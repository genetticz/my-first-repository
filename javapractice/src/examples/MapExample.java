package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("csvcontent.txt"));
		Map<String, String> deptNames = new HashMap<>();
		String currentLine = "";
		
		while (currentLine != null) {
			
			currentLine = br.readLine();
			
			if (currentLine != null) {
//				System.out.println(currentLine);
				deptNames.put(currentLine.split(",")[0],currentLine.split(",")[1]);
			}
		}
		
		for(Map.Entry<String, String> entry: deptNames.entrySet()) {
			
			System.out.println(entry.getKey()+ " : " + entry.getValue());
		}
		
		br.close();
	}
	
	public int getFileLength(BufferedReader br) throws IOException {
		
		int count = 0;
		
		String line = "";
		
		while(line != null) {
			
			count++;
			line = br.readLine();
		}
		
		return count;
	}
}
