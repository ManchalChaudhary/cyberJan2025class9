package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class handlingExcelFile {

	public static void main(String[] args) throws IOException {
		File f = new File("data\\abc5.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet1 = wb.createSheet("Sheet1");
		XSSFRow row0 = sheet1.createRow(0);
		XSSFCell cell1 = row0.createCell(0);
		cell1.setCellValue("1");
		
		
		
		wb.write(fo);
		System.out.println("File written");
		wb.close();
		
		
	}

}
