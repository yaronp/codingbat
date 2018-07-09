package com.yaronp;

public class close10 {
    public static void main(String[] args) {
        assert close10F(8, 13) == 8;
        assert close10F(13, 8) == 8;
        assert close10F(13, 7) == 0;


    }

    private static int close10F(int a, int b) {
        if (Math.abs(10 - a) < Math.abs(10 - b))
            return a;
        if (Math.abs(10 - b) < Math.abs(10 - a))
            return b;
        return 0;

    }

}
