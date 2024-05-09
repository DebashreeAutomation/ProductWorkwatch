package WWproduct.testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import WWproduct.pageObjects.Raise_New_query;
import WWproduct.pageObjects.TestuserLoginpage;
import WWproduct.pageObjects.loginToWWproduct;
import WWproduct.pageObjects.myRaisedqueries;
import WWproduct.pageObjects.query_AllocationPage;
import WWproduct.pageObjects.query_workflow;
import WWproduct.utilities.ReadConfig;

public class verify_query_forward_externalquery_close_workflow extends BaseClassTest {
	ReadConfig readconfig;
	 public String baseURL;
	 public String username;
	 public String password;
	 public String outlookURL;

	@Test(priority=1)
	 
	public void login() throws IOException, InterruptedException
	{
		readconfig=new ReadConfig();
		username=readconfig.getMyCredentials();
		password=readconfig.getPassword();
		baseURL=readconfig.getApplicationURL();
		outlookURL=readconfig.getoutlookURL();
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
		
		Thread.sleep(2000);
		Raise_New_query newQuery= new Raise_New_query(driver);
		
		newQuery.query_management();
		Thread.sleep(2000);
		newQuery.NewQuery();
		Thread.sleep(1000);
		newQuery.SetAssigneeTeam();
		Thread.sleep(2000);
		newQuery.Setworktype();
		Thread.sleep(2000);
		newQuery.Enterquerysubject();
		Thread.sleep(2000);
		newQuery.Enterquerysummary();
		Thread.sleep(2000);
		newQuery.SetLocation();
		Thread.sleep(2000);
		newQuery.Setimpact();
		Thread.sleep(2000);
		newQuery.SetUrgency();
		Thread.sleep(2000);
		newQuery.SetQuerysource();
		Thread.sleep(5000);
		newQuery.ClickAdd();
		Thread.sleep(2000);
		myRaisedqueries myraisedaisedqueries=new  myRaisedqueries(driver);
		Thread.sleep(2000);
	    myraisedaisedqueries.MyRaisedQueries();
		Thread.sleep(2000);
		String  queryid= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div/div[3]/div[2]/table/tbody/tr[1]/td[2]/a")).getText();
		Thread.sleep(3000);
		query_AllocationPage queryallocation=new query_AllocationPage(driver);
		queryallocation.QueryAllocation();
		 Thread.sleep(10000);
		 queryallocation.ClickoutstandingQueryBucket();
		 Thread.sleep(2000);
		 WebElement searchboxclick1=driver.findElement(By.xpath("//*[@id='tblQueryAllocation_filter']/label/input"));
		 Thread.sleep(2000);
		 searchboxclick1.sendKeys(queryid + "\n");
		 Thread.sleep(5000);
		 queryallocation.tickboxClick();
		 Thread.sleep(2000);
		 queryallocation.selectteam();
		 Thread.sleep(2000);
		 queryallocation.selectTestuserEmployee();
		 Thread.sleep(2000);
		 queryallocation.Clickallocate();
		 Thread.sleep(2000);
         driver.close();
         
       
         //Test userlogin and forward the query
         
         WebDriver driver=new ChromeDriver(chromeOptions);
			driver.manage().window().maximize(); 
			Thread.sleep(1000);
			driver.get(baseURL);
			Thread.sleep(1000);
			driver.manage().deleteAllCookies(); Thread.sleep(2500);
			Thread.sleep(2000);
			TestuserLoginpage testuserlogin=new TestuserLoginpage(driver);
			testuserlogin.enterTestusermailid();
			Thread.sleep(2000);
			testuserlogin.enternextbtn();
			Thread.sleep(2000);
			testuserlogin.entertestuserpswd();
			Thread.sleep(2000);
			testuserlogin.signin();
			Thread.sleep(2000);
			testuserlogin.yesclick();
			Thread.sleep(2000);
			testuserlogin.okclick();
		    Thread.sleep(10000);
	        query_workflow queryworkflow = new query_workflow (driver);
	        query_AllocationPage queryallocationTestuser=new query_AllocationPage(driver);
	        Thread.sleep(5000);
	    	JavascriptExecutor js=(JavascriptExecutor) driver;
	    	WebElement element = driver.findElement(By.xpath("(//*[@class='form-control input-sm'])[4]"));
	    	js.executeScript("arguments[0].scrollIntoView();", element);
	    	Thread.sleep(2000);
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(520));
	    	WebElement Querysearchbox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tblMyQueries_filter']/label/input")));
	    	Thread.sleep(2000);
	    	Querysearchbox.sendKeys(queryid + "\n");
	    	Thread.sleep(2000);
	    	queryworkflow.click_startquery();
	    	Thread.sleep(2000);
	    	queryworkflow.enterforwardqueryResponse();
	    	Thread.sleep(2000);
	    	queryworkflow.SetqueryActionforward();
	    	Thread.sleep(2000);
	    	queryworkflow.checkforwardANDassigneeCheckbox();
	    	Thread.sleep(2000);
	    	queryworkflow.SetAssigneeTeamForquery();
	    	Thread.sleep(2000);
	    	queryworkflow.SettejasLocalAssigneeForquery();
	    	Thread.sleep(2000);
	        queryworkflow.click_submit();
	        Thread.sleep(2000);
	        queryworkflow.querymanagement();
	        Thread.sleep(3000);
	        queryallocationTestuser.QueryAllocation();
	    	Thread.sleep(3000);
	    	queryallocationTestuser.ClickFowardQueryBucket();
	    	Thread.sleep(1000);
	   	 WebElement searchboxclick3=driver.findElement(By.xpath("//*[@id='tblQueryAllocation_filter']/label/input"));
	   	 Thread.sleep(2000);
	   	 searchboxclick3.sendKeys(queryid + "\n");
	   	 Thread.sleep(2000);
	   	driver.close();
	   	
