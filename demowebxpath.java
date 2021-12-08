package Practise_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement text = driver.findElement(By.xpath("//h5[text()='Student Registration Form']"));
		String a = text.getText();
		System.out.println(a);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vimal");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("chandar");

        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("vimal@gmail.com");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1234567890");



	}

}
