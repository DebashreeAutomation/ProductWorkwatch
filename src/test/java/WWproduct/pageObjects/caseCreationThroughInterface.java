package WWproduct.pageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class caseCreationThroughInterface {
	WebDriver ldriver;
	public caseCreationThroughInterface(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	
	
	public void Case_Creation()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Casecreation=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sideLnk69']")));	
		Casecreation.click();
	}
	public void Reopening()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Reopening=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sideLnk72']")));	
		Reopening.click();
	}
	public void ReopeningIconClick()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ReopeningIconClick=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-play-circle-o viewicon float-right padding-right-5px']")));	
		ReopeningIconClick.click();
	}
	public void ClickSearchIconOnReopening()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ClickSearchIconOnReopening=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-search']")));	
		ClickSearchIconOnReopening.click();
	}
	public void Case_Creation_byInterface()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement Creation_byInterface=wait.until(ExpectedConditions.elementToBeClickable(By.id("sideLnk72")));	
		Creation_byInterface.click();
	}
	public void setWorkType()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(3000));
		WebElement worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectWorkType']")));
		Select WT=new Select(worktype);
		WT.selectByVisibleText("Worktype A");
	}
	public void EnterCasecount()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement casecount= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='txtCaseCount']")));
		casecount.sendKeys("1");
	}
	public void SetUrgency()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectUrgency']")));
		Select URGENCY=new Select(urgency);
		URGENCY.selectByVisibleText("High");
	}
	public void SetAssignedTo()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement AssignedTo= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectAssignedTo']")));
		Select assigned_to=new Select(AssignedTo);
		assigned_to.selectByVisibleText("Debashree Panigrahi");
	}
	
	public void SetreceivedDate()
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
		Date today = Calendar.getInstance().getTime();
		String date = dateFormat.format(today);
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement receivedDate= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='dtRecievedDate']")));
		receivedDate.click();
		WebElement dateWidget = ldriver.findElement(By.className("datetimepicker-days"));  
	     List<WebElement> columns=dateWidget.findElements(By.tagName("div"));  

	     //comparing the text of cell with today's date and clicking it.
	     for (WebElement cell : columns)
	     {
	        if (cell.getText().equals("day active"))
	        {
	           cell.click();
	           break;
	        }
	     } 
		
	}
	
	public void ClickSubmit() {
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(500));
		WebElement clicksubmitbtn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnAddCase']")));
		clicksubmitbtn.click();
	}
	

}
