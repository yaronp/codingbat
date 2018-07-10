package com.yaronp;

import java.util.List;

public class doubling {


    public static void main(String[] args) {
        /*
        doubling([1, 2, 3]) → [2, 4, 6]
        doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
        doubling([]) → []
        */
    }
    public List<Integer> doublingF(List<Integer> nums) {
            nums.replaceAll(n -> n * 2);
            return nums;

    }

}
