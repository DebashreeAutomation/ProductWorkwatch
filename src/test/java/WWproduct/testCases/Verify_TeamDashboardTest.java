package WWproduct.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import WWproduct.pageObjects.TeamDashboardPage;
import WWproduct.pageObjects.loginToWWproduct;
import WWproduct.utilities.ReadConfig;

public class Verify_TeamDashboardTest extends BaseClassTest{
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
		TeamDashboardPage TD=new TeamDashboardPage(driver);
		
		
		//TeamDashboard Actions
		Thread.sleep(3000);
        TD.TeamDashboard();
        Thread.sleep(3000);
        TD.SelectTejasLocal();
        Thread.sleep(3000);
        TD.Clickgo();
        Thread.sleep(3000);
        TD.SelectTESTUSER();
        Thread.sleep(3000);
        TD.Clickgo();
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
	    TD.SelectTESTUSER();
	    Thread.sleep(3000);
	    TD.SelectWorktypeA();
	    Thread.sleep(3000);
	    TD.Clickgo();
	    Thread.sleep(3000);
	    TD.SelectTESTUSER();
	    Thread.sleep(3000);
	    TD.SelectWorktypeA();
	    Thread.sleep(3000);
	    TD.Clickgo();
	    Thread.sleep(3000);
	    TD.PRODUCTIVE_NONPRODUCTIVE_TIME();
	    Thread.sleep(3000);
	    TD.TEAM_VS_TARGET();
	    Thread.sleep(3000);
	    TD.TIME_UTILIZATION();
	    Thread.sleep(3000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,400);");
	    Thread.sleep(3000);
	    TD.PRODUCTIVITY();
	    Thread.sleep(3000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,-400);");
	    Thread.sleep(3000);
	    TD.SelectAllemployee();
	    Thread.sleep(3000);
	    TD.SelectWorktypeAll();
	    Thread.sleep(3000);
	    TD.Clickgo();
	    Thread.sleep(3000);
	    TD.TeamDashboardTeamwise();
	    Thread.sleep(3000);
	    TD.SelectTeamA();
	    Thread.sleep(3000);
	    TD.SelectWorktypeA();
	    Thread.sleep(3000);
	    TD.Clickgo();
	    Thread.sleep(3000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,450);");
	    Thread.sleep(3000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,-400);");
	    Thread.sleep(3000);
	    TD.SelectTeamA();
	    Thread.sleep(3000);
	    TD.SelectWorktypeB();
	    Thread.sleep(3000);
	    TD.Clickgo();
	    Thread.sleep(3000);
	    TD.SelectTeamB();
	    Thread.sleep(3000);
	    TD.Clickgo();
	    Thread.sleep(3000);
	  
