package WWproduct.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestuserLoginpage {
	WebDriver driver;
	public TestuserLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	 public void enterTestusermailid() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(520));
	WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
	email.sendKeys("P20000001@capitaindia.onmicrosoft.com");
	 }
	 public void enterTejasLocalmailid() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(520));
		WebElement emailidTejasLocal=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
		emailidTejasLocal.sendKeys("P20000000@capitaindia.onmicrosoft.com");
		 }
	 public void enterCIASINTmailid() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(520));
		WebElement debashreeCOUKmailid=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
		debashreeCOUKmailid.sendKeys("p50038542@capita.co.uk");
		 }
	 public void enternextbtn() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(520));
	WebElement nextbtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9"))); 
    nextbtn.click();
	 }
	 public void entertestuserpswd() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(520));
	WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='passwd']")));
	password.sendKeys("Capita@2024");
	 }
	 public void enterCIASINTpswd() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(520));
	WebElement debashreeCOUKpswd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='passwd']")));
	debashreeCOUKpswd.sendKeys("Cap_deb@2021%01_03");
	 }
	 public void entertejasLocalpswd() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(520));
	WebElement tejasLocalpswd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='passwd']")));
	tejasLocalpswd.sendKeys("Capita@2024");
	 }
	 public void signin() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(520));
	WebElement signin= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Sign in']"))); 
	signin.click();
    }
	 
	 public void yesclick() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(520));
	WebElement yes=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9")));
	yes.click();
	 }
	
	public void okclick() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(520));
	WebElement ok=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLoginConfirm")));
    ok.click();
	}
	
	 
}
