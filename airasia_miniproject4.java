package Practise_task;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class airasia_miniproject4 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.airasia.co.in/home");

		String a = driver.getCurrentUrl();
		System.out.println(a);
		String b = driver.getTitle();
		System.out.println(b);

		WebElement roundtrip = driver.findElement(By.xpath("//div[@id='Round Trip']"));
		roundtrip.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//img[@class='source-field-icon'])[1]")).click();
		WebElement fromloc = driver.findElement(By.xpath("//input[@id='basic-url']"));
		fromloc.sendKeys("mumbai");
		String abc = fromloc.getAttribute("value");
		System.out.println(abc);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='list-item']")).click();

		WebElement toloc = driver.findElement(By.xpath("//input[@id='basic-url']"));
		toloc.sendKeys("kolkata");
		String abc1 = toloc.getAttribute("value");
		System.out.println(abc1);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='list-item']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@class='icon-arrow']")).click();

		WebElement scrollElement =driver.findElement(By.xpath("/html/body/div[1]/div/div[146]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/div[3]/div[7]/div/div[1]"));
		WebElement src = driver.findElement(By.xpath("/html/body/div[1]/div/div[146]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/div[5]/div[3]/div/div"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scrollElement);
		System.out.println(src.getText());
		src.click();

		WebElement des = driver.findElement(By.xpath("/html/body/div[1]/div/div[146]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/div[5]/div[5]/div/div[1]"));
		System.out.println(des.getText());
		des.click();

		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"flight-search-passenger-count\"]/div[1]")).click();

		WebElement adult = driver.findElement(By.xpath("(//img[@id='adult'])[2]"));

		for(int i=1; i<5;i++) {
			adult.click();

			if(i==2) {
				break;
			}
		}

		WebElement seniorcitizen = driver.findElement(By.xpath("(//img[@id='scp'])[2]"));

		for(int i=1; i<3;i++) {
			seniorcitizen.click();

			if(i==1) {
				break;
			}
		}

		driver.findElement(By.xpath("//button[@class='done_button btn btn-primary']")).click();


		WebElement arrival = driver.findElement(By.xpath("(//label[text()='Before 6 AM'])[2]"));
		arrival.click();		

		WebElement amount1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		js.executeScript("arguments[0].click()", amount1);


		driver.findElement(By.xpath("//*[@id=\"spa-root\"]/div/div[146]/div[1]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[2]/div")).click();

		Thread.sleep(3000);

		WebElement amount2 =driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		js.executeScript("arguments[0].click()", amount2);

		Thread.sleep(5000);
		
		TakesScreenshot vv =(TakesScreenshot) driver;
		File screen = vv.getScreenshotAs(OutputType.FILE);
		File ab = new File("C:\\Users\\VK\\eclipse-workspace\\selenium_project\\screenshot\\commons-io-2.11.0\\docs\\airticket1.png");
		FileHandler.copy(screen, ab);

		//WebElement cont = driver.findElement(By.xpath("//button[@class='continue-btn']"));
		//cont.click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='onestop']")).click();
		driver.findElement(By.xpath("//label[@id='arrAfterSix']")).click();
		
		WebElement amount3 =driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		js.executeScript("arguments[0].click()", amount3);
		Thread.sleep(2000);
		
		TakesScreenshot vv1 =(TakesScreenshot) driver;
		File screen1 = vv1.getScreenshotAs(OutputType.FILE);
		File ab1 = new File("C:\\Users\\VK\\eclipse-workspace\\selenium_project\\screenshot\\commons-io-2.11.0\\docs\\airticket2.png");
		FileHandler.copy(screen1, ab1);








	}

}
