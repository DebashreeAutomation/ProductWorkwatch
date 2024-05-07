package WWproduct.pageObjects;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wwWorkflow {
	WebDriver ldriver;
	public wwWorkflow(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	public void Taskprocessing()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement ClickTP=wait.until(ExpectedConditions.elementToBeClickable(By.id("sideLnk1")));	
		ClickTP.click();
	}
	public void clickstarticon() throws InterruptedException
	{
		
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement starticon=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnCaseAction']")));
		starticon.click();
	}
	public void ClickStartAction() {
		
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement startAction=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnFilter\"]")));
		startAction.click();
        
	}
    public void ClickCaseUpdate() {
		
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement updatecase=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TabsActionHolder\"]/li[2]/a/span")));
		updatecase.click();
        
	}
   public void Clickupdate() {
		
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement update=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnUpdateCase\"]")));
		update.click();
        
	}
   public void entercaseupdateText() {
		
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement entertexttoupdateCase=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvCaseTaggingPopup\"]/div[2]/div/input")));
		entertexttoupdateCase.sendKeys("Case is Updated for Testing purpose");
       
	}
   public void updateurgency() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Urgencydropdown= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"UrgencyId\"]")));
		Select urgencyHigh=new Select(Urgencydropdown);
		urgencyHigh.selectByVisibleText("High");
	}
   public void ClickCasejorney() {
		
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement Casejourney=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TabsActionHolder\"]/li[3]/a/span")));
		Casejourney.click();
      
	}
   public void ClickAction() {
		
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement Action=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TabsActionHolder\"]/li[1]/a/span")));
		Action.click();
     
	}
	public void selectpend() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement actionType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlAction\"]")));
		Select actionTypepend=new Select(actionType);
		actionTypepend.selectByVisibleText("Pend");
	}
	public void selectActionReasn(){
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement actionreason= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlActionReason\"]")));
		Select actionRsn=new Select(actionreason);
		actionRsn.selectByVisibleText("Non Core activity");
		}
		
		
	
	public void entercommentsforcase() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement pendcomment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));
		pendcomment.sendKeys("putting the case into pending state as I have to do some non core activity");
		
		}
	
	public void selectReject() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement actionType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlAction\"]")));
		Select actionTypereject=new Select(actionType);
		actionTypereject.selectByVisibleText("Reject");
	} 
	public void selectRework() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement actionType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlAction\"]")));
		Select actionTyperework=new Select(actionType);
		actionTyperework.selectByVisibleText("Rework");
	} 
	public void rejectcommentsforcase() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement Rejectcomment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));
		Rejectcomment.sendKeys("The case has some data missing ,Hence rejecting the case.Case is rejected for testing purpose.Please ignore.");
		
		}
	public void selectprocessed() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement actionType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlAction\"]")));
		Select actionTypeprocessed=new Select(actionType);
		actionTypeprocessed.selectByVisibleText("Processed");
	}
	public void Processedcommentsforcase() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement processedcomment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));
		processedcomment.sendKeys("The case is processed.hence it is sent for quality.The testing is in progress");
		
		}
	public void ClickSubmit() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement submit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnSubmit\"]")));
		submit.click();
		
		}
	
	public void Clickview_stsart(){
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement view_start=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnCaseAction\"]")));	
		view_start.click();
	}
	
	public void maincommentforqualitypend()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement MaincommentforpendingQuality=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainComment\"]")));	
		MaincommentforpendingQuality.sendKeys("The case has been put in pend state for the time being.Quality will be performed and actions will be taken soon on the case");
	}	
	public void bankdetailsNobtn(){
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement bankdetails=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rbOption2\"]")));	
		bankdetails.click();
	}
	public void accNumberbtn(){
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement supplierAccNum=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rbOption5\"]")));	
		supplierAccNum.click();
	}
	public void bankdetailscomment()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement BDComment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[1]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div/textarea")));	
		BDComment.sendKeys("Bank details are not showing correct record");
	}	
	public void accNumComment()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement accNumCommentInsert=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[1]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div[3]/div/textarea")));	
		accNumCommentInsert.sendKeys("Account numbaer of the supplier is missing");
	}	
	public void maincommentforqualityRework()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement MaincommentforreworkQuality=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainComment\"]")));	
		MaincommentforreworkQuality.sendKeys("As the data of the case is not correct, Rework is need for more clarification.Hence the case is not completed and is sent for rework");
	}
	public void CommentsforReworkinQualityteam()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement Commentsforrework=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainComment\"]")));	
		Commentsforrework.sendKeys("As the desired quality is not achieved for the case, the case is put on rework state.");
	}
	public void searchboxInTaskprocessingPage()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement searchboxInTaskprocessing=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainComment\"]")));	
		searchboxInTaskprocessing.sendKeys("As the desired quality is not achieved for the case, the case is put on rework state.");
	}
	public void selectexternalQuery() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement selectexternalQuery= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlAction\"]")));
		Select eq=new Select(selectexternalQuery);
		eq.selectByVisibleText("External Query");
	}
	public void entercommentsforexternalQuery() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement entercommentsforexternalQuery=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));
		entercommentsforexternalQuery.sendKeys("External query has been raised on the case.");
		
		}
	public void ExternalQueryTO() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement ExternalQueryTO=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='dvExternalQuery']/div/input")));
		ExternalQueryTO.sendKeys("CIAS.INT@capita.co.uk");
		
		}
	public void ConfirmOKforEQ() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement ConfirmOKforEQ=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-success btn-space k-button float-right'])[2]")));
		ConfirmOKforEQ.click();
		
		}
	public void ClickCUT() {

		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement ClickCUT=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='hideCloseIcon a-button-close a-declarative'])[4]")));
		ClickCUT.click();
		
		}
}



