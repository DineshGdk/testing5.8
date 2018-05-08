package jenkins;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jenkins {
	/*@Test
	public void method(){
		System.out.println("welcome");
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium_JAR_files\\chromedriver_win32\\chromedriver.exe");  
		System.out.println("welcome2");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("welcome3");
		
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("classFrame");
		
		System.out.println("welcome3");
		driver.findElement(By.linkText("Tree")).click();
		
		System.out.println("completed");
		driver.close(); 
	}*/
	@Test
	public void Test_case1(){
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium_JAR_files\\chromedriver_win32\\chromedriver.exe");					
	    WebDriver driver = new ChromeDriver();	
	    
	    String filePath="D:/dinesh/git/source%20code/dev_login.html";
	    
	    driver.get("file://////" + filePath);
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("/html/body/section[2]/p[1]/a[1]")).click();
	    driver.findElement(By.xpath("/html/body/header/div/div/nav/a[1]")).click();	  
		System.out.println("test case passed!!");
		
        driver.close();
	}
}
