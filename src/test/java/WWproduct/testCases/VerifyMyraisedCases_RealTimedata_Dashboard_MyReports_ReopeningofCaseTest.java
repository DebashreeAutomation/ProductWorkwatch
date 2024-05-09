package WWproduct.testCases;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import WWproduct.pageObjects.Dashboard_TaskprocessingPage;
import WWproduct.pageObjects.caseCreationThroughInterface;
import WWproduct.pageObjects.caseManagementPage;
import WWproduct.pageObjects.loginToWWproduct;
import WWproduct.pageObjects.myRaisedcase;
import WWproduct.pageObjects.myReports_TaskprocessingPage;
import WWproduct.pageObjects.realtime_taskprocessingPage;
import WWproduct.pageObjects.wwWorkflow;
import WWproduct.utilities.ReadConfig;

public class VerifyMyraisedCases_RealTimedata_Dashboard_MyReports_ReopeningofCaseTest extends BaseClassTest {

	ReadConfig readconfig;
	 public String baseURL;
	 public String username;
	 public String password;

	@Test(priority=1)
	 
	public void login() throws IOException, InterruptedException
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
		
		realtime_taskprocessingPage RealtimeTaskprocessing=new realtime_taskprocessingPage(driver);
		Dashboard_TaskprocessingPage dashboard=new Dashboard_TaskprocessingPage(driver);
		 myReports_TaskprocessingPage myReports=new myReports_TaskprocessingPage(driver);
		wwWorkflow workflow=new wwWorkflow(driver);
		myRaisedcase Myraisedcase=new  myRaisedcase(driver);
		caseManagementPage CM=new caseManagementPage(driver);
		caseCreationThroughInterface CaseCreation=new caseCreationThroughInterface(driver);
		Thread.sleep(5000);
		
		Myraisedcase.Case_Creation();
		Thread.sleep(5000);
		Myraisedcase.MyRaisedCases();
		Thread.sleep(5000);
		Myraisedcase.Setcasetypeclose();
		Thread.sleep(5000);
		Myraisedcase.clickgo();
		Thread.sleep(5000);
		Myraisedcase.clickonclosedcase();
		Thread.sleep(5000);
		Myraisedcase.clickcut();
		Thread.sleep(5000);
		Myraisedcase.exporttoexcel();
		Thread.sleep(5000);
		Myraisedcase.Setcasetypeinprogress();
		Thread.sleep(5000);
		
		Myraisedcase.clickgo();
		Thread.sleep(5000);
        Myraisedcase.clickoncase();
        Thread.sleep(5000);
		Myraisedcase.EntercasecommentForcaseinfo();
		Thread.sleep(5000);
		Myraisedcase.clickadd();
		Thread.sleep(5000);
		Myraisedcase.clickoncase();
		Thread.sleep(5000);
	    Myraisedcase.clickcasejourney();
	    Thread.sleep(5000);
		Myraisedcase.clickcut();
		Thread.sleep(5000);
		Myraisedcase.clickgo();
		Thread.sleep(5000);
		Myraisedcase.exporttoexcel();
		Thread.sleep(5000);
		
		//Real time-Taskprocessing actions
		workflow.Taskprocessing();
		Thread.sleep(5000); 
		RealtimeTaskprocessing.RealTimeData();
		Thread.sleep(5000);
		RealtimeTaskprocessing.PLANNED_VS_ACTUAL_HOURS();
		Thread.sleep(5000);
		RealtimeTaskprocessing.PRODUCTIVE_VS_SHRINKAGE_VS_BREAK_HOURS();
		Thread.sleep(5000);
		RealtimeTaskprocessing.RealtimeView();
		Thread.sleep(5000);
		 ((JavascriptExecutor) driver).executeScript("scroll(0,450);"); 
		    Thread.sleep(5000);
		    ((JavascriptExecutor) driver).executeScript("scroll(0,-950);");
		
