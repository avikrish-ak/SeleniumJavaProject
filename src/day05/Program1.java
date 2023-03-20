package day05;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Program1 {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		headerValidation();
		getCompanyNames();

	}

	public static void getCompanyNames() {
		
		 List<WebElement> companyList = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//td[1]"));
		 List<String> companyNameList = new ArrayList<>();
		 for(WebElement name:companyList)
		 {
			 companyNameList.add(name.getText());
		 }
		 System.out.println(companyNameList);
	}
		

	public static void headerValidation()
	{
		List<WebElement> headers = driver.findElements(By.xpath("//table[@class='dataTable']//th"));

		if(headers.size()==5)
		{
			for(WebElement xpath:headers)
			{
				System.out.println(xpath.getText());
			}
		}
		else
		{
			System.out.println("Header Size not match");
		}
	}



}
