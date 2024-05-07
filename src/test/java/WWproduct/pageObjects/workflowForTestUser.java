package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class workflowForTestUser {
	WebDriver driver;
	public workflowForTestUser(WebDriver driver)
	{
		this.driver=driver;
}
	public void Taskprocessing()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement ClickTP=wait.until(ExpectedConditions.elementToBeClickable(By.id("sideLnk1")));	
		ClickTP.click();
	}
	public void clickstarticon() throws InterruptedException
	{
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement starticon=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnCaseAction']")));
		starticon.click();
	}
	public void ClickStartAction() {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement startAction=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnFilter\"]")));
		startAction.click();
        
	}
    public void ClickCaseUpdate() {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement updatecase=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TabsActionHolder\"]/li[2]/a/span")));
		updatecase.click();
        
	}
   public void Clickupdate() {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement update=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnUpdateCase\"]")));
		update.click();
        
	}
   public void entercaseupdateText() {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement entertexttoupdateCase=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dvCaseTaggingPopup\"]/div[2]/div/input")));
		entertexttoupdateCase.sendKeys("Case is Updated for Testing purpose");
       
	}
   public void updateurgency() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement Urgencydropdown= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"UrgencyId\"]")));
		Select urgencyHigh=new Select(Urgencydropdown);
		urgencyHigh.selectByVisibleText("High");
	}
   public void ClickCasejorney() {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement Casejourney=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TabsActionHolder\"]/li[3]/a/span")));
		Casejourney.click();
      
	}
   public void ClickAction() {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement Action=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TabsActionHolder\"]/li[1]/a/span")));
		Action.click();
     
	}
	public void selectpend() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement actionType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlAction\"]")));
		Select actionTypepend=new Select(actionType);
		actionTypepend.selectByVisibleText("Pend");
	}
	public void selectActionReasn(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement actionreason= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlActionReason\"]")));
		Select actionRsn=new Select(actionreason);
		actionRsn.selectByVisibleText("Non Core activity");
		}
		
		
	
	public void entercommentsforcase() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement pendcomment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));
		pendcomment.sendKeys("putting the case into pending state as I have to do some non core activity");
		
		}
	
	public void selectQualityCompleted() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement actionType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlAction\"]")));
		Select qualityCompleted=new Select(actionType);
		qualityCompleted.selectByVisibleText("Completed");
	}
	public void QualityCompletedcommentsforcase() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement qualitycompletedcomment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));
		qualitycompletedcomment.sendKeys("Quality completed for the case.Hence the case is sent to authorization team");
		
		}
	public void AuthorizationselectCompleted() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement actionType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlAction\"]")));
		Select AuthorizationCompleted=new Select(actionType);
		AuthorizationCompleted.selectByVisibleText("Completed");
	}
	public void AuthorizationCompletedcommentsforcase() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement Authorizationcompletedcomment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));
		Authorizationcompletedcomment.sendKeys("Authorization completed for the case.Hence the case is completed.");
		
		}
	public void selectReject() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement actionType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlAction\"]")));
		Select actionTypereject=new Select(actionType);
		actionTypereject.selectByVisibleText("Reject");
	} 
	public void selectRework() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement actionType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlAction\"]")));
		Select actionTyperework=new Select(actionType);
		actionTyperework.selectByVisibleText("Rework");
	} 
	public void rejectcommentsforcase() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement Rejectcomment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));
		Rejectcomment.sendKeys("The case has some data missing ,Hence rejecting the case.Case is rejected for testing purpose.Please ignore.");
		
		}
	public void selectprocessed() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement actionType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlAction\"]")));
		Select actionTypeprocessed=new Select(actionType);
		actionTypeprocessed.selectByVisibleText("Processed");
	}
	public void Processedcommentsforcase() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement processedcomment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));
		processedcomment.sendKeys("The case is processed.hence it is sent for quality.The testing is in progress");
		
		}
	public void ClickSubmit() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement submit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnSubmit\"]")));
		submit.click();
		
		}
	
	public void Clickview_stsart(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement view_start=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnCaseAction\"]")));	
		view_start.click();
	}
	
	public void maincommentforqualitypend()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement MaincommentforpendingQuality=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainComment\"]")));	
		MaincommentforpendingQuality.sendKeys("The case has been put in pend state for the time being.Quality will be performed and actions will be taken soon on the case");
	}	
	public void bankdetailsNobtn(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement bankdetails=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[1]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/input")));	
		bankdetails.click();
	}
	public void accNumberbtn(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement supplierAccNum=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[1]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/input")));	
		supplierAccNum.click();
	}
	public void bankdetailscomment()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement BDComment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[1]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div/textarea")));	
		BDComment.sendKeys("Bank details are not showing correct record");
	}	
	public void accNumComment()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement accNumCommentInsert=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[1]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div[3]/div/textarea")));	
		accNumCommentInsert.sendKeys("Account numbaer of the supplier is missing");
	}	
	public void maincommentforqualityRework()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement MaincommentforreworkQuality=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainComment\"]")));	
		MaincommentforreworkQuality.sendKeys("As the data of the case is not correct, Rework is need for more clarification.Hence the case is not completed and is sent for rework");
	}
	public void CommentsforReworkinQualityteam()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement Commentsforrework=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commentInput1\"]")));	
		Commentsforrework.sendKeys("As the desired quality is not achieved for the case, the case is put on rework state.");
	}
	public void searchboxInTaskprocessingPage()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(530));
		WebElement searchboxInTaskprocessing=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainComment\"]")));	
		searchboxInTaskprocessing.sendKeys("As the desired quality is not achieved for the case, the case is put on rework state.");
	}
	
}
