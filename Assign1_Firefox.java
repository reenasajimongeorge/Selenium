package day7Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign1_Firefox {

/* Assignment-1 */
	
	public static void main(String[] args) throws InterruptedException {
		// launch Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Selinium training\\RequiedTools\\Firefox Installer\\geckodriver.exe");
		WebDriver ffdriver=new FirefoxDriver();
		// Navigate to Test URL  https://www.google.com/
		ffdriver.get("https://www.google.com");
		// add wait time 5 sec
		Thread.sleep(5000);
		//Maximize the Browser Window
		ffdriver.manage().window().maximize();
		//Get Current URL of Page
		//String x=ffdriver.getCurrentUrl();
		System.out.println("Current URL:google:  " + ffdriver.getCurrentUrl());
		//Navigate to Test URL  https://bhanusaii.wordpress.com/
		ffdriver.navigate().to("https://bhanusaii.wordpress.com/");
		// add wait time 5 sec
		Thread.sleep(5000);
		//Get Current URL of Page
		//String y=ffdriver.getCurrentUrl();
		System.out.println("Current URL:bhanusaii  : " + ffdriver.getCurrentUrl());
		//Navigate back to Base URL  https://www.google.com/
		ffdriver.navigate().back();
		Thread.sleep(5000);
		// Get Current URL of Page
		//String z=ffdriver.getCurrentUrl();
		System.out.println("Back to Google: " + ffdriver.getCurrentUrl());
		//Navigate forward Test URL  https://bhanusaii.wordpress.com/
		ffdriver.navigate().forward();
		Thread.sleep(5000);
		//Get Current URL of Page
		//String m=ffdriver.getCurrentUrl();
		System.out.println("Forward to Bhanusaii: " + ffdriver.getCurrentUrl());
		//System.out.println(m);
		//Refresh the Current Page
		ffdriver.navigate().refresh();
		Thread.sleep(5000);
		//Get Current URL of Page
		//String n=ffdriver.getCurrentUrl();
		System.out.println("Bhanusaii wordpress refreshed: " + ffdriver.getCurrentUrl());	
		//Close the  Browser
		ffdriver.close();
		
	}

}
