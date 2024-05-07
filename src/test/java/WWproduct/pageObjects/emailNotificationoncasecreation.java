package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class emailNotificationoncasecreation {
	
	WebDriver ldriver;
	public emailNotificationoncasecreation(WebDriver rdriver)
	{
		this.ldriver=rdriver;
	}
	
	public void setUserName(String uname)
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
		email.sendKeys(uname);
		
		
	}
	
	public void clicknext()
	{
		WebElement nextbtn= ldriver.findElement(By.id("idSIButton9"));
		nextbtn.click();
		
		
	}
	public void setPassword(String pwd) 
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='passwd']")));
		password.sendKeys(pwd);
		
	}
	public void clickSignin()
	{
		WebElement signin= ldriver.findElement(By.xpath("//input[@value='Sign in']"));
		signin.click();
		
	}
	public void ClickSearchbox()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
	    WebElement searchbox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"searchBoxId-Mail\"]/div[2]")));
	    searchbox.click();
	}
	public void EntertextinSearchbox()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement entertext=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"searchBoxId-Mail\"]/div[2]/div/input")));
		entertext.sendKeys("CIAS.PROD@capita.co.uk");
	}
	public void Clicksearchbtn()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
		WebElement searchbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchSuggestion-0\"]/div")));
		searchbtn.click();

	}
    public void Clickcasemail()
    {
    	WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(530));
       WebElement casemail= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div[6]/div/div")));
       casemail.click();
    }

}
