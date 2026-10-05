
package com.training.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay1 {

    public static void main(String[] args) {

        // Setup FirefoxDriver
        WebDriverManager.firefoxdriver().setup();

        // Set Firefox browser path
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox");

        // Open Firefox
        WebDriver driver = new FirefoxDriver(options);

        // Maximize browser
        driver.manage().window().maximize();

        // Open application
        driver.get("https://selenium-prd.firebaseapp.com/");

        // Enter Email
        WebElement email = driver.findElement(By.id("email_field"));
        email.sendKeys("admin123@gmail.com");

        // Enter Password
        WebElement password = driver.findElement(By.id("password_field"));
        password.sendKeys("admin123");

        // Click Login
        WebElement loginButton = driver.findElement(
                By.xpath("//button[contains(text(),'Login to Account')]")
        );

        loginButton.click();

        // Close browser
        //driver.quit();
    }
}

