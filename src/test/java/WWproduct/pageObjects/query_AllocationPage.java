package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class query_AllocationPage {
	WebDriver driver;
	public query_AllocationPage(WebDriver driver)
	{
		this.driver=driver;
}
	public void QueryAllocation()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
		WebElement queryallocation=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sideLnk102\"]")));	
		queryallocation.click();
	}
	
	public void ClickoutstandingQueryBucket()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement outstandingquerybucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseOutanding\"]")));	
		outstandingquerybucket.click();
	}
	public void Clicksearchboxincaseallocationpage()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement serachboxclick=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblQueryAllocation_filter\"]/label/input")));	
		
	}
	public void tickboxClick()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement tickbox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[1]/input")));	
		tickbox.click();
	}
	public void selectteam()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement Team= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQAssigneeTeam\"]")));
		Select teamA=new Select(Team);
		teamA.selectByVisibleText("Team A");
	}
	public void selectTestuserEmployee()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement Assignee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQAssignee\"]")));
		Select Testuserassignee=new Select(Assignee);
		Testuserassignee.selectByVisibleText("TEST USER");
	}
	public void selectdebashreeEmployee()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement Assignee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQAssignee\"]")));
		Select Testuserassignee=new Select(Assignee);
		Testuserassignee.selectByVisibleText("Debashree Panigrahi");
	}
	public void Clickallocate()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement allocateincaseallocation=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnQAllocate\"]")));	
		allocateincaseallocation.click();
	}
	
	public void ClickClosedQueryBucket()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement closedquerybucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseClose\"]")));	
		closedquerybucket.click();
	}
	public void ClickFowardQueryBucket()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement FowardQueryBucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnQueryForwarded\"]")));	
		FowardQueryBucket.click();
	}
	public void ClickcompletedQueryBucket()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement completedQueryBucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseCompleted\"]")));	
		completedQueryBucket.click();
	}
	public void ClickrejectedQueryBucket()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement rejectedQueryBucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseRejected\"]")));	
		rejectedQueryBucket.click();
	}
	public void ClickexternalQueryBucket()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement externalQueryBucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseExternalQueries\"]")));	
		externalQueryBucket.click();
	}
	public void Closerejectedquery()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement closerejectedquery=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnCloseQuery\"]")));	
		closerejectedquery.click();
	}
	public void ClickFilteronqueryAllocationPage()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement Filter=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success btn-allocation'])[1]")));	
		Filter.click();
	}
	public void ClickresetinQueryallocationPage()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement Reset=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success btn-allocation'])[2]")));	
		Reset.click();
	}
	public void ClicktickboxAgainstQuery()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement tickbox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='check'])[1]")));	
		tickbox.click();
	}
	public void seturgencyCritical()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[8]")));
		Select seturgencyCritical=new Select(urgency);
		seturgencyCritical.selectByVisibleText("Critical");
	}
	public void seturgencyHigh()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[8]")));
		Select seturgencyHigh=new Select(urgency);
		seturgencyHigh.selectByVisibleText("High");
	}
	public void ClickupdateUrgency()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement ClickupdateUrgency=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success btn-md dropdown-toggle'])[3]")));	
		ClickupdateUrgency.click();
	}
	public void selecturgency()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[2]")));
		Select selecturgencyHigh=new Select(urgency);
		selecturgencyHigh.selectByVisibleText("High");
	}
	public void selecturgencyNormal()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[2]")));
		Select selecturgencyNormal=new Select(urgency);
		selecturgencyNormal.selectByVisibleText("Normal");
	}
	public void selecturgencyCritical()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[2]")));
		Select selecturgencyCritical=new Select(urgency);
		selecturgencyCritical.selectByVisibleText("Critical");
	}
	
	public void enterreceivedDate()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement enterreceivedDate=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='form-control line-height']")));	
		enterreceivedDate.sendKeys("25-Mar-2024");
	}
	public void selectActionReject()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement Action= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[3]")));
		Select selectActionReject=new Select(Action);
		selectActionReject.selectByVisibleText("Reject");
	}
	public void selectTypeAllocation()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement Type= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[4]")));
		Select selectTypeAllocation=new Select(Type);
		selectTypeAllocation.selectByVisibleText("Allocation");
	}
	public void selectworktypeA()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement WorkType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[5]")));
		Select selectworktypeA=new Select(WorkType);
		selectworktypeA.selectByVisibleText("Worktype A");
	}
	public void selectworktypeB()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement WorkType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[5]")));
		Select selectworktypeB=new Select(WorkType);
		selectworktypeB.selectByVisibleText("Worktype B");
	}
	public void ClickViewQueryDetails()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement QueryDetails=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success btn-md dropdown-toggle'])[5]")));	
		QueryDetails.click();
	}
	public void Clickcutpopuppage()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement popuppage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='a-icon a-icon-close'])[3]")));	
		popuppage.click();
	}
	public void ClickCloseRejectedQuery()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement ClickCloseRejectedQuery=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success btn-md dropdown-toggle'])[4]")));	
		ClickCloseRejectedQuery.click();
	}
}

