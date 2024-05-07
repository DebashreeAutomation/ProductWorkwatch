package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard_TaskprocessingPage {
	WebDriver ldriver;
	public Dashboard_TaskprocessingPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	public void Dashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Dashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/ul/li[3]/a/span")));	
		Dashboard.click();
	}
	public void PRODUCTIVE_NONPRODUCTIVE_TIME()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement PRODUCTIVE_NONPRODUCTIVE_TIME=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[3]/div/div/div[4]/div/div[1]/div[1]/div/div[2]/div/div[1]/div/i")));	
		PRODUCTIVE_NONPRODUCTIVE_TIME.click();
	}
	public void SELF_VS_TEAM_VS_TARGET()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement SELF_VS_TEAM_VS_TARGET=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[3]/div/div/div[4]/div/div[1]/div[2]/div/div[2]/div/div/div/span/i")));	
		SELF_VS_TEAM_VS_TARGET.click();
	}
	public void TIME_UTILIZATION()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement TIME_UTILIZATION=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[3]/div/div/div[4]/div/div[1]/div[3]/div/div[2]/div/div[1]/div/i")));	
		TIME_UTILIZATION.click();
	}
	public void Productivity()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Productivity=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[3]/div/div/div[4]/div/div[2]/div/div/div[2]/div/div[1]/div/i[1]")));	
		Productivity.click();
	}
	public void clickGo()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement go=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn btn-success waves-effect waves-light m-l-101 btn-md padding-top-bottom-3px']")));	
		go.click();
	}


}
