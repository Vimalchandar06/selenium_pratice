package Practise_task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class miniproject_phase2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		String a = driver.getCurrentUrl();
		System.out.println(a);
		String b = driver.getTitle();
		System.out.println(b);
		
		WebElement mailid = driver.findElement(By.id("email"));
		mailid.sendKeys("vimalchandar6@gmail.com");
		String mail = mailid.getAttribute("value");
		System.out.println(mail);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("Vim@123");
		String pswrd = password.getAttribute("value");
		System.out.println(pswrd);
		
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//img[@title='Blouse']")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		driver.switchTo().defaultContent();
		
	
	TakesScreenshot snap =(TakesScreenshot) driver;
		File screen = snap.getScreenshotAs(OutputType.FILE);
		File ab = new File("C:\\Users\\VK\\eclipse-workspace\\selenium_project\\screenshot\\commons-io-2.11.0\\docs\\order1.png");
		FileHandler.copy(screen, ab);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		
		WebElement comment = driver.findElement(By.xpath("//textarea[@name='message']"));
		comment.sendKeys("** no comment ** ");
		String aa = comment.getAttribute("value");
		System.out.println(aa);
		
		
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		
		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(2000);
		
		TakesScreenshot snap1 =(TakesScreenshot) driver;
		File screen1 = snap1.getScreenshotAs(OutputType.FILE);
		File ab1 = new File("C:\\Users\\VK\\eclipse-workspace\\selenium_project\\screenshot\\commons-io-2.11.0\\docs\\order1.1.png");
		FileHandler.copy(screen1, ab1);
		

	}

}
