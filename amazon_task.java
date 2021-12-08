package Practise_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon_task {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486386870127&hvpos=&hvnetw=g&hvrand=17011000805205928814&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061980&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQjwt-6LBhDlARIsAIPRQcK_5Nnja7oJR5z2TR7l1uzrYhzND0LCf1ce96W-paGuVEtr3zWX9uwaAlJmEALw_wcB");


		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		WebElement customerService = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		WebElement Fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));

		Actions actionobject = new Actions(driver);
		actionobject.contextClick(mobile).build().perform();      // mouse action

		Robot robotobject = new Robot();                   // keyboard action
		robotobject.keyPress(KeyEvent.VK_DOWN);
		robotobject.keyRelease(KeyEvent.VK_DOWN);     

		Thread.sleep(3000);
		robotobject.keyPress(KeyEvent.VK_ENTER);
		robotobject.keyRelease(KeyEvent.VK_ENTER);


		actionobject.contextClick(Fashion).perform();

		robotobject.keyPress(KeyEvent.VK_DOWN);
		robotobject.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(3000);

		robotobject.keyPress(KeyEvent.VK_ENTER);
		robotobject.keyRelease(KeyEvent.VK_ENTER);


		actionobject.contextClick(customerService).perform();

		robotobject.keyPress(KeyEvent.VK_DOWN);
		robotobject.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(3000);

		robotobject.keyPress(KeyEvent.VK_ENTER);
		robotobject.keyRelease(KeyEvent.VK_ENTER);


	}

}
