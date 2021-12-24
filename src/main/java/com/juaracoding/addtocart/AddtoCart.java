package com.juaracoding.addtocart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.driver.DriverSingleton;

public class AddtoCart {
	
private WebDriver driver;

	public AddtoCart() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//LOGIN PAGE
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info")
	private WebElement btnSignIn;
	
	@FindBy(css = "#email")
	private WebElement txtEmail;
	
	@FindBy(css = "#passwd")
	private WebElement txtPassword;
	
	@FindBy(css = "#SubmitLogin")
	private WebElement btnSubmit;
	
	//AddtoCart Dress
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement btnDresses;
		
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img")
	private WebElement btnView1;
	
	@FindBy(xpath="/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]")
	private WebElement btnMore1;
	
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
	private WebElement btnAddtoCart1;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
	private WebElement btnContinue1;
	
	//AddtoCart T-Shirts
	@FindBy(css="#block_top_menu > ul > li:nth-child(3) > a")
	private WebElement btnTShirts;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div")
	private WebElement btnView2;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]")
	private WebElement btnMore2;
	
	@FindBy(css="#add_to_cart > button")
	private WebElement btnAddtoCart2;
	
	//Proceed to Checkout
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	private WebElement btnCheckout;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]") 
	private WebElement btnCheckoutSum;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	private WebElement btnCheckoutAddress;
	
	@FindBy(xpath = "//*[@id=\"uniform-cgv\"]")
	private WebElement btnBoxShip;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	private WebElement btnCheckoutShip;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement btnPayBankWire;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	private WebElement btnConfirmPay;
	
	
	
	public void LoginPage(String email, String password) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.elementToBeClickable(btnSignIn));
		btnSignIn.click();
		js.executeScript("window.scrollBy(0,75)");
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
		btnSubmit.click();
	}
	
	public void AddToCart() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnDresses.click();
		js.executeScript("window.scrollBy(0,1000)");
		Actions action = new Actions(driver);
		action.moveToElement(btnView1).moveToElement(btnMore1).click().perform();
		js.executeScript("window.scrollBy(0,300)");
		btnAddtoCart1.click();
		btnContinue1.click();
		js.executeScript("window.scrollTo(0,0)");
		btnTShirts.click();
		js.executeScript("window.scrollBy(0,800)");
		action.moveToElement(btnView2).moveToElement(btnMore2).click().perform();
		btnAddtoCart2.click();
		btnCheckout.click();
		js.executeScript("window.scrollBy(0,800)");
		btnCheckoutSum.click();
		js.executeScript("window.scrollBy(0,800)");
		btnCheckoutAddress.click();
		js.executeScript("window.scrollBy(0,500)");
		btnBoxShip.click();
		btnCheckoutShip.click();
		js.executeScript("window.scrollBy(0,800)");
		btnPayBankWire.click();
		js.executeScript("window.scrollBy(0,800)");
		btnConfirmPay.click();
		
	}

}
