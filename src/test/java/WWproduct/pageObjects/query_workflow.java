package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class query_workflow {
	WebDriver driver;
	public query_workflow(WebDriver driver)
	{
		this.driver=driver;
}
	public void querymanagement()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement query_Management=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sideLnk90\"]")));	
		query_Management.click();
	}
	public void Task_processing()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement taskProcessing=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sideLnk1\"]")));	
		taskProcessing.click();
	}
	public void click_startquery()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement startquery=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@id=\"tblMyQueries\"]//tbody//tr[1]//td[1]//i")));	
		startquery.click();
	}
	public void enterpendqueryResponse()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement pendqueryResponse=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));	
		pendqueryResponse.sendKeys("The query is put in pend state");
	}
	public void SetqueryActionPend()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement QueryActionpend= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQueryAction\"]")));
		Select queryactionPend=new Select(QueryActionpend);
		queryactionPend.selectByVisibleText("Pend");
	}
	public void click_submit()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement submit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"addresponse\"]/div[2]/div/div/div/div[5]/div/div[2]/input")));	
		submit.click();
	}
	public void click_Queryjourney()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement Queryjourney=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvQR\"]/div/div[2]/div/div[1]/ul/li[2]/a/span")));	
		Queryjourney.click();
	}
	public void click_AddresponseTask()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement AddresponseTask=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvQR\"]/div/div[2]/div/div[1]/ul/li[1]/a/span")));	
		AddresponseTask.click();
	}
	public void SetqueryActionClose()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement QueryActionclose= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQueryAction\"]")));
		Select queryactionClose=new Select(QueryActionclose);
		queryactionClose.selectByVisibleText("Close");
	}
	public void SetqueryActionComplete()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement QueryActioncomplete= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQueryAction\"]")));
		Select queryactionComplete=new Select(QueryActioncomplete);
		queryactionComplete.selectByVisibleText("Complete");
	}
	public void checkforwardANDassigneeCheckbox()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement forwardANDassignee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div[1]/div/input")));
		forwardANDassignee.click();
	}
	public void click_confirmok()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement confirmok=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/div/input")));	
		confirmok.click();
	}
	public void SetqueryActionforward()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement QueryActionclose= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQueryAction\"]")));
		Select queryactionClose=new Select(QueryActionclose);
		queryactionClose.selectByVisibleText("Forward");
	}
	public void SetqueryExternalQuery()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement QueryActionExternalQuery= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQueryAction\"]")));
		Select queryactionExternalQuery=new Select(QueryActionExternalQuery);
		queryactionExternalQuery.selectByVisibleText("External Query");
	}
	public void SetqueryReject()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement QueryActionReject= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQueryAction\"]")));
		Select queryactionReject=new Select(QueryActionReject);
		queryactionReject.selectByVisibleText("Reject");
	}
	public void SetAssigneeTeamForquery()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement AssigneeTeamForquery= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQActionTeam\"]")));
		Select TeamForquery=new Select(AssigneeTeamForquery);
		TeamForquery.selectByVisibleText("Team A");
	}
	public void SettestuserAssigneeForquery()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement AssigneeForquery= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQAssg\"]")));
		Select firstassignee=new Select(AssigneeForquery);
		firstassignee.selectByVisibleText("TEST USER");
	}
	public void SettejasLocalAssigneeForquery()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement AssigneeForquery= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQAssg\"]")));
		Select secondassignee=new Select(AssigneeForquery);
		secondassignee.selectByVisibleText("Tejas Local");
	}
	public void SetDebashreeAssigneeForquery()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement AssigneeForquery= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQAssg\"]")));
		Select secondassignee=new Select(AssigneeForquery);
		secondassignee.selectByVisibleText("Debashree Panigrahi");
	}
	public void enterCompletequeryResponse()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement completequeryresponse=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));	
		completequeryresponse.sendKeys("The query is completed and sent to another team");
	}
	public void enterforwardqueryResponse()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement forwardqueryResponse=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));	
		forwardqueryResponse.sendKeys("The query is forwarded to another user for more clarification");
	}
	public void enterexternalqueryResponse()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement externalqueryResponse=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));	
		externalqueryResponse.sendKeys("The query is sent to external user for better response");
	}
	public void enterexternalmailid()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement Enterexternalmailid=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"addresponse\"]/div[2]/div/div/div/div[2]/div[2]/div/div/div/input")));	
		Enterexternalmailid.sendKeys("CIAS.INT@capita.co.uk");
	}
	public void enterrejectqueryResponse()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement rejectqueryResponse=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));	
		rejectqueryResponse.sendKeys("The query is rejected because of insufficient data provided");
	}
	public void enterclosequeryResponse()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement closequeryResponse=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));	
		closequeryResponse.sendKeys("The query is closed.query testing com[pleted");
	}
	public void QueryJourney()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement queryJourney=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sideLnk109\"]")));	
		queryJourney.click();
	}
	public void clicksearchinCJ()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement clicksearchinQueryid=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnCJFilter\"]")));	
		clicksearchinQueryid.click();
	}
	public void clickqueryid()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement clickqueryid=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div[2]/div/div[4]/div[2]/table/tbody/tr/td[2]/a")));	
		clickqueryid.click();
	}
	public void downloadqueryjourneyDetails()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement queryjourneyDetails=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div[3]/div/div[2]/a/span/i")));	
		queryjourneyDetails.click();
	}
	public void outlooksearchiconclick()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
		WebElement Outlooksearchiconclick=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div[1]/div/div[3]/div/input")));	
		Outlooksearchiconclick.click();
	}
	public void wwdevclick()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement wwdevclick=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='XG5Jd TszOG'])[4]")));	
		wwdevclick.click();
	}
	public void threedotclick()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
		WebElement threedotclick=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/div/div[4]/div[2]/button/span/i")));	
		threedotclick.click();
	}
	public void replyallclick()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5000));
		WebElement Replyallclick=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div[3]/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div[2]/div/div/div[3]/div/div/button/span/i/span/i")));	
		Replyallclick.click();
	}
	public void mailbodytext()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(500));
		WebElement entermailbodytext=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contentDiv_0']/div")));	
		entermailbodytext.sendKeys("External query has been replied.");
	}
	
	public void sendbtnclick()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(500));
		WebElement sendbtnclick= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='docking_InitVisiblePart_0']/div/div[2]/div[1]/div/span/button[1]")));
		sendbtnclick.click();
	}
	public void ReopeningQuery()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(500));
		WebElement ReopeningQuery= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sideLnk103\"]")));
		ReopeningQuery.click();
	}
	public void ClickOkforReopeningQuery()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(500));
		WebElement ClickOkforReopeningQuery= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='input-group-addon']")));
		ClickOkforReopeningQuery.click();
	}
	public void ClickonQueryonReopeningPage()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(500));
		WebElement ClickReopen= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div[2]/div/div[4]/div[2]/table/tbody/tr/td[2]/a")));
		ClickReopen.click();
	}
	public void ClickReopen()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(500));
		WebElement ClickReopen= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success waves-effect waves-light m-l-10 btn-md']")));
		ClickReopen.click();
	}
	public void exportclosedQueryDetails()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(500));
		WebElement exportclosedQueryDetails= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='fa fa-file-excel-o'])[1]")));
		exportclosedQueryDetails.click();
	}
	public void exportclosedQueryjourney()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(500));
		WebElement exportclosedQueryjourney= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='fa fa-file-excel-o'])[2]")));
		exportclosedQueryjourney.click();
	}
}
