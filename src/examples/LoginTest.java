package examples;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
	static WebDriver driver;
	XSSFWorkbook Workbook;
    XSSFSheet sheet1;

	@BeforeMethod
	public  void setup() throws IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
//		driver.get("https://simplilearn.com/");
		driver.get("https://www.facebook.com/");
	
	FileInputStream fis= new FileInputStream("credential.xlsx");
	Workbook = new XSSFWorkbook(fis);
	sheet1 = Workbook.getSheetAt(0);
	
	}
	
	@Test
	 @Parameters({"uName","pwd"}) 

	public static void login(String username, String password) throws InterruptedException {
		Thread.sleep(10000);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Log in")).click();
		
//		WebElement username= driver.findElement(By.name("user_login"));
//		String userNameVal11= sheet1.getRow(0).getCell(0).getStringValue();
//		username.sendKeys(userNameVal11);
		
		WebElement passwordVal1= driver.findElement(By.name("user_pwd"));
		passwordVal1.sendKeys(password);
		
		driver.findElement(By.name("btn_login")).click();
	}

	public static void tearDown() {
		driver.quit();
	}
}
