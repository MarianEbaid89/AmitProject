package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");
    By logoutLink = By.linkText("Log out");
    By myAccountLink = By.linkText("My account");
    By currenciesList = By.id("customerCurrency");
    By itemsPrices = By.cssSelector("div.prices");
    By firstSlider = By.linkText("1");
    By secondSlider = By.linkText("2");
    By followUsFacebook = By.linkText("Facebook");
    By followUsTwitter = By.linkText("Twitter");
    By followUsRSS = By.linkText("RSS");
    By followUsYouTube = By.linkText("YouTube");
    public void clickOnRegister(){
        clickOnElement(registerLink);
    }
    public void clickOnLogin(){
        clickOnElement(loginLink);
    }
    public void clickOnLogout(){
        if(elementIsDisplayed(logoutLink)) {
            clickOnElement(logoutLink);
        }
        else
            return;
    }
    public void navigateHomePage() {
        navigateToHomePage();
    }
    public boolean isMyAccountDisplayed(){
        return elementIsDisplayed(myAccountLink);
    }

    public void selectCurrency(){
        selectFromDropDown(currenciesList,"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }
    public List<String> getItemsPrices(){
        List <String> pricesValues = new ArrayList<>();

        for (int i=0; i<findElementsList(itemsPrices).size();i++){
            String str = findElementsList(itemsPrices).get(i).getText(); //Attribute("value");
            pricesValues.add(str);
        }
        return pricesValues;
    }
    public void clickOnFirstSlider(){
        clickOnElement(firstSlider);
    }
    public void clickOnSecondSlider(){
        clickOnElement(secondSlider);
    }
    public void clickOnFollowUsFacebook (){
        clickOnElement(followUsFacebook);
    }
    public void clickOnFollowUsTwitter (){
        clickOnElement(followUsTwitter);
    }
    public void clickOnFollowUsRSS (){
        clickOnElement(followUsRSS);
    }
    public void clickOnFollowUsYouTube (){
        clickOnElement(followUsYouTube);
    }

}
