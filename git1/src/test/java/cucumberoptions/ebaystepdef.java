package cucumberoptions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ebaystepdef {
	public static WebDriver driver;
	@Given("User is on Ebay login page")
	public void user_is_on_ebay_login_page() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\JEEVAN KUMAR\\OneDrive\\Documents\\Tulasi\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	}
	
	@When("user clicks on register link and user fills the required fields for registration process")
	public void user_clicks_on_new_user_link_and_user_fills_the_fields_required_for_registration_process() throws InterruptedException {
	driver.findElement(By.linkText("register")).click();
driver.findElement(By.id("firstname")).sendKeys("Tulasi");
	driver.findElement(By.id("lastname")).sendKeys("Gujja");
	driver.findElement(By.id("Email")).sendKeys("tulasivineetha96@gmail.com");
	driver.findElement(By.id("password")).sendKeys("gujja12737@");
	Thread.sleep(2000);
	}

	
	@And("clicks on submit button")
	public void clicks_on_submit_button() {
		driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
	}
	
	@Then("User will see new account created")
	public void user_will_see_new_account_created() {
		TakesScreenshot ts = (TakesScreenshot)ebaystepdef.driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		try
		{
			
			FileUtils.copyFile(file, new File("C:\\Users\\JEEVAN KUMAR\\OneDrive\\Documents\\Tulasi\\screenshot.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("screenshot is taken");
		driver.quit();
		
	}

}


