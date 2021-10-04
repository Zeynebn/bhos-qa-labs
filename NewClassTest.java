import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class NewClassTest {package com.gradle.tutorial;
import org.junit.Assert;
import org.junit.Test;

    public class FizzBuzzTest {
        @Test
        public void FizzBuzzNormalNumbers() {

            FizzBuzzProcessor fb = new FizzBuzzProcessor();
            Assertions.assertEquals("1", fb.convert(1));
            Assertions.assertEquals("2", fb.convert(2));
        }

        @Test
        public void FizzBuzzThreeNumbers() {

            FizzBuzzProcessor fb = new FizzBuzzProcessor();
            Assert.assertEquals("Fizz", fb.convert(3));
        }

        @Test
        public void FizzBuzzFiveNumbers() {

            FizzBuzzProcessor fb = new FizzBuzzProcessor();
            Assert.assertEquals("Buzz", fb.convert(5));
        }

        @Test
        public void FizzBuzzThreeAndFiveNumbers() {

            FizzBuzzProcessor fb = new FizzBuzzProcessor();
            Assert.assertEquals("Buzz", fb.convert(5));
        }
    }

