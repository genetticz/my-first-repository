import javax.xml.transform.Result;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class HandleOps {

    public Connection buildConnection() throws IOException, SQLException {

        String user = readProperties().getProperty("username");
        String pass = readProperties().getProperty("password");
        String url = readProperties().getProperty("url");
        //creates connection to database
        Connection connection = DriverManager.getConnection(url, user, pass);
        System.out.println("Now connecting to postgres");
        getDbs(connection);
        return connection;
     }

    public Connection buildConnection(String endpoint) throws IOException, SQLException {
        String user = readProperties().getProperty("username");
        String pass = readProperties().getProperty("password");
        String url = readProperties().getProperty("url") + endpoint;
        //creates connection to database
        Connection connection = DriverManager.getConnection(url, user, pass);
        System.out.println("Now connecting to the " + endpoint + " database");
        getDbs(connection);
        return connection;
    }

    public String querySingle(Connection conn, String query) {

        try {
            // Statement object represents an SQL statement
            Statement statement = conn.createStatement();
            // ResultSet object represents a database result set
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            return resultSet.getString(1);
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
            return null;
        }
    }


    public List<String> queryTable(Connection conn, String query) {

        try {
            // Statement object represents an SQL statement
            Statement statement = conn.createStatement();
            // ResultSet object represents a database result set
            ResultSet resultSet = statement.executeQuery(query);
            List<String> sqlArr = new ArrayList<>();

            while (resultSet.next()) {
                sqlArr.add(resultSet.getString(1));
            }
            return sqlArr;
        } catch(SQLException sqlException){
            System.out.println(sqlException.getMessage());
            return null;
        }
    }

    public void getDbs(Connection conn) throws SQLException {

        String initQuery = "SELECT d.datname as \"Name\", pg_catalog.pg_get_userbyid(d.datdba)" +
                " as \"Owner\", pg_catalog.pg_encoding_to_char(d.encoding) as \"Encoding\", " +
                "d.datcollate as \"Collate\", d.datctype as \"Ctype\", " +
                "pg_catalog.array_to_string(d.datacl, E'\\n') AS \"Access privileges\" " +
                "FROM pg_catalog.pg_database d ORDER BY 1;";

        Statement statement = conn.createStatement();
        // ResultSet object represents a database result set
        ResultSet resultSet = statement.executeQuery(initQuery);
        List<String> sqlArr = new ArrayList<>();

        while(resultSet.next()) {
            sqlArr.add(resultSet.getString(1));
        }

        System.out.println("There are " + sqlArr.size() + " databases available in the array. " + sqlArr);
    }

    public Properties readProperties() throws IOException {

        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/app.properties");
        properties.load(inputStream);
        inputStream.close();
        return properties;
    }
}
