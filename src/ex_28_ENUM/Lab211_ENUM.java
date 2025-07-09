package ex_28_ENUM;

import java.sql.SQLOutput;

public class Lab211_ENUM {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_password.getLocators());
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Colors.RED.getHexcode());
        System.out.println(APIRealLifeURLs.google.getUrl());
        System.out.println(APIRealLifeURLs.vwo.getUrl());
    }
}
