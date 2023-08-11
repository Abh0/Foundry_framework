package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	
	//DataProvider 1
	
		@DataProvider(name="SignIn_Page")
		
		public String [][] getData() throws IOException
		{
			String path="C:\\Users\\101Reporters\\eclipse-workspace\\Foundry_framework\\testData\\foundry_LoginData.xlsx";//taking excel sheet file  path from testData
			
			ExcelUtility xlutil=new ExcelUtility(path);//creating an object for ExcelUtility
			
			int totalrows=xlutil.getRowCount("Sheet1");	
			int totalcols=xlutil.getCellCount("Sheet1",1);
					
			String SignIn_Page[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
			
			for(int i=1;i<=totalrows;i++)  //1   //read the data from Excelutility storing in two deminsional array
			{		
				for(int j=0;j<totalcols;j++)  //0    i is rows j is column
				{
					SignIn_Page[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
				}
			}
		return SignIn_Page;//returning two dimension array
					
		}
		
		//DataProvider 2
		//If we want to add dataprovider method for any functionality, here we are creating
		//DataProvider 3
		
		//DataProvider 4

	
	
	
	
	
	
	
	
	
	
	
	
}
