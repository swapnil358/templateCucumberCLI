package com.asurion.qa.util;


import com.asurion.qa.constant.ConstantParams;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.json.simple.JSONObject;

import java.util.Map;

/**
     * Purpose: This class represents ApplicationConfiguration class.
     * Configuration class is responsible for setting pre prerequisite for execution of project.
     * Class also contains getters & setters methods.
     **/

    public class ApplicationConfiguration {
        // default environment
        private static final String DEFAULT_ENVIRONMENT = "qa";
        //private static final String DEFAULTBROWSER = "android";  //For UI testing on desktop
        // private static final String DEFAULTBROWSER = "apitest";          // private static final String DEFAULTBROWSER = "apitest";
        private static final String DEFAULT_BROWSER = "chrome";
// default run type
        private static final String DEFAULT_RUN_TYPE = "local";
        // default browser version
        private static final String DEFAULT_BROWSER_VERSION = "Any";
        private static final DateTime CURRENT_DATE = DateTime.now();

        private static String userType;
        private static String browser;
        private static String browserVersion;
        private static String runType;
        private static String region;
        private static ThreadLocal<ApplicationConfiguration> configuration = new ThreadLocal<>();
        private static ThreadLocal<Map> confia = new ThreadLocal<();
        private static Map<String, String> deviceConfig = null;
        private static String runMode = "STUB";
        private static ThreadLocal<String> carpier = ThreadLocal.withInitial(() -> "");
        private static String language = "English";
        private static int pageLoadTimeout = ConstantParams.THIRTY;
        private static int waitForEachElementTimeout = ConstantParams. ONE_TWENTY;
        private static String environment;
        private static ThreadLocal<String> apiName = new ThreadLocal<>();
        private static String graphApiName = "";
        private static String passEngcypKey = "PH4N3Cb81DQb61F1a358PCUED1X4DFMS" ;
        private static String defaultRegion="us";



        private static ThreadLocal<String> defaultConfidElleName = ThreadLocal.withInitial(() -> "configuration");
        private static JSONObject jsonobject = null;
        public static final String TEST_RUN_BROWSER_LABEL = "test.run.browser";
        public static final String TEST_RUN_TYPE_LABEL = "test.run.type";
        public static final String TEST_RUN_BROWSER_VERSION_LABEL = "test.run.browser.version";
        public static final String TEST_REGION_LABEL = "test.run.region";
        public static String loglevel = "INFO";
        public static final String BROWSERSTACK_LOCAL_IDENTIFIER = "Test12Automation";
        public String parameterProperty = "/TAS/browserstack/UNAMEKEX" ;


       /**
                * enum to set browser names
        */
        private enum BrowserNames {
                ANDROID, IOS, IOSCHROME, ANDROIDCHROME, CHROME, FIREFOX, IE, SAFARI;
        }

                public static Logger log = LogManager. getLogger (ApplicationConfiguration. class. getName());


                private ApplicationConfiguration(String environment) {
                        log.info("In ApplicationConfiguration with (String environment");
                        String testRunBrowser = System.getProperty(ApplicationConfiguration.TEST_RUN_BROWSER_LABEL);
                        String testRunType = System.getProperty(ApplicationConfiguration.TEST_RUN_TYPE_LABEL);
                        String testRunBrowserVersion = System.getProperty(ApplicationConfiguration.TEST_RUN_BROWSER_VERSION_LABEL);
                        String testraySync = System.getProperty("test.run.xraySync");

                        ApplicationConfiguration.environment = environment;
                        ApplicationConfiguration.browser = Utilitles.isNullOrEmptyOrNullString（testRunBrowser）?
                        DEFAULT_BROWSER:
                        testRunBrowser;
                        ApplicationConfiguration.browserVersion = Utilities.isNullOrEmptyOrNullstring(testRunBrowser) ?
                                DEFAULT_BROWSER_VERSION : testRunBrowserVersion;
                        ApplicationConfiguration.runType = Utilities.isNullOrEmptyOrNullString(testRunBrowser) ? DEFAULT_RUN_TYPE : testRuntype;
                }

        /**
         * THis method return runtype
         * @return Runtype like local, grid
         */

        public static String getRunType(){
                        return runType;
                }

/**
 * this method return defualt browser
 * @return like chrom/firefox/ie
 */

public static String getDefault_browser(){
    return DEFAULT_BROWSER;
}

    /**
     * this mmethod set runtype
     * @param runType like local, grid
     */
    public static void setRunType(String runType) {
        ApplicationConfiguration.runType = runType;
    }

    /**
     * This method sets runtype
     * @param jsonObject json object is outof graph api
     */
    public static void setJsonObject(JSONObject jsonObject) {
        ApplicationConfiguration.jsonobject = jsonObject;
    }

    /**
     * This method return browserversion
     * @return browser version lik 69, 70 or anythinf
     */
    public static String getBrowserVersion(){
        return browserVersion;
    }



}
