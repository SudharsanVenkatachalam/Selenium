package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;

public class Sample2 {
public static  void main(String[] args) throws InterruptedException, IOException, AWTException {
	WebDriver dr = new ChromeDriver();
	dr.get("https://demo.guru99.com/test/write-xpath-table.html");
	dr.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement countries = dr.findElement(By.xpath("//table[@border ='l']"));
	
	List<WebElement> rows = countries.findElements(By.tagName("tr"));
     WebElement row = rows.get(0);
     List<WebElement> data = row.findElements(By.tagName("td"));
	
      for (int i = 0; i < data.size(); i++) {
		WebElement date = data.get(i);
    	  String text = date.getText();
    	  System.out.println(text);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
}
}
