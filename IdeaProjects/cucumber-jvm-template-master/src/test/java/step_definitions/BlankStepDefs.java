package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


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
        driver.findElement(By.cssSelector("a[title=\"My Store\"]")).click();
        //sel.selectByVisibleText(heading);
        //WebElement emailid=driver.findElement(By.id("email"));
        //emailid.sendKeys(mail);
        //WebElement ordernumber=driver.findElement(By.id("id_order"));
        //ordernumber.sendKeys(ordnum);
        //WebElement txtmsg=driver.findElement(By.id("message"));
       // txtmsg.sendKeys(msg);
        //WebElement subbutton=driver.findElement(By.id("submitMessage"));
       // subbutton.click();
      System.out.println("testing");
    }

    @Then("^I validate title and URL$")
    public void i_print_title_and_URL() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //assertEquals("Selenium Framework | Selenium, Cucumber, Ruby, Java et al.",driver.getTitle());
      //assertEquals("http://www.seleniumframework.com/",driver.getCurrentUrl());
    }


    @Given("^For a valid user id$")
    public void for_a_valid_user_id() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.facebook.com");
    }


    @When("^we enter all the signup details 'Keerthi' and 'Kommu' and 'keerthipriya(\\d+)@gmail\\.com' and '(\\d+)-Oct-(\\d+)' and 'F'$")
    public void signupfb(int arg1, int arg2, int arg3) throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Keerthi");

        WebElement lname = driver.findElement(By.name("lastname"));
        lname.sendKeys("Kommu");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"u_0_6\"]"));
        email.sendKeys("keerthipriya0810@gmail.com");
        email.sendKeys("\t");

        WebElement renteremail=driver.findElement(By.xpath("//*[@id=\"u_0_8\"]"));
       // renteremail.sendKeys("keerthipriya0810@gmail.com");


        Actions actions = new Actions(driver);
        actions.moveToElement(renteremail);
        actions.click();
        actions.sendKeys("keerthipriya0810@gmail.com");
        actions.build().perform();

        WebElement pwd = driver.findElement(By.name("reg_passwd__"));
        pwd.sendKeys("Welcome@789");

        Select bday = new Select(driver.findElement(By.name("birthday_day")));
        bday.selectByVisibleText("8");
        Select bmonth = new Select(driver.findElement(By.name("birthday_month")));
        bmonth.selectByIndex(9);
        Select byear = new Select(driver.findElement(By.name("birthday_year")));
        byear.selectByValue("1987");

        WebElement gender=driver.findElement(By.xpath("//*[@id=\"u_0_j\"]/span[1]/label"));
        gender.click();

        WebElement submit=driver.findElement(By.name("websubmit"));
        submit.click();



        System.out.println("i keerthi printed this to debug");
    }

    @Then("^I should be able to sign up for new user$")
    public void i_should_be_able_to_sign_up_for_new_user() throws Throwable {

    }

}