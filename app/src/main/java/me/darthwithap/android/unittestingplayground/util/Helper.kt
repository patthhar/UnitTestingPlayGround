package me.darthwithap.android.unittestingplayground.util

class Helper {
  fun isPalindrome(str: String): Boolean {
    if (str.isEmpty()) return false
    var i = 0
    var j = str.length - 1

    while (i < j) {
      if (str[i] != str[j]) {
        return false
      }
      i++
      j--
    }
    return true
  }
}