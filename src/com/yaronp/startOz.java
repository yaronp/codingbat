package com.yaronp;

public class startOz {

    public static void main(String[] args) {
        assert startOzF("ozymandias").equals("oz");
        assert startOzF("bzoo").equals("z");
        assert startOzF("oxx").equals("o");
    }

    private static String startOzF(String str) {
        switch(str.length()) {
            case 0:
                return "";
            case 1:
                return (str.charAt(0) == 'o') ? "o" : "";
            default:
                return ((str.charAt(0) == 'o') ? "o" : "") + ((str.charAt(1) == 'z') ? "z" : "");
        }
    }

}
