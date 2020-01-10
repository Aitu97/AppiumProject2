package StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import resources.DriverSetup;

public class AppDef {

    private static AndroidDriver<AndroidElement> driver;


    @Given("^Launch the app\\.$")
    public void launch_the_app() throws Throwable {

        AndroidDriver<AndroidElement> driver = DriverSetup.setUpAppiumDriver();


    }

    @Given("^Verify the toast message, when wrong/insufficient input provided$")
    public void verify_the_toast_message_when_wrong_insufficient_input_provided() throws Throwable {

        AndroidElement enterName = driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
        enterName.sendKeys("aitu");

        AndroidElement letsShop = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
        letsShop.click();

    }



    @Given("^Fill the forms\\.$")
    public void fill_the_forms() throws Throwable {

    }

    @Then("^Verify successful login$")
    public void verify_successful_login() throws Throwable {

    }

    @Given("^Login\\.$")
    public void login() throws Throwable {

    }

    @Then("^Add to cart (\\d+) item \\(Air Jordan (\\d+) Mid SE\\)\\. (\\d+)\\. Verify the item in the cart\\.$")
    public void add_to_cart_item_Air_Jordan_Mid_SE_Verify_the_item_in_the_cart(int arg1, int arg2, int arg3) throws Throwable {

    }

    @Then("^Add to cart (\\d+) items \\(Air Jordan (\\d+) Retro, Jordan Lift Off, Lebron Soldier (\\d+)\\)\\. (\\d+)\\. Verify the items in the cart\\.$")
    public void add_to_cart_items_Air_Jordan_Retro_Jordan_Lift_Off_Lebron_Soldier_Verify_the_items_in_the_cart(int arg1, int arg2, int arg3, int arg4) throws Throwable {

    }

    @Then("^Add to cart (\\d+) items \\(PG (\\d+), Nike SFB Jungle\\)\\.$")
    public void add_to_cart_items_PG_Nike_SFB_Jungle(int arg1, int arg2) throws Throwable {

    }

    @Then("^Verify the items in the cart\\.$")
    public void verify_the_items_in_the_cart() throws Throwable {

    }

    @Then("^Verify the prices in cart are same with listed prices\\. (\\d+)\\. Verify the total price is correct\\.$")
    public void verify_the_prices_in_cart_are_same_with_listed_prices_Verify_the_total_price_is_correct(int arg1) throws Throwable {

    }

    @Then("^Remove PG (\\d+) from cart\\.$")
    public void remove_PG_from_cart(int arg1) throws Throwable {

    }

    @Then("^Verify only (\\d+) item left in the cart\\.\\.$")
    public void verify_only_item_left_in_the_cart(int arg1) throws Throwable {

    }

    @Then("^Verify the price for the item\\.$")
    public void verify_the_price_for_the_item() throws Throwable {

    }

    @Then("^Verify total price\\.$")
    public void verify_total_price() throws Throwable {

    }

    @Then("^Add to cart (\\d+) items \\(Converse All Star, Jordan (\\d+) Rings\\)\\.$")
    public void add_to_cart_items_Converse_All_Star_Jordan_Rings(int arg1, int arg2) throws Throwable {

    }

    @Then("^Verify the prices in cart are same with listed prices\\.$")
    public void verify_the_prices_in_cart_are_same_with_listed_prices() throws Throwable {

    }

    @Then("^Verify the total price is correct\\.$")
    public void verify_the_total_price_is_correct() throws Throwable {

    }

    @Then("^Tap on the check box in the cart to receive emails\\.$")
    public void tap_on_the_check_box_in_the_cart_to_receive_emails() throws Throwable {

    }

    @Then("^Tap on “Visit to the website to complete purchase” button\\.$")
    public void tap_on_Visit_to_the_website_to_complete_purchase_button() throws Throwable {

    }

    @Then("^Navigate to www\\.techtorialacademy\\.com from mobile browser\\.$")
    public void navigate_to_www_techtorialacademy_com_from_mobile_browser() throws Throwable {

    }

    @Then("^Verify you are on home page of www\\.techtorialacademy\\.com$")
    public void verify_you_are_on_home_page_of_www_techtorialacademy_com() throws Throwable {

    }

    @Then("^Switch back to mobile application$")
    public void switch_back_to_mobile_application() throws Throwable {

    }


    @Given("^Add to cart all items\\.$")
    public void add_to_cart_all_items() throws Throwable {

    }

    @Then("^Print out “Terms Of Conditions” to console\\. (\\d+)\\. Verify all items in the cart\\.$")
    public void print_out_Terms_Of_Conditions_to_console_Verify_all_items_in_the_cart(int arg1) throws Throwable {

    }

}
