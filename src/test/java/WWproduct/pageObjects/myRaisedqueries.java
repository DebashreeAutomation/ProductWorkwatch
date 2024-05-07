package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myRaisedqueries {
	WebDriver ldriver;
	public myRaisedqueries(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	public void query_management()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement query_Management=wait.until(ExpectedConditions.elementToBeClickable(By.id("sideLnk90")));	
		query_Management.click();
	}
	public void MyRaisedQueries()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement myRaisedQueries=wait.until(ExpectedConditions.elementToBeClickable(By.id("sideLnk98")));	
		myRaisedQueries.click();
	}
	
	
	public void clickonqueryid()
	{
		WebDriverWait wait=new WebDriverWait(ldriver,Duration.ofSeconds(1030));
		
		WebElement Clickonqueryid=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div/div/div[2]/div/div[3]/div[2]/table/tbody/tr[1]/td[2]/a")));	
		Clickonqueryid.click();
	}
	
	
	public void clickcut()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement clickCut=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnClosePopupView2\"]")));	
		clickCut.click();
	}
	
	
	public void exporttoexcel()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement ExportToexcel=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblQueryDetails_wrapper\"]/div[1]/a/span/i")));	
		ExportToexcel.click();
	}
	
}
