package com.sgtesting.objectmap;

	import java.time.Duration;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class ModifyCustomerDemo4 {

			public static WebDriver oBrowser=null;
			
			public static String path=System.getProperty("user.dir");
			public static String filename=path+"\\ObjectMap\\objectmap.properties";
			public static ObjectMap objectmap=null;
			public static void main(String[] args) {
				launchBrowser();
				navigate();
				login();
				minimizeFlyOutWindow();
				createcustomer();
				modifycustomer();
				deletecustomer();
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
			
			static void createcustomer()
			{
				try
				{
					oBrowser.findElement(objectmap.getLocator("createbtn")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("addnewbtn")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("createcustomer")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("crtcustname")).sendKeys("Demo");
					Thread.sleep(3000);
					oBrowser.findElement(objectmap.getLocator("crtbtn")).click();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			static void modifycustomer()
			{
				try
				{
					oBrowser.findElement(objectmap.getLocator("modcustu")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("modcustbtn")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("modcustwr")).sendKeys("DemoUser");
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("modcustcr")).click();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			static void deletecustomer()
			{
				try
				{
					oBrowser.findElement(objectmap.getLocator("deletcustmrbtn")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("dltcustbtn")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("actnbtn")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("delete")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("dltpermntly")).click();
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


