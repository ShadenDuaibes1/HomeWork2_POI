package automationFrameWork;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModules.SignIn_Action;
import utils.Constant;
import utils.ExcelDataProvider;
public class Apache_POI_TC {
    private static WebDriver driver =null;
    public static void main(String[] args) throws Exception {
    	ExcelDataProvider.setExcelFile(Constant.Path_TestData+Constant.File_TestData,"SheetExcel1");
    	driver= new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.get(Constant.URL);
    	SignIn_Action.Execute(driver);
    	System.out.println("Login Successfully");
    	driver.close();
    	ExcelDataProvider.setCellData("all valid", 1, 3);
    	ExcelDataProvider.setCellData("Invalid Email", 2, 3);
    	ExcelDataProvider.setCellData("password_empty", 3, 3);

    	
    }
    }


