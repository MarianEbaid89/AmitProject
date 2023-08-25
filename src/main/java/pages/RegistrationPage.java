package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends PageBase{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    // add element type at the end of the locator name, ex confirmPassword should be confirmPasswordField
    By genderMale = By.id("gender-male");
    By genderFemale = By.id("gender-female");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By birthDay= By.name("DateOfBirthDay");
    By birthMonth = By.name("DateOfBirthMonth");
    By birthYear = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By company = By.id("Company");
    By newsLetter = By.id("Newsletter");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By successMessage = By.cssSelector("div.result");
    public void selectGender(){
        clickOnElement(genderFemale);
    }
    public void enterFirstName(){
        setElementText(firstName,"automation");
    }
    public void enterLastName(){
        setElementText(lastName,"tester");
    }
    public void selectDayOfBirth(){
        selectFromDropDown(birthDay,"7");
    }
    public void selectMonthOfBirth(){
        selectFromDropDown(birthMonth,"1");
    }
    public void selectYearOfBirth(){
        selectFromDropDown(birthYear,"1989");
    }
    public void enterEmail(){
        setElementText(email,"test@example.com");
    }
    public void enterPassword(){
        setElementText(password,"P@ssw0rd");
    }
    public void enterCompany(){
        setElementText(company,"AMIT");
    }
    public void enterConfirmPassword(){
        setElementText(confirmPassword,"P@ssw0rd");
    }
    public void clickRegister(){
        clickOnElement(registerButton);
    }
    public String getSuccessMessage(){
        return getElementText(successMessage);
    }
}
