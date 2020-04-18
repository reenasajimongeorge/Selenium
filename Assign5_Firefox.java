package day7Assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign5_Firefox {

	public static void main(String[] args) throws InterruptedException {
		// launch Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Selinium training\\RequiedTools\\Firefox Installer\\geckodriver.exe");
		WebDriver ffdriver=new FirefoxDriver();
		// Navigate to Test URL  https://netbanking.hdfcbank.com/netbanking/
		ffdriver.get("https://netbanking.hdfcbank.com/netbanking/");
		// add wait time 5 sec
		Thread.sleep(5000);
		//Maximize the Browser Window
		ffdriver.manage().window().maximize();
		//Get the Title of Page
		//String c= ffdriver.getTitle();
		System.out.println("HDFC page: " + ffdriver.getTitle());
	      //click on know more link text
		ffdriver.switchTo().frame("login_page");
		ffdriver.findElement(By.xpath("(//a[text()='Know More'])[1]")).click();
	      Thread.sleep(5000); 
	    //Handle window
	      ArrayList<String> wins=new ArrayList<String>(ffdriver.getWindowHandles());
	      System.out.println("Window: " + wins);
	      Thread.sleep(5000);
	      //After Switching Get the Title of Page 
	      ffdriver.switchTo().window(wins.get(1));
	      System.out.println("Know More page : " + ffdriver.getTitle());
			Thread.sleep(3000);  // wait 3 sec
			//Close HDFC log in page
			ffdriver.close();
			// Switch to previous window and get the title
			ffdriver.switchTo().window(wins.get(0));
            System.out.println("HDFC login page: " + ffdriver.getTitle());
            //Close HDFC log in page
            ffdriver.close();
	}

}
