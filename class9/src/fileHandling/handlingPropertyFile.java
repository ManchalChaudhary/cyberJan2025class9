package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class handlingPropertyFile {

	public static void main(String[] args) throws IOException {
		
		test();

	}
	public static void test() throws IOException {
		String path = "data\\abc1.properties";
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
	//	FileOutputStream fi = new FileOutputStream(f);
		Properties prop = new Properties();
		prop.load(fi);
		
		System.out.println(prop.getProperty("A"));
		System.out.println(prop.keySet());
		System.out.println(prop.size());
		System.out.println(prop.values());
		System.out.println(prop.entrySet());
		System.out.println(prop.replace("A", 20));
		System.out.println(prop.entrySet());
		
	}

}
