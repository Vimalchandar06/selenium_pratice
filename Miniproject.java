package Practise_task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Miniproject {

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

		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("vimalchandar6@gmail.com");
		String entermail = email.getAttribute("value");
		System.out.println(entermail);

		WebElement login = driver.findElement(By.name("SubmitCreate"));
		boolean abc = login.isEnabled();
		System.out.println("login :"+abc);
		login.click();
		
		Thread.sleep(4000);
		
		WebElement gender = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label"));
		gender.click();
		boolean ref = gender.isSelected();
		System.out.println("gender is selected :"+ref);
		

		WebElement firstname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstname.sendKeys("vimal");
		String name1 = firstname.getAttribute("value");
		System.out.println(name1);
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lastname.sendKeys("chandar");
		String name2 = lastname.getAttribute("value");
		System.out.println(name2);
	
		
		WebElement password =driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("Vim@123");
		String pass = password.getAttribute("value");
		System.out.println(pass);

		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		Select a1 = new Select(days);
		a1.selectByValue("24");

		WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
		Select a2 = new Select(months);
		a2.selectByIndex(11);

		WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
		Select a3 = new Select(years);
		a3.selectByVisibleText("1991  ");

	
		WebElement company = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[3]/input"));
		company.sendKeys("GREENS TECH");
		String office = company.getAttribute("value");
		System.out.println(office);
		
		WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("no 3 california street ");
		String z = address.getAttribute("value");
		System.out.println(z);
		
		
		WebElement address1 = driver.findElement(By.xpath("//input[@name='address2']"));
		address1.sendKeys("xyz");
		String z1 = address1.getAttribute("value");
		System.out.println(z1);
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("abcd");
		String z2 = city.getAttribute("value");
		System.out.println(z2);

		WebElement state =	driver.findElement(By.xpath("//select[@name='id_state']"));
		Select a4 = new Select(state);
		a4.selectByVisibleText("California");
		
		boolean check = a4.isMultiple();
		System.out.println("statecheck :"+check);


		WebElement mm = driver.findElement(By.xpath("//input[@id='postcode']"));
		mm.sendKeys("93657");
		String z5 = mm.getAttribute("value");
		System.out.println(z5);
		
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select a5 = new Select(country);
		a5.selectByValue("21");


		WebElement aa = driver.findElement(By.xpath("//textarea[@id='other']"));
		aa.sendKeys(" 9876543210");
		String z6 = aa.getAttribute("value");
		System.out.println(z6);

		WebElement bb = driver.findElement(By.xpath("//input[@name='phone']"));
		bb.sendKeys("044-123456789");
		String z7 = bb.getAttribute("value");
		System.out.println(z7);
		
		WebElement cc = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		cc.sendKeys("1234567890");
		String z8 = cc.getAttribute("value");
		System.out.println(z8);
		
		WebElement dd = driver.findElement(By.xpath("//input[@name='alias']"));
		dd.sendKeys("chennai");
		String z9 = dd.getAttribute("value");
		System.out.println(z9);
		
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
		TakesScreenshot vv =(TakesScreenshot) driver;
		File screen = vv.getScreenshotAs(OutputType.FILE);
		File ab = new File("C:\\Users\\VK\\eclipse-workspace\\selenium_project\\screenshot\\commons-io-2.11.0\\docs\\miniproject.png");
		FileHandler.copy(screen, ab);



	}

}
