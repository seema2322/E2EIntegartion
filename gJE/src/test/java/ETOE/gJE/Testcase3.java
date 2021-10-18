package ETOE.gJE;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase3 {
	
	
	
	
	
	@Test 
	public void Testcase() throws InterruptedException {
	
	
	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("email")).sendKeys("yourusername@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("password");
    driver.quit();
}
}