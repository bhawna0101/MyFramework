/*package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream("D:/EclipseWorksapce/MyFrameworkArt/src/main/java/com/crm/qa/config/config.properties");
		prop.load(fs);
		String browser = prop.getProperty("browser");
		
	System.out.println(prop.getProperty("browser"));
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.out.println(System.getProperty("user.dir"));
		//System.setProperty("webdriver,chrome.driver", value);
		driver=new ChromeDriver();
	}
	}
}
*/