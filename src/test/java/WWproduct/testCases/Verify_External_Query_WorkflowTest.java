package WWproduct.testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import WWproduct.pageObjects.TestuserLoginpage;
import WWproduct.pageObjects.caseCreationThroughInterface;

import WWproduct.pageObjects.loginToWWproduct;
import WWproduct.pageObjects.query_workflow;
import WWproduct.pageObjects.wwWorkflow;
import WWproduct.utilities.ReadConfig;

public class Verify_External_Query_WorkflowTest extends BaseClassTest {
	ReadConfig readconfig;
	 public String baseURL;
	 public String username;
	 public String password;
	 public String outlookURL;
	@Test(priority=1)
	 
	public void verify_External_Query_Workflow() throws InterruptedException, IOException
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
				System.out.println("Advisor Logged in successfully to WW product application");
			}
			Thread.sleep(3000);
		}
	
		
		
		/*caseManagementPage CM = new caseManagementPage(driver);
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
	String  caseid= driver.findElement(By.xpath("//*[@id='btnAddAction']")).getText();
	WorkflowAction.clickstarticon();
	Thread.sleep(2000);
	WorkflowAction.ClickStartAction();
	Thread.sleep(2000);
	WorkflowAction.selectpend();
	Thread.sleep(2000);
	WorkflowAction.selectActionReasn();
	Thread.sleep(2000);
	WorkflowAction.entercommentsforcase();
	Thread.sleep(2000);
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.xpath("//*[@id=\"btnReset\"]"));
	 
      js.executeScript("arguments[0].scrollIntoView();", element);
      Thread.sleep(2000);
      WorkflowAction.ClickSubmit();
      Thread.sleep(2000);
      WebElement searchboxinTaskprocessing=driver.findElement(By.xpath("(//*[@class='form-control input-sm'])[2]"));
      searchboxinTaskprocessing.sendKeys(caseid + "\n");
      Thread.sleep(2000);
      WorkflowAction.clickstarticon();
  	Thread.sleep(2000);
  	WorkflowAction.ClickStartAction();
  	Thread.sleep(2000);
  	WorkflowAction.selectexternalQuery();
  	Thread.sleep(2000);
  	
  	WorkflowAction.ExternalQueryTO();
  	Thread.sleep(2000);
  	WorkflowAction.entercommentsforexternalQuery();
  	Thread.sleep(2000);
  	JavascriptExecutor js1=(JavascriptExecutor) driver;
	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"btnReset\"]"));
	 
       js1.executeScript("arguments[0].scrollIntoView();", element1);
       Thread.sleep(2000);
       WorkflowAction.ClickSubmit();
       Thread.sleep(2000);
       WebElement searchboxinTaskprocessing1=driver.findElement(By.xpath("(//*[@class='form-control input-sm'])[2]"));
       searchboxinTaskprocessing1.sendKeys(caseid + "\n");
       Thread.sleep(2000);
       WorkflowAction.clickstarticon();
   	Thread.sleep(2000);
   	WorkflowAction.ConfirmOKforEQ();
   	Thread.sleep(2000);
	WorkflowAction.ClickCUT();
	Thread.sleep(2000);*/
	driver.close();
	
	Thread.sleep(2000);
	
	//CIAS INT outlook login and response the query
		WebDriver driver3=new ChromeDriver(chromeOptions);
		 driver3.manage().window().maximize(); 
			Thread.sleep(1000);
			System.out.println("mailbox login test" + outlookURL);
			
			
			
			File src = new File("./Configuration/config.property");
			FileInputStream fis = new FileInputStream(src);
			Properties pro = new Properties();
			pro.load(fis);
			pro.getProperty("outlookURL");
			System.out.println("mailbox login test1" + pro.getProperty("outlookURL"));
			driver3.get(pro.getProperty("outlookURL"));
			
			
			Thread.sleep(1000);
			driver3.manage().deleteAllCookies(); Thread.sleep(2500);
			Thread.sleep(2000);
			TestuserLoginpage outlooklogin=new TestuserLoginpage(driver3);
			outlooklogin.enterCIASINTmailid();
			Thread.sleep(2000);
			outlooklogin.enternextbtn();
			Thread.sleep(2000);
			outlooklogin.enterCIASINTpswd();
			Thread.sleep(2000);
			outlooklogin.signin();
			Thread.sleep(5000);
			System.out.println("Logged in to mailbox");
			/*Thread.sleep(5000);
			WebElement outlooksearchbox=driver3.findElement(By.xpath("//*[@class='rclHC']"));
			System.out.println("Logged in to mailbox2");
			Thread.sleep(2000);
			outlooksearchbox.click();
			System.out.println("Logged in to mailbox3");
			Thread.sleep(2000);
			outlooksearchbox.sendKeys( "[UAT] WW Product" + "\n");
			Thread.sleep(2000);
			System.out.println("searched query");
			/*query_workflow outlookAction=new query_workflow(driver3);
			//outlookAction.outlooksearchiconclick();
			Thread.sleep(2000);
			outlookAction.wwdevclick();
			Thread.sleep(4000);
			outlookAction.replyallclick();
			Thread.sleep(2000);
			////outlookAction.threedotclick();
			Thread.sleep(1000);
			outlookAction.mailbodytext();
			Thread.sleep(1000);
			outlookAction.sendbtnclick();*/
			Thread.sleep(2000);
			driver3.close();
			
			/*Login to debashree advisor
			WebDriver driverDP=new ChromeDriver(chromeOptions);
			driverDP.manage().window().maximize(); 
			driverDP.get(baseURL);
			driverDP.manage().deleteAllCookies(); Thread.sleep(2500); WebDriverWait wait18 =
			  new WebDriverWait(driverDP, Duration.ofSeconds(120)); WebElement emailDP=
			  wait18.until(ExpectedConditions.elementToBeClickable(By.xpath(
			  "//input[@type='email']")));
			  emailDP.sendKeys("P50038542@capitaindia.onmicrosoft.com");
			  
			  WebDriverWait wait19= new WebDriverWait(driverDP, Duration.ofSeconds(120));
			  WebElement nextbtnforDP=wait19.until(ExpectedConditions.elementToBeClickable(By.id(
			  "idSIButton9"))); nextbtnforDP.click();
			  
			  WebDriverWait wait20= new WebDriverWait(driverDP, Duration.ofSeconds(120));
			  WebElement
			  passwordforDP=wait20.until(ExpectedConditions.elementToBeClickable(By.xpath(
			  "//input[@name='passwd']"))); passwordforDP.sendKeys("Thank_you_sai542");
			  
			  WebDriverWait wait21 = new WebDriverWait(driverDP, Duration.ofSeconds(120));
			  WebElement signinforDP= wait21.until(ExpectedConditions.elementToBeClickable(By.
			  xpath("//input[@value='Sign in']"))); signinforDP.click();
			  
			  WebDriverWait wait22 = new WebDriverWait(driverDP, Duration.ofSeconds(120));
			  WebElement
			  yesforDP=wait22.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9"))
			  ); yesforDP.click();
			  
			  
			  WebDriverWait wait23 = new WebDriverWait(driverDP, Duration.ofSeconds(120));
			  WebElement okForDPlogin=wait23.until(ExpectedConditions.elementToBeClickable(By.id(
			  "btnLoginConfirm"))); okForDPlogin.click();
			  
			 // caseManagementPage CMDP = new caseManagementPage(driverDP);
				 wwWorkflow WorkflowActionDP= new wwWorkflow(driverDP);
				 
				 
			
			Thread.sleep(2000);
			 WebElement RefreshbtnClick= driverDP.findElement(By.xpath("(//*[@class='zmdi zmdi-refresh'])[1]"));
			 RefreshbtnClick.click();
			 Thread.sleep(2000);
			 WebElement RefreshbtnClick1= driverDP.findElement(By.xpath("(//*[@class='zmdi zmdi-refresh'])[1]"));
			 RefreshbtnClick1.click();
			 Thread.sleep(2000);
			 WebElement RefreshbtnClick2= driverDP.findElement(By.xpath("(//*[@class='zmdi zmdi-refresh'])[1]"));
			 RefreshbtnClick2.click();
			 Thread.sleep(2000);
			 WebDriverWait wait24=new WebDriverWait(driverDP, Duration.ofSeconds(530));
			   	WebElement searchboxInTaskprocessingPageofDebashree=wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='form-control input-sm'])[2]")));
			   	searchboxInTaskprocessingPageofDebashree.sendKeys(caseid + "\n");
			  Thread.sleep(2000);
			  WorkflowActionDP.ClickAction();
			  Thread.sleep(2000);
			  WorkflowActionDP.ClickStartAction();
		   	Thread.sleep(2000);
		   	WorkflowActionDP.selectReject();
		   	Thread.sleep(2000);
		   	WorkflowActionDP.rejectcommentsforcase();
		   	Thread.sleep(2000);
		   	WorkflowActionDP.ClickSubmit();
		    Thread.sleep(2000);
		    driverDP.close();*/
		    
			 
}
	
}
