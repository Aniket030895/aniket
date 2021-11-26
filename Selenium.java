package SoftwareTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\H P\\Desktop\\chrome driver\\chromedriver_win32\\chromedriver.exe");
        
       WebDriver driver=new ChromeDriver () ;
        Thread.sleep(3000);
       driver.get("https://www.google.com/");
       
       driver.manage().window().maximize();
       Thread.sleep(3000);
       String at=driver.getTitle();
       String et="Google";
    	
       if(at.equals(et)) {
    	   System.out.println("test succesfull");
       }
       
       else System.out.println("test faild");
	}

}
