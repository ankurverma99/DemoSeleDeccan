import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("E:\\Write.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		// Sheet sh = wb.getSheet("Sheet1");
		//Sheet sh = wb.createSheet("VALIDLOGIN");
		Sheet sh = wb.getSheet("VALIDLOGIN");
		Cell cl = sh.createRow(0).createCell(0);
		cl.setCellValue("USERNAME");
		sh.getRow(0).createCell(1).setCellValue("PASSWORD");
		sh.createRow(1).createCell(0).setCellValue("ADMIN");
		sh.getRow(1).createCell(1).setCellValue("MANAGER");
		FileOutputStream fio = new FileOutputStream("E:\\Write.xlsx");
		wb.write(fio);
		System.out.println("Done");
		wb.close();
	}

}
