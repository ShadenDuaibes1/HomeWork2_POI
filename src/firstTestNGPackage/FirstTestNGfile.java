package firstTestNGPackage;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;


public class FirstTestNGfile {
   // private static final String logonButton = null;
	public String baseUrl = "https://www.frontgate.com/ShoppingCartView";
    static String driverPath = "C:\\Users\\Hp\\Desktop\\seleinum\\selenium-java-4.4.0\\geckodriver.exe";
    public static WebDriver driver ; 
    	
  @Test
  public void verifyLogo() {
	  System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      driver.manage().window().maximize();
      SoftAssert soft= new SoftAssert();
      Boolean Display = driver.findElement(By.xpath("//a[@title='Ballard Designs LOGO']")).isDisplayed();
      soft.assertTrue(Display,"The logo is not displayed");
      soft.assertAll();
  }
  @Test
  public static void signIn() {
	  System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get("baseUrl");
      driver.manage().window().maximize();
      driver.findElement(By.className("class=button primary")).click();
      
  }
  @Test
  public static void Register(String Path) {
	  System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(Path);
      driver.manage().window().maximize();
      String expected ="Welcome back! ";
      String t =  driver.findElement(By.cssSelector("#mainContent > div.data")).getText();
      SoftAssert soft= new SoftAssert();
      soft.assertEquals(t, expected,"The user not enter to sign in page, because Welcome back! is not displayed");
      Boolean Display = driver.findElement(By.cssSelector("#logonId")).isDisplayed();
      Boolean pass = driver.findElement(By.cssSelector("#logonPassword")).isDisplayed();
      Boolean sign = driver.findElement(By.cssSelector("#logonButton")).isDisplayed();
      soft.assertTrue(Display, "Not found");
      soft.assertTrue(pass, "passward field not displayed");
      soft.assertTrue(sign, "Sign in link is not displayed");
      soft.assertAll();	  
  }
  @Test
  public static void EnterInformation(String Us, String pass) {
	  System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get("https://www.frontgate.com/ShoppingCartView");
      driver.manage().window().maximize();
      SoftAssert soft= new SoftAssert();
      driver.findElement(By.name("Email")).sendKeys(Us);
      driver.findElement(By.name("Password")).sendKeys(pass);
      driver.findElement(By.name("SIGN IN")).click();
      String expected ="My Account ";
      String t =  driver.findElement(By.cssSelector("#mainContent > div.data")).getText();
      String account=  driver.findElement(By.cssSelector("#myAccount")).getText();
      soft.assertEquals(account, expected,"The user is not logged successfully, because My Account is not displayed");
      String  s="welcome"+driver.findElement(By.cssSelector("#logonId")).getText();
      soft.assertEquals(t,s,"not the same username that you uesd");
      soft.assertAll();	  
  }
}
  


