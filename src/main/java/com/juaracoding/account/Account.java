package com.juaracoding.account;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.driver.DriverSingleton;

public class Account {
	
	private WebDriver driver;
	
	public Account() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Button Sign In
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info")
	private WebElement btnSignIn;
	
	@FindBy(css = "#email_create")
	private WebElement txtEmail;
	
	@FindBy(css = "#SubmitCreate")
	private WebElement btnCreate;
	
	//Input Data
	@FindBy(xpath = "//div[@class='radio-inline'][1]/label[@class='top'][1]")
	private WebElement btnGender;
	
	@FindBy(css = "#customer_firstname")
	private WebElement txtFirstName;
	
	@FindBy(css = "#customer_lastname")
	private WebElement txtLastName;
	
	@FindBy(css = "#passwd")
	private WebElement txtPwd;
	
	@FindBy(xpath = "//select[@id='days']")
	private WebElement txtDateofBirthDays;
	
	@FindBy(xpath = "//select[@id='months']")
	private WebElement txtDateofBirthMonths;
	
	@FindBy(xpath  = "//select[@id='years']")
	private WebElement txtDateofBirthYears;
	
	@FindBy(css = "#uniform-newsletter")
	private WebElement btnBox1;
	
	@FindBy(css = "#uniform-optin")
	private WebElement btnBox2;	
	
	//Your Address
	@FindBy(css = "#firstname")
	private WebElement txtFirstName2;
	
	@FindBy(css = "#lastname")
	private WebElement txtLastName2;	
	
	@FindBy(css = "#company")
	private WebElement txtCompany;
	
	@FindBy(css = "#address1")
	private WebElement txtAddress;
	
	@FindBy(css = "#address2")
	private WebElement txtAdress2;
	
	@FindBy(css = "#city")
	private WebElement txtCity;
	
	@FindBy(css = "#id_state")
	private WebElement btnState;
	
	@FindBy(css = "#postcode")
	private WebElement txtCode;
	
	@FindBy(css = "#id_country")
	private WebElement btnCountry;
	
	@FindBy(css = "#other")
	private WebElement txtAddInfo;
	
	@FindBy(css = "#phone")
	private WebElement txtPhone;
	
	@FindBy(css = "#phone_mobile")
	private WebElement txtPhoneMobile;
	
	@FindBy(css = "#alias")
	private WebElement txtAlias;
	
	@FindBy(css = "#submitAccount")
	private WebElement btnRegister;
	
	public void menuAccount() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.elementToBeClickable(btnSignIn));
		btnSignIn.click();
		js.executeScript("window.scrollBy(0,50)");
		txtEmail.sendKeys("IlhamNgetest1@test.com");
		js.executeScript("window.scrollBy(0,500)");
		btnCreate.click();
	}
	
	public void menuInputData() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnGender.click();
		js.executeScript("window.scrollBy(0,50)");
		txtFirstName.sendKeys("Test First");
		txtLastName.sendKeys("Test Last");
		txtPwd.sendKeys("passing");
		js.executeScript("window.scrollBy(0,50)");
		txtDateofBirthDays.click();
		new Select(txtDateofBirthDays).selectByValue("7");
		txtDateofBirthMonths.click();
		new Select(txtDateofBirthMonths).selectByValue("2");
		txtDateofBirthYears.click();
		new Select(txtDateofBirthYears).selectByValue("2000");
		btnBox1.click();
		btnBox2.click();
		
		txtFirstName2.sendKeys("Test First");
		txtLastName2.sendKeys("Test Last");
		txtCompany.sendKeys("PT. Testing");
		txtAddress.sendKeys("Jalan Pahlawan");
		js.executeScript("window.scrollBy(0,50)");
		txtAdress2.sendKeys("Jalan Kyai Saleh");
		txtCity.sendKeys("Semarang");
		btnState.click();
		new Select(btnState).selectByValue("2");
		txtCode.sendKeys("11111");
		btnCountry.click();
		new Select(btnCountry).selectByValue("21");
		js.executeScript("window.scrollBy(0,50)");
		txtAddInfo.sendKeys("Testing Testing");
		txtPhone.sendKeys("021-5552223");
		txtPhoneMobile.sendKeys("081555423218");
		txtAlias.clear();
		txtAlias.sendKeys("Testing");
		js.executeScript("window.scrollBy(0,50)");
		wait.until(ExpectedConditions.elementToBeClickable(btnRegister));
		btnRegister.click();
	}
	
	
	


}
