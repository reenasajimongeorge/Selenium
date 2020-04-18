package day7Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Chrome {

/* Assignment-1 */
	
	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium training\\RequiedTools\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeBrowser=new ChromeDriver();
		// Navigate to Test URL  https://www.google.com/
		chromeBrowser.get("https://www.google.com");
		// add wait time 5 sec
		Thread.sleep(5000);
		//Maximize the Browser Window
		chromeBrowser.manage().window().maximize();
		//Get Current URL of Page
		String x=chromeBrowser.getCurrentUrl();
		System.out.println("Current URL:google");
		System.out.println(x);
		//Navigate to Test URL  https://bhanusaii.wordpress.com/
		chromeBrowser.navigate().to("https://bhanusaii.wordpress.com/");
		// add wait time 5 sec
		Thread.sleep(5000);
		//Get Current URL of Page
		String y=chromeBrowser.getCurrentUrl();
		System.out.println("Current URL:bhanusaii");
		System.out.println(y);
		//Navigate back to Base URL  https://www.google.com/
		chromeBrowser.navigate().back();
		Thread.sleep(5000);
		// Get Current URL of Page
		String z=chromeBrowser.getCurrentUrl();
		System.out.println("Back to Google");
		System.out.println(z);
		//Navigate forward Test URL  https://bhanusaii.wordpress.com/
		chromeBrowser.navigate().forward();
		Thread.sleep(5000);
		//Get Current URL of Page
		String m=chromeBrowser.getCurrentUrl();
		System.out.println("Forward to Bhanusaii");
		System.out.println(m);
		//Refresh the Current Page
		chromeBrowser.navigate().refresh();
		Thread.sleep(5000);
		//Get Current URL of Page
		String n=chromeBrowser.getCurrentUrl();
		System.out.println("Bhanusaii wordpress refreshed");
		System.out.println(n);	
		//Close the  Browser
		chromeBrowser.close();
		
	}

}
