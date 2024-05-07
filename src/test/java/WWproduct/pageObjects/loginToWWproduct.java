package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginToWWproduct {
	WebDriver ldriver;
	public loginToWWproduct(WebDriver rdriver)
	{
		this.ldriver=rdriver;
	}
	
	public void setUserName(String uname)
	{
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(120));
		
		WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
		email.sendKeys(uname);
		
		
	}
	public void setusername1(String uname)
	{
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(120));
		
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
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(120));
		WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='passwd']")));
		password.sendKeys(pwd);
		
	}
	
	public void clickSignin()
	{
		WebElement signin= ldriver.findElement(By.xpath("//input[@value='Sign in']"));
		signin.click();
		
	}	
	public void clickyes()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(120));
		WebElement yes=wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
		yes.click();
		
	}
	public void clickOkforAlreadyexistSession()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(120));
		WebElement ok=wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLoginConfirm")));
	ok.click();
		
	}	


}
