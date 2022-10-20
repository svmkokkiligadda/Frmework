package com.hrms.lib;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;


import com.hrms.utility.Log1;

public class General extends Global {
	//To provide all re-usable functions/methods of whole application
	public void openApplication() {
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");// console
		Reporter.log("Application opened");//html report
		Log1.info("Open Applicatin");//log file
	
	}
	public void CloseApplication(){
		driver.close();
		System.out.println("Application closed");//console
		Reporter.log("Application closed");//html reports
		Log1.info("close Application");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login completed");	
		Log1.info("login Completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout completed");	
		Log1.info("logout Completed");
	}
	
	//add new employee
	public void enterframe() 
	{
		driver.switchTo().frame(Frame_empinfo);
		System.out.println("enter into frame");
		Log1.info("enter into frame");
		
	}
	public void exitframe() {
	driver.switchTo().defaultContent();
	System.out.println("exit from frame");
	Log1.info("exit from frame");
	}
		
public void addnewemp() {
	driver.findElement(By.xpath(btn_Add)).click();
	driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
	driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
	driver.findElement(By.id(btn_Save)).click();
	System.out.println("new emp added");
	Log1.info("Add new employee");
}	
}