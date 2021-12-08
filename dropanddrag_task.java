package Practise_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dropanddrag_task {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Static.html");
		
		String a = driver.getCurrentUrl();
		System.out.println(a);
		String b = driver.getTitle();
		System.out.println(b);
		
		Thread.sleep(5000);
	//	Actions a = new Actions(driver);
		
		
		WebElement from1 = driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement to1 = driver.findElement(By.xpath("//div[@id='droparea']"));
		
		//	WebElement from2 = driver.findElement(By.xpath("//img[@id='angular']"));
		//	WebElement to2 = driver.findElement(By.xpath("//img[@id='angular']"));
		//	WebElement from3 = driver.findElement(By.xpath("//img[@id='angular']"));
		//	WebElement to3 = driver.findElement(By.xpath("//img[@id='angular']"));
		//a.dragAndDrop(from1, to1).build().perform();
		a.clickAndHold(from1).release(to1).perform();
		//Action act = a.clickAndHold(from1).moveToElement(to1).release(to1).build();
		//Thread.sleep(2000);
		//act.perform();





	}

}
