package WWproduct.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
Properties pro;
	
	public  ReadConfig()
	{
		File src = new File("./Configuration/config.property");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	public String getbrowser() {
		String Browser=pro.getProperty("Browser");
		return Browser;
	}
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getoutlookURL()
	{
		String outlookurl=pro.getProperty("outlookURL");
		return outlookurl;
	}
	public String getMyCredentials()
	{
	String username=pro.getProperty("userid");
	return username;
	}
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	public String getTestUser1()
	{
	String username=pro.getProperty("TestUser1");
	return username;
	}
	public String getPasssword1()
	{
	String password=pro.getProperty("Passsword1");
	return password;
	}


	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}
	

}
