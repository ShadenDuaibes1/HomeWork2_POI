package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Font;

public class ExcelDataProvider {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFRow Row;
	private static XSSFCell Cell;
	Font headerFont= ExcelWBook.createFont();
	//.setBlod(true);
	//headerFont.setFontHeightInPoints((short)12);
	//headerFont.setColor(IndexedColors.BLACK.index);
	
	public static void readXLSXFile(String Path, String SheetName) throws Exception {
		// TODO Auto-generated method stub		 
		try {
			FileInputStream ExcelFile = new FileInputStream("C:\\Users\\Hp\\Desktop\\pp\\POIs-Project\\src\\testData");
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		}
		catch(Exception e){
			throw e;
			
		}
	}
	public static String getCellData(int RowNum, int ColNum) throws Exception{
		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData =Cell.getStringCellValue();
	         return CellData;
	         }
		catch(Exception e) {
			return"";		
			}
	}
	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception{
		try {
			Row =ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum);
			if(Cell == null) {
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(Result);
			}
			else {
				Cell.setCellValue(Result);
			}
			FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData+ Constant.File_TestData);
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		}
		catch(Exception e) {
			throw(e);
		}
		
	}
	public static void setExcelFile(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	
	
		
	}
	

