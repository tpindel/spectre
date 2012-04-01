package com.spectre.core.acceptance.commons.agents;

import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.web.selenium.PropertyWebDriverProvider;
import org.springframework.stereotype.Component;

@Component
public class BrowserAgentDriverProvider extends PropertyWebDriverProvider {

    @BeforeStories
    public void beforeStories() throws Exception {
        initialize();
    }

    @AfterStories
    public void afterStories() throws Exception {
        get().quit();
    }

    @BeforeScenario
    public void beforeEachScenario() throws Exception {
        get().manage().deleteAllCookies();
    }
}
