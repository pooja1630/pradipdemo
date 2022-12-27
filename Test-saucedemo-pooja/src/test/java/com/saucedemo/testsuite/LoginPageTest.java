package com.saucedemo.testsuite;
//logs in, adds an item(s)to the basket, proceeds to checkout and checks out successfully.

import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage=new LoginPage();
    CheckoutPage chekoutpage=new CheckoutPage();
    @Test
    ////logs in, adds an item(s)to the basket, proceeds to checkout and checks out successfully.
    public void userSholdLoginandchekoutSuccessfully(){
        loginPage.entervalidUserName();
        loginPage.entervalidPassword();
        loginPage.clickonLoginButton();
        loginPage.clickonAddToCartButton();
        loginPage.clicktheAddToCartcornorButton();
        chekoutpage.clickoncheckoutButton();
        chekoutpage.entervalidFirstName();
        chekoutpage.entervalidLastName();
        chekoutpage.entervalidpostcode();
        chekoutpage.clickonContineButtonLast();
        chekoutpage.clickOnFinishButton();

    }
    @Test
    //Failed login (using the failed login user)
    public void verifyuserloginfailed(){
        loginPage.entervalidUserName();
        loginPage.entervalidPassword();
        loginPage.clickonLoginButton();

    }

}



