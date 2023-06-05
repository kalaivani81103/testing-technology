package com.example.test5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5tc4 {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://j2store.net/free/");
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
    
        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.quit();
    }
	
}
