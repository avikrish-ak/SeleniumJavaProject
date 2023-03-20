package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");		
		Actions action = new Actions(driver);
		WebElement btn= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(btn).build().perform();
	}

}
