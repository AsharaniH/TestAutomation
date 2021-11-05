package com.sgtesting.pageobjectmodel;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CreateTaskDemo7 {

		public static WebDriver oBrowser=null;
		public static ActiTimePage oPage=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			createcustomer();
			createproject();
			createtask();
			deletetask();
			deletproject();
			deletecustomer();
		    logout();
		//	closeApplication();
		}
		
		static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\web-Automation\\Library\\Driver\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oPage=new ActiTimePage(oBrowser);
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
				oPage.getUserName().sendKeys("admin");
				oPage.getPassword().sendKeys("manager");
				oPage.getLogin().click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void minimizeFlyOutWindow()
		{
			try
			{
				oPage.getFlyOutWindow().click();
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
				oPage.getoTask().click();
				Thread.sleep(2000);
				oPage.getoSelectc().click();
				Thread.sleep(2000);
				oPage.getoCreatec().click();
				Thread.sleep(2000);
				oPage.getoCteatec1().sendKeys("Demo");
				Thread.sleep(4000);
				oPage.getoCommitbtn().click();
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
				oPage.getoCrpr().click();
				Thread.sleep(2000);
				oPage.getoSgpr().click();
				Thread.sleep(2000);
				oPage.getoSgpro().click();
				Thread.sleep(2000);
				oPage.getoSgpron().sendKeys("Demo");
				Thread.sleep(3000);
				oPage.getoCrprbtn().click();
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
				oPage.getoCrta().click();
				Thread.sleep(2000);
				oPage.getoCrtask().click();
				Thread.sleep(2000);
				oPage.getoCrtaskwr().sendKeys("DemoUser");
				Thread.sleep(3000);
				oPage.getoCrtaskwrbtn().click();
				Thread.sleep(2000);
				oPage.getoDlta().click();
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
				oPage. getoDltask().click();
				Thread.sleep(2000);
				oPage.getoDltask1().click();
				Thread.sleep(2000);
				oPage.getoDeletetask().click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void deletproject()
		{
			try
			{
				oPage.getoDltpr().click();
				Thread.sleep(2000);
				oPage.getoDltpro().click();
				Thread.sleep(2000);
				oPage.getoDltproc().click();
				Thread.sleep(2000);
				oPage.getoDltprocject().click();
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
				oPage.getoBtnc().click();
				Thread.sleep(2000);
				oPage.getoBtnc1().click();
				Thread.sleep(2000);
				oPage.getoAction().click();
				Thread.sleep(2000);
				oPage.getoAction1().click();
				Thread.sleep(2000);
				oPage.getoDlt().click();
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
				oPage.getLogout().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void closeApplication()
		{
			try
			{
				oBrowser.quit();
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}

	}



