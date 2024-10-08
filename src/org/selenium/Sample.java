package org.selenium;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	public static void main(String[] args)  {
		WebDriver dr = new ChromeDriver();
			
		dr.get("https://www.youtube.com/");
		dr.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)dr;
		
		WebElement search = dr.findElement(By.xpath("//textarea[@id = 'APjFqb']"));
		
		js.executeScript("arguments[0].setAttribute('value','horoscope')", search);
		
		
		WebElement google = dr.findElement(By.xpath("(//span[text() ='Horoscope.com'])[1]"));
		
		Actions a = new Actions(dr);
		
		Actions moveToElement = a.moveToElement(google);
		a.doubleClick(google);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	Robot ro = new Robot();
		
//		WebElement search = dr.findElement(By.xpath("(//a[@href='javascript:void(0);'])[3]"));
//		search.click();
//		
//		WebElement okey = dr.findElement(By.xpath("//a[text() = 'Ok']"));
//		okey.click();
//		okey.clear();
//		okey.sendKeys("headphones");
		
		//okey.sendKeys("headphones");
		
//		WebElement list = dr.findElement(By.xpath("//img[@src='https://cdn.shopclues.com/images1/thumbnails/77696/280/1/133223983-77696184-1668507502.jpg']"));
//		list.click();
//	
//		WebElement crtacc = dr.findElement(By.xpath("//a[text() ='Create new account']"));
//		crtacc.click();
//		
//		Thread.sleep("5000");
//		
//		WebElement ratio = dr.findElement(By.xpath("(//input[@type=\"radio\"])[3]"));
//		ratio.click();
		

	}}
