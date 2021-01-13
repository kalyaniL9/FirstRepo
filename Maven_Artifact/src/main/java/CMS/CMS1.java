package CMS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CMS1 {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://s1.demo.opensourcecms.com/s/44");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		
	    WebElement login =	driver.findElement(By.id ("txtUsername"));
	    login.click();
	    login.sendKeys("opensourcecms");

	    WebElement pwd = driver.findElement(By.id ("txtPassword"));
	    pwd.click();
	    pwd.sendKeys("opensourcecms");
		driver.findElement(By.xpath("//input[@name ='Submit']")).click();
		
		
		//*******************************************//
		
		WebElement   admin = driver.findElement(By.xpath("//li[@id = 'admin']"));
		WebElement list = driver.findElement(By.xpath("//a[@class = 'l2_link parent companyinfo']"));
		WebElement submenu = driver.findElement(By.xpath("//li[@class = 'l3']//a[contains(@href, 'General')]"));
		
		
		//**********************************************//
		
//List<WebElement> list = driver.findElements(By.xpath("//a[@class = 'l2_link parent companyinfo']"));
		
//		for (int i = 0; i<list.size(); i++) {
//			if (list.get(i).getText().equals("ORGANIZATION")) {
//				list.get(i).click();
//				break;
//			}
//		}
		
		//*********************************************//
		//Navigating to sub menu - From => Admin => Organization=> General Information
		Actions action = new Actions(driver);
		action.moveToElement(admin).perform(); 
		Thread.sleep(1000);
		action.moveToElement(list).perform();
		Thread.sleep(1000);
		action.moveToElement(submenu).click().perform();
		
		//***************************************************//
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id = 'btnSaveGenInfo']")).click();
		driver.findElement(By.xpath("//input[@id = 'organization_name']")).sendKeys("Automation Org1");
		driver.findElement(By.xpath("//input[@name = 'organization[phone]']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id = 'organization_fax']")).sendKeys("987654321");
		driver.findElement(By.xpath("//input[@id = 'organization_street1']")).sendKeys("123 Street");
		driver.findElement(By.xpath("//input[@id = 'organization_city']")).sendKeys("Test City");
		
		//driver.findElement(By.xpath("//input[@id = 'organization_note']")).sendKeys("Test Automation");
		driver.findElement(By.xpath("//input[@id = 'organization_taxId']")).sendKeys("123789");
		driver.findElement(By.xpath("//input[@id = 'organization_registraionNumber']")).sendKeys("A12FG456");
		driver.findElement(By.xpath("//input[@id = 'organization_email']")).sendKeys("Test.Test@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'organization_province']")).sendKeys("Texas");
		driver.findElement(By.xpath("//input[@id = 'organization_zipCode']")).sendKeys("75033");
		Select country  =  new Select(driver.findElement(By.id("organization_country")));
		Thread.sleep(2000);
		country.selectByVisibleText("Bangladesh");
		Thread.sleep(2000);
     	driver.findElement(By.xpath("//input[@id = 'btnSaveGenInfo']")).click();
		
		
		//**************************************************//
		
	}

}
