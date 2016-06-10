package executableMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PagelessActions extends Notifications{
	
	public static void login(String username, String password, WebDriver driver) {
		//for loadapp.iformbuilder.com sign in button
		driver.findElement(By.xpath("//img[@src='https://iform-artwork.s3.amazonaws.com/load.iformbuilder.com/sign_in.png']")).click();
		driver.findElement(By.name("USERNAME")).sendKeys(username); //fill USERNAME field
		driver.findElement(By.name("PASSWORD")).sendKeys(password); //fill PASSWORD field
		//click login button
		driver.findElement(By.xpath("//input[@src='https://iform-artwork.s3.amazonaws.com/load.iformbuilder.com/login.png']")).click();
	}
	
	public static void logout(WebDriver driver){
		
		//click logout button
		driver.findElement(By.xpath("//img[@src='https://iform-artwork.s3.amazonaws.com/load.iformbuilder.com/logout.png']")).click();
		
	}
	
	public static void navigateTo(String tabName, WebDriver driver){
		
		String location = tabName.toLowerCase();
		
		switch (location) { //depending on passed 
		case "data":
			driver.findElement(By.linkText("Data")).click();
			break;
		case "form assignment":
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Form Assignment")).click();
			break;
		case "form builder":
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Form Builder")).click();
			break;
		case "form group":
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Form Group")).click();
			break;
		case "localization":
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Localization")).click();
			break;
		case "scoring":
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Scoring")).click();
			break;
		case "package builder": //INCOMPLETE
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Form Packages")).click();
			driver.findElement(By.linkText("Package Builder")).click();
			break;
		case "package import":
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Form Packages")).click();
			driver.findElement(By.linkText("Package Import")).click();
			break;
		case "notifications":
			driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.linkText("Notifications")).click();
			break;
		case "add/edit users":
			driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.linkText("Add/Edit Users")).click();
			break;
		case "my profile":
			driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.linkText("My Profile")).click();
			break;
		case "user group":
			driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.linkText("User Group")).click();
			break;
		case "company info":
			driver.findElement(By.linkText("Company")).click();
			driver.findElement(By.linkText("Company Info")).click();
			break;
		case "license":
			driver.findElement(By.linkText("Company")).click();
			driver.findElement(By.linkText("License")).click();	
			break;
		case "api apps":
			driver.findElement(By.linkText("Company")).click();
			driver.findElement(By.linkText("API Apps")).click();
			break;
		case "billing":
			driver.findElement(By.linkText("Company")).click();
			driver.findElement(By.linkText("Billing")).click();	
			break;
		case "fb v2":
			driver.findElement(By.linkText("Support")).click();
			driver.findElement(By.linkText("FB V2")).click();
			break;
		case "ol v2":
			driver.findElement(By.linkText("Support")).click();
			driver.findElement(By.linkText("OL V2")).click();
			break;
		case "home":
			driver.get("https://loadapp.iformbuilder.com/");
			break;
		case "homepage":
			driver.get("https://loadapp.iformbuilder.com/");
			break;
		default:
			System.out.println("method \'navigateTo\' in pagelessActions.java incorrect input \'" + location + "\'");		
		}
	}
}