import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.example.pages.LoginPage;
import org.example.pages.HomePage;
import org.example.pages.RegistrationPage;


public class RegistrationTest extends DataTest {
    @Test
    @DisplayName("Успешная регистрация пользователя")
    public void goRegisterPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickableButtonSignInToAccount();
        homePage.clickButtonSignInToAccount();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.visibilityTextLogin();
        loginPage.clickButtonRegister();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.visibilityTextRegistration();
        registrationPage.inputFieldName(name);
        registrationPage.inputFieldEmail(email);
        registrationPage.inputFieldPassword(password);
        registrationPage.clickButtonRegister();
        Assert.assertTrue(loginPage.visibilityTextLogin());
    }

    @Test
    @DisplayName("При регистрации пользователя c Некорректным паролем")
    public void goRegisterPageInvalidPassword() {
        HomePage homePage = new HomePage(driver);
        homePage.clickableButtonSignInToAccount();
        homePage.clickButtonSignInToAccount();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.visibilityTextLogin();
        loginPage.clickButtonRegister();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.visibilityTextRegistration();
        registrationPage.inputFieldName(name);
        registrationPage.inputFieldEmail(email);
        registrationPage.inputFieldPassword(invalidPassword);
        registrationPage.clickButtonRegister();
        Assert.assertTrue(registrationPage.visibilityTextInvalidPassword());
    }
}
