package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//To Provide TestData & Object of whole application
	public    WebDriver driver;
	//*******************TestData
	public String url = "http://183.82.103.245/nareshit/login.php";
	//public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	public String EFN = "selenium";
	public String ELN = "suresh";

	//*******************Objects
	public String txt_loginname = "txtUserName";
	public String txt_password  = "txtPassword";
	public String btn_login     = "Submit";
	public String link_logout   = "Logout";
	public String frame_empinfo   = "rightMenu";
	public String btn_Add       = "//input[@value='Add']";
	public String txt_EFN       = "txtEmpFirstName";
	public String txt_ELN       = "txtEmpLastName";
	public String btn_Save      = "btnEdit";


	}


