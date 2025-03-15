package com.test.automate.desktop;

import org.testng.annotations.Test;

import com.test.base.WebBaseTest;
import com.utils.AppUtils;

public class ExecutorTest extends WebBaseTest {

    @Test
    public void executorTest() {
        driver.get("https://www.browserstack.com/");
        String sessionId = driver.getSessionId().toString();
        AppUtils.executeScript(sessionId, "window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' })");
    }

}