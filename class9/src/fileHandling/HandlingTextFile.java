package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HandlingTextFile {

	public static void main(String[] args) throws IOException {
		String path = "data\\abc2.txt";
		File f = new File(path);
		readGivenLine(9, f);
		
	}
	
	public static void readGivenLine(int lineNum, File f2) throws IOException {
		String path = "data\\abc2.txt";
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		List <String> allLines = new ArrayList<String>();
		while((line=br.readLine())!=null) {
			
		allLines.add(line);}
		
		
		System.out.println(allLines.get(lineNum-1));
		System.out.println("hello");
		br.close();
		}
	
}

