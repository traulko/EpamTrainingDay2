package com.traulko.day2.service;

public class PasswordService {
    private static final String SAMPLE_PASSWORD = "qwerty";

    public boolean isPasswordEqual(String password) {
        return password.equals(SAMPLE_PASSWORD);
    }
}
