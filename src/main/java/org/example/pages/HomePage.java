package org.example.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Текст "Соберите бургер"
    private final By textAssembleBurger = By.xpath(".//h1[text()='Соберите бургер']");

    //Кнопка "Личный кабинет"
    private final By buttonPersonalAccount = By.xpath(".//p[text()='Личный Кабинет']");

    //Кнопка "Войти в аккаунт"
    private final By buttonLoginToAccount = By.xpath(".//button[text()='Войти в аккаунт']");

    //Вкладка "Булки"
    private final By tabBuns = By.xpath(".//span[text()='Булки']");

    //Вкладка "Соусы"
    private final By tabSauces = By.xpath(".//span[text()='Соусы']");

    //Вкладка "Начинки"
    private final By tabFillings = By.xpath(".//span[text()='Начинки']");

    //Выбранная вкладка
    private final By tabSelected = By.xpath(".//div[contains(@class, 'tab_tab_type_current__2BEPc')]");


    //@Step("Видимость текста Регистрация")
    public boolean visibilityTextAssembleBurger() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(textAssembleBurger));
        return true;
    }

    //@Step("Кликабельность кнопки Личный кабинет")
    public void clickableButtonPersonalAccount() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(buttonLoginToAccount));
    }

    //@Step("Кликабельность кнопки Войти в аккаунт")
    public void clickableButtonSignInToAccount() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(buttonLoginToAccount));
    }

    //@Step("Клик по кнопке Личный кабинет")
    public void clickButtonPersonalAccount() {
        driver.findElement(buttonPersonalAccount).click();
    }

    //@Step("Клик по кнопке Войти в аккаунт")
    public void clickButtonSignInToAccount() {
        driver.findElement(buttonLoginToAccount).click();
    }

    //@Step("Клик по вкладке Булки")
    public void clickTabBuns() {
        driver.findElement(tabBuns).click();
    }

    //@Step("Клик по вкладке Соусы")
    public void clickTabSauces() {
        driver.findElement(tabSauces).click();
    }

    //@Step("Клик по вкладке Начинки")
    public void clickTabFillings() {
        driver.findElement(tabFillings).click();
    }

    //@Step("Возврат названия выбранной вкладки")
    public String getTabSelected() {
        new WebDriverWait(driver, Duration.ofSeconds(3));
        return driver.findElement(tabSelected).getText();
    }
}
