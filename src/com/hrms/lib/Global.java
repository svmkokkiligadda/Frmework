package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	// To provide test data & object whole application
	public WebDriver driver;
	//****************test data
	
	//Login Data
	public String url="http://183.82.103.245/nareshit/login.php";
	public String un="nareshit";
	public String pw="nareshit";
	
	//AddEmployee
	public String EFN="selenium";
	public String ELN="suresh";
	
	//*************objects
	
	//Login Data
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	
	//AddEmployee
	public String Frame_empinfo="rightMenu";
	public String btn_Add = "//input[@value='Add']";
	public String txt_EFN ="txtEmpFirstName";
	public String txt_ELN ="txtEmpLastName";
	public String btn_Save="btnEdit";
}
