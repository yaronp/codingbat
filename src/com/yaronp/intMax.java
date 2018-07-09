package com.yaronp;

public class intMax {
    public static void main(String[] args) {
        assert intMaxF(1,2,3) == 3;
        assert intMaxF(1,3,2) == 3;
        assert intMaxF(3,2,1) == 3;
    }

    private static int intMaxF(int a, int b, int c) {
        if(a > b && a > c)  return a;
        else if (b > c) return b;
        else return c;
    }

}
