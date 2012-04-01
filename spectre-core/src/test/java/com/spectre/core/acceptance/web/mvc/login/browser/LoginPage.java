package com.spectre.core.acceptance.web.mvc.login.browser;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.spectre.core.acceptance.commons.agents.BrowserAgentDriver;
import com.spectre.core.acceptance.web.mvc.login.LoginAgent;

@Component
public class LoginPage implements LoginAgent {

    private static final String PAGE_URL_REGEXP = "^login";

    @Inject
    private BrowserAgentDriver driver;

    @Override
    public void submit() {
        ensureOnCurrentPage();
    }

    @Override
    public boolean isLogged() {
        ensureOnCurrentPage();
        return false;
    }

    private void ensureOnCurrentPage() {
        if (!isCurrentPage()) {
            throw new RuntimeException("not on order confirmation page");
        }
    }

    private boolean isCurrentPage() {
        return driver.getCurrentPagePath().matches(PAGE_URL_REGEXP);
    }

    @Override
    public void navigateToLoginPage() {
        driver.navigateTo("login");
    }
}
