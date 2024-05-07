package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TeamDashboardPage {
	WebDriver ldriver;
	public TeamDashboardPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	public void TeamDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement TeamDashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sideLnk65']")));	
		TeamDashboard.click();
	}
	public void RTADashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement RTADashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='clsLoadRTADashboard']")));	
		RTADashboard.click();
	}
	public void SLADashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement SLADashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='clsLoadSLADashboard']")));	
		SLADashboard.click();
	}
	public void WorkflowDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement WorkflowDashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='clsLoadStageDashboard']")));	
		WorkflowDashboard.click();
	}
	public void LoadQualityDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement LoadQualityDashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='clsLoadQualityDashboard']")));	
		LoadQualityDashboard.click();
	}
	public void SelectTESTUSER()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Testuseremployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlSelectEmployee']")));
		Select SelectTESTUSER=new Select(Testuseremployee);
		SelectTESTUSER.selectByVisibleText("TEST USER");
	}
	public void SelectTejasLocal()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Testuseremployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlSelectEmployee']")));
		Select SelectTejasLocal=new Select(Testuseremployee);
		SelectTejasLocal.selectByVisibleText("Tejas Local");
	}
	public void SelectAllemployee()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Testuseremployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlSelectEmployee']")));
		Select SelectTejasLocal=new Select(Testuseremployee);
		SelectTejasLocal.selectByVisibleText("ALL");
	}
	public void SelectWorktypeAll()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectWorkType']")));
		Select SelectWorktypeAll=new Select(Worktype);
		SelectWorktypeAll.selectByVisibleText("ALL");
	}
	public void SelectWorktypeA()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectWorkType']")));
		Select SelectWorktypeA=new Select(Worktype);
		SelectWorktypeA.selectByVisibleText("Worktype A");
	}
	public void SelectWorktypeB()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectWorkType']")));
		Select SelectWorktypeA=new Select(Worktype);
		SelectWorktypeA.selectByVisibleText("Worktype B");
	}
	public void SelectTeamA()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Team= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlSelectTeam']")));
		Select SelectTeamA=new Select(Team);
		SelectTeamA.selectByVisibleText("Team A");
	}
	public void SelectTeamB()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Team= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlSelectTeam']")));
		Select SelectTeamB=new Select(Team);
		SelectTeamB.selectByVisibleText("Team B");
	}
	public void Clickgo()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Clickgo=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnFilter']")));	
		Clickgo.click();
	}
	public void TeamDashboardTeamwise()
	{
		ldriver.findElement(By.xpath("//*[@id='rbTeamwise']")).click();
	}
	public void PRODUCTIVE_NONPRODUCTIVE_TIME()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement PRODUCTIVE_NONPRODUCTIVE_TIME=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[1]")));	
		PRODUCTIVE_NONPRODUCTIVE_TIME.click();
	}
	public void TEAM_VS_TARGET()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement TEAM_VS_TARGET=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[2]")));	
		TEAM_VS_TARGET.click();
	}
	public void TIME_UTILIZATION()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement TIME_UTILIZATION=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[3]")));	
		TIME_UTILIZATION.click();
	}
	public void PRODUCTIVITY()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement PRODUCTIVITY=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ExportProductiveBarChart']")));	
		PRODUCTIVITY.click();
	}
	public void ExportRTA()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ExportRTA=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[1]")));	
		ExportRTA.click();
	}
	
	public void ExportUTILIZATION()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement UTILIZATION=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[2]")));	
		UTILIZATION.click();
	}
	
	public void ExportTaskOutput()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement TaskOutput=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[3]")));	
		TaskOutput.click();
	}
	
	public void ExportPRODUCTIVITY ()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement PRODUCTIVITY=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[4]")));	
		PRODUCTIVITY.click();
	}
	
	public void ExportTASK_OUTSTANDING ()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement TASK_OUTSTANDING =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[5]")));	
		TASK_OUTSTANDING.click();
	}
	
	public void ExportCASE_TOUCH_POINTS ()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement CASE_TOUCH_POINTS=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[6]")));	
		CASE_TOUCH_POINTS.click();
	}
	
	public void ExportHOURLY_COMPLETE_VS_PEND ()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement HOURLY_COMPLETE_VS_PEND=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[4]")));	
		HOURLY_COMPLETE_VS_PEND.click();
	}
	
	public void ExportPLANNED_VS_ACTUAL_HOURS  ()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement PLANNED_VS_ACTUAL_HOURS=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[5]")));	
		PLANNED_VS_ACTUAL_HOURS.click();
	}
	
	public void ExportPRODUCTIVE_VS_SHRINKAGE_VS_BREAK_HOURS()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement PRODUCTIVE_VS_SHRINKAGE_VS_BREAK_HOURS=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[6]")));	
		PRODUCTIVE_VS_SHRINKAGE_VS_BREAK_HOURS.click();
	}
	public void SelectAllemployeeRTA()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement ALLemployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlQAssignee']")));
		Select ALL=new Select(ALLemployee);
		ALL.selectByVisibleText("ALL");
	}
	public void SelectdebashreeemployeeDebashree()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement employee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlQAssignee']")));
		Select Debashree=new Select(employee);
		Debashree.selectByVisibleText("Debashree Panigrahi");
	}
	public void SelectKiranemployeeDebashree()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement employee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlQAssignee']")));
		Select Kiran=new Select(employee);
		Kiran.selectByVisibleText("Kirankumar Jayakumar");
	}
	//public void ExportRealTimeView()
	public void ExportRealTimeWorkloadAging  ()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement RealTimeWorkloadAging=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[7]")));	
		RealTimeWorkloadAging.click();
	}
	public void RealTimeWorktype  ()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ExportRealTimeWorktype=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='clsDemandvsSupplyWT']")));	
		ExportRealTimeWorktype.click();
	}
	public void ExportRealTimeWorkTypeAging  ()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement RealTimeWorkTypeAging=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[8]")));	
		RealTimeWorkTypeAging.click();
	}
	public void ExportRealTimeAHT()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement RealTimeAHT=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='exceprept fa fa-file-image-o pngiconadj']")));	
		RealTimeAHT.click();
	}
	public void ClickExpand()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ClickExpand=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-plus'])[1]")));	
		ClickExpand.click();
	}
	
	public void SelectWorktypeAinSLADashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='select2-search__field']")));
		Worktype.sendKeys("Worktype A");
	}
	public void ClickgoSLADashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ClickgoSLADashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnFilterSLADashboard']")));	
		ClickgoSLADashboard.click();
	}
	public void ClickgoSLAAchieved()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ClickgoSLAAchieved=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success waves-effect waves-light m-l-101 btn-md padding-top-bottom-3px'])[3]")));	
		ClickgoSLAAchieved.click();
	}
	public void SLAMetRatio()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement SLAMetRatio=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o slapngimg'])[1]")));	
		SLAMetRatio.click();
	}
	public void STT_VS_ATT()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement STT_VS_ATT=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[1]")));	
		STT_VS_ATT.click();
	}
	public void AHTtrendingDateWise()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement AHTtrendingDateWise=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[4]")));	
		AHTtrendingDateWise.click();
	}
	public void AHTtrendingUserWise()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement AHTtrendingUserWise=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='clsLoadMyTaskuserwise']")));	
		AHTtrendingUserWise.click();
	}
	public void AHTtrendingUserWiseexport()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement AHTtrendingUserWiseexport=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[5]")));	
		AHTtrendingUserWiseexport.click();
	}
	public void ExpandinSLAdashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ExpandinSLAdashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa cSLAcollapse fa-plus'])[1]")));	
		ExpandinSLAdashboard.click();
	}
	public void OutstandingStatus()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement OutstandingStatus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[2]")));	
		OutstandingStatus.click();
	}
	public void ToptenOldCases()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ToptenOldCases=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[3]")));	
		ToptenOldCases.click();
	}
	public void inventoryStatus()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement inventoryStatus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[4]")));	
		inventoryStatus.click();
	}
	public void SelectWorktypeAinWorkflowDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='form-control frm-h']")));
		Select SelectWorktypeAinWorkflowDashboard=new Select(Worktype);
		SelectWorktypeAinWorkflowDashboard.selectByVisibleText("Worktype A");
	}
	public void SelectWorktypeBinWorkflowDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='form-control frm-h']")));
		Select SelectWorktypeBinWorkflowDashboard=new Select(Worktype);
		SelectWorktypeBinWorkflowDashboard.selectByVisibleText("Worktype B");
	}
	public void clickGOinWorkflowDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement clickGOinWorkflowDashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnDump']")));	
		clickGOinWorkflowDashboard.click();
	}
	public void SelectWorktypeAinQualityDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[7]")));
		Select SelectWorktypeAinQualityDashboard=new Select(Worktype);
		SelectWorktypeAinQualityDashboard.selectByVisibleText("Worktype A");
	}
	public void SelectWorktypeBinQualityDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[7]")));
		Select SelectWorktypeBinQualityDashboard=new Select(Worktype);
		SelectWorktypeBinQualityDashboard.selectByVisibleText("Worktype B");
	}
	public void SelectemployeeYash()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement ALLemployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[5]")));
		Select Yash=new Select(ALLemployee);
		Yash.selectByVisibleText("Yash Lokhande");
	}
	public void SelectemployeeDebashree()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement ALLemployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[5]")));
		Select Debashree=new Select(ALLemployee);
		Debashree.selectByVisibleText("Debashree Panigrahi");
	}
	public void ClickgoQualityDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ClickgoQualityDashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success waves-effect waves-light m-l-101 btn-md padding-top-bottom-3px'])[2]")));	
		ClickgoQualityDashboard.click();
	}
	public void Quality_Report()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Quality_Report=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[1]")));	
		Quality_Report.click();
	}
	public void Quality_Score()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Quality_Score=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[2]")));	
		Quality_Score.click();
	}
	public void expandinQualityDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement expandinQualityDashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-plus'])[1]")));	
		expandinQualityDashboard.click();
	}
	public void QualityDashboardTeamwise()
	{
		ldriver.findElement(By.xpath("//*[@id='rbTeamwiseQuality']")).click();
	}
	public void SelectWorktypeAinTeamWiseQualityDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[7]")));
		Select SelectWorktypeAinQualityDashboard=new Select(Worktype);
		SelectWorktypeAinQualityDashboard.selectByVisibleText("Worktype A");
	}
	public void SelectWorktypeBinTeamWiseQualityDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[7]")));
		Select SelectWorktypeBinTeamWiseQualityDashboard=new Select(Worktype);
		SelectWorktypeBinTeamWiseQualityDashboard.selectByVisibleText("Worktype B");
	}
	public void SelectTeamAinTeamWiseQualityDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Team= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[6]")));
		Select SelectTeamAinTeamWiseQualityDashboard=new Select(Team);
		SelectTeamAinTeamWiseQualityDashboard.selectByVisibleText("Team A");
	}
	public void goinTeamWiseQualityDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement goinTeamWiseQualityDashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success waves-effect waves-light m-l-101 btn-md padding-top-bottom-3px'])[2]")));	
		goinTeamWiseQualityDashboard.click();
	}
}
