package SELENIUM.Tests;


import org.testng.annotations.Test;

import java.io.IOException;

@Test
public class PurchaseProductTests extends Base {



    public void enterUsernameTests() {
        loginPage.enterUsername(readFromExcel.username);
    }

    public void enterPasswordTests() {
        loginPage.enterPassword(readFromExcel.password);
        takeScreenshots.takeSnapShot(driver, "Login Screen");
    }

    @Test(dependsOnMethods = {"enterUsernameTests", "enterPasswordTests"})
    public void clickLoginTests() {
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
        homePage.verifyProductLabelIsDisplayedInHomePage();
        takeScreenshots.takeSnapShot(driver, "Home Screen");
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void clickAddToCart() {
        productPage.clickAddToCart();
    }

    @Test(dependsOnMethods = "clickAddToCart")
    public void verifyAddedToCart() {
        productPage.verifyAddedToCart();
        takeScreenshots.takeSnapShot(driver, "Add To Cart");
    }

    @Test(dependsOnMethods = "verifyAddedToCart")
    public void clickNavigateToCart() {
        yourCartPage.clickNavigateToCart();
    }

    @Test(dependsOnMethods = "clickNavigateToCart")
    public void verifyYourCartLabelIsDisplayedInCartPage() {
        yourCartPage.verifyYourCartLabelIsDisplayedInCartPage();
        takeScreenshots.takeSnapShot(driver, "Your Cart");
    }

    @Test(dependsOnMethods = "verifyYourCartLabelIsDisplayedInCartPage")
    public void verifySauceLabsBackpackProductIsDisplayedInCartPage() {
        yourCartPage.verifySauceLabsBackpackProductIsDisplayedInCartPage();
        takeScreenshots.takeSnapShot(driver, "Sauce Labs Backpack");
    }

    @Test(dependsOnMethods = "verifySauceLabsBackpackProductIsDisplayedInCartPage")
    public void clickCheckout() {
        yourCartPage.clickCheckout();
        takeScreenshots.takeSnapShot(driver, "checkout");
    }

    @Test(dependsOnMethods = "clickCheckout")
    public void verifyCheckoutYourInformationPage() {
        checkoutInformationPage.verifyCheckoutYourInformationPage();
        takeScreenshots.takeSnapShot(driver, "Checkout: Your Information");
    }
    @Test(dependsOnMethods = "verifyCheckoutYourInformationPage")
    public void enterFirstNameTests() {
        checkoutInformationPage.enterFirstName(reausable.Firstname);
    }

    @Test(dependsOnMethods = "verifyCheckoutYourInformationPage")
    public void enterLastNameTests() {
        checkoutInformationPage.enterLastName(reausable.Lastname);
    }

    @Test(dependsOnMethods = "verifyCheckoutYourInformationPage")
    public void enterPostalCodeTests() {
        checkoutInformationPage.enterPostalCode(reausable.zipCode);
        takeScreenshots.takeSnapShot(driver, "Details");
    }
    @Test(dependsOnMethods = {"enterFirstNameTests","enterLastNameTests","enterPostalCodeTests"})
    public void clickContinueButton() {
        checkoutInformationPage.clickContinueButton();
    }
    @Test(dependsOnMethods = "clickContinueButton")
    public void CheckoutOverviewTests (){
        checkoutOverviewPage.verifyCheckoutOverviewLabel();

    }
    @Test(dependsOnMethods = "CheckoutOverviewTests")
    public void verifySauceLabsBackpackProductIsDisplayedInCheckOverviewPage() {
        checkoutOverviewPage.verifySauceLabsBackpackProductIsDisplayedInCheckOverviewPage();
        takeScreenshots.takeSnapShot(driver, "Check Out Overview");
    }

    @Test(dependsOnMethods = "verifySauceLabsBackpackProductIsDisplayedInCheckOverviewPage")
    public void verifyItemTotalPlusTax(){
        checkoutOverviewPage.verifyItemTotalPlusTax();
        takeScreenshots.takeSnapShot(driver, "Total with Tax");
    }

    @Test(dependsOnMethods = "verifyItemTotalPlusTax")
    public void clickFinishButton(){
        checkoutOverviewPage.clickFinishButton();
    }

    @Test(dependsOnMethods = "verifyItemTotalPlusTax")
    public void clickCancelButton(){
        checkoutOverviewPage.clickCancelButton();
    }

    @Test(dependsOnMethods = {"clickFinishButton", "clickCancelButton"})
    public void clickBurgerMenuButton() {checkoutOverviewPage.clickBurgerMenuButton();}

    @Test(dependsOnMethods = {"clickBurgerMenuButton"})
    public void clickLogoutFromBurgerMenu() {checkoutOverviewPage.clickLogoutFromBurgerMenu ();}
}