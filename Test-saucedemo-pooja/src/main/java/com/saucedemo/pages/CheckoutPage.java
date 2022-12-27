package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By countinuecheckout=By.xpath("//button[@id='checkout']");
    By firstName=By.id("first-name");
    By lastName=By.id("last-name");
    By zipCode=By.id("postal-code");

    By continuebutton=By.xpath("//input[@id='continue']");
    By finishbutton=By.xpath("//button[@id='finish']");

    public void clickoncheckoutButton(){
        clickOnElement(countinuecheckout);
    }
    public void entervalidFirstName(){
        sendTextToElement(firstName,"xyzv");
    }
    public void entervalidLastName(){
        sendTextToElement(lastName,"abcd");
    }
    public void entervalidpostcode(){
        sendTextToElement(zipCode,"wd37hg");
    }
    public void clickonContineButtonLast(){
        clickOnElement(continuebutton);
    }
    public void clickOnFinishButton(){
        clickOnElement(finishbutton);
    }
}
