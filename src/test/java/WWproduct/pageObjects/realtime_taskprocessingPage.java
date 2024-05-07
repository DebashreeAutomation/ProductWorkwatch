package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class realtime_taskprocessingPage {

	WebDriver ldriver;
	public realtime_taskprocessingPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	public void RealTimeData()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement RealTimeData=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/ul/li[2]/a/span")));	
		RealTimeData.click();
	}
	
	public void PLANNED_VS_ACTUAL_HOURS()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement PLANNED_VS_ACTUAL_HOURS=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id=\"collapseOne\"]/div/div[1]/div/i)[1]")));	
		PLANNED_VS_ACTUAL_HOURS.click();
	}
	public void PRODUCTIVE_VS_SHRINKAGE_VS_BREAK_HOURS()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement PRODUCTIVE_VS_SHRINKAGE_VS_BREAK_HOURS=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id=\"collapseOne\"]/div/div[1]/div/i)[2]")));	
		PRODUCTIVE_VS_SHRINKAGE_VS_BREAK_HOURS.click();
	}
	public void RealtimeView()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement RealtimeView=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/div[2]/a/span/i")));	
		RealtimeView.click();
	}

}
