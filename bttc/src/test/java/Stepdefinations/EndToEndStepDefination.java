package Stepdefinations;

import BrowserConfigaration.BaseTest;
import Pagesss.LandingPage;
import cucumber.api.java.en.When;

public class EndToEndStepDefination {


BaseTest b = new BaseTest();
LandingPage l;
	

	@Given()
	public void open_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   b.openBrowser();
	}

	@Given()
	public LandingPage  go_to_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   l = b.GoToUrl();
	    
	    return new LandingPage(null);
	}

	@When("^user hover over o n man menu$")
	public void user_hover_over_on_man_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user click new arrival submenu$")
	public void user_click_new_arrival_submenu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user click a shirt$")
	public void user_click_a_shirt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user select all optins$")
	public void user_select_all_optins() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
