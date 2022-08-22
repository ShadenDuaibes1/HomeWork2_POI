package appModules;

import org.openqa.selenium.WebDriver;
import utils.ExcelDataProvider;
import firstTestNGPackage.FirstTestNGfile;
public class SignIn_Action {

		String baseUrl="https://www.frontgate.com/ShoppingCartView";
	    String driverPath="C:\\Users\\Hp\\Desktop\\seleinum\\selenium-java-4.4.0\\chromedriver.exe";	   
		public static void Execute( WebDriver driver) throws Exception{
			String sUserName= ExcelDataProvider.getCellData(1,1);
			String sPassword= ExcelDataProvider.getCellData(1, 2);
			FirstTestNGfile.signIn();
			FirstTestNGfile.EnterInformation(sUserName,sPassword);
			String mUserName= ExcelDataProvider.getCellData(2,1);
			String mPassword= ExcelDataProvider.getCellData(2, 2);
			FirstTestNGfile.signIn();
			FirstTestNGfile.EnterInformation(mUserName,mPassword);
			String vUserName= ExcelDataProvider.getCellData(3,1);
			String vPassword= ExcelDataProvider.getCellData(3, 2);
			FirstTestNGfile.signIn();
			FirstTestNGfile.EnterInformation(vUserName,vPassword);
			
		}
		

	}



