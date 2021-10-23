package com.davioooh.fizzobuzzo

import com.davioooh.fizzobuzzo.FizzBuzz.GameRule.BuzzRule
import com.davioooh.fizzobuzzo.FizzBuzz.GameRule.FizzRule

class FizzBuzz private constructor(
    val n: Int = 100,
    val fizzRule: FizzRule = FizzRule(),
    val buzzRule: BuzzRule = BuzzRule()
) {
    fun play(): String {
        return (1..n).joinToString {
            when {
                fizzRule.isMetBy(it) && buzzRule.isMetBy(it) -> "${fizzRule.word} ${buzzRule.word}"
                buzzRule.isMetBy(it) -> buzzRule.word
                fizzRule.isMetBy(it) -> fizzRule.word
                else -> it.toString()
            }
        }
    }

    companion object {
        fun of(
            n: Int = 100,
            fizzRule: FizzRule = FizzRule(),
            buzzRule: BuzzRule = BuzzRule()
        ): FizzBuzz {
            require(n >= 1)

            return FizzBuzz(n, fizzRule, buzzRule)
        }
    }

    sealed class GameRule(
        open val divisor: Int,
        open val word: String
    ) {
        fun isMetBy(number: Int): Boolean = number % this.divisor == 0

        data class FizzRule(
            override val divisor: Int = 3,
            override val word: String = "Fizz"
        ) : GameRule(divisor, word)

        data class BuzzRule(
            override val divisor: Int = 5,
            override val word: String = "Buzz"
        ) : GameRule(divisor, word)
    }
}
