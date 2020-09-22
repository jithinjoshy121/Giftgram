package data;

import utilities.Xls_Reader;

public class DataFile {
	
	Xls_Reader d=new Xls_Reader("C:\\testing\\Data.xlsx");
	public String title=d.getCellData("Sheet1", "Title", 2);
	public String price=d.getCellData("Sheet1", "Price", 2);
	public String name=d.getCellData("Sheet1", "Name", 2);
	public String text=d.getCellData("Sheet1", "Text", 2);
	public String title2=d.getCellData("Sheet1", "Title", 3);


}
