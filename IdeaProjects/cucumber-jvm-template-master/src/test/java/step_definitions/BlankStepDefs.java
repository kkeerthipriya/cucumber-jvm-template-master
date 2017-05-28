package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class BlankStepDefs{
    public WebDriver driver;
    
    public BlankStepDefs()
    {
    	driver = Hooks.driver;
    }

    @Given("An order placed '(.*)'")
    public void i_open_automationpractice_website(String ref) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://automationpractice.com/index.php?controller=contact");
    }


    @When("I fill the form with the details as '(.*)' and '(.*)' and '(.*)' and '(.*)'")
    public void filldata(String heading,String mail,String ordnum,String msg) throws Throwable {
        WebElement contact=driver.findElement(By.id("id_contact"));
        Select sel=new Select(contact);
        sel.selectByVisibleText(heading);
        WebElement emailid=driver.findElement(By.id("email"));
        emailid.sendKeys(mail);
        WebElement ordernumber=driver.findElement(By.id("id_order"));
        ordernumber.sendKeys(ordnum);
        WebElement txtmsg=driver.findElement(By.id("message"));
        txtmsg.sendKeys(msg);
        WebElement subbutton=driver.findElement(By.id("submitMessage"));
        subbutton.click();
      System.out.println("testing");
    }

    @Then("^I validate title and URL$")
    public void i_print_title_and_URL() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //assertEquals("Selenium Framework | Selenium, Cucumber, Ruby, Java et al.",driver.getTitle());
      //assertEquals("http://www.seleniumframework.com/",driver.getCurrentUrl());
    }

    @Given("^An order placed \"(.*?)\"$")
    public void an_order_placed(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://automationpractice.com/index.php?controller=contact");
    }

    @When("^I fill the form with the details as \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
    public void i_fill_the_form_with_the_details_as_and_and_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
        WebElement contact=driver.findElement(By.id("id_contact"));
        Select sel=new Select(contact);
        sel.selectByVisibleText(arg1);
        WebElement emailid=driver.findElement(By.id("email"));
        emailid.sendKeys(arg2);
        WebElement ordernumber=driver.findElement(By.id("id_order"));
        ordernumber.sendKeys(arg3);
        WebElement txtmsg=driver.findElement(By.id("message"));
        txtmsg.sendKeys(arg4);
        WebElement subbutton=driver.findElement(By.id("submitMessage"));
        subbutton.click();
        System.out.println("testing");
    }

    @Then("^I should be able click on submit button and send message to customer care$")
    public void i_should_be_able_click_on_submit_button_and_send_message_to_customer_care() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

}