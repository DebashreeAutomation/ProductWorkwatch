package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class caseManagementpagefortestusers {
	WebDriver driver;
	public caseManagementpagefortestusers(WebDriver driver)
	{
		this.driver=driver;
}
	public void caseManagement()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement casemanagement=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sideLnk105\"]")));	
		casemanagement.click();
	}
	public void CaseAllocation()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement ClickCaseAllocation=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sideLnk62\"]")));	
		ClickCaseAllocation.click();
	}
	public void Rejectedbucket()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement ClickrejectedBucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseRejected\"]")));	
		ClickrejectedBucket.click();
	}
	public void Outstandingbucket()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement ClickoutstandingBucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseOutanding\"]")));	
		ClickoutstandingBucket.click();
	}
	public void tickboxClick()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement tickbox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div[2]/table/tbody/tr/td[3]/input")));	
		tickbox.click();
	}
	public void eligibleEmployeeClick()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement eligibleEmployee=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnEligible\"]")));	
		eligibleEmployee.click();
	}
	public void debashreeEmployeeSelect()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement debashreeEmployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SelectEmployee\"]")));
		Select employee=new Select(debashreeEmployee);
		employee.selectByVisibleText("Debashree Panigrahi");
	}
	public void TejasLocalEmployeeSelect()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement TejasLocalEmployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SelectEmployee\"]")));
		Select employee=new Select(TejasLocalEmployee);
		employee.selectByVisibleText("Tejas Local");
	}
	public void TestUserEmployeeSelect()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement Testuseremployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SelectEmployee\"]")));
		Select employee=new Select(Testuseremployee);
		employee.selectByVisibleText("TEST USER");
	}
	public void AllocatebtnClick()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement allocate=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnAllocate\"]")));	
		allocate.click();
	}
	
	public void Searchboxcaseallocationpage()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement searchbox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FilteredCaseInfoGrid_filter\"]/label/input")));	
		searchbox.click();
	}
	
	public void Casejourney()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement Casejourneyclick=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sideLnk66\"]")));	
		Casejourneyclick.click();
	}
	
	public void SearchCasejourney()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement SearchCaseJourney=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnCJFilter\"]")));	
		SearchCaseJourney.click();
	}
	public void firstcaseclick()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement firstcase=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblFilteredCaseDetail\"]/tbody/tr[1]/td[1]/a")));	
		firstcase.click();
	}
	public void clicksecondcase()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement secondcase =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblFilteredCaseDetail\"]/tbody/tr[2]/td[1]/a")));	
		secondcase.click();
	}
	public void downloadcasejourney1()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement casejourney1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblFilteredCaseDetail_wrapper\"]/div[2]/a/span/i")));	
		casejourney1.click();
	}
	public void downloadcasejourney2()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement casejourney2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblBindCaseJourneyView_wrapper\"]/div[2]/a/span/i")));	
		casejourney2.click();
	}
	public void reworkbucket()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement ClickreworkBucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseReworkError\"]")));	
		ClickreworkBucket.click();
	}
	public void Completedbucket()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement ClickcompletedBucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseCompleted\"]")));	
		ClickcompletedBucket.click();
	}
	


}
