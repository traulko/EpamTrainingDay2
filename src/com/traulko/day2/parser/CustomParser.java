package com.traulko.day2.parser;

public class CustomParser {
    public int parseIntValue(String value) {
        int parsedIntValue = 0;
        try {
            parsedIntValue = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return parsedIntValue;
    }
}