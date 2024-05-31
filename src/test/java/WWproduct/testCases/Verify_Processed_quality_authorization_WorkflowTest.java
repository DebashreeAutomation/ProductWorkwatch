package WWproduct.testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import WWproduct.pageObjects.caseCreationThroughInterface;
import WWproduct.pageObjects.caseManagementPage;
import WWproduct.pageObjects.caseManagementpagefortestusers;
import WWproduct.pageObjects.loginToWWproduct;
import WWproduct.pageObjects.workflowForTestUser;
import WWproduct.pageObjects.wwWorkflow;
import WWproduct.utilities.ReadConfig;

public class Verify_Processed_quality_authorization_WorkflowTest extends BaseClassTest {
	ReadConfig readconfig;
	 public String baseURL;
	 public String username;
	 public String password;
	 public String PassWord;
	 //public String  TestUser1;
	 //public String Passsword1;
	
	 
	
	@Test(priority=1)
	 
	public void login() throws InterruptedException, IOException
	{
		readconfig=new ReadConfig();
		username=readconfig.getMyCredentials();
		password=readconfig.getPassword();
		PassWord=readconfig.getPassword();
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
				System.out.println("Advisor logged in successfully to WW product Application");
			}
			
		}
		
		caseManagementPage CM = new caseManagementPage(driver);
		caseCreationThroughInterface CaseCreation=new caseCreationThroughInterface(driver);
		  wwWorkflow WorkflowAction= new wwWorkflow(driver);
	Thread.sleep(3000);
	//case creation through interface
	CaseCreation.Case_Creation();
	Thread.sleep(3000);
	CaseCreation.Case_Creation_byInterface();
	Thread.sleep(3000);
	CaseCreation.setWorkType();
	Thread.sleep(3000);
	CaseCreation.EnterCasecount();
	Thread.sleep(3000);
	CaseCreation.SetUrgency();
	Thread.sleep(3000);
	CaseCreation.SetAssignedTo();
	Thread.sleep(3000);
	CaseCreation.ClickSubmit();
	Thread.sleep(3000);
	System.out.println("Advisor created case successfully");
	Thread.sleep(3000);
	
	//Processd the case
	WorkflowAction.Taskprocessing();
	Thread.sleep(3000);
	String  caseIdTS= driver.findElement(By.xpath("//*[@id='btnAddAction']")).getText();
	System.out.println("Caseid is" + caseIdTS);
	Thread.sleep(2000);
	WorkflowAction.clickstarticon();
	Thread.sleep(2000);
	WorkflowAction.ClickStartAction();
	Thread.sleep(2000);
	WorkflowAction.selectprocessed();
	Thread.sleep(2000);
	WorkflowAction.Processedcommentsforcase();
	Thread.sleep(2000);
	WorkflowAction.ClickSubmit();
	Thread.sleep(2000);
	System.out.println("Case is processed by advisor,case status changed to 'Sent for QC'");
	//Assign the case to quality team user
	CM.caseManagement();
	Thread.sleep(2000);
	CM.CaseAllocation();
	Thread.sleep(2000);
	CM.Outstandingbucket();
	Thread.sleep(2000);
	WebElement searchboxInCaseAllocationPage=driver.findElement(By.xpath("//*[@id='FilteredCaseInfoGrid_filter']/label/input"));	
    searchboxInCaseAllocationPage.sendKeys(caseIdTS + "\n");
    Thread.sleep(2500);
    CM.tickboxClick();
    Thread.sleep(2000);
    CM.eligibleEmployeeClick();
    Thread.sleep(2000);
    CM.debashreeEmployeeSelect();
    Thread.sleep(2000);
    CM.AllocatebtnClick();
    System.out.println("Case cannot be allocated to the user in quality team who has processed the case");
    Thread.sleep(2000);
	captureScreen(driver,"User cannot be assigned the case in quality team who has worked on the case previously");
	Thread.sleep(2500);
	WebElement searchboxInCaseAllocationpage=driver.findElement(By.xpath("//*[@id='FilteredCaseInfoGrid_filter']/label/input"));	
	searchboxInCaseAllocationpage.sendKeys(caseIdTS + "\n");
	Thread.sleep(2500);
	CM.tickboxClick();
	Thread.sleep(2000);
	CM.eligibleEmployeeClick();
	Thread.sleep(2000);
	CM.TejasLocalEmployeeSelect();
	Thread.sleep(2000);
	CM.AllocatebtnClick();
	Thread.sleep(2000);
	System.out.println("Case is allocated to Quality manager in quality team");
    driver.close();
	
	
	//Loginfor Testuser TejasLocal
	/*
	 * @Test(priority=2) public void testuserlogin() throws InterruptedException,
	 * IOException{
	 * 
	 * readconfig=new ReadConfig(); username=readconfig.getTestUser1();
	 * password=readconfig.getPasssword1(); baseURL=readconfig.getApplicationURL();
	 * driver.get(baseURL);
	 * 
	 * if(driver.getTitle().equals("Privacy error")) {
	 * driver.findElement(By.id("details-button")).click();
	 * driver.findElement(By.id("proceed-link")).click(); } else {
	 * System.out.println("proceed to login"); } driver.manage().deleteAllCookies();
	 * loginToWWproduct login1=new loginToWWproduct(driver);
	 * 
	 * login1.setUserName(TestUser1); login1.clicknext();
	 * login1.setPassword(Passsword1); login1.clickSignin(); login1.clickyes();
	 * 
	 * 
	 * login1.clickOkforAlreadyexistSession();
	 * if(driver.getTitle().equals("Workwatch")) { Assert.assertTrue(true);
	 * 
	 * } else { if(driver.getTitle().equals("Authentication Problem")) {
	 * login1.clickOkforAlreadyexistSession(); }
	 * 
	 * }
	 */
	
	// Logging to testuser- TejasLocal(p20000000@capitaindia.onmicrosoft.com)
	
	  WebDriver driver=new ChromeDriver(chromeOptions);
	  driver.manage().window().maximize(); driver.get(baseURL);
	  driver.manage().deleteAllCookies(); Thread.sleep(2500); WebDriverWait wait4 =
	  new WebDriverWait(driver, Duration.ofSeconds(120)); WebElement email=
	  wait4.until(ExpectedConditions.elementToBeClickable(By.xpath(
	  "//input[@type='email']")));
	  email.sendKeys("P20000000@capitaindia.onmicrosoft.com");
	  
	  WebDriverWait wait5= new WebDriverWait(driver, Duration.ofSeconds(120));
	  WebElement nextbtn=wait5.until(ExpectedConditions.elementToBeClickable(By.id(
	  "idSIButton9"))); nextbtn.click();
	  
	  WebDriverWait wait6= new WebDriverWait(driver, Duration.ofSeconds(120));
	  WebElement
	  password=wait6.until(ExpectedConditions.elementToBeClickable(By.xpath(
	  "//input[@name='passwd']"))); password.sendKeys("Capita#2024");
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	  WebElement signin= wait.until(ExpectedConditions.elementToBeClickable(By.
	  xpath("//input[@value='Sign in']"))); signin.click();
	  
	  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(120));
	  WebElement
	  yes=wait1.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9"))
	  ); yes.click();
	  
	  
	  WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(120));
	  WebElement ok=wait2.until(ExpectedConditions.elementToBeClickable(By.id(
	  "btnLoginConfirm"))); ok.click();
	  System.out.println("Quality manager logged in to WW product application");
	  caseManagementpagefortestusers CM1 = new caseManagementpagefortestusers(driver);
		//caseCreationThroughInterface CaseCreation1=new caseCreationThroughInterface(driver);
		workflowForTestUser WorkflowAction1= new workflowForTestUser(driver);
	 
	
	//Searching the case in task processing screen of TejasLocal
	//String  caseIdTS1= driver.findElement(By.xpath("//*[@id=\"btnAddAction\"]")).getText();
	Thread.sleep(2000);
	WebDriverWait wait7=new WebDriverWait(driver, Duration.ofSeconds(1000));
	WebElement searchboxInTaskprocessingPage=wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div/label/input")));	
	searchboxInTaskprocessingPage.sendKeys(caseIdTS + "\n");
	Thread.sleep(5000);
	String  caseIdTS1= driver.findElement(By.xpath("//*[@id='btnAddAction']")).getText();
	
	//Putting the case in pend state while the case is with quality team
	WorkflowAction1.clickstarticon();
	Thread.sleep(2000);
	WorkflowAction1.ClickStartAction();
	Thread.sleep(2000);
	WorkflowAction1.maincommentforqualitypend();
	Thread.sleep(2000);
	WorkflowAction1.ClickSubmit();
	Thread.sleep(2000);
	WorkflowAction1.selectpend();
	
	Thread.sleep(2000);
	WorkflowAction1.selectActionReasn();
	Thread.sleep(2000);
	WorkflowAction1.entercommentsforcase();
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.xpath("//*[@id='btnReset']"));
	 
       js.executeScript("arguments[0].scrollIntoView();", element);
       Thread.sleep(2000);
       WorkflowAction1.ClickSubmit();
       System.out.println("Quality manager searched the case in his task processing screen and put the case in pend state");
	
	Thread.sleep(2000);
	
	JavascriptExecutor js2=(JavascriptExecutor) driver;
	WebElement element2 = driver.findElement(By.xpath("//*[@id='btnStartNonCoreActivity']"));
	 
       js.executeScript("arguments[0].scrollIntoView();", element2);
       Thread.sleep(3000);
       
      // The case is put for rework
       WebDriverWait wait8=new WebDriverWait(driver, Duration.ofSeconds(530));
   	WebElement searchboxInTaskprocessingPageofTejasLocal=wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tblOutStandingQueue_filter']/label/input")));
   	searchboxInTaskprocessingPageofTejasLocal.sendKeys(caseIdTS1 + "\n");
       Thread.sleep(2000);
       WorkflowAction1.Clickview_stsart();
	Thread.sleep(2000);
	WorkflowAction1.ClickStartAction();
	//Thread.sleep(3000);
	//WorkflowAction1.bankdetailsNobtn();
	//Thread.sleep(3000);
	//WorkflowAction1.accNumberbtn();
	Thread.sleep(3000);
	WorkflowAction1.bankdetailscomment();
	Thread.sleep(3000);
	WorkflowAction1.accNumComment();
	Thread.sleep(2000);
	WorkflowAction1.maincommentforqualityRework();
	Thread.sleep(2000);
	WorkflowAction1.ClickSubmit();
	Thread.sleep(2000);
	WorkflowAction1.selectRework();
	Thread.sleep(2000);
	WorkflowAction1.CommentsforReworkinQualityteam();
	Thread.sleep(2000);
	WorkflowAction1.ClickSubmit();
	Thread.sleep(2000);
	System.out.println("Quality manager put the case in Rework state");
	CM1.caseManagement();
	Thread.sleep(2000);
	CM1.CaseAllocation();
	Thread.sleep(2000);
	CM1.reworkbucket();
	
	Thread.sleep(2000);
	WebDriverWait wait9=new WebDriverWait(driver, Duration.ofSeconds(1000));
	WebElement searchboxInCaseAllocationPageofTejasLocal=wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='FilteredCaseInfoGrid_filter']/label/input")));
	searchboxInCaseAllocationPageofTejasLocal.sendKeys(caseIdTS1 + "\n");
    Thread.sleep(2500);
    CM1.tickboxClick();
    Thread.sleep(2000);
	/*
	 * CM1.eligibleEmployeeClick(); Thread.sleep(2000);
	 * CM1.TejasLocalEmployeeSelect(); Thread.sleep(2000); CM1.AllocatebtnClick();
	 * Thread.sleep(2000); captureScreen(
	 * driver,"User Tejas Local cannot be assigned the case in quality team who has worked on the case previously"
	 * ); Thread.sleep(2500); CM1.tickboxClick(); Thread.sleep(2500);
	 * CM1.tickboxClick(); Thread.sleep(2000);
	 */
	CM1.eligibleEmployeeClick();
	Thread.sleep(2000);
	CM1.debashreeEmployeeSelect();
	Thread.sleep(2000);
	CM1.AllocatebtnClick();
	Thread.sleep(2000);
	System.out.println("The case is moved to Rework bucket, case status is Rework and it is again assigned to advisor");
	driver.close();
	
	
		
		//Login to debashree advisor
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
	  System.out.println("Advisor logged in successfully to WW Product application");
	  caseManagementPage CMDP = new caseManagementPage(driverDP);
		 wwWorkflow WorkflowActionDP= new wwWorkflow(driverDP);
		 
		 WebDriverWait wait24=new WebDriverWait(driverDP, Duration.ofSeconds(530));
		   	WebElement searchboxInTaskprocessingPageofDebashree=wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tblOutStandingQueue_filter']/label/input")));
		   	searchboxInTaskprocessingPageofDebashree.sendKeys(caseIdTS1 + "\n");
	
	Thread.sleep(2000);
	WorkflowActionDP.clickstarticon();
	Thread.sleep(2000);
	WorkflowActionDP.ClickStartAction();
	Thread.sleep(2000);
	WorkflowActionDP.selectprocessed();
	Thread.sleep(2000);
	WorkflowActionDP.Processedcommentsforcase();
	Thread.sleep(2000);
	WorkflowActionDP.ClickSubmit();
	Thread.sleep(2000);
	System.out.println("Advisor Processed the case and the case is again sent for quality");
	//Assign the case to quality team user
	CMDP.caseManagement();
	Thread.sleep(2000);
	CMDP.CaseAllocation();
	Thread.sleep(2000);
	CMDP.Outstandingbucket();
	WebDriverWait wait25=new WebDriverWait(driverDP, Duration.ofSeconds(1000));
	WebElement searchboxInCaseAllocationPageofDebashreeAdvisor=wait25.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='FilteredCaseInfoGrid_filter']/label/input")));
	searchboxInCaseAllocationPageofDebashreeAdvisor.sendKeys(caseIdTS1 + "\n");
	
	    Thread.sleep(2500);
	    CMDP.tickboxClick();
	    Thread.sleep(2000);
	    CMDP.eligibleEmployeeClick();
	    Thread.sleep(2000);
	    CMDP.TestUserEmployeeSelect();
	    Thread.sleep(2000);
	    CMDP.AllocatebtnClick();
	    Thread.sleep(2000);
	    System.out.println("Case is allocated to quality manager");
	    driverDP.close();
	    
	    
	    
	  //TESTUSER login
		
		WebDriver driver2=new ChromeDriver(chromeOptions);
		driver2.manage().window().maximize(); 
		driver2.get(baseURL);
		driver2.manage().deleteAllCookies(); Thread.sleep(2500); WebDriverWait wait10 =
		  new WebDriverWait(driver2, Duration.ofSeconds(120)); WebElement email1=
		  wait10.until(ExpectedConditions.elementToBeClickable(By.xpath(
		  "//input[@type='email']")));
		  email1.sendKeys("P20000001@capitaindia.onmicrosoft.com");
		  
		  WebDriverWait wait11= new WebDriverWait(driver2, Duration.ofSeconds(120));
		  WebElement nextbtn1=wait11.until(ExpectedConditions.elementToBeClickable(By.id(
		  "idSIButton9"))); nextbtn1.click();
		  
		  WebDriverWait wait12= new WebDriverWait(driver2, Duration.ofSeconds(120));
		  WebElement
		  password2=wait12.until(ExpectedConditions.elementToBeClickable(By.xpath(
		  "//input[@name='passwd']"))); password2.sendKeys("Capita@2024");
		  
		  WebDriverWait wait13 = new WebDriverWait(driver2, Duration.ofSeconds(120));
		  WebElement signin1= wait13.until(ExpectedConditions.elementToBeClickable(By.
		  xpath("//input[@value='Sign in']"))); signin1.click();
		  
		  WebDriverWait wait14 = new WebDriverWait(driver2, Duration.ofSeconds(120));
		  WebElement
		  yes1=wait14.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9"))
		  ); yes1.click();
		  
		  
		  WebDriverWait wait15 = new WebDriverWait(driver2, Duration.ofSeconds(120));
		  WebElement ok1=wait15.until(ExpectedConditions.elementToBeClickable(By.id(
		  "btnLoginConfirm"))); ok1.click();
		  System.out.println("Quality manager logged in to WW product application");
		  caseManagementpagefortestusers CM2 = new caseManagementpagefortestusers(driver2);
			workflowForTestUser WorkflowAction2= new workflowForTestUser(driver2);
		  
		  WebDriverWait wait16=new WebDriverWait(driver2, Duration.ofSeconds(530));
		   	WebElement searchboxInTaskprocessingPageforTESTUSER=wait16.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tblOutStandingQueue_filter']/label/input")));
		   	searchboxInTaskprocessingPageforTESTUSER.sendKeys(caseIdTS1 + "\n");
		 Thread.sleep(3000);
		    WorkflowAction2.Clickview_stsart();
			Thread.sleep(2000);
			WorkflowAction2.ClickStartAction();
			Thread.sleep(2000);
			WorkflowAction2.ClickSubmit();
			Thread.sleep(2000);
			WorkflowAction2.selectQualityCompleted();
			Thread.sleep(2000);
			WorkflowAction2.QualityCompletedcommentsforcase();
			Thread.sleep(2000);
			WorkflowAction2.ClickSubmit();
			Thread.sleep(2000);
			System.out.println("Quality manager completed Quality for the case");
			CM2.caseManagement();
			Thread.sleep(2000);
			CM2.CaseAllocation();
			Thread.sleep(2000);
			CM2.Outstandingbucket();
			Thread.sleep(2000);
			WebDriverWait wait17=new WebDriverWait(driver2, Duration.ofSeconds(1000));
			WebElement searchboxInCaseAllocationPageofTESTUSER=wait17.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='FilteredCaseInfoGrid_filter']/label/input")));
			searchboxInCaseAllocationPageofTESTUSER.sendKeys(caseIdTS1 + "\n");
		    Thread.sleep(2500);
		    CM2.tickboxClick();
		    Thread.sleep(2000);
		    CM2.eligibleEmployeeClick();
			Thread.sleep(2000);
			CM2.TestUserEmployeeSelect();
			Thread.sleep(2000);
			CM2.AllocatebtnClick();
			System.out.println("Case is available under outstanding tile in case allocation page with status 'Sent for Authorization'");
			Thread.sleep(2000);
			WorkflowAction2.Taskprocessing();
			Thread.sleep(3000);
			WebDriverWait wait27=new WebDriverWait(driver2, Duration.ofSeconds(530));
		   	WebElement searchboxInTaskprocessingforTESTUSER=wait27.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tblOutStandingQueue_filter']/label/input")));
		   	searchboxInTaskprocessingforTESTUSER.sendKeys(caseIdTS1 + "\n");
			Thread.sleep(3000);
		    WorkflowAction2.Clickview_stsart();
			Thread.sleep(2000);
			WorkflowAction2.ClickStartAction();
			Thread.sleep(2000);
			WorkflowAction2.selectpend();
			Thread.sleep(2000);
			WorkflowAction2.selectActionReasn();
			Thread.sleep(2000);
			WorkflowAction2.entercommentsforcase();
			
			JavascriptExecutor js3=(JavascriptExecutor) driver2;
			WebElement element3 = driver2.findElement(By.xpath("//*[@id='btnReset']"));
			 
		       js3.executeScript("arguments[0].scrollIntoView();", element3);
		       Thread.sleep(2000);
		       WorkflowAction2.ClickSubmit();
		       System.out.println("Authorizer put the case in pend state");
			
			Thread.sleep(3000);
			
			JavascriptExecutor js4=(JavascriptExecutor) driver2;
			WebElement element4 = driver2.findElement(By.xpath("//*[@id='btnStartNonCoreActivity']"));
			 
		       js4.executeScript("arguments[0].scrollIntoView();", element4);
		       Thread.sleep(4000);
		   	
		       WebDriverWait wait28=new WebDriverWait(driver2, Duration.ofSeconds(530));
			   	WebElement searchboxInTaskprocessingpageforTESTUSER1=wait28.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tblOutStandingQueue_filter']/label/input")));
		       searchboxInTaskprocessingpageforTESTUSER1.sendKeys(caseIdTS1 + "\n");
		       Thread.sleep(3000);
		       WorkflowAction2.Clickview_stsart();
			Thread.sleep(2000);
			WorkflowAction2.ClickStartAction();
			Thread.sleep(2000);
			WorkflowAction2.AuthorizationselectCompleted();
			Thread.sleep(2000);
			WorkflowAction2.AuthorizationCompletedcommentsforcase();
			Thread.sleep(2000);
			WorkflowAction2.ClickSubmit();
			System.out.println("Authorizer completed the case");
			Thread.sleep(2000);
			CM2.caseManagement();
			Thread.sleep(2000);
			CM2.CaseAllocation();
			Thread.sleep(2000);
			CM2.Completedbucket();
			WebDriverWait wait26=new WebDriverWait(driver2, Duration.ofSeconds(1000));
			WebElement searchboxInCaseAllocationpageofTESTUSER1=wait26.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='FilteredCaseInfoGrid_filter']/label/input")));
			searchboxInCaseAllocationpageofTESTUSER1.sendKeys(caseIdTS1 + "\n");
			Thread.sleep(3000);
			System.out.println("Case is closed and is moved to completed bucket in case allocation page");
		    CM2.Casejourney();
		    Thread.sleep(3000);
		    //Removed the default date from case journey and entered the caseid and searched the case
		    WebElement date= driver2.findElement (By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/input"));
		    for (int i=0;i<=30;i++)
		    	date.sendKeys(Keys.BACK_SPACE);
		     Thread.sleep(2000);
		   WebElement caseidInputbox= driver2.findElement (By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div/div/div[1]/div[3]/div/div/input"));
		    caseidInputbox.sendKeys(caseIdTS1  );
		    Thread.sleep(2000);
		    CM2.SearchCasejourney();
		    Thread.sleep(2000);
		    CM2.firstcaseclick();
		    Thread.sleep(2000);
		    //download case details
		    CM2.downloadcasejourney1();
		    Thread.sleep(2000);
		    //download detail  case journey of that case
		    CM2.downloadcasejourney2();
		    Thread.sleep(2000);
		    System.out.println("Case journey for that case is downloaded");
			driver2.close();
	}
}


	
	
	
	

