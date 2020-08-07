package examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CsvParsing {

    public static void main(String[] args) throws IOException {
        Iterator<Object[]> it = parseCsvData(System.getProperty("user.dir")+"/src/examples/csvcontent.txt");
        it.next();
        System.out.println(it.next()[0] + " " + it.next()[1]);
    }

    private static Iterator<Object[]> parseCsvData(String fileName) throws IOException
    {
        BufferedReader input = null;
        File file = new File(fileName);
        input = new BufferedReader(new FileReader(file));
        String line = null;
        ArrayList<Object[]> data = new ArrayList<Object[]>();
        while ((line = input.readLine()) != null)
        {
            String in = line.trim();
            String[] temp = in.split(",");
            List<Object> arrray = new ArrayList<Object>();
            for(String s : temp)
            {
                arrray.add(s);
            }
            data.add(arrray.toArray());
        }
        input.close();
        return data.iterator();
    }
}
