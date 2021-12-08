package Practise_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation_demo_website {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK\\eclipse-workspace\\selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement text = driver.findElement(By.xpath("/html/body/section/div/h2"));
		String v = text.getText();
		System.out.println(v);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("vimal");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("chandar");

        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("tambaram chennai 600059");
        
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("vimal@gmail.com");
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("1234567890");
	    
	    driver.findElement(By.xpath("//input[@name='radiooptions']")).click();
        
	}

}
