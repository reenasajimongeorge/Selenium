package day7Assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Assignment-2*/

public class Assign2_Chrome {

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
				String a=chromeBrowser.getTitle();
				System.out.println("Current page bhanusaii wordpress: " + a);
				//Click on SELENIUM QUIZ-1 Link Text 
				chromeBrowser.findElement(By.linkText("SELENIUM QUIZ-1")).click();
				Thread.sleep(5000);
				// Handle tab
				ArrayList<String> tabs= new ArrayList<String>(chromeBrowser.getWindowHandles());
				System.out.println("Tabs: " + tabs);
				
				//19. Switch from 0th Tab to 1st Tab
				chromeBrowser.switchTo().window(tabs.get(1)); 
				//20. After Switching Get the Title of Page 
				String b=chromeBrowser.getTitle();
				System.out.println("Quiz tab : " + b);
				// 21. Switch from 1st  Tab to 0th  Tab
				chromeBrowser.switchTo().window(tabs.get(0)); 
				// 22. After Switching Get the Title of Page
				System.out.println("Bhanu Sai learning page : " + chromeBrowser.getTitle());
				// 23. Close all windows of Browser 
				chromeBrowser.quit();
				
				
	}

}
