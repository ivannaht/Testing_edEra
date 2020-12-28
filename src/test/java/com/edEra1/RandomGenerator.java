package com.edEra1;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;


public class RandomGenerator {


    public RandomGenerator() {
    }



    @Test
        public String generatingRandomStringName () {
            String randomStringName =
                    RandomStringUtils.randomAlphabetic(8)
                            + " "
                            + RandomStringUtils.randomAlphabetic(10);
            return randomStringName;

        }


    @Test
        public String generatingRandomStringEmail() {
            String ranmdomEmail = "asdn" + RandomStringUtils.randomAlphanumeric(4) + "@.i.ua";
            return ranmdomEmail;
        }
    }



