package com.example.test4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d4test3four {

	public static void main( String[] args )throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        //launching the url
        WebDriver driver = new EdgeDriver();
      
        String url="https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb";
		//Launchig the url
		driver.navigate().to(url);
        //maximizing the page
        //driver.manage().window().maximize();
        //filling the data in the webpage->inspect->input->copy->copy as pathxml
        ////*[@id="input-firstname"]
        driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Lavanya");
        driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("s.lavanya@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("nivaas");
        driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("Slavanya08");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3800)" , "");
        Thread.sleep(5000); 
        driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Happy Birthday!!!");
        driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
        
      
       // js.executeScript("window.scrollBy(0,3800)" , "");
        
        
       
    }
}
