package com.example.test4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d4test3one {
	
	public static void main( String[] args )throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        //launching the url
        WebDriver driver = new EdgeDriver();
      
        String url="https://demo.opencart.com/index.php?route=account/register&language=en-gb";
		//Launchig the url
		driver.navigate().to(url);
        //maximizing the page
        //driver.manage().window().maximize();
        //filling the data in the webpage->inspect->input->copy->copy as pathxml
        ////*[@id="input-firstname"]
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Lavanya");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("S");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("s.lavanya@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Slavanya08");
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        Thread.sleep(3000);
        js.executeScript("window.ScrollBy(0,1500)" , "");
       
    }

}
