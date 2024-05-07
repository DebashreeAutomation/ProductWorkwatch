package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportsPage {
	WebDriver ldriver;
	public ReportsPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	public void Reports()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Reports=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sideLnk94']")));	
		Reports.click();
	}
	public void UtilizationReports()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement UtilizationReports=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='clsReportsDump'])[1]")));	
		UtilizationReports.click();
	}
	public void LoggedhoursReports()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement LoggedhoursReports=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='clsReportsDump'])[2]")));	
		LoggedhoursReports.click();
	}
	public void Reportdump()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Reportdump=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='clsReportsDump'])[3]")));	
		Reportdump.click();
	}
	public void ReportedByUser()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[5]")));
		Select ReportedByUser=new Select(User);
		ReportedByUser.selectByVisibleText("User");
	}
	public void Userdebashree()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[6]")));
		Select Userdebashree=new Select(User);
		Userdebashree.selectByVisibleText("Debashree Panigrahi");
	}
	public void ReportedByWorktype()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[5]")));
		Select ReportedByWorktype=new Select(Worktype);
		ReportedByWorktype.selectByVisibleText("Worktype");
	}
	public void ReportedByManager()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Manager= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[5]")));
		Select ReportedByManager=new Select(Manager);
		ReportedByManager.selectByVisibleText("Manager");
	}
	public void ManagerAsmita()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Manager= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[8]")));
		Select Asmita=new Select(Manager);
		Asmita.selectByVisibleText("Asmita Katare");
	}
	public void ManagerDebashree()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Manager= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[8]")));
		Select Debashree=new Select(Manager);
		Debashree.selectByVisibleText("Debashree Panigrahi");
	}
	public void WorktypeA()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[7]")));
		Select WorktypeA=new Select(Worktype);
		WorktypeA.selectByVisibleText("Worktype A");
	}
	public void WorktypeB()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[7]")));
		Select WorktypeB=new Select(Worktype);
		WorktypeB.selectByVisibleText("Worktype B");
	}
	
   public void clickgoinPR()
   {
	   WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement go=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success waves-effect waves-light m-l-101 btn-md padding-top-bottom-3px'])[2]")));	
		go.click();
   }
   public void exportProductivityReport()
   {
	   WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement exportProductivityReport=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-file-excel-o']")));	
		exportProductivityReport.click();
   }
   public void ReportedByUserinUtilizationReport()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[9]")));
		Select ReportedByUser=new Select(User);
		ReportedByUser.selectByVisibleText("User");
	}
   public void ReportedByManagerinUtilizationReport()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Manager= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[9]")));
		Select ReportedByManagerinUtilizationReport=new Select(Manager);
		ReportedByManagerinUtilizationReport.selectByVisibleText("Manager");
	}
	public void ReportedByUserDebashreeinUtilizationReport()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[10]")));
		Select Userdebashree=new Select(User);
		Userdebashree.selectByVisibleText("Debashree Panigrahi");
	}
	public void ReportedByUserTejasinUtilizationReport()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[10]")));
		Select ReportedByUserTejasinUtilizationReport=new Select(User);
		ReportedByUserTejasinUtilizationReport.selectByVisibleText("Tejas Shah");
	}
	public void ReportedByUserALLinUtilizationReport()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[10]")));
		Select ReportedByUserALLinUtilizationReport=new Select(User);
		ReportedByUserALLinUtilizationReport.selectByVisibleText("ALL");
	}
	public void ReportedByManagerDebashreeinUtilizationReport()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[11]")));
		Select ReportedByManagerDebashreeinUtilizationReport=new Select(User);
		ReportedByManagerDebashreeinUtilizationReport.selectByVisibleText("Debashree Panigrahi");
	}
	public void ReportedByManagerAmit()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[11]")));
		Select ReportedByManagerDebashreeinUtilizationReport=new Select(User);
		ReportedByManagerDebashreeinUtilizationReport.selectByVisibleText("Amit Verma");
	}
	public void ReportedByManagerALL()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Manager= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[11]")));
		Select ReportedByManagerALL=new Select(Manager);
		ReportedByManagerALL.selectByVisibleText("ALL");
	}
	public void clickgoinUR()
	   {
		   WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
			WebElement clickgoinUR=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success waves-effect waves-light m-l-101 btn-md padding-top-bottom-3px'])[3]")));	
			clickgoinUR.click();
	   }
	public void ReportedByUserinLoggedHoursReport()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[9]")));
		Select ReportedByUserinLoggedHoursReport=new Select(User);
		ReportedByUserinLoggedHoursReport.selectByVisibleText("User");
	}
   public void ReportedByManagerinLoggedHoursReport()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Manager= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[9]")));
		Select ReportedByManagerinLoggedHoursReport=new Select(Manager);
		ReportedByManagerinLoggedHoursReport.selectByVisibleText("Manager");
	}
	public void ReportedByUserDebashreeinLoggedHoursReport()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[10]")));
		Select ReportedByUserDebashreeinLoggedHoursReport=new Select(User);
		ReportedByUserDebashreeinLoggedHoursReport.selectByVisibleText("Debashree Panigrahi");
	}
	public void ReportedByUserTejasinLoggedHoursReport()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[10]")));
		Select ReportedByUserTejasinLoggedHoursReport=new Select(User);
		ReportedByUserTejasinLoggedHoursReport.selectByVisibleText("Tejas Shah");
	}
	public void ReportedByUserALLinLoggedHoursReport()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[10]")));
		Select ReportedByUserALLinLoggedHoursReport=new Select(User);
		ReportedByUserALLinLoggedHoursReport.selectByVisibleText("ALL");
	}
	public void ReportedByManagerDebashreeinLoggedHoursReport()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[11]")));
		Select ReportedByManagerDebashreeinLoggedHoursReport=new Select(User);
		ReportedByManagerDebashreeinLoggedHoursReport.selectByVisibleText("Debashree Panigrahi");
	}
	public void ReportedByManagerAmitiLR()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement User= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[11]")));
		Select ReportedByManagerAmitiLR=new Select(User);
		ReportedByManagerAmitiLR.selectByVisibleText("Amit Verma");
	}
	public void ReportedByManagerALLLR()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Manager= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[11]")));
		Select ReportedByManagerALLLR=new Select(Manager);
		ReportedByManagerALLLR.selectByVisibleText("ALL");
	}
	public void clickgoinULoggedHoursReport()
	   {
		   WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
			WebElement clickgoinULoggedHoursReport=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success waves-effect waves-light m-l-101 btn-md padding-top-bottom-3px'])[3]")));	
			clickgoinULoggedHoursReport.click();
	   }
	public void ExportHoursReport()
	   {
		   WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
			WebElement ExportHoursReport=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-file-excel-o']")));	
			ExportHoursReport.click();
	   }
	
	//////////
	public void clickgoinReportDUMP()
	   {
		   WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
			WebElement clickgoinReportDUMP=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success waves-effect waves-light m-l-101 btn-md padding-top-bottom-3px'])[1]")));	
			clickgoinReportDUMP.click();
	   }
	
	public void ReportTypeCASE_DUMPSinRD()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Reporttype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[1]")));
		Select ReportTypeinRD=new Select(Reporttype);
		ReportTypeinRD.selectByVisibleText("Case Dumps");
	}
	public void ReportTypeCASE_DUMPSTypeINprogress()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Reporttype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[3]")));
		Select ReportTypeintype=new Select(Reporttype);
		ReportTypeintype.selectByVisibleText("In Progress");
	}
	public void ReportTypeCASE_DUMPSTypeClosed()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Reporttype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[3]")));
		Select ReportTypeCASE_DUMPSTypeClosed=new Select(Reporttype);
		ReportTypeCASE_DUMPSTypeClosed.selectByVisibleText("Closed");
	}
	public void ReportTypeCASE_DUMPSTypeDeleted()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Reporttype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[3]")));
		Select ReportTypeCASE_DUMPSTypeDeleted=new Select(Reporttype);
		ReportTypeCASE_DUMPSTypeDeleted.selectByVisibleText("Deleted");
	}
	public void Stage_caseDumps()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Stage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='StageId']")));
		Select Stage_caseDumps=new Select(Stage);
		Stage_caseDumps.selectByVisibleText("Processing");
	}
	public void Source_caseDumps()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Source= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Source']")));
		Source.sendKeys("System");
	}
	public void AssignedTo_caseDumps()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement AssignedTo_caseDumps= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='select2-search__field'])[2]")));
		AssignedTo_caseDumps.sendKeys("Tejas Local");
	}
	
	public void ReportTypeAgent_ActivityReportinRD()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Reporttype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[1]")));
		Select Agent_ActivityReport=new Select(Reporttype);
		Agent_ActivityReport.selectByVisibleText("Agent Activity Report");
	}
	public void ReportTypeAgent_ActivityReportforTESTUSER()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Reporttype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[4]")));
		Select ReportTypeAgent_ActivityReportforTESTUSER=new Select(Reporttype);
		ReportTypeAgent_ActivityReportforTESTUSER.selectByVisibleText("TEST USER");
	}
	public void ReportTypeAgent_ActivityReportforALL()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Reporttype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[4]")));
		Select ReportTypeAgent_ActivityReportforALL=new Select(Reporttype);
		ReportTypeAgent_ActivityReportforALL.selectByVisibleText("ALL");
	}
	public void ReportTypeNonCore_ActivityReportinRD()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Reporttype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[1]")));
		Select NonCore_ActivityReport=new Select(Reporttype);
		NonCore_ActivityReport.selectByVisibleText("Non Core Activity Report");
	}
	public void ReportTypeCore_ActivityReportinRD()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Reporttype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[1]")));
		Select Core_ActivityReport=new Select(Reporttype);
		Core_ActivityReport.selectByVisibleText("Core Activity Report");
	}
	public void ReportTypeloginlogoutReportinRD()
	{

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Reporttype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control frm-h'])[1]")));
		Select ReportTypeloginlogoutReportinRD=new Select(Reporttype);
		ReportTypeloginlogoutReportinRD.selectByVisibleText("Login Logout Report");
	}
}
