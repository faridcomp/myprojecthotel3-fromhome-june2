package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HotelHomePageObject3;

public class TestStepDef extends Base{
	
	HotelHomePageObject3 hotelHomePage = new HotelHomePageObject3(); 
	
	@Given("user is on hotel website")
	public void user_is_on_hotel_website() {
	   String actualTitle = driver.getTitle(); 
	   String expectedTitle = "Hotel"; 
	   Assert.assertEquals(expectedTitle, actualTitle);
	   logger.info(actualTitle + "is equal to " + expectedTitle); 
	}
	@When("user click on signIn button")
	public void user_click_on_sign_in_button() {
	  hotelHomePage.clickSignIn();
	  logger.info("user clicked on SignIn");
	}
	@Then("user should see signIn page")
	public void user_should_see_sign_in_page() {
		Assert.assertTrue(hotelHomePage.isAuthenticationDisplayed());
		Assert.assertTrue(hotelHomePage.isEmailPresent());
		logger.info("sign in page is displayed");
	
	}

}
