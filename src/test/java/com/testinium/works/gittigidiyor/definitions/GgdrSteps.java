package com.testinium.works.gittigidiyor.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GgdrSteps {
    public static WebDriver driver;

    //


    @Given("^Open the Chrome and launch the application$")

    public void launch() throws Throwable {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.home") + "/Desktop/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.gittigidiyor.com/");

    }

    @Given("^Güncel fırsatlar pop-up'ında daha sonra butonu tıklanır$")
    public void ClosePopUp() {
        CloseSubscriptionPopUp();
    }

    @Then("^hover on moda$")

    public void hoverModa() throws Throwable {


        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"header_wrapper\"]/div[6]/div[3]"))));
        element.click();

        //hoverEl(driver,moda);
    }

    @Then("^click on kadın$")

    public void hoverKadın() throws Throwable {


        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElements(By.cssSelector("a[href='//www.gittigidiyor.com/saat/kol-saati/kadin-kol-saati']")).get(1)
                )
        );
        element.click();

    }

    @Then("^click price filter$")

    public void clickPrice() throws Throwable {

        WebElement element = driver.findElement(By.id("priceRange100-250"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        driver.findElement(By.cssSelector("label[for='priceRange250-500']")).click();

    }

    @Given("^click on ücretsiz kargo$")

    public void clickKargo() throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.cssSelector("#search-page-tab-free-shipping > a > span"))
                )
        );
        element.click();

    }

    @Then("^click on first saat$")

    public void clickFirstSaat() throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.cssSelector("li[product-index='1']"))
                )
        );
        element.click();

    }

    @Given("^click on sepete ekle$")

    public void clickSepeteEkle() throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.id("add-to-basket"))
                )
        );
        element.click();

    }
    @Given("^click on alışverişi tamamla$")

    public void clickTamamla() throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.cssSelector("div > div > div > div:nth-child(5) > input"))
                )
        );
        element.click();

    }
    @Given("^kullanıcı adına '(.*)' yaz$")
    public void writeName(String name) throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.id("FormLoginEmail"))
                )
        );
        element.sendKeys(name);

    }
    @Then("^şifreye '(.*)' yaz$")
    public void writePassword(String pass) throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.id("FormLoginPassword"))
                )
        );
        element.sendKeys(pass);

    }
    @Then("^Devam et tıkla$")
    public void clickDevam() throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.id("loginForm"))
                )
        );
        element.click();

    }
    @Given("^Name '(.*)' yaz$")
    public void writeAddName(String n) throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.name("Name"))
                )
        );
        element.sendKeys(n);

    }

    @Then("^SurName '(.*)' yaz$")
    public void writeAddSurName(String n) throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.name("SurName"))
                )
        );
        element.sendKeys(n);

    }
    @Then("^Address '(.*)' yaz$")
    public void writeAdd(String n) throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.name("Address"))
                )
        );
        element.sendKeys(n);

    }
    @Then("^il '(.*)' seç")
    public void selectSehir(int n) throws Throwable {

        Select fruits = new Select(driver.findElement(By.id("CitySelect")));
        fruits.selectByIndex(n);

    }

    @Then("^Telefon '(.*)' yaz")
    public void writePhone(String n) throws Throwable {

        driver.findElement(By.name("phone-number")).sendKeys(n);

    }
    @Then("^ilçe '(.*)' seç")
    public void selectIlce(int index) throws Throwable {

        Select fruits = new Select(driver.findElement(By.id("District")));
        fruits.selectByIndex(index);

    }
    @Then("^kaydet tıkla")
    public void clickKaydet() throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"AdrEditPopup\"]/div/div/div[2]/div[6]/div[1]/input")).click();

    }



    public void hoverEl(WebDriver driver, WebElement el) {
        Actions action = new Actions(driver);
        action.moveToElement(el).perform();

    }

    public void CloseSubscriptionPopUp() {
        driver.findElement(By.id("later-subscription-button")).click();
    }

}
