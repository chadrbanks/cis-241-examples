package com.example.cis_241_examples

import org.junit.Assert
import org.junit.Test

class MathTest {

    @Test
    fun addition_isCorrect() {
        // Assemble
        val subject = Math()

        // Act
        val result = subject.add(1, 1)

        // Assert
        Assert.assertEquals(2, result)
    }

    @Test
    fun addition_isCorrect2() {
        // Assemble
        val subject = Math()

        // Act
        val result = subject.add(504, 107)

        // Assert
        Assert.assertEquals(611, result)
    }

    @Test
    fun addition_isCorrect3() {
        // Assemble
        val subject = Math()

        // Act
        val result = subject.add(-504, 504)

        // Assert
        Assert.assertEquals(0, result)
    }

    @Test
    fun subtraction_isCorrect() {
        // Assemble
        val subject = Math()

        // Act
        val result = subject.sub(10, 5)

        // Assert
        Assert.assertEquals(5, result)
    }
}