package com.saucedemo.testsuite;
//logs in, adds an item(s)to the basket, proceeds to checkout and checks out successfully.

import com.saucedemo.pages.FailedLoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.annotations.Test;

public class FailedLoginPageTest extends BaseTest {

    FailedLoginPage failedLoginPage=new FailedLoginPage();
    @Test
    //Failed login (using the failed login user)
    public void userSholdLoginunsuceesfully(){
        failedLoginPage.enterInvalidUserName();
        failedLoginPage.enterInvalidPassword();
        failedLoginPage.clickOnLoginButton();

    }




}



