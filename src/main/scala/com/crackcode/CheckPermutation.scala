package com.crackcode

object CheckPermutation extends App {

  println("ABC - CAB: " + checkPermutation("ABC", "CAB"))
  println("ABC - CABD: " + checkPermutation("ABC", "CABD"))
  println("ABCD - CABE: " + checkPermutation("ABCD", "CABE"))

  def checkPermutation(str1: String, str2: String): Boolean = {
    if (str1.length != str2.length)
      false
    else {

      val s1 = str1.toCharArray.sorted.mkString
      val s2 = str2.toCharArray.sorted.mkString

      s1 == s2
    }
  }

}
