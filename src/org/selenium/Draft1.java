package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.awt.AWTEvent;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot; 

public class Draft1 {
	public static WebDriver dr;
	public static void browser() {
	dr = new ChromeDriver();
	}
	
	public static void url() {
		dr.get("https://www.amazon.in/");
	}
	
	public static void maxi() {
		dr.manage().window().maximize();
		

	}
	
	public static void getUrl() {
		String currentUrl = dr.getCurrentUrl();
		System.out.println(currentUrl);

	}
	 public static void title() {
	    String title = dr.getTitle();
        System.out.println(title);
	}
	 
	
	public static void main(String[] args) throws AWTException {
		browser();
		url();
		maxi();
		getUrl();
		title();
		WebElement search = dr.findElement(By.xpath("//input[@aria-label ='Search Amazon.in']"));
		search.sendKeys("bluethooth speaker");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//public static void main(String[] args) throws InterruptedException,AWTException, IOException {
//	WebDriver dr = new ChromeDriver();
//	
//	
//	dr.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=CjwKCAjwko21BhAPEiwAwfaQCN8ywKzlxIgAuz3Zl5h3hnwlOtJmjdVqk73CFSg944XNIv2_NATzPRoCkkUQAvD_BwE");
//	dr.manage().window().maximize();
//	Thread.sleep(8000);
//	
// 	WebElement search = dr.findElement(By.xpath("(//a[text() = 'Beauty'])[1]"));
// 	
//    
//	Actions a = new Actions(dr);
//	a.moveToElement(search).perform();
//	
//	Robot r = new Robot();
//for (int i = 1; i <=4; i++) {
//		
//	
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);}
//
//    r.keyPress(KeyEvent.VK_ENTER);
//    r.keyRelease(KeyEvent.VK_ENTER);
// TakesScreenshot ss = (TakesScreenshot)dr;
// File src = ss.getScreenshotAs(OutputType.FILE);
// File dest = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\Screenshot\\myntra.png") ;
//	FileUtils.copyFile(src, dest);

	
//https://netbanking.hdfcbank.com/netbanking/
//	WebElement cont = dr.findElement(By.xpath("//a[text() = 'CONTINUE']"));
//	cont.click();
//	Thread.sleep(3000);
//	Alert a = dr.switchTo().alert();
//	a.accept();	
	
	
	
	
	
//	WebElement al = dr.findElement(By.xpath("//a[text() = 'Log in']"));
//	al.click();
//	WebElement us = dr.findElement(By.xpath("(//input[@type = 'text'])[4]"));
//	Thread.sleep(3000);
//	us.sendKeys("sudharsan");
//	
//	WebElement pass = dr.findElement(By.xpath("(//input[@type = 'password'])[2]"));
//	pass.sendKeys("asdfghj");
//	
//	WebElement log = dr.findElement(By.xpath("//button[text() = 'Log in']"));
//	log.click();
//	Thread.sleep(3000);
//	Alert a = dr.switchTo().alert();
//	Thread.sleep(3000);
//	
//	a.accept();
	
	
//	WebElement s1 = dr.findElement(By.xpath("//a[text() = ' 5000']"));
//	WebElement d1 = dr.findElement(By.xpath("(//li [@class=\"placeholder\"])[2]"));
//	WebElement s2 = dr.findElement(By.xpath("//a[text() = ' 5000']"));
//	WebElement d2 = dr.findElement(By.xpath("(//li[@class=\"placeholder\"])[4]"));
//	WebElement s3 = dr.findElement(By.xpath("//a[text()=\" BANK \"]"));
//	WebElement d3 = dr.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
//	WebElement s4 = dr.findElement(By.xpath("//a[text() =' SALES ']"));
//	WebElement d4 = dr.findElement(By.xpath("(//li[@class=\"placeholder\"])[3]"));
//	
//	
//	Actions ar = new Actions(dr);
//	
//	ar.dragAndDrop(s1, d1).perform();
//	ar.dragAndDrop(s2, d2).perform();
//	ar.dragAndDrop(s3, d3).perform();
//	ar.dragAndDrop(s4, d4).perform();
	
	
	
	
//	WebElement al = dr.findElement(By.xpath("(//button[@onclick='myFunction()'])[1]"));	
	
	
	
	
	
	
	
	
	
//	WebElement email = dr.findElement(By.xpath("//input[@name=\"email\"]"));
//	
//	Actions ar = new Actions(dr);
//	ar.sendKeys(email, "susan").perform();
//	ar.doubleClick(email);
//	ar.contextClick(email).perform();
//	
//	Robot r = new Robot();
//	for (int i = 1; i <= 8; i++) {
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//	}
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
//	r.keyPress(KeyEvent.VK_TAB);
//	r.keyRelease(KeyEvent.VK_TAB);
//	
//	r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_V);
//	r.keyRelease(KeyEvent.VK_CONTROL);
//	r.keyRelease(KeyEvent.VK_V);
	
	
}

