package org.execute;


import org.base.GlobalClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSc extends GlobalClass {

	public static void main(String[] args) throws InterruptedException {
		GlobalClass global=new GlobalClass();
		global.getDriver("Chrome");
		global.windowMx();
		//base.windowMn();
		
		global.url("https://www.geeksforgeeks.org/");
		
		System.out.println("Parent Window:"+global.windowhandle());
		System.out.println("Parent URL"+global.getCurrentURL());
		
		
		WebElement course = driver.findElement(By.xpath("//a[text()='Full Stack Live Classes']"));
		global.clickbt(course);
		
		//System.out.println(driver.getWindowHandles());
		System.out.println("Parent Window:"+global.windowhandle());
		System.out.println("Parent URL"+global.getCurrentURL());
		
		global.windowhandles(1);
		
		global.closeWindow();
		
		global.windowhandles(0);
		System.out.println(global.getCurrentURL());
		
		
		

	}

}
