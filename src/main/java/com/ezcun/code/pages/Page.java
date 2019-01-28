package com.ezcun.code.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * @author Huangtian
 * @create 2019-01-24 10:01
 */
public class Page {
    WebDriver driver = new ChromeDriver();

    public Page() {
        System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
        PageFactory.initElements(driver, this);
    }

}
