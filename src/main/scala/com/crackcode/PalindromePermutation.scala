package com.crackcode

import com.crackcode.PalindromePermutation.isPalindrome

import scala.collection.mutable.ArrayBuffer

object PalindromePermutation extends App {

  start("tactcoa")

  def start(str: String): Unit = {

    //val s = str.replaceAll(" ", "")

    var pList: ArrayBuffer[String] = new ArrayBuffer[String]()

    checkPalindromePermutation(pList, "", str)

    pList.foreach(println)
  }

  def checkPalindromePermutation(pList: ArrayBuffer[String], prefix: String, restStr: String): Unit = {

    if (restStr.length < 1) {
      //println(prefix)

      if (isPalindrome(prefix))
        pList.append(prefix)
    }
    else {
      for (i <- 0 until restStr.length) {
        checkPalindromePermutation(pList, prefix + restStr.charAt(i),
          restStr.substring(0, i) + restStr.substring(i+1))
      }
    }
  }

  def isPalindrome(str: String): Boolean = {

    for (i <- 0 until (str.length / 2) ) {
      if (str.charAt(i) != str.charAt(str.length - i - 1))
        return false
    }
    true
  }
}
