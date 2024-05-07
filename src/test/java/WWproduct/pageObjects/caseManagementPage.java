package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class caseManagementPage {
	WebDriver ldriver;
	public caseManagementPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	public void caseManagement()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement casemanagement=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sideLnk105\"]")));	
		casemanagement.click();
	}
	public void CaseAllocation()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement ClickCaseAllocation=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sideLnk62\"]")));	
		ClickCaseAllocation.click();
	}
	public void Rejectedbucket()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement ClickrejectedBucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseRejected\"]")));	
		ClickrejectedBucket.click();
	}
	public void Outstandingbucket()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement ClickoutstandingBucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseOutanding\"]")));	
		ClickoutstandingBucket.click();
	}
	public void tickboxClick()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement tickbox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div[2]/table/tbody/tr/td[3]/input")));	
		tickbox.click();
	}
	public void eligibleEmployeeClick()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement eligibleEmployee=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnEligible\"]")));	
		eligibleEmployee.click();
	}
	public void debashreeEmployeeSelect()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement debashreeEmployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SelectEmployee\"]")));
		Select employee=new Select(debashreeEmployee);
		employee.selectByVisibleText("Debashree Panigrahi");
	}
	public void TESTUSER1EmployeeSelect()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement TESTUSER1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SelectEmployee\"]")));
		Select employee=new Select(TESTUSER1);
		employee.selectByVisibleText("TEST USER1");
	}
	public void TejasLocalEmployeeSelect()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement TejasLocalEmployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SelectEmployee\"]")));
		Select employee=new Select(TejasLocalEmployee);
		employee.selectByVisibleText("Tejas Local");
	}
	public void TestUserEmployeeSelect()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Testuseremployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SelectEmployee\"]")));
		Select employee=new Select(Testuseremployee);
		employee.selectByVisibleText("TEST USER");
	}
	public void AllocatebtnClick()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement allocate=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnAllocate\"]")));	
		allocate.click();
	}
	
	public void Searchboxcaseallocationpage()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement searchbox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FilteredCaseInfoGrid_filter\"]/label/input")));	
		searchbox.click();
	}
	
	public void Casejourney()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement Casejourneyclick=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sideLnk66\"]")));	
		Casejourneyclick.click();
	}
	
	public void SearchCasejourney()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement SearchCaseJourney=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnCJFilter\"]")));	
		SearchCaseJourney.click();
	}
	public void firstcaseclick()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement firstcase=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblFilteredCaseDetail\"]/tbody/tr[1]/td[1]/a")));	
		firstcase.click();
	}
	public void clicksecondcase()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement secondcase =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblFilteredCaseDetail\"]/tbody/tr[2]/td[1]/a")));	
		secondcase.click();
	}
	public void downloadcasejourney1()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement casejourney1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblFilteredCaseDetail_wrapper\"]/div[2]/a/span/i")));	
		casejourney1.click();
	}
	public void downloadcasejourney2()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement casejourney2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblBindCaseJourneyView_wrapper\"]/div[2]/a/span/i")));	
		casejourney2.click();
	}
	public void reworkbucket()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement ClickreworkBucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseReworkError\"]")));	
		ClickreworkBucket.click();
	}
	public void Completedbucket()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement ClickcompletedBucket=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spnCaseCompleted\"]")));	
		ClickcompletedBucket.click();
	}
	public void selectworktypeA()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement WorkType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[2]")));
		Select selectworktypeA=new Select(WorkType);
		selectworktypeA.selectByVisibleText("Worktype A");
	}
	public void selectworktypeB()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement WorkType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[2]")));
		Select selectworktypeB=new Select(WorkType);
		selectworktypeB.selectByVisibleText("Worktype B");
	}
	public void ClickFilteroncaseAllocationPage()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Filter=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn btn-success btn-allocation']")));	
		Filter.click();
	}
	public void ClickresetincaseallocationPage()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Reset=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn btn-success']")));	
		Reset.click();
	}
	public void enterreceivedDate()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement enterreceivedDate=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='form-control line-height']")));	
		enterreceivedDate.sendKeys("28-Mar-2024");
	}
	public void ClicktickboxAgainstcase()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement tickbox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='check'])[1]")));	
		tickbox.click();
	}
	public void updateCaseDetails()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement updateCaseDetails=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success btn-md dropdown-toggle'])[3]")));	
		updateCaseDetails.click();
	}
	public void EntertextinupdateCaseDetails()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement text=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[4]/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div/input")));	
		text.sendKeys("Case is updated");
	}
	public void seturgencylow()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[2]")));
		Select seturgencylow=new Select(urgency);
		seturgencylow.selectByVisibleText("Low");
	}
	public void seturgencyNormal()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[2]")));
		Select seturgencylow=new Select(urgency);
		seturgencylow.selectByVisibleText("Normal");
	}
	public void Clickupdate()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement update=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn btn-success btn-md dropdown-toggle float-xs-right']")));	
		update.click();
	}
	public void Clickcutpopuppage()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement popuppage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='a-icon a-icon-close'])[3]")));	
		popuppage.click();
	}
	public void selecturgencyNormal()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[3]")));
		Select selecturgencyNormal=new Select(urgency);
		selecturgencyNormal.selectByVisibleText("Normal");
	}
	public void selecturgencyCritical()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[3]")));
		Select selecturgencyCritical=new Select(urgency);
		selecturgencyCritical.selectByVisibleText("Critical");
	}
	public void selecturgencyLow()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[3]")));
		Select selecturgencyLow=new Select(urgency);
		selecturgencyLow.selectByVisibleText("Low");
	}
	public void selecturgencyHigh()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[3]")));
		Select selecturgencyHigh=new Select(urgency);
		selecturgencyHigh.selectByVisibleText("High");
	}
	public void selectTypeAllocation()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Type= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[4]")));
		Select selectTypeAllocation=new Select(Type);
		selectTypeAllocation.selectByVisibleText("Allocation");
	}
	public void selectTypeReAllocation()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Type= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[4]")));
		Select selectTypeReAllocation=new Select(Type);
		selectTypeReAllocation.selectByVisibleText("Reallocation");
	}
	public void expandfilter()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement expandfilter=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-plus-square btn btn-success circletoggle']")));	
		expandfilter.click();
	}
	public void enterTargetdDate()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement enterTargetdDate=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='form-control line-height col-md-12']")));	
		enterTargetdDate.sendKeys("21-Nov-2023");
	}
	public void selectSourceEmail()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Source= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[5]")));
		Select selectSource=new Select(Source);
		selectSource.selectByVisibleText("Email");
	}
	public void selectSourceExcel()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Source= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[5]")));
		Select selectSource=new Select(Source);
		selectSource.selectByVisibleText("Excel");
	}
	public void selectSourceSystem()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Source= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[5]")));
		Select selectSource=new Select(Source);
		selectSource.selectByVisibleText("System");
	}
	public void selectAssignedTo()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement assignedto= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[8]")));
		Select selectAssignedTo=new Select(assignedto);
		selectAssignedTo.selectByVisibleText("Debashree Panigrahi");
	}
	public void selectAssignedToTejas()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement assignedto= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[8]")));
		Select selectAssignedTo=new Select(assignedto);
		selectAssignedTo.selectByVisibleText("Tejas Local");
	}
	public void selectAssignedToTU()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement assignedto= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[8]")));
		Select selectAssignedTo=new Select(assignedto);
		selectAssignedTo.selectByVisibleText("TEST USER1");
	}
	public void selectStatus()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Status= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[6]")));
		Select selectStatus=new Select(Status);
		selectStatus.selectByVisibleText("Sent for QC");
	}
	public void selectStage()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Stage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[7]")));
		Select selectStage=new Select(Stage);
		selectStage.selectByVisibleText("Quality");
	}
	public void uniqueidfilter()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement uniqueid=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='form-control txtvalidations']")));	
		uniqueid.sendKeys("12032");
	}
	
	public void clickDeallocate()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement clickDeallocate=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnDeallocate']")));	
		clickDeallocate.click();
	}
	public void clickconfirmOk()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ok=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='CancelPassword'])[2]")));	
		ok.click();
	}
	public void clickeyebutton()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement clickeyebutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-eye viewicon float-right1 padding-right-5px1 text-center']")));	
		clickeyebutton.click();
	}
	public void clickcutCasedetailspopup()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement clickcutCasedetailspopup=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='a-icon a-icon-close'])[3]")));	
		clickcutCasedetailspopup.click();
	}
	public void clickdelete()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement clickdelete=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnDeleteCases']")));	
		clickdelete.click();
	}
	public void exportToexcel()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement exportToexcel=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnExportToExcel']")));	
		exportToexcel.click();
	}
	public void peripheralActivity()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement peripheralActivity= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlNonCoreActivity']")));
		Select PA=new Select(peripheralActivity);
		PA.selectByVisibleText("Tea break");
	}
	public void EnterperipheralActivityComment()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement EnterperipheralActivityComment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='commentInput']")));	
		EnterperipheralActivityComment.sendKeys("I am going for tea break.I will resume my work after 10 min");
	}
	
	public void clickstartofperipheralActivity()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement peripheralActivity=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnStartNonCoreActivity']")));	
		peripheralActivity.click();
	}
	public void SwitchTeamclick()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement SwitchTeamclick=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-users btnChangeTeam']")));	
		SwitchTeamclick.click();
	}
	public void clickconfirmOktoswitchteam()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ok=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='CancelPassword'])[1]")));	
		ok.click();
	}
	public void ChangeTeamBDropdownclick()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement ChangeTeamDropdownclick= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectTeam']")));
		Select Team=new Select(ChangeTeamDropdownclick);
		Team.selectByVisibleText("Team B");
	}
	public void ChangeTeamADropdownclick()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement ChangeTeamDropdownclick= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectTeam']")));
		Select Team=new Select(ChangeTeamDropdownclick);
		Team.selectByVisibleText("Team A");
	}
	public void clickchange()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement clickchange=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnChange']")));	
		clickchange.click();
	}
	public void clickendperipheralActivity()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement clickendperipheralActivity=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnStartNonCoreActivity']")));	
		clickendperipheralActivity.click();
	}
	
}
