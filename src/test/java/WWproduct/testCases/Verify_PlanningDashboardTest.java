package WWproduct.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import WWproduct.pageObjects.PlanningDashboardPage;
import WWproduct.pageObjects.loginToWWproduct;
import WWproduct.utilities.ReadConfig;

public class Verify_PlanningDashboardTest extends BaseClassTest {
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
		PlanningDashboardPage PD=new PlanningDashboardPage(driver);
		Thread.sleep(2000);
		PD.PlanningDashboard();
		Thread.sleep(3000);
		PD.CaseVolumeTrending();
		Thread.sleep(3000);
        PD.RESOURCE_PLANNING();
        Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,200);");
        Thread.sleep(3000);
        PD.expandinPlanningDashboard();
        Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,1000);");
        Thread.sleep(3000);
        PD.Associate_View();
        Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,1800);");
        Thread.sleep(3000);
       PD.WORKTYPE_WISE_CASE_COUNT_AND_HOURS();
       Thread.sleep(3000);
       ((JavascriptExecutor) driver).executeScript("scroll(0,2500);");
       Thread.sleep(3000);
       PD.Demand_Vs_supply();
       ((JavascriptExecutor) driver).executeScript("scroll(0,3500);");
       Thread.sleep(3000);
       PD.Worktype_WiseDemandVSSupply();
       Thread.sleep(3000);
       PD.Worktype_WiseDemandVSSupplyExport();
       Thread.sleep(3000);
       ((JavascriptExecutor) driver).executeScript("scroll(0,4500);");
       Thread.sleep(3000);
       ((JavascriptExecutor) driver).executeScript("scroll(0,-5500);");
       Thread.sleep(3000);
       WebElement ForDate=driver.findElement(By.xpath("//*[@class='datepicker1 form-control line-height']"));
       for (int i=0;i<=30;i++)
    	   ForDate.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    ForDate.sendKeys("20-Mar-2024"); 
	    Thread.sleep(2000);
	    PD.ClickgoinPlanningDashboard();
	    driver.close();
	    
}
}