package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class handlingCSVFile {

	public static void main(String[] args) throws IOException {
		
		String path = "data\\abc3.csv";
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Employee, Title, Salary");
		bw.newLine();
		bw.write("Naresh, Lead, 50000");
		bw.newLine();
		bw.write("Monna, HR, 55000");
		System.out.println("File written");
		bw.close();

	}

}
