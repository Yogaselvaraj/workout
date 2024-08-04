package org.mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.edureka.co/blog/what-is-setproperty-in-selenium/");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.xpath("//p[contains(text(),'primary')]"));
		System.out.println(findElement.getText());
		
		
		
	}

}
