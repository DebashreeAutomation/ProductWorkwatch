package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myRaisedcase {

	WebDriver ldriver;
	public myRaisedcase(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	public void Case_Creation()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(2000));
		WebElement Casecreation=wait.until(ExpectedConditions.elementToBeClickable(By.id("sideLnk69")));	
		Casecreation.click();
	}
	public void MyRaisedCases()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(2000));
		WebElement Creation_byInterface=wait.until(ExpectedConditions.elementToBeClickable(By.id("sideLnk122")));	
		Creation_byInterface.click();
	}
	public void Setcasetypeclose()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(2000));
		WebElement casetype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlCaseType\"]")));
		Select caseType=new Select(casetype);
		caseType.selectByVisibleText("Closed");
	}
	public void clickgo()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Clickgo=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnFilter\"]")));	
		Clickgo.click();
	}
	public void clickoncase()
	{
		WebDriverWait wait=new WebDriverWait(ldriver,Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='tblMyUploadedCases']//tbody//tr[4]//td[2]//a//span")));
		WebElement Clickoncase=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@id='tblMyUploadedCases']//tbody//tr[4]//td[2]//a//span")));	
		Clickoncase.click();
	}
	public void clickonclosedcase()
	{
		WebDriverWait wait=new WebDriverWait(ldriver,Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tblMyUploadedCases\"]/tbody/tr[2]/td[2]/a/span")));
		WebElement Clickoncase=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblMyUploadedCases\"]/tbody/tr[2]/td[2]/a/span")));	
		Clickoncase.click();
	}
	public void EntercasecommentForcaseinfo()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(2000));
		WebElement entercasecomment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"txtCaseComments\"]")));	
		entercasecomment.sendKeys("case is updated for testing purpose");
	}
	public void clickadd()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement clickAdd=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnAddCase\"]")));	
		clickAdd.click();
	}
	public void clickcasejourney()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement clickcaseJourney=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TabsActionHolder\"]/li[2]/a")));	
		clickcaseJourney.click();
	}
	public void clickcut()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement clickCut=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnClosePopupView2\"]")));	
		clickCut.click();
	}
	
	
	public void exporttoexcel()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ExportToexcel=wait.until(ExpectedConditions.elementToBeClickable(By.id("btnExportToExcel")));	
		ExportToexcel.click();
	}
	public void Setcasetypeinprogress()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement inprogress= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlCaseType\"]")));
		Select InProgress=new Select(inprogress);
		InProgress.selectByVisibleText("In progress");
	}
}
