package com.yaronp.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import com.yaronp.close10;

public class close10Test extends Object {

    @org.junit.Test
    public void close10F() {
        assertThat("8 is closer then 13",          close10.close10F( 8, 13),  is(8) );
        assertThat("8 is closer then 13 opposite", close10.close10F(13,  8) , is( 8));
        assertThat("7 & 13 are equal",             close10.close10F(13,  7) , is( 0));

    }
}