package com.telran.tests;

import com.telran.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {
    LoginPage login;

    @Before

    public void setUp() {
        login = new LoginPage();
    }

    @Test
    public void loginPositiveTest(){
        login.with ("ira@web.de","Ira123123_");
        login.validLogin();

    }
@Test
    public void loginNegativeTest(){
        login.with ("ira@web.de","Ira123123_123");
        login.invalidLogin();
}
}
