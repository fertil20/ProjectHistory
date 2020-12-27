package com.poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Date;

public class POITest {
    public static void main(String[] args) {
        write();
        //read();
    }

    private static void read() {
        try {
            Workbook wb;
            try (InputStream is = new FileInputStream("C://Users/iliaf/Desktop/_POI/workbook.xls")) {
                wb = new HSSFWorkbook(is);
            } catch (OfficeXmlFileException e) {
                try (InputStream is = new FileInputStream("C://Users/iliaf/Desktop/_POI/workbook.xlsx")) {
                    wb = new XSSFWorkbook(is);
                }
            }
//      final int numberOfSheets = wb.getNumberOfSheets();
            final Sheet sheet = wb.getSheet("film");
            final Row row = sheet.getRow(1);
            final Cell cell = row.getCell(2);
            final CellType cellType = cell.getCellType();
            switch (cellType) {
                case STRING:
                    final String stringCellValue = cell.getStringCellValue();
                    System.out.println(stringCellValue);
                    break;
                case NUMERIC:
                    final Date numericCellValue = cell.getDateCellValue();
                    System.out.println(numericCellValue);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write() {
        Workbook wb = new XSSFWorkbook();
        final Sheet sheet = wb.createSheet("film");
        final Row row = sheet.createRow(1);

        final Cell cell = row.createCell(1);
        cell.setCellValue("ЛЭТИ");

        final CellStyle cellStyle = wb.createCellStyle();
        final CreationHelper creationHelper = wb.getCreationHelper();
        cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("DD.MM.YYYY"));
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        cellStyle.setBorderBottom(BorderStyle.MEDIUM);
        cellStyle.setBottomBorderColor(IndexedColors.RED.getIndex());
        final Cell cellDate = row.createCell(2);
        cellDate.setCellValue(new Date());
        cellDate.setCellStyle(cellStyle);
        cellStyle.setFillForegroundColor(IndexedColors.BLACK.getIndex());
        // cellStyle.setFillBackgroundColor(IndexedColors.BLUE.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        Font font = wb.createFont();
        font.setFontHeightInPoints((short) (32));
        font.setFontName("Freestyle Script");
        font.setItalic(true);
        font.setBold(true);
        font.setColor(IndexedColors.YELLOW.getIndex());
        cellStyle.setFont(font);

        try (OutputStream os = new FileOutputStream("C://Users/iliaf/Desktop/_POI/workbook.xlsx")) {
            wb.write(os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
