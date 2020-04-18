package day7Assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

public class Assign3_Firefox {

	public static void main(String[] args) throws InterruptedException {
		// launch Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Selinium training\\RequiedTools\\Firefox Installer\\geckodriver.exe");
		WebDriver ffdriver=new FirefoxDriver();
				// Navigate to Test URL  https://bhanusaii.wordpress.com/
		ffdriver.get("https://bhanusaii.wordpress.com");
				Thread.sleep(5000);
				//Maximize the Browser Window
				ffdriver.manage().window().maximize();
				//Get the Title of Page
				//String a=ffdriver.getTitle();
				System.out.println("Current page bhanusaii wordpress: " + ffdriver.getTitle());
				//Click on SELENIUM QUIZ-1 Link Text 
				ffdriver.findElement(By.linkText("SELENIUM QUIZ-1")).click();
				Thread.sleep(5000);
				// Handle tab
				ArrayList<String> tabs= new ArrayList<String>(ffdriver.getWindowHandles());
				System.out.println("Tabs: " + tabs);
				
				//Switch from 0th Tab to 1st Tab
				ffdriver.switchTo().window(tabs.get(1)); 
				// After Switching Get the Title of Page 
				//String b=ffdriver.getTitle();
				System.out.println("Quiz tab : " + ffdriver.getTitle());
				Thread.sleep(3000);  // wait 3 sec
				//  Close 2nd tab 
				ffdriver.close();
				//  Switch from 1st  Tab to 0th  Tab
				ffdriver.switchTo().window(tabs.get(0)); 
				//  After Switching Get the Title of Page
				System.out.println("Bhanu Sai learning page : " + ffdriver.getTitle());
				Thread.sleep(3000);  // wait 3 sec
				// Close 1st tab 
				ffdriver.close();

	}

}
