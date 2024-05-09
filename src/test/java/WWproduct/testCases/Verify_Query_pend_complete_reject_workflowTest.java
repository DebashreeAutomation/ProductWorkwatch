package WWproduct.testCases;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
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
import freemarker.template.utility.Constants;

public class Verify_Query_pend_complete_reject_workflowTest extends BaseClassTest{
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
		
		Thread.sleep(1000);
		Raise_New_query newQuery= new Raise_New_query(driver);
		newQuery.query_management();
		newQuery.NewQuery();
		Thread.sleep(1000);
		newQuery.SetAssigneeTeam();
		newQuery.Setworktype();
		newQuery.Enterquerysubject();
		newQuery.Enterquerysummary();
		newQuery.SetLocation();
		newQuery.Setimpact();
		newQuery.SetUrgency();
		newQuery.SetQuerysource();
		Thread.sleep(5000);
		newQuery.ClickAdd();
		
		Thread.sleep(2000);
		myRaisedqueries myraisedaisedqueries=new  myRaisedqueries(driver);
		Thread.sleep(2000);
	    myraisedaisedqueries.MyRaisedQueries();
		Thread.sleep(2000);
		String  queryid= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div/div[3]/div[2]/table/tbody/tr[1]/td[2]/a")).getText();
		myraisedaisedqueries.clickonqueryid();
		Thread.sleep(2000);
	    captureScreen(driver,"Query information popup");
	    Thread.sleep(2000);
		myraisedaisedqueries.clickcut();
		Thread.sleep(2000);
		myraisedaisedqueries.exporttoexcel();
		Thread.sleep(2000);
		query_AllocationPage queryallocation=new query_AllocationPage(driver);
		queryallocation.QueryAllocation();
		 Thread.sleep(10000);
		 queryallocation.ClickoutstandingQueryBucket();
		 Thread.sleep(2000);
		 WebElement searchboxclick1=driver.findElement(By.xpath("//*[@id=\"tblQueryAllocation_filter\"]/label/input"));
		 Thread.sleep(2000);
		 searchboxclick1.sendKeys(queryid + "\n");
		 Thread.sleep(5000);
		 queryallocation.tickboxClick();
		 Thread.sleep(2000);
		 queryallocation.selectteam();
		 Thread.sleep(2000);
		 queryallocation.selectdebashreeEmployee();
		 Thread.sleep(2000);
		 queryallocation.Clickallocate();
		 Thread.sleep(2000);
		 captureScreen(driver,"Query cann't be assigned to the person who has raised the query");
		 Thread.sleep(2000);
		 WebElement searchboxclick2=driver.findElement(By.xpath("//*[@id=\"tblQueryAllocation_filter\"]/label/input"));
		 Thread.sleep(2000);
		 searchboxclick2.sendKeys(queryid + "\n");
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
	Thread.sleep(500);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.xpath("//*[@id='tblMyQueries_filter']/label/input"));
	js.executeScript("arguments[0].scrollIntoView();", element);
	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(520));
	WebElement Querysearchbox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tblMyQueries_filter']/label/input")));
	Thread.sleep(2000);
	Querysearchbox.sendKeys(queryid + "\n");
	Thread.sleep(2000);
	queryworkflow.click_startquery();
	Thread.sleep(2000);
	queryworkflow.enterpendqueryResponse();
	Thread.sleep(2000);
	queryworkflow.SetqueryActionPend();
	Thread.sleep(2000);
	queryworkflow.click_submit();
	Thread.sleep(10000);
	WebElement Querysearchbox1=driver.findElement(By.xpath("//*[@id='tblMyQueries_filter']/label/input"));
	Querysearchbox1.sendKeys(queryid + "\n");
	Thread.sleep(2000);
	queryworkflow.click_startquery();
	Thread.sleep(3000);
	queryworkflow.click_Queryjourney();
	Thread.sleep(5000);
	queryworkflow.click_AddresponseTask();
	Thread.sleep(2000);
	queryworkflow.enterCompletequeryResponse();
	Thread.sleep(2000);
	queryworkflow.SetqueryActionComplete();
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
	Thread.sleep(10000);
	queryallocationTestuser.ClickcompletedQueryBucket();
	Thread.sleep(1000);
	 WebElement searchboxclick3=driver.findElement(By.xpath("//*[@id='tblQueryAllocation_filter']/label/input"));
	 Thread.sleep(2000);
	 searchboxclick3.sendKeys(queryid + "\n");
	 Thread.sleep(2000);
	driver.close();
	
	
	//Tejas Local reject the query
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
queryworkflowTejasLocal.enterrejectqueryResponse();
Thread.sleep(2000);
queryworkflowTejasLocal.SetqueryReject();
Thread.sleep(2000);
queryworkflowTejasLocal.click_submit();
Thread.sleep(10000);
queryworkflowTejasLocal.click_confirmok();
Thread.sleep(2000);
queryworkflowTejasLocal.querymanagement();
Thread.sleep(2000);
queryallocationTejasLocal.QueryAllocation();
Thread.sleep(2000);
queryallocationTejasLocal.ClickrejectedQueryBucket();
Thread.sleep(2000);
WebElement searchboxclickTejasLocal=driver2.findElement(By.xpath("//*[@id='tblQueryAllocation_filter']/label/input"));
Thread.sleep(2000);
searchboxclickTejasLocal.sendKeys(queryid + "\n");
Thread.sleep(2000);
queryworkflowTejasLocal.QueryJourney();
Thread.sleep(2000);
WebElement queryidsearchbox=driver2.findElement(By.xpath("(//*[@class='form-control'])[3]"));
Thread.sleep(2000);
queryidsearchbox.sendKeys(queryid + "\n");
Thread.sleep(2000);
queryworkflowTejasLocal.clicksearchinCJ();
Thread.sleep(2000);
queryworkflowTejasLocal.clickqueryid();
Thread.sleep(2000);
queryworkflowTejasLocal.downloadqueryjourneyDetails();
Thread.sleep(2000);
driver2.close();
	}

}
