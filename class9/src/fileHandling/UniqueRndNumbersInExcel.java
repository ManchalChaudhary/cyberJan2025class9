package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UniqueRndNumbersInExcel {
	public static void main(String[] args) throws IOException {
        int numberOfRandomNumbers = 500;  // Number of unique random numbers you want to generate
        int minValue = 100;  // Minimum random number value
        int maxValue = 1000;  // Maximum random number value

        // Generate unique random numbers
        Set<Integer> uniqueRandomNumbers = generateUniqueRandomNumbers(numberOfRandomNumbers, minValue, maxValue);

        // Write these numbers to an Excel file
        writeNumbersToExcel(uniqueRandomNumbers, "data\\abc5.xlsx");
    }

    // Method to generate unique random numbers
    public static Set<Integer> generateUniqueRandomNumbers(int count, int min, int max) {
        Set<Integer> randomNumbers = new HashSet<>();
        Random random = new Random();

        while (randomNumbers.size() < count) {
            int number = random.nextInt((max - min) + 1) + min;
            randomNumbers.add(number);
        }

        return randomNumbers;
    }

    // Method to write numbers to Excel file
    public static void writeNumbersToExcel(Set<Integer> numbers, String fileName) throws IOException {
        // Create a new workbook and sheet
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Random Numbers");

        int rowNum = 0;
        // Iterate through the set and write numbers to sheet
        for (Integer number : numbers) {
            XSSFRow row = sheet.createRow(rowNum++);
            XSSFCell cell = row.createCell(0);
            cell.setCellValue(number);
        }

        // Write the workbook to a file
        File f = new File("data\\abc5.xlsx");
        FileOutputStream fileOut = new FileOutputStream(f);
            workbook.write(fileOut);
        

        // Close the workbook
        workbook.close();
        System.out.println("file done");
    }
}
