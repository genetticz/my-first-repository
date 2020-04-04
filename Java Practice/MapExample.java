package datastructure_problems;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