		//Dashboard actions
		dashboard.Dashboard();
		Thread.sleep(5000);
		dashboard.PRODUCTIVE_NONPRODUCTIVE_TIME();
		Thread.sleep(5000);
		dashboard.SELF_VS_TEAM_VS_TARGET();
		Thread.sleep(5000);
		dashboard.TIME_UTILIZATION();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id=\"ExportProductiveBarChart\"]"));
		 
	       js.executeScript("arguments[0].scrollIntoView();", element);
	       Thread.sleep(2000);
	    dashboard.Productivity();
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,-250);");
	    WebElement ToDate=driver.findElement(By.xpath("//*[@class='datepicker2 form-control line-height']"));
	    WebElement FromDate=driver.findElement(By.xpath("//*[@class='datepicker1 form-control line-height']"));
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	FromDate.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    FromDate.sendKeys("01-Jan-2024");
	    Thread.sleep(2000);
	    dashboard.clickGo();
	    Thread.sleep(2000);
	    captureScreen(driver,"Date range should not be greater than one month");
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	FromDate.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    FromDate.sendKeys("01-Mar-2024"); 
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	ToDate.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    ToDate.sendKeys("29-Mar-2024"); 
	    Thread.sleep(2000);
	    dashboard.clickGo();
	    Thread.sleep(2000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,450);"); 
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,-950);"); 
		
	    //My Reports-Taskprocessing page Actions
	    myReports.Reports();
	    Thread.sleep(2000);
	    myReports.selectReportTypeProcessed();
	    Thread.sleep(2000);
	    myReports.clickGo();
	    Thread.sleep(2000);
	    myReports.selectReportTypeRejected();
	    Thread.sleep(2000);
	    myReports.clickGo();
	    Thread.sleep(2000);
	    WebElement ToDate_MyReportsTS=driver.findElement(By.xpath("//*[@class='dateMyReportTo form-control line-height']"));
	    WebElement FromDate_MyReportsTS=driver.findElement(By.xpath("//*[@class='dateMyReportFrom form-control line-height']"));
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	FromDate_MyReportsTS.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    FromDate_MyReportsTS.sendKeys("01-Mar-2024"); 
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	ToDate_MyReportsTS.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    ToDate_MyReportsTS.sendKeys("29-Mar-2024"); 
	    Thread.sleep(2000);
	    myReports.selectReportTypeProcessed();
	    Thread.sleep(3000);
	    myReports.clickGo();
	    Thread.sleep(2000);
	    myReports.MyreportsExportToExcel();
	   Thread.sleep(2000);
	    myReports.selectReportTypeRejected();
	    Thread.sleep(3000);
	    myReports.clickGo();
	    Thread.sleep(2000);
	    myReports.MyreportsExportToExcel();
	    Thread.sleep(2000); 
	    
	    //Reopen a rejected case
       CM.caseManagement();
       Thread.sleep(3000);
       CM.CaseAllocation();
       Thread.sleep(3000);
       CM.Rejectedbucket();
       Thread.sleep(3000);
       String  caseIdTS= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[6]")).getText();
       Thread.sleep(3000);
       CaseCreation.Case_Creation();
       Thread.sleep(3000);
       CaseCreation.Reopening();
       Thread.sleep(3000);
       WebElement searchboxinReopeningPage=driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
       Thread.sleep(3000);
       searchboxinReopeningPage.sendKeys( caseIdTS + "\n");
       Thread.sleep(3000);
       CaseCreation.ClickSearchIconOnReopening();
       Thread.sleep(3000);
       CaseCreation.ReopeningIconClick();
       Thread.sleep(3000);
       CM.caseManagement();
       Thread.sleep(3000);
       CM.CaseAllocation();
       Thread.sleep(3000);
       CM.Outstandingbucket();
       Thread.sleep(3000);
       WebElement searchboxInCaseAllocationpage=driver.findElement(By.xpath("(//*[@class='form-control input-sm'])[2]"));
       Thread.sleep(3000);
   	searchboxInCaseAllocationpage.sendKeys(caseIdTS + "\n");
   	Thread.sleep(3000);
       
   	
   	//Reopen a closed case
   	CM.Completedbucket();
   	Thread.sleep(3000);
    String  caseIdTS1= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[6]")).getText();
    Thread.sleep(3000);
    CaseCreation.Case_Creation();
    Thread.sleep(3000);
    CaseCreation.Reopening();
    Thread.sleep(3000);
   WebElement searchboxinReopeningPage1=driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
    Thread.sleep(3000);
    searchboxinReopeningPage1.sendKeys( caseIdTS1 + "\n");
    Thread.sleep(3000);
    CaseCreation.ClickSearchIconOnReopening();
    Thread.sleep(3000);
    CaseCreation.ReopeningIconClick();
    Thread.sleep(3000);
    CM.caseManagement();
    Thread.sleep(3000);
    CM.CaseAllocation();
    Thread.sleep(3000);
    CM.Outstandingbucket();
    Thread.sleep(3000);
    WebElement searchboxInCaseAllocationpage1=driver.findElement(By.xpath("(//*[@class='form-control input-sm'])[2]"));
    Thread.sleep(3000);
	searchboxInCaseAllocationpage1.sendKeys(caseIdTS1 + "\n");
	Thread.sleep(3000);
	driver.close();
	}	
		 
}
