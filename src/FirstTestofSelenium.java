import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTestofSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Driver initializarion
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Imran\\Desktop\\SeleniumFiles\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Access URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//LoginTest
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Logged In Successfully!");

		//AssignLeaveTest
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[1]/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/input[1]")).sendKeys("Odis Adalwin");
		
        Select leaveType = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[2]/select"))); 
        leaveType.selectByVisibleText("US - Personal");
        
        System.out.println("Test output");
	}

}
