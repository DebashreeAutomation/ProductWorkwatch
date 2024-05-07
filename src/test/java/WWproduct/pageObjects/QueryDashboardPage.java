package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QueryDashboardPage {
	WebDriver driver;
	public QueryDashboardPage(WebDriver driver)
	{
		this.driver=driver;
}
	public void queryDashboard()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement queryDashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sideLnk117']")));	
		queryDashboard.click();
	}
	public void SelectTESTUSER()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement Testuseremployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[2]")));
		Select SelectTESTUSER=new Select(Testuseremployee);
		SelectTESTUSER.selectByVisibleText("TEST USER");
	}
	public void SelectTejasLocal()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement Testuseremployee= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[2]")));
		Select SelectTejasLocal=new Select(Testuseremployee);
		SelectTejasLocal.selectByVisibleText("Tejas Local");
	}
	public void clickgoQueryDashboard()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement go=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn btn-success waves-effect waves-light m-l-101 btn-md padding-top-bottom-3px']")));	
		go.click();
	}
	public void expandQueryOutstanding()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement expandQueryOutstanding=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div[1]/div/a[2]/i")));	
		expandQueryOutstanding.click();
	}
	public void expandQueryReport()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement QueryReport=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[3]/div/div/div/div/div[1]/div/div[1]/div/a[2]/i")));	
		QueryReport.click();
	}
	public void exportQueryOutput()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement exportQueryOutput=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[1]")));	
		exportQueryOutput.click();
	}
	public void exportQueryOutstanding()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement exportQueryOutstanding=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[2]")));	
		exportQueryOutstanding.click();
	}
	public void exportQueryReport()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement exportQueryReport=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-file-excel-o'])[3]")));	
		exportQueryReport.click();
	}
	public void SelectTeamA()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement Team= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[3]")));
		Select SelectTeamA=new Select(Team);
		SelectTeamA.selectByVisibleText("Team A");
	}
	public void SelectTeamB()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement Team= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[3]")));
		Select SelectTeamA=new Select(Team);
		SelectTeamA.selectByVisibleText("Team B");
	}
	public void QueryDashboardTeamwise()
	{
		driver.findElement(By.xpath("//*[@id='rbTeamwise']")).click();
	}
	public void QueryTrend()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement QueryTrend=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/ul/li[2]/a/span")));	
		QueryTrend.click();
	}
	public void DownloadQueryVolumepng()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement DownloadQueryVolumepng=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='exceprept']")));	
		DownloadQueryVolumepng.click();
	}

}
