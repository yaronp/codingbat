package com.yaronp;

public class close10 {
    public static void main(String[] args) {

    }

    public static int close10F(int a, int b) {
        if (Math.abs(10 - a) < Math.abs(10 - b))
            return a;
        if (Math.abs(10 - b) < Math.abs(10 - a))
            return b;
        return 0;

    }

}
