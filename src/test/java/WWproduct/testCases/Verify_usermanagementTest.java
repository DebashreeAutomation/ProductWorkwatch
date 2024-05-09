package WWproduct.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import WWproduct.pageObjects.UserManagementPage;
import WWproduct.pageObjects.loginToWWproduct;
import WWproduct.utilities.ReadConfig;

public class Verify_usermanagementTest extends BaseClassTest {
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
		UserManagementPage UM=new UserManagementPage(driver);
		
		//Add Employee Action
		Thread.sleep(5000);
		UM.UserManagement();
		Thread.sleep(5000);
		UM.AddEmployee();
		Thread.sleep(5000);
		UM.EmployeeLANID();
		Thread.sleep(5000);
		UM.EmployeeID();
		Thread.sleep(5000);
		UM.FirstName();
		Thread.sleep(5000);
		UM.LastName();
		Thread.sleep(5000);
		UM.Gender();
		Thread.sleep(5000);
		UM.TimeZone();
		Thread.sleep(5000);
		UM.ClickReset();
		Thread.sleep(5000);
		UM.EmployeeLANID();
		Thread.sleep(5000);
		UM.EmployeeID();
		Thread.sleep(5000);
		UM.FirstName();
		Thread.sleep(5000);
		UM.LastName();
		Thread.sleep(5000);
		UM.ClickAdd();
		Thread.sleep(5000);
		UM.Gender();
		Thread.sleep(5000);
		UM.EmailidAddEMp();
		Thread.sleep(5000);
		UM.TeamManagerdropdown();
		Thread.sleep(5000);
		UM.TeamManager();
		Thread.sleep(5000);
		UM.TeamManagerDebashree();
		Thread.sleep(5000);
		UM.TimeZone();
		Thread.sleep(5000);
		UM.SelectTeamofEmp();
		Thread.sleep(5000);
		UM.SelectRoleofEmp();
		Thread.sleep(5000);
		UM.clickRoleofEmp();
		Thread.sleep(5000);
		UM.SelectWorktypeofEmp();
		Thread.sleep(5000);
		UM.clickworktypeofEmp();
		Thread.sleep(5000);
		UM.ClickAdd();
		Thread.sleep(5000);
		WebElement Searchbox=driver.findElement(By.xpath("//*[@id='SearchUsers']"));
				Searchbox.sendKeys("Praj");
				Thread.sleep(5000);
		UM.ClickSearchiconinAddEmpPage();
		Thread.sleep(5000);
		UM.EditAddEmp();
		Thread.sleep(5000);
		//UM.updateEmailidAddEMp();
		Thread.sleep(5000);
		UM.updateGender();
		Thread.sleep(5000);
		UM.SelectTeamofEmp();
		Thread.sleep(5000);
		UM.SelectAdminRoleofEmp();
		Thread.sleep(5000);
		UM.clickRoleofEmp();
		Thread.sleep(5000);
		UM.SelectWorktypeofEmp();
		Thread.sleep(5000);
		UM.clickworktypeofEmp();
		Thread.sleep(5000);
		UM.updateEmp();
		Thread.sleep(5000);
		UM.EditAddEmp();
		Thread.sleep(5000);
		UM.clickTickbox();
		Thread.sleep(5000);
		UM.deleteRoleofAddemp();
		Thread.sleep(5000);
		UM.ClickConfirmOK();
		Thread.sleep(5000);
		UM.exportAddemp();
		Thread.sleep(5000);
		UM.updateEmp();
		Thread.sleep(5000);
		UM.disableEmpl();
		Thread.sleep(5000);
		

}
}
