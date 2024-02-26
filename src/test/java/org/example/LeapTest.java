package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapTest {

    @Test
    void ist_durch_400_teilbar (){

        //given
        Leap leap = new Leap();
        int test = 2000;

        //when
        boolean actual = leap.leapyear(test);

        //then
        assertTrue(actual);
    }

    @Test
    void ist_durch_4_und_nicht_durch_100_teilbar (){

        //given
        Leap leap = new Leap();
        int test = 2004;

        //when
        boolean actual = leap.leapyear(test);

        //then
        assertTrue(actual);
    }


    @Test
    void ist_durch_4_und_durch_100_teilbar (){

        //given
        Leap leap = new Leap();
        int test = 1900;

        //when
        boolean actual = leap.leapyear(test);

        //then
        assertFalse(actual);
    }




}