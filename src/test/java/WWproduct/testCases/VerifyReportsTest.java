package WWproduct.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import WWproduct.pageObjects.ReportsPage;
import WWproduct.pageObjects.loginToWWproduct;
import WWproduct.utilities.ReadConfig;

public class VerifyReportsTest extends BaseClassTest {
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
		ReportsPage RP=new ReportsPage(driver);
		Thread.sleep(3000);
		RP.Reports();
		Thread.sleep(3000);
		RP.ReportedByUser();
		Thread.sleep(3000);
		RP.clickgoinPR();
		Thread.sleep(3000);
		RP.exportProductivityReport();
		System.out.println("productivity report downloaded");
		Thread.sleep(3000);
		WebElement ToDate=driver.findElement(By.xpath("//*[@class='dateProdcRptTo form-control line-height']"));
	    WebElement FromDate=driver.findElement(By.xpath("//*[@class='dateProdcRptFrom form-control line-height']"));
	    for (int i=0;i<=30;i++)
	    	FromDate.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    FromDate.sendKeys("05-Mar-2024"); 
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	ToDate.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    ToDate.sendKeys("3-Apr-2024"); 
	    Thread.sleep(3000);
	    RP.clickgoinPR();
	    Thread.sleep(3000);
	    RP.ReportedByUser();
	    System.out.println("test");
	    Thread.sleep(3000);
	    RP.Userdebashree();
	    System.out.println("test1");
	    Thread.sleep(3000);
	    RP.clickgoinPR();
	    Thread.sleep(5000);
	   // WebElement scrollArea = driver.findElement(By.xpath("//*[@id='tblProductivityReport_wrapper']/div[4]/div[1]/div/table/thead/tr/th[33]"));

	 // Scroll to div's most right:
	 //((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea);

