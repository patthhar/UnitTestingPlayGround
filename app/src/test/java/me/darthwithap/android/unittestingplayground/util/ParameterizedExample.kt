package me.darthwithap.android.unittestingplayground.util

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(Parameterized::class)
class ParameterizedIsPalindrome(
  private val inputValue: String,
  private val expectedValue: Boolean
) {

  @Test
  fun testIsPalindrome() {
    val helper = Helper()
    val result = helper.isPalindrome(inputValue)
    assertEquals(expectedValue, result)
  }

  companion object {
    @JvmStatic
    @Parameters
    fun parameters(): List<Array<Any>> {
      return listOf(
        arrayOf("hello", false),
        arrayOf("name", false),
        arrayOf("level", true),
        arrayOf("", false),
        arrayOf("a", true),
      )
    }
  }
}