package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class GlobalClass {
	public static WebDriver driver;
	
	public Alert alert;

	public void windowMx() {
		driver.manage().window().maximize();
	}

	public void url(String website) {
		driver.get(website);
	}

	public void screenShot(String name)  {
		try {
		TakesScreenshot shot=(TakesScreenshot)driver;
		
		File sourcefile=shot.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("H:\\Eclipse Workspace\\WorkOut\\ScreenCap\\"+name+".png");
		
		FileUtils.copyFile(sourcefile, destinationfile);
		}
		
		catch(Exception e) {
			
		}
		
	}

	public void sendkey(WebElement e,String user) {
		e.sendKeys(user);
	}

	public void clickbt(WebElement e3) {
		e3.click();
	}


	public void getDriver(String drv) {
		switch (drv) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
	

		default:
			System.out.println("Invalid Driver");
		}			
	}

	public void alertOK() {
		alert = driver.switchTo().alert();
		alert.accept();
	}

	public void alertCANCEL() {
		alert=driver.switchTo().alert();
		alert.dismiss();
	}

	public void alertText(String text) {
		alert=driver.switchTo().alert();
		alert.sendKeys(text);
	}

	public void switchframe(int index) {
		driver.switchTo().frame(index);	
	}

	public int framesize(String framename) {
		List<WebElement> list = driver.findElements(By.tagName(framename));
		int size = list.size();
		
		return size;
		
	}

	public void switchToParentFrame() {
		driver.switchTo().parentFrame();	
	}

	public void switchToMainPageFrame() {
		driver.switchTo().defaultContent();
		
	}

	public String windowhandle() {
		String parentId = driver.getWindowHandle();
		
		return parentId;
		
		
	}

	public void windowhandles(int index) {
		Set<String> handles = driver.getWindowHandles();
		//System.out.println(handles);
		
		List<String> list=new LinkedList<String>();
		list.addAll(handles);
		//System.out.println(list);
		
		driver.switchTo().window(list.get(index));	
	}

	public String getCurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void getPageTitle() {
		System.out.println(driver.getTitle());
		
	}

	public void closeWindow() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
