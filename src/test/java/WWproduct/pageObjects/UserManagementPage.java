package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserManagementPage {
	WebDriver ldriver;
	public UserManagementPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	public void UserManagement()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement UserManagement=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sideLnk73']")));	
		UserManagement.click();
	}
	public void AddEmployee()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement AddEmployee=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sideLnk76']")));	
		AddEmployee.click();
	}
	public void EmployeeLANID()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement EmployeeLANID=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='txtUserId']")));	
		EmployeeLANID.sendKeys("p111114@capita.co.uk");
	}
	public void EmployeeID()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement EmployeeID=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='txtEmpId']")));	
		EmployeeID.sendKeys("p111114");
	}
	public void FirstName()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement FirstName=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='txtFname']")));	
		FirstName.sendKeys("Praj");
	}
	public void LastName()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement LastName=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='txtLname']")));	
		LastName.sendKeys("Panda");
	}
	public void EmailidAddEMp()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement EmailidAddEMp=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='txtEmail']")));	
		EmailidAddEMp.sendKeys("p111114@gmail.com");
	}
	public void Gender()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Gender= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectGender']")));
		Select GenderM=new Select(Gender);
		GenderM.selectByVisibleText("Male");
	}
	public void TeamManagerdropdown()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement TeamManager= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='select2-SelectTeamMgr-container']")));
		TeamManager.click();
	}
	public void TeamManager()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement TeamManager= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='select2-search__field'])[3]")));
		TeamManager.sendKeys("Debashree Panigrahi");
	}
	public void TeamManagerDebashree()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement TeamManager= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='select2-results__option select2-results__option--highlighted'])[1]")));
		TeamManager.click();
	}
	public void TimeZone()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement TZ= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectTimezone']")));
		Select TimeZone=new Select(TZ);
		TimeZone.selectByVisibleText("(UTC-10:00) Hawaii");
	}
	public void SelectTeamofEmp()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Team= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectTeam']")));
		Select SelectTeamofEmp=new Select(Team);
		SelectTeamofEmp.selectByVisibleText("Team A");
	}
	
	public void SelectRoleofEmp()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Role= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='select2-search__field'])[1]")));
		Role.sendKeys("Processor");
	}
	public void clickRoleofEmp()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Role= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='select2-results__option select2-results__option--highlighted'])[1]")));
		Role.click();
	}
	public void SelectAdminRoleofEmp()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement SelectAdminRoleofEmp= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='select2-search__field'])[1]")));
		SelectAdminRoleofEmp.sendKeys("Admin");
	}
	public void SelectWorktypeofEmp()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='select2-search__field'])[2]")));
		Worktype.sendKeys("Worktype A");
	}
	public void clickworktypeofEmp()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement clickworktypeofEmp= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='select2-results__option select2-results__option--highlighted'])[1]")));
		clickworktypeofEmp.click();
	}
	public void ClickAdd()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement ClickAdd= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='empAddUpdate']")));
		ClickAdd.click();
	}
	public void ClickReset()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement ClickReset= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btnReset']")));
		ClickReset.click();
	}
	public void ClickSearchiconinAddEmpPage()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement ClickSearchiconinAddEmpPage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btnSearchUsers']")));
		ClickSearchiconinAddEmpPage.click();
	}
	public void EditAddEmp()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement EditAddEmp= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fa fa-edit editusericon']")));
		EditAddEmp.click();
	}
	public void updateEmailidAddEMp()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement updateEmailidAddEMp=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='txtEmail']")));	
		updateEmailidAddEMp.sendKeys("p111111@capita.com");
	}
	public void updateGender()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Gender= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectGender']")));
		Select GenderM=new Select(Gender);
		GenderM.selectByVisibleText("Female");
	}
	public void updateEmp()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement updateEmp= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='empAddUpdate']")));
		updateEmp.click();
	}
	public void clickTickbox()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement clickTickbox= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div[1]/div/div/div[3]/div/div/div[2]/div/form/fieldset/div[3]/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/input")));
		clickTickbox.click();
	}
	public void deleteRoleofAddemp()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement updateEmp= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='empDetails']/div/div/div[3]/div/div/div[2]/div/form/fieldset/div[1]/div[5]/i")));
		updateEmp.click();
	}
	public void ClickConfirmOK()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement ClickConfirmOK= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='CancelPassword'])[2]")));
		ClickConfirmOK.click();
	}
	public void exportAddemp()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement updateEmp= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='exportusermanage fa fa-file-excel-o serverexportallocation float-right']")));
		updateEmp.click();
	}
	public void disableEmpl()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement disableEmpl= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='userList']/li/a/div[3]/label/span")));
		disableEmpl.click();
	}
}
