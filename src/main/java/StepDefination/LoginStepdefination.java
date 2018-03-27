package StepDefination;



import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefination {  
	
	WebDriver driver;
	
	
	@Given("^user is already on Login Page$")
     public void user_already_on_LoginPage(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul Sinha\\Downloads\\Software\\Driver\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://freecrm.com/index.html");
	}
	
	@When("^title of login page is Free Pedia$")
	public void Title_of_Login_page(){
     String title  =		driver.getTitle();
     System.out.println(title);
     Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software",title);

}
	
	@Then("^user enters username and password$")
	public void enter_username_password(){
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
	}
	
	
	@Then( "^user click on login button$")
	public void Click_On_login(){
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Then("^user is on home page$")
	public void Login_Home_Page(){
		String title=driver.getTitle();
		System.out.println("Home Page Title"+title);
		Assert.assertEquals("CRMPRO", title);
	}
}
