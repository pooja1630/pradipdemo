package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By validUsername=By.id("user-name");
    By validPassword=By.id("password");
    By loginClick=By.xpath("//input[@type='submit']");
    By iteaminaddToCart=By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By addToCartbutton=By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]");

//	Enter “standard_user” username
    public void entervalidUserName(){
        sendTextToElement(validUsername,"standard_user");
    }
//	Enter “secret_sauce” password
public void entervalidPassword(){
    sendTextToElement(validPassword,"secret_sauce");
}
//	Click on ‘LOGIN’ button
public void clickonLoginButton(){
        clickOnElement(loginClick);
}
public void clickonAddToCartButton(){
        clickOnElement(iteaminaddToCart);
}
    public void clicktheAddToCartcornorButton() {
        clickOnElement(addToCartbutton);
    }






}
