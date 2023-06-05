package com.example.test5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5tc2 {

public static void main(String args[])throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String getUrl=driver.getCurrentUrl();
		System.out.print(getUrl);
		String expect="https://j2store.net/free/";
		if(getUrl.equals(expect))
			System.out.print("true");
		else
			System.out.print("false");
		
//		WebElement clothingLink = driver.findElement(By.linkText("Clothing"));
//        clothingLink.click();
		Thread.sleep(8000);
		driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
        getUrl = driver.getCurrentUrl();
        System.out.println("Current URL after clicking Clothing link: " + getUrl);

        
        String expectedClothingUrl = "https://j2store.net/free/index.php/shop?filter_catid=11";
        if (getUrl.equals(expectedClothingUrl)) {
            System.out.println("URL is correct.");
        } else {
            System.out.println("URL is incorrect.");
        }

        driver.quit();
		
	}
	
}
