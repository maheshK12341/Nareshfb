package StepDefination;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import AllpageA.loginpageA;

import Genericmethods.Generimethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefaintion extends loginpageA {



@Given("User is on login page")
public void user_is_on_login_page() throws IOException {
    // Write code here that turns the phrase above into concrete actions
	browser_lanuch();
	ExtentCucumberAdapter.addTestStepLog("application launched successfully");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath((captureScreenshot()));
}

@When("^user enters Right usernam\"([^\"]*)\"$") 
public void user_enters_right_username(String username) throws IOException {
  // Write code here that turns the phrase above into concrete actions
	Enter_emaild(username);
	  ExtentCucumberAdapter.addTestStepLog("entered email id successfully"+username);
	 ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(captureScreenshot());
}

@When("^user enters Right password\"([^\"]*)\"$")
public void user_enters_password(String password) throws IOException {
	Enter_password(password);
	  ExtentCucumberAdapter.addTestStepLog("entered password successfully"+password);
	 ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(captureScreenshot());
	  

}


//@When("user enters Right username {string}")
//public void user_enters_right_username(String username) throws IOException {
//    // Write code here that turns the phrase above into concrete actions
//	Enter_Email(username);
//	
//}
//
//@And("user enters password {string}")
//public void user_enters_password(String password) throws IOException {
//	Enter_password(password);
//
//
//}

@And("clicks on submit")
public void clicks_on_submit() throws IOException {
	login_submit();
	//ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(obj.captureScreenshot());
}

@Then("browse close")
public void browse_close() throws IOException
{
	
	browser_close();
	//ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(obj.captureScreenshot());
}
	
	
}
