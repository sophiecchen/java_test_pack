// run mvn clean install to package

package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public boolean alphabet(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+at");
        Matcher matcher = pattern.matcher(text);
        boolean matchFound = matcher.find();
        if(matchFound) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numbers(String text) {
        Pattern pattern = Pattern.compile("[1-9][0-9]*%");
        Matcher matcher = pattern.matcher(text);
        boolean matchFound = matcher.find();
        if(matchFound) {
            return true;
        } else {
            return false;
        }
    }
}
