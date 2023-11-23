package Read_Write_ExcelFile;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

public class ExcelWriter {
    public static void main(String[] args) {
        try {
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Sheet1");

            // Sample data for writing
            Object[][] data = {
                    {"Name", "Age", "City"},
                    {"John Doe", 25, "New York"},
                    {"Jane Doe", 30, "San Francisco"},
                    // Add more rows as needed
            };

            int rowNum = 0;
            for (Object[] rowData : data) {
                Row row = sheet.createRow(rowNum++);

                int colNum = 0;
                for (Object field : rowData) {
                    Cell cell = row.createCell(colNum++);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }
            }

            // Write the workbook content to a file
            try (FileOutputStream fileOut = new FileOutputStream("path/to/your/excel/output.xlsx")) {
                workbook.write(fileOut);
                fileOut.close();
            }

            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
