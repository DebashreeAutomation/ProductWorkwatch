package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myReports_TaskprocessingPage {
	WebDriver ldriver;
	public myReports_TaskprocessingPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	public void Reports()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Reports=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/ul/li[4]/a/span")));	
		Reports.click();
	}
	public void selectReportTypeProcessed()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement processed= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='form-control frm-h']")));
		Select Processed=new Select(processed);
		Processed.selectByVisibleText("Processed");
	}
	public void selectReportTypeRejected()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement rejected= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='form-control frm-h']")));
		Select Rejected=new Select(rejected);
		Rejected.selectByVisibleText("Rejected");
	}
	public void clickGo()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(2000));
		WebElement go=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnMyReports']")));	
		go.click();
	}
	public void MyreportsExportToExcel()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement MyreportsExportToExcel=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[4]/div/div[2]/div/div/div/div[2]/div/div/div[2]/a/span/i")));	
		MyreportsExportToExcel.click();
	}
}
