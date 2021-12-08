package Practise_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerttask_customerid {

	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(5000);

		WebElement customerid = driver.findElement(By.xpath("//input[@name='cusid']"));
		customerid.sendKeys("9500908");
		String ref1 = customerid.getAttribute("value");
		System.out.println("Customer id - "+ref1);
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		String msg = driver.switchTo().alert().getText();
		System.out.println("popup message- "+msg);
	
		
		Thread.sleep(4000);
	 driver.switchTo().alert().accept();


	}

}
