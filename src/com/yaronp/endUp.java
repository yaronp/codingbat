package com.yaronp;

public class endUp {

    public static void main(String[] args) {
        assert endUpF("Hello").equals("HeLLO");
        assert endUpF("hi there").equals("hi thERE");
        assert endUpF("hi").equals("HI");
        assert stringTimes("Hi", 2).equals("HiHi");
        assert stringTimes("Hi", 3).equals("HiHiHi");
    }
    private static String endUpF(String str) {
        if(str.length() < 3)
            return str.toUpperCase();
        else {
            return str.substring(0, str.length()-3) +
                    str.substring(str.length()-3, str.length()).toUpperCase();
        }
    }

    private static String stringTimes(String str, int n) {
        return n > 0 ? str + stringTimes(str,n-1) : str;
    }
}
