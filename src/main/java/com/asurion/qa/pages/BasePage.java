package com.asurion.qa.pages;

import com.asurion.qa.steps.HomePageTest;
import com.asurion.qa.util.ApplicationConfiguration;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.logging.Logger;

public class BasePage {

    /**
     * THis class represents BasePage
     * It contains specific veriable, methods, object
     * This class contains webDriver calls, navigate methods & current system date
     */

    public static Logger log = java.util.logging.Logger.getLogger(HomePageTest.class.getName());

int counter= 0;

protected ThreadLocal<TestDriver> driver = new ThreadLocal<>();
    public static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(BasePage.class.getName());

    @FindBy(className = "tickit-logo")
    private static WebElement appLogo;
    @FindBy (className = "tickit-waitingIndicator")
    private static WebElement loader;
    @FindBy(css = ". css-kjof9i-menu div div")
    private static List<WebElement> dropdownValues;

    @FindBy(id = "follow-up-checkbox")
    private static WebElement createFollowUpChkBox;

    @FindBy(xpath = "//*I@class='side-panel-header']//buttonl@title='Emails']")
    private static WebElement emails;

    @FindBy(xpath = "//*[@placeholder='Followup Date']")
    private static WebElement dateTextBox;

    /**
     * Base pafe constructor responsible for to launch or not to lunch web browser & instantiating PageFactory pattern.
     * If user is running UI test case then ApplicationConfiguration.browser should be chrome/firefox/ie and in case of database/api testing
     * the ApplicationConfiguration. browser should be dbtest/apitest as per type test case(db or restAPI)
     */
    public BasePage(){
        ApplicationConfiguration.get
    }
}
