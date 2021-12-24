package com.juaracoding.main;

import org.openqa.selenium.WebDriver;

import com.juaracoding.account.Account;
import com.juaracoding.addtocart.AddtoCart;
import com.juaracoding.driver.DriverSingleton;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com/index.php");
		
		//NOMOR 1
//		Account akun = new Account();
//		akun.menuAccount();
//		akun.menuInputData();
		
		//NOMOR 2	
		AddtoCart cart = new AddtoCart();
		cart.LoginPage("IlhamNgetest@test.com", "passing");
		cart.AddToCart();
		

	}

}
