package WWproduct.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import WWproduct.pageObjects.QueryDashboardPage;
import WWproduct.pageObjects.loginToWWproduct;
import WWproduct.pageObjects.query_AllocationPage;
import WWproduct.pageObjects.query_workflow;
import WWproduct.utilities.ReadConfig;

public class VerifyQueryDashboard_and_Reopeningofquery_QueryAllocationPage extends BaseClass {

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
		query_workflow QW=new query_workflow(driver);
		query_AllocationPage QA=new query_AllocationPage(driver);
		QueryDashboardPage QD=new QueryDashboardPage(driver);
		Thread.sleep(3000);
		
		//Reopening a closed query
		QW.querymanagement();
		Thread.sleep(3000);
		QA.QueryAllocation();
		Thread.sleep(3000);
		QA.ClickClosedQueryBucket();
		Thread.sleep(3000);
		String  caseIdTS= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]")).getText();
		Thread.sleep(3000);
		QW.ReopeningQuery();
		Thread.sleep(3000);
		WebElement searchboxinReopeningQueryPage=driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
	       Thread.sleep(3000);
	    searchboxinReopeningQueryPage.sendKeys( caseIdTS + "\n");
	    Thread.sleep(3000);
	    QW.ClickOkforReopeningQuery();
	    Thread.sleep(3000);
	    QW.ClickonQueryonReopeningPage();
	    Thread.sleep(3000);
	    QW.exportclosedQueryDetails();
	    Thread.sleep(3000);
	    QW.exportclosedQueryjourney();
	    Thread.sleep(3000);
	    QW.ClickReopen();
	    Thread.sleep(3000);
	    QA.QueryAllocation();
	    Thread.sleep(3000);
	    QA.ClickoutstandingQueryBucket();
	    Thread.sleep(3000);
	    WebElement searchboxinQueryallocationPage=driver.findElement(By.xpath("(//*[@class='form-control input-sm'])[2]"));
	       Thread.sleep(3000);
	       searchboxinQueryallocationPage.sendKeys( caseIdTS + "\n");
	       Thread.sleep(3000);
	       
	       //Query dashboard
	       QD.queryDashboard();
	       Thread.sleep(1000);
	       QD.SelectTejasLocal();
	       Thread.sleep(3000);
	       QD.clickgoQueryDashboard();
	       Thread.sleep(3000);
	       WebElement ToDate=driver.findElement(By.xpath("//*[@class='datepicker2 form-control line-height']"));
		    WebElement FromDate=driver.findElement(By.xpath("//*[@class='datepicker1 form-control line-height']"));
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
		    QD.clickgoQueryDashboard();
		    Thread.sleep(3000);
		    QD.SelectTejasLocal();
		    Thread.sleep(3000);
		    QD.clickgoQueryDashboard();
		    Thread.sleep(3000);
		    QD.SelectTESTUSER();
		    Thread.sleep(3000);
		    QD.clickgoQueryDashboard();
		    Thread.sleep(3000);
		    ((JavascriptExecutor) driver).executeScript("scroll(0,250);");
		    Thread.sleep(3000);
		    QD.exportQueryOutput();
		    Thread.sleep(3000);
		    QD.expandQueryOutstanding();
		    Thread.sleep(3000);
		    QD.exportQueryOutstanding();
		    Thread.sleep(3000);
		    ((JavascriptExecutor) driver).executeScript("scroll(0,750);");
		    Thread.sleep(3000);
		    QD.expandQueryReport();
		    Thread.sleep(3000);
		    QD.exportQueryReport();
		    Thread.sleep(3000);
		    ((JavascriptExecutor) driver).executeScript("scroll(0,950);");
		    Thread.sleep(3000);
		    ((JavascriptExecutor) driver).executeScript("scroll(0,-2000);");
	        Thread.sleep(2000);
		    QD.QueryDashboardTeamwise();
		    Thread.sleep(3000);
		    QD.SelectTeamB();
		    QD.clickgoQueryDashboard();
		    QD.SelectTeamA();
		    Thread.sleep(3000);
		    QD.clickgoQueryDashboard();
		    Thread.sleep(3000);
		    QD.QueryTrend();
		    Thread.sleep(5000);
		    QD.DownloadQueryVolumepng();
		    Thread.sleep(3000);
		 //Query allocation filter and other functionality
		QA.QueryAllocation();
		 Thread.sleep(5000);
		QA.selecturgency();
		Thread.sleep(5000);
		QA.ClickFilteronqueryAllocationPage();
		Thread.sleep(5000);
		String  QueryId= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]")).getText();
		Thread.sleep(5000);
		QA.ClicktickboxAgainstQuery();
		Thread.sleep(5000);
		QA.seturgencyCritical();
		Thread.sleep(5000);
		QA.ClickupdateUrgency();
		Thread.sleep(5000);
		QA.selecturgencyCritical();
		Thread.sleep(5000);
		QA.ClickFilteronqueryAllocationPage();
		Thread.sleep(5000);
		  WebElement searchboxinQueryallocationPage1=driver.findElement(By.xpath("(//*[@class='form-control input-sm'])[2]"));
	       Thread.sleep(3000);
	       searchboxinQueryallocationPage1.sendKeys( QueryId + "\n");
	       Thread.sleep(5000);
	       QA.ClicktickboxAgainstQuery();
	       Thread.sleep(5000);
	       QA.seturgencyHigh();
	       Thread.sleep(5000);
	       QA.ClickupdateUrgency();
	       Thread.sleep(5000);
	       QA.selecturgency();
			Thread.sleep(5000);
			QA.ClickFilteronqueryAllocationPage();
			Thread.sleep(5000);
			WebElement searchboxinQueryallocationPage2=driver.findElement(By.xpath("(//*[@class='form-control input-sm'])[2]"));
		       Thread.sleep(3000);
		       searchboxinQueryallocationPage2.sendKeys( QueryId + "\n");
		       Thread.sleep(5000);      
		QA.selecturgencyNormal();
		Thread.sleep(5000);
		QA.ClickFilteronqueryAllocationPage();
		Thread.sleep(5000);
		QA.ClickrejectedQueryBucket();
		Thread.sleep(5000);
		QA.ClickClosedQueryBucket();
		Thread.sleep(5000);
		QA.ClickresetinQueryallocationPage();
		Thread.sleep(5000);
		 QA.enterreceivedDate();
		 Thread.sleep(5000);
		 QA.ClickFilteronqueryAllocationPage();
		 Thread.sleep(5000);
		 QA.selectActionReject();
		 Thread.sleep(5000);
		 QA.ClickFilteronqueryAllocationPage();
		 Thread.sleep(5000);
		 QA.ClickresetinQueryallocationPage();
		 Thread.sleep(5000);
		 QA.selectTypeAllocation();
		 Thread.sleep(5000);
		 QA.selectworktypeB();
		 Thread.sleep(5000);
		 QA.ClickFilteronqueryAllocationPage();
		 Thread.sleep(5000);
		 QA.selectworktypeA();
		 Thread.sleep(5000);
		 QA.ClickFilteronqueryAllocationPage();
		 Thread.sleep(5000);
		  QA.ClicktickboxAgainstQuery();
		  Thread.sleep(5000);
		  QA.ClickViewQueryDetails();
		  Thread.sleep(5000);
		  captureScreen(driver,"Query Information popup page when View Query details is clicked from Query allocation page");
		  Thread.sleep(5000);
		  QA.Clickcutpopuppage();
		  Thread.sleep(5000);
		  QA.ClickresetinQueryallocationPage();
		  Thread.sleep(5000);
		  QA.selecturgencyNormal();
		  Thread.sleep(5000);
		  QA.ClickFilteronqueryAllocationPage();
		  Thread.sleep(5000);
		  QA.ClickrejectedQueryBucket();
		  Thread.sleep(5000);
		  String  QueryId1= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]")).getText();
		  Thread.sleep(5000);
		  QA.ClicktickboxAgainstQuery();
		  Thread.sleep(5000);
		  QA.ClickCloseRejectedQuery();
		  Thread.sleep(5000);
		  QA.ClickClosedQueryBucket();
		  Thread.sleep(5000);
		  WebElement searchboxinQueryallocationPage3=driver.findElement(By.xpath("(//*[@class='form-control input-sm'])[2]"));
	       Thread.sleep(3000);
	       searchboxinQueryallocationPage3.sendKeys( QueryId1 + "\n");
	       Thread.sleep(5000);      
		    driver.close();
}
}
