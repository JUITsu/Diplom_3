import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import org.example.pages.HomePage;

public class ConstructorTest extends DataTest {
    @Override
    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    @DisplayName("Раздел «Конструктор» переход к разделу «Соусы»")
    public void goSauces() {
        HomePage homePage = new HomePage(driver);
        homePage.visibilityTextAssembleBurger();
        homePage.clickTabSauces();
        Assert.assertEquals(homePage.getTabSelected(), "Соусы");
    }

    @Test
    @DisplayName("Раздел «Конструктор» переход к разделу «Начинки»")
    public void goFillings() {
        HomePage homePage = new HomePage(driver);
        homePage.visibilityTextAssembleBurger();
        homePage.clickTabFillings();
        Assert.assertEquals(homePage.getTabSelected(), "Начинки");
    }

    @Test
    @DisplayName("Раздел «Конструктор» переход к разделу «Булки» из раздела «Начинки»")
    public void goBuns() {
        HomePage homePage = new HomePage(driver);
        homePage.visibilityTextAssembleBurger();
        homePage.clickTabFillings();
        homePage.clickTabBuns();
        Assert.assertEquals(homePage.getTabSelected(), "Булки");
    }
}
