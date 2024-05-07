package WWproduct.pageObjects;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Raise_New_query {
	WebDriver ldriver;
	public Raise_New_query(WebDriver rdriver)
	{
		this.ldriver=rdriver;
}
	public void query_management()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement query_Management=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sideLnk90\"]")));	
		query_Management.click();
	}
	public void NewQuery()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		WebElement newquery=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sideLnk96\"]")));	
		newquery.click();
	}
	public void SetAssigneeTeam()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement AssigneeTeam= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlRaisedQueryTeam\"]")));
		Select team=new Select(AssigneeTeam);
		team.selectByVisibleText("Team A");
	}
	public void Setworktype()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement worktype= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlWTforQuery\"]")));
		Select Worktype=new Select(worktype);
		Worktype.selectByVisibleText("Worktype A");
	}
	public void Enterquerysubject()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement subject= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"txtSubject\"]")));
		subject.sendKeys("Raising internal query for Worktype A in team A");
	}
	public void Enterquerysummary()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement summary= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"txtSummary\"]")));
		summary.sendKeys("User is not able to take action on case.Time is not getting captured properly for the Case.Please answer the query ASAP");
	}
	public void SetLocation()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Location= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlLocation\"]")));
		Select location=new Select(Location);
		location.selectByVisibleText("Vikhroli");
	}
	public void Setimpact()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Impact= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlImpact\"]")));
		Select impact=new Select(Impact);
		impact.selectByVisibleText("1-Extensive");
	}
	public void SetUrgency()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Urgency= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlUrgency\"]")));
		Select urgency=new Select(Urgency);
		urgency.selectByVisibleText("Critical");
	}
	public void SetQuerysource()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(300));
		WebElement Querysource= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ddlQuerySrc\"]")));
		Select querySource=new Select(Querysource);
		querySource.selectByVisibleText("Web");
	}
	public void ClickAdd()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(500));
		WebElement Add=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/section/div[16]/div/div[2]/div[3]/input[2]")));	
		Add.click();
	}

}
