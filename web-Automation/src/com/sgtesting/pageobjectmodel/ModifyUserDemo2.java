package com.sgtesting.pageobjectmodel;
	import java.time.Duration;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class ModifyUserDemo2 {
		public static WebDriver oBrowser=null;
		public static ActiTimePage oPage=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			createUser();
			modifyUser();
			deleteUser();
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
		static void createUser()
		{
			try
			{
				oPage.getUser().click();
				Thread.sleep(2000);
				oPage.getAdduser().click();
				Thread.sleep(2000);
				oPage. getfirstname().sendKeys("Demo");
				Thread.sleep(4000);
				oPage.getlastname().sendKeys("User");
				Thread.sleep(4000);
				oPage.getEmail().sendKeys("DemoUser@gmail.com");
				Thread.sleep(4000);
				oPage. getDetails().sendKeys("DemoUser");
				Thread.sleep(4000);
				oPage.getpassword().sendKeys("123");
			    Thread.sleep(4000);
			    oPage.getRepassword().sendKeys("123");
			    Thread.sleep(4000);
			    oPage.getoCommit().click();
			    Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		static void modifyUser()
		{
		 try
		{
			oPage.getoBtn2().click();
			Thread.sleep(2000);
			oPage. getopasswordchange1() .sendKeys("456");
			Thread.sleep(4000);
			oPage. getopasswordchange2() .sendKeys("456");
			Thread.sleep(4000);
			oPage.getoChange().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
			static void deleteUser()
			{
				try
				{
					oPage.getoBtn().click();
					Thread.sleep(2000);
					oPage.getoBtn1().click();
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
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}

	}


