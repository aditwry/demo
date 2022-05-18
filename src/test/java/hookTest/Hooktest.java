package hookTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Hooktest {	
	WebDriver driver = null; 
	@Before(order = 1)
    public void beforeScenario(){
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/driver1/chromedriver.exe");
        driver = new ChromeDriver(); 
        System.out.println("This will run before the every Scenario");
            }	
	@Before(order = 2)
    public void beforeScenarioStart(){
        System.out.println("-----Start of Scenario-----");
    }	
	 
	@Given("^this is the first step$")
	public void This_Is_The_First_Step(){
        driver.navigate().to("https://www.saucedemo.com/"); 
		System.out.println("This is the first step");
	}	
	@When("I enter Username as (.*) and Password as (.*)$")
	public void This_Is_The_Second_Step(String arg1, String arg2)throws InterruptedException{
		driver.findElement(By.xpath("//INPUT[@id='user-name']")).sendKeys(arg1);
	    driver.findElement(By.xpath("//INPUT[@id='password']")).sendKeys(arg2);
	    driver.findElement(By.xpath("//INPUT[@id='login-button']")).click(); 
	    System.out.println("This is the second step");
	    System.out.println(arg1);
	   } 
	
	// for multiple inputs
/*	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(DataTable dataTable) {
		List<List<String>> data = dataTable.cells();
		loginPage.loginUsingCrentials(data.get(0).get(0), data.get(0).get(1));
	}*/
	
	@Then("^this is the third step$")
	public void This_Is_The_Third_Step(){
		System.out.println("This is the third step");
	}
}


