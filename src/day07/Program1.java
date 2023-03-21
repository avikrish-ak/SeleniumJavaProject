package day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program1 {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//driver.switchTo().frame("singleframe");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Test");
		driver.switchTo().defaultContent();		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
	
	}

}
