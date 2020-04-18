package day7Assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5_Chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium training\\RequiedTools\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeBrowser=new ChromeDriver();
		// Navigate to Test URL  https://netbanking.hdfcbank.com/netbanking/
		chromeBrowser.get("https://netbanking.hdfcbank.com/netbanking/");
		// add wait time 5 sec
		Thread.sleep(5000);
		//Maximize the Browser Window
		chromeBrowser.manage().window().maximize();
		//Get the Title of Page
		//String c= chromeBrowser.getTitle();
		System.out.println("HDFC page: " + chromeBrowser.getTitle());
	      //click on know more link text
		chromeBrowser.switchTo().frame("login_page");
	  	chromeBrowser.findElement(By.xpath("(//a[text()='Know More'])[1]")).click();
	      Thread.sleep(5000); 
	    //Handle window
	      ArrayList<String> wins=new ArrayList<String>(chromeBrowser.getWindowHandles());
	      System.out.println("Window: " + wins);
	      Thread.sleep(5000);
	      //After Switching Get the Title of Page 
	      chromeBrowser.switchTo().window(wins.get(1));
	      System.out.println("Know More page : " + chromeBrowser.getTitle());
			Thread.sleep(3000);  // wait 3 sec
			//Close HDFC log in page
            chromeBrowser.close();
			// Switch to previous window and get the title
			chromeBrowser.switchTo().window(wins.get(0));
            System.out.println("HDFC login page: " + chromeBrowser.getTitle());
            //Close HDFC log in page
            chromeBrowser.close();
	}

}
