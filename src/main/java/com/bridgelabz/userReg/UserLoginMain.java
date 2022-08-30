package com.bridgelabz.userReg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLoginMain {
    public static boolean FirstNameValidator(String name)
    {
        String y="^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(name);
        if(matcher.find())
            return true;
        else
            return false;
    }




}