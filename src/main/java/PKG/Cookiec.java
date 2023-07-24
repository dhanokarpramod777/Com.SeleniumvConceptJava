package PKG;



import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Cookiec {

	@Test
	public  void  Cookie() {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\SeleniumProject\\chromedriver_win32\\chromedriver.exe");
	    ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
    	driver.manage().window().maximize();
	    driver.get("https://www.amazon.in");
		   
		   // Set ---> java.util.Set; import
		   // Cookie ----> org.openqa.selenium.Cookie
		   // Capture all the cookies from the browser 
	     Set <Cookie> cookie = driver.manage().getCookies();
	     
	     // Get how many cookie are created
	     int  s = cookie.size();
//	     
	     System.out.println(s);
//	    
	    
		//	System.out.println(cookie.size());
			
			driver.close();
			   
			
			
			
			
			
			// 7718955555
	}
}
