package com.ezcun.code.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


/**
 * @author Huangtian
 * @create 2019-01-24 9:56
 */
public class LoginPage extends Page {
    /**
     * 首页登录元素
     */
    @FindBy(xpath = "//span[text()=\"登录\"]")
    WebElement loginele;
    @FindBy(id = "loginName")
    WebElement loginName;
    @FindBy(id = "loginPwd")
    WebElement loginPwd;
    @FindBy(id = "login")
    WebElement login;

    @BeforeMethod
    public void getUrl() {
        driver.get("https://www.ezcun.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void login(String username, String password) {
        loginele.click();
        loginName.sendKeys(username);
        loginPwd.sendKeys(password);
        login.click();
    }
}
