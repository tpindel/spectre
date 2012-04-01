package com.spectre.core.acceptance.web.mvc.login;

public interface LoginAgent {

    boolean isLogged();

    void submit();

    void navigateToLoginPage();

}
