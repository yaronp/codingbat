package com.yaronp;

public class in3050 {
    public static void main(String[] args) {
        in3050F(30, 41);
        assert in3050F(30, 31);
        assert !in3050F(30, 41);
        assert in3050F(40, 50);
    }

    private static boolean in3050F(int a, int b) {
        int low = a > b ? b : a;
        int high = b > a ? b : a;
        if (low >= 30 && high <= 40)
            return true;
        if (low >= 40 && high <= 50)
            return true;
        return false;
    }

}
