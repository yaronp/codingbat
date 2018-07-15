package com.yaronp.test;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class endUpTest extends Object {

    @Test
    public void endUpF() {
        assertThat(com.yaronp.endUp.endUpF("Hello"), equalTo("HeLLO"));
        assertThat(com.yaronp.endUp.endUpF("hi there"), equalTo("hi thERE"));
        assertThat(com.yaronp.endUp.endUpF("hi"), equalTo("HI"));

        assertThat(com.yaronp.endUp.stringTimes("Hi", 2), equalTo("HiHi"));
        assertThat(com.yaronp.endUp.stringTimes("Hi", 3), equalTo("HiHiHi"));

    }
}