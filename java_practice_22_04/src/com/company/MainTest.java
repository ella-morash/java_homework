package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class MainTest {

    @Test
    void CheckIfLengthIfUpperCase() {
        String words =  "aaa BBBB dEfxc";
        String expected = "AAA BBBB dEfxc";

        System.out.println(expected.equals(Main.transformString(words,new ToUpperCase())));
        Assertions.assertEquals(expected,Main.transformString(words,new ToUpperCase()));

    }

    @Test
    void CheckIfLengthIfLowerCase() {
        String words =  "aaa BBBB dEfxc";
        String expected = "aaa bbbb dEfxc";
        Assertions.assertEquals(expected,Main.transformString(words,new ToLowerCase()));

    }

    @Test
    void CheckIfLengthIfAsterisks() {
        String words =  "aaa BBBB dEfxc";
        String expected = "aaa BBBB *****";
        Assertions.assertEquals(expected,Main.transformString(words,new ToAsterisks()));

    }



}