	    //RTA dashboard Actions
	    TD.RTADashboard();
	    Thread.sleep(5000);
	    TD.ExportRTA();
	    Thread.sleep(5000);
	    TD.ClickExpand();
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,400);");
	    TD.ExportUTILIZATION();
	    Thread.sleep(5000);
	    TD.ClickExpand();
	    ((JavascriptExecutor) driver).executeScript("scroll(0,400);");
	    Thread.sleep(5000);
	    TD.ExportTaskOutput();
	    
	    Thread.sleep(5000);
	    TD.ClickExpand();
	    ((JavascriptExecutor) driver).executeScript("scroll(0,700);");
	    
	    Thread.sleep(5000);
	    TD.ExportPRODUCTIVITY();
	    Thread.sleep(5000);
	    TD.ClickExpand();
	    ((JavascriptExecutor) driver).executeScript("scroll(0,1200);");
	    Thread.sleep(5000);
	    TD.ExportTASK_OUTSTANDING();
	    Thread.sleep(5000);
	   
	    TD.ClickExpand();
	    ((JavascriptExecutor) driver).executeScript("scroll(0,2400);");
	   
	    Thread.sleep(5000);
	    TD.ExportCASE_TOUCH_POINTS();
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,3000);");
	    Thread.sleep(5000);
	    TD.ClickExpand();
	    ((JavascriptExecutor) driver).executeScript("scroll(0,3400);");
	    Thread.sleep(5000);
	    TD.ClickExpand();
	    Thread.sleep(3000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,3900);");
	    Thread.sleep(3000);
	    TD.ExportHOURLY_COMPLETE_VS_PEND();
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,6500);");
	    Thread.sleep(5000);
	    TD.ClickExpand();
	    
	    Thread.sleep(5000);
	    //((JavascriptExecutor) driver).executeScript("scroll(0,4000);");
	    //Thread.sleep(5000);
	    System.out.println("Test inprogress");
	    TD.ExportPLANNED_VS_ACTUAL_HOURS();
	    Thread.sleep(5000);
	    TD.ExportPRODUCTIVE_VS_SHRINKAGE_VS_BREAK_HOURS();
	    Thread.sleep(5000);
	    TD.SelectdebashreeemployeeDebashree();
	    Thread.sleep(5000);
	    TD.SelectKiranemployeeDebashree();
	    Thread.sleep(5000);
	   
	    ((JavascriptExecutor) driver).executeScript("scroll(0,7500);");
	    Thread.sleep(5000);
	    TD.ClickExpand();
	    Thread.sleep(5000);
	    System.out.println("Test inprogress by deb");
	    ((JavascriptExecutor) driver).executeScript("scroll(0,8000);");
	    Thread.sleep(5000);
	    TD.ExportRealTimeWorkloadAging();
	    Thread.sleep(5000);
	    TD.RealTimeWorktype();
	    Thread.sleep(5000);
	    TD.ExportRealTimeWorkTypeAging();
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,8500);");
	    Thread.sleep(5000);
	    TD.ClickExpand();
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,9000);");
	    TD.ExportRealTimeAHT();
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,-30000);");
	    Thread.sleep(5000);
	    
	  //SLA Dashboard Actions
	    TD.SLADashboard();
	    Thread.sleep(5000);
	    TD.SelectWorktypeAinSLADashboard();
	    Thread.sleep(5000);
	    TD.ClickgoSLADashboard();
	    Thread.sleep(5000);
	    WebElement ToDate1=driver.findElement(By.xpath("//*[@class='datepickerSLADashboardTo form-control line-height']"));
	    WebElement FromDate1=driver.findElement(By.xpath("//*[@class='datepickerSLADashboardFrom form-control line-height']"));
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
	    TD.ClickgoSLAAchieved();
	    Thread.sleep(5000);
	    TD.SLAMetRatio();
	    Thread.sleep(5000);
	    TD.STT_VS_ATT();
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,400);");
	    Thread.sleep(5000);
	    TD.AHTtrendingDateWise();
	    Thread.sleep(5000);
	    TD.AHTtrendingUserWise();
	    Thread.sleep(5000);
	    TD.AHTtrendingUserWiseexport();
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,600);");
	    Thread.sleep(5000);
	    TD.ExpandinSLAdashboard();
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,900);");
	    Thread.sleep(5000);
	    TD.OutstandingStatus();
	    Thread.sleep(5000);
	    TD.ExpandinSLAdashboard();
	    Thread.sleep(5000);
	    TD.ToptenOldCases();
	    Thread.sleep(5000);
	    TD.ExpandinSLAdashboard();
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,1200);");
	    Thread.sleep(5000);
	    TD.inventoryStatus();
	    Thread.sleep(5000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,-3000);");
	    Thread.sleep(5000);
	    
	    
	    //Workflow Dashboard Action
	    TD.WorkflowDashboard();
	    Thread.sleep(3000);
	    TD.SelectWorktypeAinWorkflowDashboard();
	    Thread.sleep(3000);
	    TD.clickGOinWorkflowDashboard();
	    Thread.sleep(3000);
	    TD.SelectWorktypeBinWorkflowDashboard();
	    Thread.sleep(3000);
	    TD.clickGOinWorkflowDashboard();
	    Thread.sleep(3000);
	    WebElement ToDate2=driver.findElement(By.xpath("//*[@class='dateReportTo form-control line-height dateRecievedTo']"));
	    WebElement FromDate2=driver.findElement(By.xpath("//*[@class='dateReportFrom form-control line-height dateRecievedFrom']"));
	    for (int i=0;i<=30;i++)
	    	FromDate2.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    FromDate2.sendKeys("01-Feb-2024"); 
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	ToDate2.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    ToDate2.sendKeys("2-Mar-2024"); 
	    Thread.sleep(3000);
	    TD.SelectWorktypeAinWorkflowDashboard();
	    Thread.sleep(3000);
	    TD.clickGOinWorkflowDashboard();
	    Thread.sleep(3000);
	    TD.SelectWorktypeBinWorkflowDashboard();
	    Thread.sleep(3000);
	    TD.clickGOinWorkflowDashboard();
	    Thread.sleep(3000);
        
        //Quality Dashboard Actions
        TD.LoadQualityDashboard();
        Thread.sleep(3000);
        WebElement ToDate3=driver.findElement(By.xpath("//*[@class='datepickerQuality2 form-control line-height']"));
	    WebElement FromDate3=driver.findElement(By.xpath("//*[@class='datepickerQuality1 form-control line-height']"));
	    for (int i=0;i<=30;i++)
	    	FromDate3.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    FromDate3.sendKeys("01-Mar-2024"); 
	    Thread.sleep(2000);
	    for (int i=0;i<=30;i++)
	    	ToDate3.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    ToDate3.sendKeys("30-Mar-2024"); 
	    Thread.sleep(3000);
	    TD.ClickgoQualityDashboard();
	    Thread.sleep(3000);
	    //TD.SelectemployeeYash();
	   // Thread.sleep(3000);
	   // TD.ClickgoQualityDashboard();
	    //Thread.sleep(3000);
	   // TD.SelectemployeeDebashree();
	    //Thread.sleep(3000);
	    TD.SelectWorktypeBinQualityDashboard();
	    Thread.sleep(3000);
	    TD.ClickgoQualityDashboard();
	    Thread.sleep(3000);
	    TD.SelectWorktypeAinQualityDashboard();
	    Thread.sleep(3000);
	    TD.ClickgoQualityDashboard();
	    Thread.sleep(3000);
	    TD.Quality_Report();
	    Thread.sleep(3000);
	    TD.Quality_Score();
	    Thread.sleep(3000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,300);");
	    Thread.sleep(3000);
	    TD.expandinQualityDashboard();
	    Thread.sleep(3000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,500);");
	    Thread.sleep(3000);
	    TD.expandinQualityDashboard();
	    Thread.sleep(3000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,600);");
	    Thread.sleep(3000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,-1000);");
	    Thread.sleep(3000);
	    TD.QualityDashboardTeamwise();
	    Thread.sleep(3000);
	    TD.SelectWorktypeAinTeamWiseQualityDashboard();
	    Thread.sleep(3000);
	    TD.SelectTeamAinTeamWiseQualityDashboard();
	    Thread.sleep(3000);
	    TD.goinTeamWiseQualityDashboard();
	    Thread.sleep(3000);
	    TD.SelectWorktypeBinTeamWiseQualityDashboard();
	    Thread.sleep(3000);
	    TD.goinTeamWiseQualityDashboard();
	    Thread.sleep(3000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,300);");
	    Thread.sleep(3000);
	    ((JavascriptExecutor) driver).executeScript("scroll(0,-500);");
	    Thread.sleep(3000);
	    driver.close();
	    
	    
}
}
