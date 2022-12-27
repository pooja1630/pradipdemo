package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class FailedLoginPage extends Utility {

    By InvalidUsername=By.id("user-name");
    By InvalidPassword=By.id("password");
    By loginClickbutton=By.xpath("//input[@type='submit']");

//	Enter failed username
    public void enterInvalidUserName(){
        sendTextToElement(InvalidUsername,"abc_user");
    }
//	Enter invalid password
public void enterInvalidPassword(){
    sendTextToElement(InvalidPassword,"secret");
}
//	Click on ‘LOGIN’ button
public void clickOnLoginButton(){
        clickOnElement(loginClickbutton);
}







}
