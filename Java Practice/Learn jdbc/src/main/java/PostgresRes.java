import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PostgresRes {


    public static void main(String[] args) {

        HandleOps psql = new HandleOps();
        try{
            Connection conn = psql.buildConnection();
            System.out.println("Creating new database");
            psql.querySingle(conn, "create database test_database");
            conn.close();
            System.out.println("Closed connection.");
            System.out.println("Attempting to connect to new database");
            conn = psql.buildConnection("test_database");
            psql.querySingle(conn, "create table test_table (firstname varchar(20), id int)");
            System.out.println("connected to database");
            psql.querySingle(conn, "insert into test_table (firstname, id) values ('Doe', 123),('John', 124)");
            psql.querySingle(conn, "Update test_table set firstname = 'Jack' where id = 124");
            psql.querySingle(conn, "Delete from test_table where firstname = 'Doe'");
            psql.querySingle(conn, "drop table test_table" );
            conn.close();
            conn = psql.buildConnection();
            psql.querySingle(conn, "drop database test_database");
            conn.close();
        } catch(IOException ioException){
            System.out.println(ioException.getMessage());
        } catch(SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
    }

}
