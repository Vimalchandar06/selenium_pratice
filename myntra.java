package Practise_task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(5000);

		String a = driver.getCurrentUrl();
		System.out.println(a);
		String b = driver.getTitle();
		System.out.println(b);
		
		Thread.sleep(2000);
		WebElement women = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		System.out.println(women.getText());
		
		WebElement handbag = driver.findElement(By.xpath("//a[text()='Handbags, Bags & Wallets']"));
		String a2 = handbag.getText();
		System.out.println(a2);

		Actions move = new Actions(driver);
		move.moveToElement(women).perform();
		move.click(handbag).perform();
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Women']"));
		System.out.println(gender.getText());
		gender.click();
		
		Thread.sleep(1000);
		WebElement catagory = driver.findElement(By.xpath("(//input[@value='Handbags'])[1]"));
		System.out.println(catagory.getText());	
		catagory.click();
		
		Thread.sleep(1000);
		WebElement color = driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]"));
		System.out.println(color.getText());
		color.click();
		
		Thread.sleep(2000);
		WebElement bag = driver.findElement(By.xpath("//h4[text()='Solid Structured Tote Bag']"));
		System.out.println(bag.getText());
		bag.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
