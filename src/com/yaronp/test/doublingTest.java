package com.yaronp.test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import com.yaronp.doubling;

import java.util.Arrays;
import java.util.List;

public class doublingTest extends Object {

    @Test
    public void doublingF() {
        List<Integer> input    = Arrays.asList(1,2,3);
        List<Integer> expected = Arrays.asList(2, 4, 6);

        assertThat(doubling.doublingF(input), is(expected));

        List<Integer> input1    = Arrays.asList(6, 8, 6, 8, -1);
        List<Integer> expected1 = Arrays.asList(12, 16, 12, 16, -2);

        assertThat(doubling.doublingF(input1), is(expected1));
    }
}