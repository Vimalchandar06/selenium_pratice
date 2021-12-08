package Practise_task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class miniproject2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://practice.automationtesting.in/");
		
		driver.findElement(By.xpath("//a[text()='Shop']")).click();
		
		driver.findElement(By.xpath("(//a[text()='Add to basket'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[text()='Add to basket'])[3]")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		
		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
		
		driver.findElement(By.id("billing_first_name")).sendKeys("vimal");
		driver.findElement(By.id("billing_last_name")).sendKeys("chandar");
		driver.findElement(By.id("billing_company")).sendKeys("greens");
		driver.findElement(By.id("billing_email")).sendKeys("vimalchnadar@gmail.com");
		driver.findElement(By.id("billing_phone")).sendKeys("1234567890");
		
		WebElement country = driver.findElement(By.id("billing_country"));
		Select a1 = new Select(country);
		a1.selectByValue("IN");
		
		driver.findElement(By.id("billing_address_1")).sendKeys("tambaram");
		
		driver.findElement(By.id("billing_address_2")).sendKeys("chennai");
		
		driver.findElement(By.id("billing_city")).sendKeys("chennai");
	
	WebElement state = driver.findElement(By.id("s2id_billing_state"));
	state.click();
	
//	driver.findElement(By.id("select2-chosen-2")).click();
	
//	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[10]/select/option[25]")).click();
//	driver.findElement(By.xpath("//input[@class='select2-input']")).click();
	
	
//	WebElement state1 = driver.findElement(By.xpath("//div[@id=select2-result-label-98']"));	
//	state1.sendKeys("Tamil Nadu");
//	Select a2 = new Select(state1);
//	a2.selectByVisibleText("Tamil Nadu");
	
 Thread.sleep(2000);
		
		driver.findElement(By.id("billing_postcode")).sendKeys("600059");
		
		driver.findElement(By.id("createaccount")).click();
		
		driver.findElement(By.xpath("//input[@id='payment_method_cod']")).sendKeys("Vim@123");
		
		driver.findElement(By.id("place_order")).click();
	

		
	

				
		
		
		
		
	}

}
