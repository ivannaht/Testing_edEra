package com.edEra1;

import org.junit.Test;

public class TestString {

    @Test
    public void TestString() {
        RandomGenerator randomStringName = new RandomGenerator();
        String name = randomStringName.generatingRandomStringName();
        System.out.println(name);
    }
}
