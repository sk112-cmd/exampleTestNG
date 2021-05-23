package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsAndPopUps {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		driver.get("https://www.airvistara.com/in/en");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//*[@id="onewaytrip"]

		// driver.get("https://html.com/input-type-file/");
		// driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//
//		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//		String text= alert.getText();
//		
//		if(text.equals("Please enter a valid user name")) {
//			System.out.println("Valid text");
//			alert.accept();
//		}else {
//			System.out.println("Invalid text");
//			alert.dismiss();

//driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("C:/Users/shubkuma/Downloads/Token.txt");
//driver.findElement(By.xpath("//input[@value='submit']")).click();

		driver.findElement(By.id("domain-done")).click();
		Thread.sleep(10000);
		Actions action = new Actions(driver);
		driver.findElement(By.id("att_lightbox_close")).click();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Plan Travel')]"))).build().perform();
		driver.findElement(By.linkText("Flights")).click();
		
	}

}
