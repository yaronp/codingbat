package com.yaronp;

public class maxSpan {

    public static void main(String[] args) {
        final int testVals[][] = {
                {3, 3, 3},
                {3, 9, 3},
                {3, 3},
                {1},
                {1, 4, 2, 1, 4, 1, 4},
                {1, 4, 2, 1, 4, 4, 4}
        };
        final int expectedRets[] = {3, 3, 1, 2, 6, 6};

        for (int i = 0; i < expectedRets.length; i++) {
            maxSpanF(testVals[i]);
            assert maxSpanF(testVals[i]) == expectedRets[i];
        }
    }

    private static int maxSpanF(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;

            while(nums[i] != nums[j])
                j--;

            int span = j - i + 1;

            if(span > max)
                max = span;
        }

        return max;
    }
}
