package WWproduct.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import WWproduct.pageObjects.caseManagementPage;
import WWproduct.pageObjects.loginToWWproduct;
import WWproduct.pageObjects.query_AllocationPage;
import WWproduct.pageObjects.query_workflow;
import WWproduct.pageObjects.wwWorkflow;
import WWproduct.utilities.ReadConfig;

public class Verify_CaseAllocationPage_peripheralActivity_switchTeams extends BaseClassTest {
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
		wwWorkflow Workflow=new wwWorkflow(driver);
		caseManagementPage CM=new caseManagementPage(driver);
		query_workflow QW=new query_workflow(driver);
		query_AllocationPage QA=new query_AllocationPage(driver);
		Thread.sleep(2000);
		CM.caseManagement();
		Thread.sleep(2000);
		CM.CaseAllocation();
		Thread.sleep(2000);
		CM.selectworktypeB();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.selectworktypeA();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.ClickresetincaseallocationPage();
		Thread.sleep(2000);
		CM.enterreceivedDate();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.ClicktickboxAgainstcase();
		Thread.sleep(2000);
		CM.updateCaseDetails();
		Thread.sleep(2000);
		CM.EntertextinupdateCaseDetails();
		Thread.sleep(2000);
		CM.seturgencylow();
		Thread.sleep(2000);
		CM.Clickupdate();
		Thread.sleep(2000);
		CM.ClicktickboxAgainstcase();
		Thread.sleep(2000);
		CM.updateCaseDetails();
		Thread.sleep(2000);
		CM.seturgencyNormal();
		Thread.sleep(2000);
		CM.Clickupdate();
		Thread.sleep(2000);
		CM.ClickresetincaseallocationPage();
		Thread.sleep(2000);
		CM.selecturgencyNormal();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.selecturgencyHigh();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.selecturgencyLow();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.selecturgencyCritical();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.ClickresetincaseallocationPage();
		Thread.sleep(2000);
		CM.selectTypeAllocation();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.selectTypeReAllocation();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.ClickresetincaseallocationPage();
		Thread.sleep(2000);
		CM.expandfilter();
		Thread.sleep(2000);
		CM.enterTargetdDate();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.ClickresetincaseallocationPage();
		Thread.sleep(2000);
		CM.selectSourceExcel();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.selectSourceEmail();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.selectSourceSystem();
		Thread.sleep(2000);
		CM.selectAssignedToTejas();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.ClickresetincaseallocationPage();
		Thread.sleep(2000);
		CM.selectStatus();
		Thread.sleep(2000);
		CM.selectStage();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.ClickresetincaseallocationPage();
		Thread.sleep(2000);
		CM.uniqueidfilter();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		CM.ClickresetincaseallocationPage();
		Thread.sleep(1000);
		CM.selectAssignedToTU();
		Thread.sleep(2000);
		CM.ClickFilteroncaseAllocationPage();
		Thread.sleep(2000);
		String  caseIdTS= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div[2]/table/tbody/tr/td[6]")).getText();
		Thread.sleep(2000);
		CM.ClicktickboxAgainstcase();
		Thread.sleep(2000);
		CM.clickDeallocate();
		Thread.sleep(2000);
		CM.clickconfirmOk();
		Thread.sleep(2000);
		CM.ClickresetincaseallocationPage();
		Thread.sleep(2000);
		CM.ClickresetincaseallocationPage();
		Thread.sleep(2000);
		CM.Outstandingbucket();
		Thread.sleep(2000);
		WebElement searchboxInCaseAllocationPage=driver.findElement(By.xpath("//*[@id='FilteredCaseInfoGrid_filter']/label/input"));	
		Thread.sleep(2000);
	    searchboxInCaseAllocationPage.sendKeys(caseIdTS + "\n");
	    Thread.sleep(2000);
	    CM.ClicktickboxAgainstcase();
	    Thread.sleep(2000);
	    CM.eligibleEmployeeClick();
	    Thread.sleep(2000);
	    CM.TESTUSER1EmployeeSelect();
	    Thread.sleep(2000);
	    CM.AllocatebtnClick();
	    Thread.sleep(2000);
	    CM.clickeyebutton();
	    Thread.sleep(2000);
	    captureScreen(driver,"Query cann't be assigned to the person who has raised the query");
	    Thread.sleep(2000);
	    CM.clickcutCasedetailspopup();
	    Thread.sleep(2000);
	    CM.selectworktypeB();
	    Thread.sleep(2000);
	    CM.ClickFilteroncaseAllocationPage();
	    Thread.sleep(2000);
	    String  caseIdTS1= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div[2]/table/tbody/tr/td[6]")).getText();
	    Thread.sleep(2000);
	    CM.ClicktickboxAgainstcase();
	    Thread.sleep(2000);
	    CM.clickdelete();
	    Thread.sleep(2000);
	    CM.clickconfirmOk();
	    Thread.sleep(2000);
	    WebElement searchboxInCaseAllocationPage1=driver.findElement(By.xpath("//*[@id='FilteredCaseInfoGrid_filter']/label/input"));
	    Thread.sleep(2000);
	    searchboxInCaseAllocationPage1.sendKeys(caseIdTS1 + "\n");
	    Thread.sleep(2000);
	    CM.exportToexcel();
	    Thread.sleep(4000);
	    CM.peripheralActivity();
	    Thread.sleep(4000);
	    CM.EnterperipheralActivityComment();
	    Thread.sleep(4000);
	    CM.clickstartofperipheralActivity();
	    Thread.sleep(4000);
	    QW.Task_processing();
	    Thread.sleep(4000);
	    QW.querymanagement();
	    Thread.sleep(4000);
	    QA.QueryAllocation();
	    Thread.sleep(4000);
	    CM.SwitchTeamclick();
	    Thread.sleep(4000);
	    CM.clickconfirmOktoswitchteam();
	    Thread.sleep(4000);
	    CM.clickendperipheralActivity();
	    Thread.sleep(4000);
	    CM.SwitchTeamclick();
	    Thread.sleep(4000);
	    CM.ChangeTeamBDropdownclick();
	    Thread.sleep(4000);
	    CM.clickchange();
	    Thread.sleep(4000);
	    QW.querymanagement();
	    Thread.sleep(4000);
	    QA.QueryAllocation();
	    Thread.sleep(4000);
	    QA.QueryAllocation();
	    Thread.sleep(4000);
	    CM.SwitchTeamclick();
	    Thread.sleep(4000);
	    CM.ChangeTeamADropdownclick();
	    Thread.sleep(4000);
	    CM.clickchange();
	    Thread.sleep(4000);
	    
	}
	    
		
		
		
		

}

