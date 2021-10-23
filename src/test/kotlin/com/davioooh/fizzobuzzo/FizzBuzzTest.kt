package com.davioooh.fizzobuzzo

import com.davioooh.fizzobuzzo.FizzBuzz.GameRule.BuzzRule
import com.davioooh.fizzobuzzo.FizzBuzz.GameRule.FizzRule
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    @Test
    fun `test default 100`() {
        val fizzBuzz = FizzBuzz.of()
        assertEquals(
            "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, " +
                    "11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, " +
                    "Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, " +
                    "31, 32, Fizz, 34, Buzz, Fizz, 37, 38, Fizz, Buzz, " +
                    "41, Fizz, 43, 44, Fizz Buzz, 46, 47, Fizz, 49, Buzz, " +
                    "Fizz, 52, 53, Fizz, Buzz, 56, Fizz, 58, 59, Fizz Buzz, " +
                    "61, 62, Fizz, 64, Buzz, Fizz, 67, 68, Fizz, Buzz, " +
                    "71, Fizz, 73, 74, Fizz Buzz, 76, 77, Fizz, 79, Buzz, " +
                    "Fizz, 82, 83, Fizz, Buzz, 86, Fizz, 88, 89, Fizz Buzz, " +
                    "91, 92, Fizz, 94, Buzz, Fizz, 97, 98, Fizz, Buzz",
            fizzBuzz.play()
        )
    }

    @Test
    fun `test 35`() {
        val fizzBuzz = FizzBuzz.of(35)
        assertEquals(
            "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, " +
                    "11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, " +
                    "Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, " +
                    "31, 32, Fizz, 34, Buzz",
            fizzBuzz.play()
        )
    }

    @Test
    fun `test 50 foo bar`() {
        val fizzBuzz = FizzBuzz.of(n = 50, fizzRule = FizzRule(word = "Foo"), BuzzRule(word = "Bar"))
        assertEquals(
            "1, 2, Foo, 4, Bar, Foo, 7, 8, Foo, Bar, " +
                    "11, Foo, 13, 14, Foo Bar, 16, 17, Foo, 19, Bar, " +
                    "Foo, 22, 23, Foo, Bar, 26, Foo, 28, 29, Foo Bar, " +
                    "31, 32, Foo, 34, Bar, Foo, 37, 38, Foo, Bar, " +
                    "41, Foo, 43, 44, Foo Bar, 46, 47, Foo, 49, Bar",
            fizzBuzz.play()
        )
    }

    @Test
    fun `test 40 (foo 2) (bar 7)`() {
        val fizzBuzz = FizzBuzz.of(n = 40, FizzRule(divisor = 2, word = "Foo"), BuzzRule(divisor = 7, word = "Bar"))
        assertEquals(
            "1, Foo, 3, Foo, 5, Foo, Bar, Foo, 9, Foo, " +
                    "11, Foo, 13, Foo Bar, 15, Foo, 17, Foo, 19, Foo, " +
                    "Bar, Foo, 23, Foo, 25, Foo, 27, Foo Bar, 29, Foo, " +
                    "31, Foo, 33, Foo, Bar, Foo, 37, Foo, 39, Foo",
            fizzBuzz.play()
        )
    }
}