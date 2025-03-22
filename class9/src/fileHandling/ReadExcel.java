package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) {
        // Specify the file path of the Excel file
        String path = "data\\abc5.xlsx";

        try {
            // Open the Excel file
        	File f = new File(path);
            FileInputStream fileInputStream = new FileInputStream(f);

            // Create a workbook instance that refers to the .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

            // Get the first sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through all the rows in the sheet
            for (Row row : sheet) {
                // Get the cell in the first column (0th index)
                Cell cell = row.getCell(0);

                // If the cell is not null, print its value
                if (cell != null) {
                    // Assuming the cell contains a number (Integer)
                    System.out.println(cell.getNumericCellValue());
                }
            }

            // Close the workbook and input stream
            workbook.close();
            fileInputStream.close();

        } catch (IOException e) {
            // Handle exceptions
            e.printStackTrace();
        }
}
}