package day7Assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Assignment-3
Launch Chrome Browser
Navigate to Test URL  https://bhanusaii.wordpress.com/
Maximize the Browser Window
Get the Title of Page
Click on SELENIUM QUIZ-1 Link Text 
Switch from 0th Tab to 1st Tab
After Switching Get the Title of Page 
Switch from 1st  Tab to 2nd  Tab
After Switching Get the Title of Page 
Close 2nd Tab
Close 1st Tab 
 */

public class Assign3_Chrome {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium training\\RequiedTools\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeBrowser=new ChromeDriver();
				// Navigate to Test URL  https://bhanusaii.wordpress.com/
				chromeBrowser.get("https://bhanusaii.wordpress.com");
				Thread.sleep(5000);
				//Maximize the Browser Window
				chromeBrowser.manage().window().maximize();
				//Get the Title of Page
				//String a=chromeBrowser.getTitle();
				System.out.println("Current page bhanusaii wordpress: " + chromeBrowser.getTitle());
				//Click on SELENIUM QUIZ-1 Link Text 
				chromeBrowser.findElement(By.linkText("SELENIUM QUIZ-1")).click();
				Thread.sleep(5000);
				// Handle tab
				ArrayList<String> tabs= new ArrayList<String>(chromeBrowser.getWindowHandles());
				System.out.println("Tabs: " + tabs);
				
				//Switch from 0th Tab to 1st Tab
				chromeBrowser.switchTo().window(tabs.get(1)); 
				// After Switching Get the Title of Page 
				//String b=chromeBrowser.getTitle();
				System.out.println("Quiz tab : " + chromeBrowser.getTitle());
				Thread.sleep(3000);  // wait 3 sec
				//  Close 2nd tab 
				chromeBrowser.close();
				//  Switch from 1st  Tab to 0th  Tab
				chromeBrowser.switchTo().window(tabs.get(0)); 
				//  After Switching Get the Title of Page
				System.out.println("Bhanu Sai learning page : " + chromeBrowser.getTitle());
				Thread.sleep(3000);  // wait 3 sec
				// Close 1st tab 
				chromeBrowser.close();

	}

}