	 // Or scroll the div by pixel number:
	 //((JavascriptExecutor) driver).executeScript("arguments[0].scrollRight += 250", scrollArea);
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id='tblProductivityReport_wrapper']/div[4]/div[1]/div/table/thead/tr/th[33]")));
		Thread.sleep(5000);
		System.out.println("test2");
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id='tblProductivityReport_wrapper']/div[4]/div[1]/div/table/thead/tr/th[1]")));
	    Thread.sleep(3000);
		RP.exportProductivityReport();
		//Thread.sleep(3000);
		//((JavascriptExecutor) driver).executeScript("scroll(2000,0);");
		////Thread.sleep(3000);
		//((JavascriptExecutor) driver).executeScript("scroll(-2000,0);");
		
		RP.ReportedByWorktype();
		Thread.sleep(3000);
		RP.clickgoinPR();
		Thread.sleep(3000);
		RP.WorktypeA();
		Thread.sleep(3000);
		RP.clickgoinPR();
		Thread.sleep(3000);
		RP.WorktypeB();
		Thread.sleep(3000);
		RP.clickgoinPR();
		Thread.sleep(3000);
		RP.ReportedByManager();
		Thread.sleep(3000);
		RP.clickgoinPR();
		Thread.sleep(3000);
		RP.ManagerDebashree();
		Thread.sleep(3000);
		RP.clickgoinPR();
		Thread.sleep(3000);
		
		//Utilization Report actions
		RP.UtilizationReports();
		Thread.sleep(3000);
		RP.clickgoinUR();
		Thread.sleep(3000);
		RP.ReportedByManagerinUtilizationReport();
		Thread.sleep(3000);
		RP.clickgoinUR();
		Thread.sleep(3000);
		RP.ReportedByManagerDebashreeinUtilizationReport();
		Thread.sleep(3000);
		RP.clickgoinUR();
		Thread.sleep(3000);
		WebElement ToDate1=driver.findElement(By.xpath("//*[@class='dateUtilRptTo form-control line-height']"));
	    WebElement FromDate1=driver.findElement(By.xpath("//*[@class='dateUtilRptFrom form-control line-height']"));
	    for (int i=0;i<=30;i++)
	    	FromDate1.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    FromDate1.sendKeys("05-Mar-2024"); 
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	ToDate1.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    ToDate1.sendKeys("3-Apr-2024"); 
	    Thread.sleep(3000);
	    RP.clickgoinUR();
	    Thread.sleep(3000);
	    RP.ReportedByManagerALL();
	    Thread.sleep(3000);
	    RP.clickgoinUR();
	    Thread.sleep(3000);
	    RP.ReportedByUserinUtilizationReport();
	    Thread.sleep(3000);
	    RP.ReportedByUserDebashreeinUtilizationReport();
	    Thread.sleep(3000);
	    RP.clickgoinUR();
	    Thread.sleep(3000);
	    RP.ReportedByUserTejasinUtilizationReport();
	    Thread.sleep(3000);
	    RP.clickgoinUR();
	    Thread.sleep(3000);
	    RP.ReportedByUserALLinUtilizationReport();
	    Thread.sleep(3000);
	    RP.clickgoinUR();
        Thread.sleep(3000);
	    
	    //LoggedHours Report
	    RP.LoggedhoursReports();
		Thread.sleep(3000);
		RP.clickgoinULoggedHoursReport();
		Thread.sleep(3000);
		RP.ExportHoursReport();
		Thread.sleep(3000);
		RP.ReportedByManagerinLoggedHoursReport();
		Thread.sleep(3000);
		RP.clickgoinULoggedHoursReport();
		Thread.sleep(3000);
		RP.ReportedByManagerDebashreeinLoggedHoursReport();
		Thread.sleep(3000);
		RP.clickgoinULoggedHoursReport();
		Thread.sleep(3000);
		WebElement ToDate2=driver.findElement(By.xpath("//*[@class='dateLoggedHrsRptTo form-control line-height']"));
	    WebElement FromDate2=driver.findElement(By.xpath("//*[@class='dateLoggedHrsRptFrom form-control line-height']"));
	    for (int i=0;i<=30;i++)
	    	FromDate2.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    FromDate2.sendKeys("05-Mar-2024"); 
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	ToDate2.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    ToDate2.sendKeys("3-Apr-2024"); 
	    Thread.sleep(3000);
	    RP.clickgoinULoggedHoursReport();
	    Thread.sleep(3000);
	    RP.ReportedByManagerALLLR();
	    Thread.sleep(3000);
	    RP.clickgoinULoggedHoursReport();
	    Thread.sleep(3000);
	    RP.ReportedByManagerAmitiLR();
	    Thread.sleep(3000);
	    RP.clickgoinULoggedHoursReport();
	    Thread.sleep(3000);
	    RP.ReportedByUserinLoggedHoursReport();
	    Thread.sleep(3000);
	    RP.ReportedByUserDebashreeinLoggedHoursReport();
	    Thread.sleep(3000);
	    RP.clickgoinULoggedHoursReport();
	    Thread.sleep(3000);
	    RP.ReportedByUserTejasinLoggedHoursReport();
	    Thread.sleep(3000);
	    RP.clickgoinULoggedHoursReport();
	    Thread.sleep(3000);
	    RP.ReportedByUserALLinLoggedHoursReport();
	    Thread.sleep(3000);
	    RP.clickgoinULoggedHoursReport();
	    Thread.sleep(3000);
	    RP.ExportHoursReport();
	    Thread.sleep(3000);
	    
	    //ReportDUMP actions
	    RP.Reportdump();
	    Thread.sleep(5000);
	    RP.ReportTypeCASE_DUMPSinRD();
	    Thread.sleep(5000);
	    RP.ReportTypeCASE_DUMPSTypeINprogress();
	    Thread.sleep(5000);
	    RP.clickgoinReportDUMP();
	    Thread.sleep(5000);
	    RP.ReportTypeCASE_DUMPSTypeClosed();
	    Thread.sleep(5000);
	    RP.clickgoinReportDUMP();
	    Thread.sleep(5000);
	    RP.ReportTypeCASE_DUMPSTypeDeleted();
	    Thread.sleep(5000);
	    RP.clickgoinReportDUMP();
	    Thread.sleep(5000);
	    RP.Stage_caseDumps();
	    Thread.sleep(5000);
	    RP.Source_caseDumps();
	    Thread.sleep(5000);
	    RP.AssignedTo_caseDumps();
	    Thread.sleep(5000);
	    RP.ReportTypeCASE_DUMPSTypeINprogress();
	    Thread.sleep(5000);
	    RP.clickgoinReportDUMP();
	    Thread.sleep(5000);
	    //Agent activity report
        RP.ReportTypeAgent_ActivityReportinRD();
        Thread.sleep(5000);
        RP.clickgoinReportDUMP();
        Thread.sleep(5000);
        RP.ReportTypeAgent_ActivityReportforTESTUSER();
        Thread.sleep(5000);
        RP.clickgoinReportDUMP();
        Thread.sleep(5000);
        WebElement ToDate3=driver.findElement(By.xpath("//*[@class='dateReportTo form-control line-height']"));
	    WebElement FromDate3=driver.findElement(By.xpath("//*[@class='dateReportFrom form-control line-height']"));
	    for (int i=0;i<=30;i++)
	    	FromDate3.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    FromDate3.sendKeys("05-Mar-2024"); 
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	ToDate3.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    ToDate3.sendKeys("3-Apr-2024"); 
	    Thread.sleep(3000);
	    RP.ReportTypeAgent_ActivityReportforALL();
	    Thread.sleep(5000);
	    RP.clickgoinReportDUMP();
	    Thread.sleep(5000);
	    //noncore Activity report
	    RP.ReportTypeNonCore_ActivityReportinRD();
	    Thread.sleep(5000);
	    RP.clickgoinReportDUMP();
	    Thread.sleep(5000);
	    WebElement ToDate4=driver.findElement(By.xpath("//*[@class='dateReportTo form-control line-height']"));
	    WebElement FromDate4=driver.findElement(By.xpath("//*[@class='dateReportFrom form-control line-height']"));
	    for (int i=0;i<=30;i++)
	    	FromDate4.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    FromDate4.sendKeys("05-Mar-2024"); 
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	ToDate4.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    ToDate4.sendKeys("3-Apr-2024"); 
	    Thread.sleep(3000);
	    RP.clickgoinReportDUMP();
	    Thread.sleep(5000);
	    //LoginLOgout Report
	    RP.ReportTypeloginlogoutReportinRD();
	    Thread.sleep(5000);
	    RP.clickgoinReportDUMP();
	    Thread.sleep(5000);
	    //Core activity report
	    RP.ReportTypeCore_ActivityReportinRD();
	    Thread.sleep(5000);
	    RP.clickgoinReportDUMP();
	    Thread.sleep(5000);
	    WebElement ToDate5=driver.findElement(By.xpath("//*[@class='dateReportTo form-control line-height']"));
	    WebElement FromDate5=driver.findElement(By.xpath("//*[@class='dateReportFrom form-control line-height']"));
	    for (int i=0;i<=30;i++)
	    	FromDate5.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    FromDate5.sendKeys("05-Mar-2024"); 
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	ToDate5.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    ToDate5.sendKeys("3-Apr-2024"); 
	    Thread.sleep(3000);
	    RP.clickgoinReportDUMP();
	    Thread.sleep(5000);
	    driver.close();
}
}
