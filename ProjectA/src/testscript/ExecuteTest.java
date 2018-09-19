package testscript;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExecuteTest {
	@Test
	public void ExecuteTest_01() throws Exception	{
		Keywords key = new Keywords();
		ArrayList list = new ArrayList();
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\workspace\\ProjectA\\src\\testcases\\NewTest.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("Steps");
		Iterator itr = sheet.iterator();
		while (itr.hasNext())	{
			Row rowitr = (Row)itr.next();
			Iterator cellitr = rowitr.cellIterator();
			while (cellitr.hasNext())	{
				Cell celldata = (Cell)cellitr.next();
				switch (celldata.getCellType())	{
				case Cell.CELL_TYPE_STRING:
					list.add(celldata.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					list.add(celldata.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					list.add(celldata.getBooleanCellValue());
					break;
				}
			}
		}
		
		for (int i=0; i<list.size(); i++)	{
			if (list.get(i).equals("Openbrowser"))	{
				String Keyword = (String)list.get(i);
				String Data = (String)list.get(i+1);
				String Objectname = (String)list.get(i+2);
				String Runmode = (String)list.get(i+3);
				System.out.println(Keyword);
				System.out.println(Data);
				System.out.println(Objectname);
				System.out.println(Runmode);
				if (Runmode.equals("Yes"))	{
					key.Openbrowser();
				}
			}
			
			if (list.get(i).equals("Navigate"))	{
				String Keyword = (String)list.get(i);
				String Data = (String)list.get(i+1);
				String Objectname = (String)list.get(i+2);
				String Runmode = (String)list.get(i+3);
				System.out.println(Keyword);
				System.out.println(Data);
				System.out.println(Objectname);
				System.out.println(Runmode);
				if (Runmode.equals("Yes"))	{
					key.Navigate(Data);
				}
			}
			
			if (list.get(i).equals("Click"))	{
				String Keyword = (String)list.get(i);
				String Data = (String)list.get(i+1);
				String Objectname = (String)list.get(i+2);
				String Runmode = (String)list.get(i+3);
				System.out.println(Keyword);
				System.out.println(Data);
				System.out.println(Objectname);
				System.out.println(Runmode);
				if (Runmode.equals("Yes"))	{
					key.Click(Objectname);
				}
			}
			
			if (list.get(i).equals("Input"))	{
				String Keyword = (String)list.get(i);
				String Data = (String)list.get(i+1);
				String Objectname = (String)list.get(i+2);
				String Runmode = (String)list.get(i+3);
				System.out.println(Keyword);
				System.out.println(Data);
				System.out.println(Objectname);
				System.out.println(Runmode);
				if (Runmode.equals("Yes"))	{
					key.Input(Objectname, Data);
				}
			}
		}
	}

}
