package com.example.test5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5tc3 {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://j2store.net/free/");
        Thread.sleep(5000);

        driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
        

        // Find all the item names displayed on the screen//*[@id="t3-content"]
        List<WebElement> itemElements = driver.findElements(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]"));

        // Print the names of the items
        for(int i = 0; i< itemElements.size(); i++) {
            //obtain text
            String s = itemElements.get(i).getText();
            System.out.println(s);

        driver.quit();
        }
    }
	
}
