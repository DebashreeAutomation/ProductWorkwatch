package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlanningDashboardPage {
	WebDriver ldriver;
	public PlanningDashboardPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	public void PlanningDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement PlanningDashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sideLnk111']")));	
		PlanningDashboard.click();
	}
	public void CaseVolumeTrending()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement CaseVolumeTrending=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[1]")));	
		CaseVolumeTrending.click();
	}
	public void RESOURCE_PLANNING()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement RESOURCE_PLANNING=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[2]")));	
		RESOURCE_PLANNING.click();
	}
	public void expandinPlanningDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement expandinPlanningDashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='fa fa-plus'])[1]")));	
		expandinPlanningDashboard.click();
	}
	public void Associate_View()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Associate_View=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[3]")));	
		Associate_View.click();
	}
	public void WORKTYPE_WISE_CASE_COUNT_AND_HOURS()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement WORKTYPE_WISE_CASE_COUNT_AND_HOURS=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[4]")));	
		WORKTYPE_WISE_CASE_COUNT_AND_HOURS.click();
	}
	public void Demand_Vs_supply()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Demand_Vs_supply=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[7]")));	
		Demand_Vs_supply.click();
	}
	public void Worktype_WiseDemandVSSupply()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Worktype_WiseDemandVSSupply=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='clsDemandvsSupplyWT']")));	
		Worktype_WiseDemandVSSupply.click();
	}
	public void Worktype_WiseDemandVSSupplyExport()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement Worktype_WiseDemandVSSupplyExport=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exceprept fa fa-file-image-o'])[8]")));	
		Worktype_WiseDemandVSSupplyExport.click();
	}
	public void ClickgoinPlanningDashboard()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement ClickgoinPlanningDashboard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnFilter']")));	
		ClickgoinPlanningDashboard.click();
	}

}
