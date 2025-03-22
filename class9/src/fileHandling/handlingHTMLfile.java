package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class handlingHTMLfile {

	public static void main(String[] args) throws IOException {
		String path = "data\\abc4.html";
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("<html>\r\n"
				+ "<title>\r\n"
				+ "TEST for html\r\n"
				+ "</title>\r\n"
				+ "<body>\r\n"
				+ "<p>\r\n"
				+ "Hello everyone, file is here\r\n"
				+ "</p>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		bw.close();
		
		System.out.println("File written");

	}

}
