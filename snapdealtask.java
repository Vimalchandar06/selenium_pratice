package Practise_task;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class snapdealtask {

	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.snapdeal.com/");

		String a = driver.getCurrentUrl();
		System.out.println(a);
		String b = driver.getTitle();
		System.out.println(b);

		Thread.sleep(3000);
		WebElement aa = driver.findElement(By.xpath("//span[text()='Electronics']"));
		String ele = aa.getText();
		System.out.println(ele);

		WebElement aa1 = driver.findElement(By.xpath("//span[text()='Semi Automatic']"));
		String semi = aa1.getText();
		System.out.println(semi);

		Actions move = new Actions(driver);
		move.moveToElement(aa).click(aa1).build().perform();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='electronic grayScale']")).click();
		driver.findElement(By.xpath("(//a[@class='sub-cat-node dp-widget-link hashAdded'])[5]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']")).sendKeys("600059");
		driver.findElement(By.xpath("//button[@class='pincode-check']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='dp-widget-link noUdLine hashAdded']//p[text()='Dish TV SD Super Family with 1 month Subscription Free']")).click();

		String windowHandle = driver.getWindowHandle();            
		Set<String> a2 = driver.getWindowHandles();

		for (String a1:a2) {
			if (!windowHandle.equals(a1)) {
				driver.switchTo().window(a1);
			}
		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@class='intialtext'])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='cartQuantity']")).click();

		Thread.sleep(3000);

		TakesScreenshot vv =(TakesScreenshot) driver;
		File screen = vv.getScreenshotAs(OutputType.FILE);
		File ab = new File("C:\\Users\\VK\\eclipse-workspace\\selenium_project\\screenshot\\commons-io-2.11.0\\docs\\snapdeal1.png");
		FileHandler.copy(screen, ab);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@class='icon-font-grey-size24 close-popup-icon']//i")).click();

		Thread.sleep(2000);

		for (String a1:a2) {
			if (windowHandle.equals(a1)) {
				driver.switchTo().window(a1);
			}
		}

		Thread.sleep(3000);

		WebElement scroll1 = driver.findElement(By.xpath("(//a[@class='bCrumbOmniTrack hashAdded'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)",scroll1);
		scroll1.click();

		Thread.sleep(2000);

		WebElement offer = driver.findElement(By.xpath("(//span[@class='catText'])[6]"));
		String col = offer.getText();
		System.out.println(col);

		WebElement shirt = driver.findElement(By.xpath("(//span[text()='Shirts'])[2]"));
		String s = shirt.getText();
		System.out.println(s);

		move.moveToElement(offer).click(shirt).build().perform();

		Thread.sleep(5000);

		WebElement jac = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		jac.sendKeys("jacket men");
		String men = jac.getAttribute("value");
		System.out.println(men);

		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();

		Thread.sleep(2000);

		WebElement jack = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		jack.click();

		Thread.sleep(10000);
        String win = driver.getWindowHandle();
        driver.switchTo().window(win);
//		WebElement addcart = driver.findElement(By.xpath("/html/body/div[11]/section/div[1]/div[2]/div/div[1]/div[7]/div[3]/div/div[2]/div[1]/div/div[1]/span"));
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("arguments[0].scrollIntoView(true)",addcart);
//		Thread.sleep(3000);
//		addcart.click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//span[@class='cartQuantity']")).click();


		

		TakesScreenshot vv1 =(TakesScreenshot) driver;
		File screen1 = vv1.getScreenshotAs(OutputType.FILE);
		File ab1 = new File("C:\\Users\\VK\\eclipse-workspace\\selenium_project\\screenshot\\commons-io-2.11.0\\docs\\snapdeal2.png");
		FileHandler.copy(screen1, ab1);


		Thread.sleep(10000);




		//		//driver.switchTo().frame("loginIframe");
		//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//
		//
		//		WebDriverWait wait = new WebDriverWait(driver, 10);
		//		WebElement chart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='pincode-change']")));
		//		//	chart.click();
		//
		//		//	WebElement sizeChart = driver.findElement(By.xpath("//span[@id='pincode-change']"));
		//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//		js1.executeScript("arguments[0].scrollIntoView(true)",chart);
		//		Thread.sleep(3000);
		//
		//		WebElement addToCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		//		//addToCart.click();
		//		js.executeScript("arguments[0].click()",addToCart);


	}

}
