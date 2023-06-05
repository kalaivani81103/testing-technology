package com.example.test8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8tc4 {

	public static void main(String args[]) throws InterruptedException{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		WebElement value=driver.findElement(By.xpath("//*[@id=\"source\"]"));
		value.sendKeys("Coimbatore");
		WebElement value1=driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		value1.sendKeys("Chennai");
		//WebElement value2=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		//value2.sendKeys("");
		WebElement datepick=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '03/06/2023')",datepick);
	}
	
}
