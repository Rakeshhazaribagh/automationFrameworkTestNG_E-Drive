package com.hrms.lib;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.utility.Log;

public class General extends Global{
	
		//To provide all Re-usable fun:/methods of whole application
		public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "E:\\4.automtion\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");//console
		Reporter.log("Application Opened"); //html Report
		Log.info("Application Opened"); //logfile
		}
		public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		//Log.info(" Application closed");
		}
		public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Log.info("Login completed ");
		}
		public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info(" Logout completed");
		}
		public void enterFrame() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Enter into frame");
		Log.info(" Enter into frame");
		}
		public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info(" exit from frame");
		}
		public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
		driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
		driver.findElement(By.id(btn_Save)).click();
		System.out.println("New Emp Added");
		Log.info(" Add new emp");
		}

}
