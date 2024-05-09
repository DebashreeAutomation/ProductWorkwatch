package WWproduct.testCases;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WWproduct.pageObjects.caseCreationThroughInterface;
import WWproduct.pageObjects.caseManagementPage;
import WWproduct.pageObjects.loginToWWproduct;
import WWproduct.pageObjects.wwWorkflow;
import WWproduct.utilities.ReadConfig;
import freemarker.template.utility.Constants;

public class Verify_PendAndReject_workflowOf_case extends BaseClassTest  {
	ReadConfig readconfig;
	 public String baseURL;
	 public String username;
	 public String password;
	 
	@Test(priority=1)
	 
	public void login() throws InterruptedException, IOException
	{
		readconfig=new ReadConfig();
		username=readconfig.getMyCredentials();
		password=readconfig.getPassword();
		baseURL=readconfig.getApplicationURL();
		driver.get(baseURL);
		
		if(driver.getTitle().equals("Privacy error"))
		{
			driver.findElement(By.id("details-button")).click();
			driver.findElement(By.id("proceed-link")).click();
		}
		else
		{
			System.out.println("proceed to login");
		}
		driver.manage().deleteAllCookies();
		loginToWWproduct login=new loginToWWproduct(driver);
		
		login.setUserName(username);
		login.clicknext();
		login.setPassword(password);
		login.clickSignin();
		login.clickyes();
		
		
		login.clickOkforAlreadyexistSession();
		if(driver.getTitle().equals("Workwatch"))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			if(driver.getTitle().equals("Authentication Problem"))
			{
				login.clickOkforAlreadyexistSession();
			}
			
		}
	
		
		caseManagementPage CM = new caseManagementPage(driver);
		 caseCreationThroughInterface CaseCreation=new caseCreationThroughInterface(driver);
		 wwWorkflow WorkflowAction= new wwWorkflow(driver);
	Thread.sleep(3000);
	//Case creation through Interface
	CaseCreation.Case_Creation();
	Thread.sleep(3000);
	CaseCreation.Case_Creation_byInterface();
	
	Thread.sleep(500);
	CaseCreation.setWorkType();
	Thread.sleep(1000);
	CaseCreation.EnterCasecount();
	Thread.sleep(1000);
	CaseCreation.SetUrgency();
	Thread.sleep(1000);
	CaseCreation.SetAssignedTo();
	Thread.sleep(1000);
	
	CaseCreation.ClickSubmit();
	
	//Pend the case
	Thread.sleep(2000);
	WorkflowAction.Taskprocessing();
	Thread.sleep(2000);
	WorkflowAction.clickstarticon();
	Thread.sleep(2000);
	WorkflowAction.ClickStartAction();
	Thread.sleep(2000);
	WorkflowAction.selectpend();
	WorkflowAction.selectActionReasn();
	WorkflowAction.entercommentsforcase();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.xpath("//*[@id=\"btnReset\"]"));
	 
       js.executeScript("arguments[0].scrollIntoView();", element);
       Thread.sleep(2000);
       WorkflowAction.ClickSubmit();
	
	
	Thread.sleep(2000);
	
	JavascriptExecutor js2=(JavascriptExecutor) driver;
	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"btnStartNonCoreActivity\"]"));
	 
       js.executeScript("arguments[0].scrollIntoView();", element2);
       Thread.sleep(2000);
       
       //update case and see the case journey in task processing
	WorkflowAction.Clickview_stsart();
	Thread.sleep(2000);
	WorkflowAction.ClickCaseUpdate();
	Thread.sleep(2000);
	WorkflowAction.entercaseupdateText();
	WorkflowAction.updateurgency();
	WorkflowAction.Clickupdate();
	//Copied the caseid from task processing
	String  caseIdTS= driver.findElement(By.xpath("//*[@id=\"btnAddAction\"]")).getText();
	Thread.sleep(2000);
	WorkflowAction.Clickview_stsart();
	Thread.sleep(2000);
	WorkflowAction.ClickCaseUpdate();
	Thread.sleep(2000);
	WorkflowAction.ClickCasejorney();
	Thread.sleep(2000);
	//JavascriptExecutor js1=(JavascriptExecutor) driver;
	//WebElement element1 = driver.findElement(By.xpath("//*[contains(text(),'\" + Case Updated + \"')]"));
	 
      // js.executeScript("arguments[0].scrollIntoView();", element1);
      
	
	
     //Reject the case  
       Thread.sleep(2000);
       WorkflowAction.ClickAction();
   	WorkflowAction.ClickStartAction();
   	Thread.sleep(2000);
    WorkflowAction.selectReject();
   	WorkflowAction.rejectcommentsforcase();
   	WorkflowAction.ClickSubmit();
    Thread.sleep(2000);
       
    
    
    //Check the case journey of the case through case journey
    CM.caseManagement();
    Thread.sleep(2000);
    CM.Casejourney();
    //Removed the default date from case journey and entered the caseid and searched the case
    WebElement date= driver.findElement (By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/input"));
    for (int i=0;i<=30;i++)
    	date.sendKeys(Keys.BACK_SPACE);
     Thread.sleep(2000);
    WebElement caseidInputbox= driver.findElement (By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div/div/div[1]/div[3]/div/div/input"));
    caseidInputbox.sendKeys(caseIdTS );
    CM.SearchCasejourney();
    Thread.sleep(2000);
    CM.firstcaseclick();
    Thread.sleep(2000);
    //download case details
	CM.downloadcasejourney1();
    Thread.sleep(2000);
    //download detail  case journey of that case
    CM.downloadcasejourney2();
    Thread.sleep(2000);
    //Check the case in Rejected bucket in case allocation page
    CM.CaseAllocation();
    Thread.sleep(5000);
    CM.Rejectedbucket();
    Thread.sleep(2000);
    WebElement searchboxInCaseAllocationPage=driver.findElement(By.xpath("//*[@id=\"FilteredCaseInfoGrid_filter\"]/label/input"));	
    searchboxInCaseAllocationPage.sendKeys(caseIdTS + "\n");
    Thread.sleep(2000);
    driver.close();
}
	
}
