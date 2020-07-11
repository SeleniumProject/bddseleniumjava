package com.demowebshop.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demowebshop.testBase.TestBase;

public class RegisterPage {

	/*
	 *  Page Object Model
	 *  a. Page Object Method
	 *  b. Page Factory.
	 */
	public static WebDriver driver;
	
	 By registerh1 = By.xpath("//*[@class='page-title']/h1");
	  By registerlink = By.xpath("//*[@class='ico-register']");
	  By gendermalerbtn = By.id("gender-male");
	  By firstNametxt = By.id("FirstName");
	  By lastNametxt = By.id("LastName");
	  By emailtxt = By.id("Email");
	  By passtxt = By.id("Password");
	  By confirmpasstxt = By.id("ConfirmPassword");
	  By registerbtn = By.id("register-button");
	  By registererrormsg = By.xpath("//*[@class='field-validation-error']/span");
	 
	  
	  // Name of Each Element
	  String registerlinknm = "Register Link";
	  String gendermalenm ="Gender Male";
	  String firstnamenm ="First name:";
	  String lastnamenm ="Last name:";
	  String emailnm ="Email:";
	  String passnm ="Password:";
	  String confpassnm ="Confirm Password:";
	  String registerbtnnm ="Register button";
	  String registererrormsgnm ="Error message";
	  
	  public RegisterPage(WebDriver driver) {
		
		  this.driver = driver;
	}
	  
	  public String getTitle() {
		  return driver.getTitle();
	  }
	  
	  public String getCurrentUrlPage() {
		  return driver.getCurrentUrl();
	  }
	 public void clickRegisterLink() {
		 TestBase.click(driver, registerlink, registerlinknm);
	 }
	 
	 public void clickGenderMale() {
		 TestBase.click(driver, gendermalerbtn, gendermalenm);
	 }
	 
	 public void EnterFirstName(String fname) {
		 TestBase.EnterText(driver, firstNametxt, fname, firstnamenm);
	 }
	 
	 public void EnterLastName(String lname) {
		 TestBase.EnterText(driver, lastNametxt, lname, lastnamenm);
	 }
	 
	 public void EnterEmail() {
		 String email = TestBase.randomEmail();
		 TestBase.EnterText(driver, emailtxt, email, emailnm);
	 }
	 
	 public void EnterPassword(String pwd) {
		 TestBase.EnterText(driver, passtxt, pwd, passnm);
	 }
	 
	 public void EnterConfirmPassword(String conpwd) {
		 TestBase.EnterText(driver, confirmpasstxt, conpwd, confpassnm);
	 }
	 
	 public void clickRegisterbtn() {
		 TestBase.click(driver, registerbtn, registerbtnnm);
	 }
	 
	 public String firstNameError() {
		 List<WebElement> li = driver.findElements(By.xpath("//*[@class='field-validation-error']/span"));
		 li.get(0).getText();
		 return li.get(0).getText();
	 }
	 
	 public String lastNameError() {
		 List<WebElement> li = driver.findElements(By.xpath("//*[@class='field-validation-error']/span"));
		 li.get(0).getText();
		 return li.get(1).getText();
	 }
	 public String emailerror() {
		 List<WebElement> li = driver.findElements(By.xpath("//*[@class='field-validation-error']/span"));
		 li.get(0).getText();
		 return li.get(2).getText();
	 }
	 
	 public String passworderror() {
		 List<WebElement> li = driver.findElements(By.xpath("//*[@class='field-validation-error']/span"));
		 li.get(0).getText();
		 return li.get(3).getText();
	 }
	 
	 public String confpassworderror() {
		 List<WebElement> li = driver.findElements(By.xpath("//*[@class='field-validation-error']/span"));
		 li.get(0).getText();
		 return li.get(4).getText();
	 }
	 public String getregistererrormsg(String errormsg) {
		List<WebElement> li = driver.findElements(registererrormsg);
		for (WebElement webElement : li) {
			if (webElement.getText().equals(errormsg)) {
				return errormsg;
			}
		}
		return errormsg;
	 }
	
	
}