	   	//TejasLocal testuser login and external query raised
	   	
	   	WebDriver driver2=new ChromeDriver(chromeOptions);
		 driver2.manage().window().maximize(); 
			Thread.sleep(1000);
			driver2.get(baseURL);
			Thread.sleep(1000);
			driver2.manage().deleteAllCookies(); Thread.sleep(2500);
			Thread.sleep(2000);
			TestuserLoginpage testuserlogin1=new TestuserLoginpage(driver2);
			testuserlogin1.enterTejasLocalmailid();
			Thread.sleep(2000);
			testuserlogin1.enternextbtn();
			Thread.sleep(2000);
			testuserlogin1.entertejasLocalpswd();
			Thread.sleep(2000);
			testuserlogin1.signin();
			Thread.sleep(2000);
			testuserlogin1.yesclick();
			Thread.sleep(2000);
			testuserlogin1.okclick();
		    Thread.sleep(10000);
	     query_workflow queryworkflowTejasLocal = new query_workflow (driver2);
	     query_AllocationPage queryallocationTejasLocal=new query_AllocationPage(driver2);
	Thread.sleep(5000);
	JavascriptExecutor js1=(JavascriptExecutor) driver2;
	WebElement element1 = driver2.findElement(By.xpath("//*[@id='tblMyQueries_filter']/label/input"));
	js1.executeScript("arguments[0].scrollIntoView();", element1);
	Thread.sleep(2000);
	WebElement QuerysearchboxTejasLocal=driver2.findElement(By.xpath("//*[@id='tblMyQueries_filter']/label/input"));
	Thread.sleep(2000);
	QuerysearchboxTejasLocal.sendKeys(queryid + "\n");
	Thread.sleep(2000);
	queryworkflowTejasLocal.click_startquery();
	Thread.sleep(2000);
	queryworkflowTejasLocal.enterexternalqueryResponse();
	Thread.sleep(2000);
	queryworkflowTejasLocal.SetqueryExternalQuery();
	Thread.sleep(2000);
	queryworkflowTejasLocal.enterexternalmailid();
	Thread.sleep(2000);
	queryworkflowTejasLocal.click_submit();
	Thread.sleep(2000);
	queryworkflowTejasLocal.click_submit();
	Thread.sleep(2000);
	queryworkflowTejasLocal.querymanagement();
	Thread.sleep(2000);
	queryallocationTejasLocal.QueryAllocation();
	Thread.sleep(2000);
	queryallocationTejasLocal.ClickexternalQueryBucket();
	Thread.sleep(2000);
	WebElement searchboxclickTejasLocal=driver2.findElement(By.xpath("//*[@id='tblQueryAllocation_filter']/label/input"));
	Thread.sleep(2000);
	searchboxclickTejasLocal.sendKeys(queryid + "\n");
	Thread.sleep(2000);
	driver2.close();
	
