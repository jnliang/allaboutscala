package com.crackcode

object OneEditAway extends App {


  println(isOneAway("abdc", "abcd"))

  def isOneAway(s1: String, s2: String): Boolean = {

    if (s1.length == s2.length)
      checkReplacement(s1, s2)
    else if (s1.length - s2.length == 1)
      checkInsertion(s1, s2)
    else if (s2.length - s1.length == 1)
      checkInsertion(s2, s1)
    else
      false
  }

  def checkReplacement(str1: String, str2: String): Boolean = {

    var defFound = false

    for (i <- 0 until str1.length) {

      if (str1.charAt(i) != str2.charAt(i)) {
        if (defFound)
          return false
        defFound = true
      }
    }
    true
  }

  def checkInsertion(str1: String, str2: String): Boolean = {

    var index1 = 0
    var index2 = 0

    while (index1< str1.length && index2<str2.length) {

      if (str1.charAt(index1) != str2.charAt(index2)) {

        if (index1 != index2)
          return false
        else {
          index1 += 1
        }
      } else {
        index1 += 1
        index2 += 1
      }
    }

    true
  }
}
