package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//User Name WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//Minimize flyOut Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	
	//createUser
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a")
	private WebElement oUser;
	public WebElement getUser()
	{
		return oUser;
	}
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement oAdduser;
	public WebElement getAdduser()
	{
		return oAdduser;
	}
	private WebElement userDataLightBox_firstNameField;
	public WebElement getfirstname()
	{
		return userDataLightBox_firstNameField;
	}
	private WebElement userDataLightBox_lastNameField;
	public WebElement getlastname()
	{
		return userDataLightBox_lastNameField;
	}
	private WebElement userDataLightBox_emailField;
	public WebElement getEmail()
	{
		return userDataLightBox_emailField;
	}
  private WebElement userDataLightBox_usernameField;
  public WebElement getDetails()
  {
	  return userDataLightBox_usernameField;
  }
  private WebElement userDataLightBox_passwordField;
  public WebElement getpassword()
  {
	  return userDataLightBox_passwordField;
  }
  private WebElement userDataLightBox_passwordCopyField;
  public WebElement getRepassword()
  {
	  return userDataLightBox_passwordCopyField;
  }
  @FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
  private WebElement oCommit;
  public WebElement getoCommit()
  {
	  return oCommit;
  }
  
  //DeleteUser
  @FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")
  private WebElement oBtn;
  public WebElement getoBtn() 
  {
	  return oBtn;
  }
  @FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
  private WebElement oBtn1;
  public WebElement getoBtn1()
  {
	  return oBtn1;

  }
  //ModifyUser
  @FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[2]/div[2]")
  private WebElement oBtn2;
  public WebElement getoBtn2()
  {
	  return oBtn2;
  }
  @FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
 private WebElement oUserchange1;
 public WebElement getopasswordchange1() 
 {
	 return oUserchange1;
 }
 @FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
 private WebElement oUserchange2;
 public WebElement getopasswordchange2()
 {
	 return oUserchange2;
 }
  @FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
  private WebElement oChange;
  public WebElement getoChange()
  {
	  return oChange;
  }
  
  //CreateCustomer
  
  @FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")
  private WebElement oTask;
  public WebElement getoTask()
  {
	  return oTask;
  }
  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
  private WebElement oSelectc;
  public WebElement getoSelectc()
  {
	  return oSelectc;
  }
  @FindBy(xpath="/html/body/div[14]/div[1]")
  private WebElement oCreatec;
  public WebElement getoCreatec()
  {
	return oCreatec;  
  }
  @FindBy(xpath="//*[@id=\'customerLightBox_nameField\']")
  private WebElement oCreatec1;
  public WebElement getoCteatec1() 
  {
	  return oCreatec1;
  }
  @FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
  private WebElement oCommitbtn;
  public WebElement getoCommitbtn()
  {
	  return oCommitbtn;
  }
  
  
  //DeleteCustomer
  
  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")
  private WebElement oBtnc;
  public WebElement getoBtnc()
  {
	  return oBtnc;
  }
  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
  
  private WebElement oBtnc1;
  public WebElement getoBtnc1()
  {
	  return oBtnc1;
  }
  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
  private WebElement oAction;
  public WebElement getoAction()
  {
	  return oAction;
  }
  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
  private WebElement oAction1;
  public WebElement getoAction1()
  {
	  return oAction1;
  }
  @FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")
  private WebElement oDlt;
  public WebElement getoDlt()
  {
	  return oDlt;
 }
  
  //ModifyCustomer
  
  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")
  private WebElement oCust;
  public WebElement getoCust()
  {
	  return oCust;
 }
  
  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
  private WebElement oStng;
  public WebElement getoStng()
  {
	  return oStng;
  }
  
  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[1]")
  private WebElement oDesc;
  public WebElement getoDesc()
  {
	  return oDesc;
  }
  
  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
  private WebElement oDescwr;
  public  WebElement getoDescwr() 
  {
	  return oDescwr;
  }
  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
  private WebElement oModify;
  public WebElement getoModify()
  {
	  return oModify;
  }
  
  
  //CreateProject
  
  @FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")
  private WebElement oCrpr;
  public WebElement getoCrpr()
  {
	  return  oCrpr;
  }
  
  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[3]")
  private WebElement oSgpr;
  public WebElement getoSgpr()
  {
	  return  oSgpr;
  }
  
  @FindBy(xpath="/html/body/div[14]/div[2]")
  private WebElement oSgpro;
  public WebElement getoSgpro()
  {
	  return  oSgpro;
  }
  @FindBy(xpath="//*[@id=\'projectPopup_projectNameField\']")
  private WebElement oSgpron;
  public WebElement getoSgpron()
  {
	  return  oSgpron;
  }
  @FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
  private WebElement oCrprbtn;
  public WebElement getoCrprbtn()
  {
	  return  oCrprbtn;
  }
  
  //DeleteProject
  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
  private WebElement oDltpr;
  public WebElement getoDltpr()
  {
	  return oDltpr;
  }
  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
  private WebElement oDltpro;
  public WebElement getoDltpro()
  {
	  return oDltpro;
  }
  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
  private WebElement oDltproc;
  public WebElement getoDltproc()
  {
	  return oDltproc;
  }
  @FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
  private WebElement oDltprocject;
  public WebElement getoDltprocject()
  {
	  return oDltprocject;
  }
  
  
  //ModifyProject
  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
  private WebElement oMopr;
  public WebElement getoMopr()
  {
	  return oMopr;
  }

  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
  private WebElement oMoprojectwr;
  public WebElement getoMoprojectwr()
  {
	  return oMoprojectwr;
  }
  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
  private WebElement oMoproject;
  public WebElement getoMoproject()
  {
	  return oMoproject;
  }
  
  //CreatTask
  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
  private WebElement oCrta;
  public WebElement getoCrta()
  {
	  return oCrta;
  }
  @FindBy(xpath="/html/body/div[13]/div[1]")
  private WebElement oCrtask;
  public WebElement getoCrtask()
  {
	  return oCrtask;
  }
  @FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
  private WebElement oCrtaskwr;
  public WebElement getoCrtaskwr()
  {
	  return oCrtaskwr;
  }

  @FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
  private WebElement oCrtaskwrbtn;
  public WebElement getoCrtaskwrbtn()
  {
	  return oCrtaskwrbtn;
  }
  
  //DeleteTask
  @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
  private WebElement  oDlta;
  public WebElement getoDlta()
  {
	  return  oDlta;
  }
  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")
  private WebElement  oDltask;
  public WebElement getoDltask()
  {
	  return  oDltask;
  }
  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
  private WebElement  oDltask1;
  public WebElement getoDltask1()
  {
	  return  oDltask1;
  }
  @FindBy(xpath="//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")
  private WebElement  oDeletetask;
  public WebElement getoDeletetask() 
  {
	  return  oDeletetask;
  }
  
  //LoginUser1
  @FindBy(xpath="//*[@id=\'username\']")
  private WebElement  oLoginuse1;
  public WebElement getoLoginuse1() 
  {
	  return oLoginuse1;
  }
  @FindBy(xpath="//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
  private WebElement  oLoginuser1;
  public WebElement getoLoginuser1() 
  {
	  return oLoginuser1;
  }
  @FindBy(xpath="//*[@id=\'loginButton\']/div")
  private WebElement  oLoginuser;
  public WebElement getoLoginuser() 
  {
	  return oLoginuser;
  }
  

  //LoginUser2
  
  @FindBy(xpath="//*[@id=\'username\']")
  private WebElement  oLoginuse2;
  public WebElement getoLoginuse2() 
  {
	  return oLoginuse1;
  }
  @FindBy(xpath="//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
  private WebElement  oLoginuser2;
  public WebElement getoLoginuser2() 
  {
	  return oLoginuser1;
  }
  @FindBy(xpath="//*[@id=\'loginButton\']/div")
  private WebElement  oLoginusers;
  public WebElement getoLoginusers() 
  {
	  return oLoginusers;
  }
  
 //LoginUser3
  
  @FindBy(xpath="//*[@id=\'username\']")
  private WebElement  oLoginuse3;
  public WebElement getoLoginuse3() 
  {
	  return oLoginuse1;
  }
  @FindBy(xpath="//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
  private WebElement  oLoginuser3;
  public WebElement getoLoginuser3() 
  {
	  return oLoginuser1;
  }
  @FindBy(xpath="//*[@id=\'loginButton\']/div")
  private WebElement  oLoginusers3;
  public WebElement getoLoginusers3() 
  {
	  return oLoginusers;
  }

  
  
}