	//CIAS INT outlook login and response the query
	WebDriver driver3=new ChromeDriver(chromeOptions);
	 driver3.manage().window().maximize(); 
		Thread.sleep(1000);
		driver3.get(outlookURL);
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
		//Thread.sleep(5000);
		//WebElement outlooksearchbox=driver3.findElement(By.xpath("//*[@id=\"topSearchInput\"]"));
		//Thread.sleep(2000);
		//outlooksearchbox.sendKeys( "QRY27795" + "\n");
		//Thread.sleep(2000);
		query_workflow outlookAction=new query_workflow(driver3);
		//outlookAction.outlooksearchiconclick();
		Thread.sleep(2000);
		outlookAction.wwdevclick();
		Thread.sleep(2000);
		outlookAction.replyallclick();
		Thread.sleep(2000);
		////outlookAction.threedotclick();
		Thread.sleep(1000);
		outlookAction.mailbodytext();
		Thread.sleep(1000);
		outlookAction.sendbtnclick();
		Thread.sleep(2000);
		driver3.close();
		
      
	//TejasLocal testuser again login and external query raised
	   	
	  	WebDriver driver4=new ChromeDriver(chromeOptions);
		 driver4.manage().window().maximize(); 
			Thread.sleep(1000);
			driver4.get(baseURL);
			Thread.sleep(1000);
			driver4.manage().deleteAllCookies(); Thread.sleep(2500);
			Thread.sleep(2000);
			TestuserLoginpage testuserlogin2=new TestuserLoginpage(driver4);
			testuserlogin2.enterTejasLocalmailid();
			Thread.sleep(2000);
			testuserlogin2.enternextbtn();
			Thread.sleep(2000);
			testuserlogin2.entertejasLocalpswd();
			Thread.sleep(2000);
			testuserlogin2.signin();
			Thread.sleep(2000);
			testuserlogin2.yesclick();
			Thread.sleep(2000);
			testuserlogin2.okclick();
		    Thread.sleep(10000);
	     query_workflow queryworkflowTejasLocal1 = new query_workflow (driver4);
	     query_AllocationPage queryallocationTejasLocal1=new query_AllocationPage(driver4);
	Thread.sleep(5000);
	JavascriptExecutor js2=(JavascriptExecutor) driver4;
	WebElement element2 = driver4.findElement(By.xpath("//*[@id='tblMyQueries_filter']/label/input"));
	js2.executeScript("arguments[0].scrollIntoView();", element2);
	Thread.sleep(2000);
	WebElement QuerysearchboxTejasLocal1=driver4.findElement(By.xpath("//*[@id='tblMyQueries_filter']/label/input"));
	Thread.sleep(2000);
	QuerysearchboxTejasLocal1.sendKeys(queryid + "\n");
	Thread.sleep(2000);
	queryworkflowTejasLocal1.click_startquery();
	Thread.sleep(2000);
	queryworkflowTejasLocal1.enterclosequeryResponse();
	Thread.sleep(2000);
	queryworkflowTejasLocal1.SetqueryActionClose();
	Thread.sleep(2000);
	queryworkflowTejasLocal1.click_submit();
	queryworkflowTejasLocal1.click_confirmok();
	queryworkflowTejasLocal1.querymanagement();
	Thread.sleep(2000);
	queryallocationTejasLocal1.QueryAllocation();
	Thread.sleep(2000);
	queryallocationTejasLocal1.ClickClosedQueryBucket();
	Thread.sleep(2000);
	WebElement searchboxclickTejasLocal1=driver4.findElement(By.xpath("//*[@id='tblQueryAllocation_filter']/label/input"));
	Thread.sleep(2000);
	searchboxclickTejasLocal1.sendKeys(queryid + "\n");
	Thread.sleep(2000);
	queryworkflowTejasLocal1.QueryJourney();
	Thread.sleep(2000);
	WebElement queryidsearchbox=driver4.findElement(By.xpath("(//*[@class='form-control'])[3]"));
	Thread.sleep(2000);
	queryidsearchbox.sendKeys(queryid + "\n");
	Thread.sleep(2000);
	queryworkflowTejasLocal1.clicksearchinCJ();
	Thread.sleep(2000);
	queryworkflowTejasLocal1.clickqueryid();
	Thread.sleep(2000);
	queryworkflowTejasLocal1.downloadqueryjourneyDetails();
	Thread.sleep(2000);
	driver4.close();

        
}
}
