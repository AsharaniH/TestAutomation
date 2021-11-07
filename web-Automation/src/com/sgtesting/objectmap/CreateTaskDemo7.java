package com.sgtesting.objectmap;

	import java.time.Duration;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class CreateTaskDemo7 {

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
				createproject();
				createtask();
				deletetask();
				deleteproject();
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
			static void createproject()
			{
				try
				{
					oBrowser.findElement(objectmap.getLocator("crtprct")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("crtprobtn")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("crtprojectbtn")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("crtpronam")).sendKeys("Demo");
					Thread.sleep(3000);
					oBrowser.findElement(objectmap.getLocator("crtprobutton")).click();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			static void createtask()
			{
				try
				{
					oBrowser.findElement(objectmap.getLocator("crttsk")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("crtnewtsk")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("crtnewtskwr")).sendKeys("Demo");
					Thread.sleep(3000);
					oBrowser.findElement(objectmap.getLocator("crttskbtn")).click();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			static void deletetask()
			{
				try
				{
					oBrowser.findElement(objectmap.getLocator("deletecreatedtask")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("dltatn")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("dlt")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("dltplt")).click();
					Thread.sleep(2000);			
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			static void deleteproject()
			{
				try
				{
					oBrowser.findElement(objectmap.getLocator("dltpr")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("dltactn")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("deltbttn")).click();
					Thread.sleep(2000);
					oBrowser.findElement(objectmap.getLocator("dltprntly")).click();
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

