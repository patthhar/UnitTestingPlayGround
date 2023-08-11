package me.darthwithap.android.unittestingplayground.util

import org.junit.Assert.*
import org.junit.Test

class HelperTest {
  @Test
  fun isPalindromeTest() {
    val helper = Helper()
    val result = helper.isPalindrome("level")
    assertEquals(true, result)
  }
}