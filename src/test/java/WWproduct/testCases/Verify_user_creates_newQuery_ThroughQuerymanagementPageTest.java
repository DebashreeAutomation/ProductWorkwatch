package WWproduct.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import WWproduct.pageObjects.Raise_New_query;
import WWproduct.pageObjects.loginToWWproduct;
import WWproduct.utilities.ReadConfig;

public class Verify_user_creates_newQuery_ThroughQuerymanagementPageTest extends BaseClassTest {
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
		newQuery.SetAssigneeTeam();
		newQuery.Setworktype();
		newQuery.Enterquerysubject();
		newQuery.Enterquerysummary();
		newQuery.SetLocation();
		newQuery.Setimpact();
		newQuery.SetUrgency();
		newQuery.SetQuerysource();
		newQuery.ClickAdd();

}
}
