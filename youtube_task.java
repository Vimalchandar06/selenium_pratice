package Practise_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class youtube_task {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com/");

		String a = driver.getCurrentUrl();
		System.out.println(a);
		String b = driver.getTitle();
		System.out.println(b);

		WebElement id = driver.findElement(By.xpath("//input[@id='search']"));
		id.sendKeys("learn selenium");
		String type1 = id.getAttribute("value");
		System.out.println(type1);


		WebElement search = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		search.click();

		Thread.sleep(3000);

		WebElement selenium = driver.findElement(By.xpath("//a[@title='Selenium Full Course - Learn Selenium in 12 Hours | Selenium Tutorial For Beginners | Edureka']"));
		String title1 = selenium.getText();
		
		WebElement scroll1 = driver.findElement(By.xpath("(//tp-yt-paper-button[@id='button'])[5]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scroll1);
		Thread.sleep(2000);

		Actions actionobject = new Actions(driver);

		actionobject.contextClick(selenium).perform();

		Robot object = new Robot();
		object.keyPress(KeyEvent.VK_DOWN);
		object.keyRelease(KeyEvent.VK_DOWN);     

		Thread.sleep(2000);
		object.keyPress(KeyEvent.VK_ENTER);
		object.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		String windowHandle = driver.getWindowHandle();             // window handle & window handles
		Set<String> aa = driver.getWindowHandles();

		for (String a1:aa) {
			if (!windowHandle.equals(a1)) {
				driver.switchTo().window(a1);
			}
		}
		
		Thread.sleep(3000);


		WebElement pause = driver.findElement(By.xpath("//button[@title='Pause (k)']"));
		pause.click();
		

		TakesScreenshot vv =(TakesScreenshot) driver;
		File screen = vv.getScreenshotAs(OutputType.FILE);
		File ab = new File("C:\\Users\\VK\\eclipse-workspace\\selenium_project\\screenshot\\commons-io-2.11.0\\docs\\youtubetask.png");
		FileHandler.copy(screen, ab);


		WebElement page2 = driver.findElement(By.xpath("(//*[@class='style-scope ytd-video-primary-info-renderer'])[3]"));
		String title2 = page2.getText();
		System.out.println("Title 1: "+title1);
		System.out.println("Title 2: "+title2);
		
		if (title1.equals(title2)) {
			System.out.println("Title1 and Title2 are same");
			
		}else {
			System.out.println("Title1 and Title2 are not same");
		}
		


	}

}
