package com.sgtesting.objectmap;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreateUserDemo1 {
public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		deleteuser();
		logout();
	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver","D:\\CurrentWorkSpace\\TestAutomation\\web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginusernametxtfield")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpasswordtxtfield")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginloginbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageminimizeflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createuser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("userbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("adduserbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("firstname")).sendKeys("Demo");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("lastname")).sendKeys("User");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("email")).sendKeys("demouser@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userdetails")).sendKeys("DemoUser");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("password")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("repassword")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("savecreateduser")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteuser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("deletecreateduser")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("dltnbtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}


