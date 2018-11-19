package com.crackcode

object UniqueChars extends App {

  println(allUniqueChars("ABCDEFG"))

  def allUniqueChars(str: String): Boolean = {

    for (i <- 0 until str.length - 1) {

      val char = str.charAt(i)

      if (str.indexOf(char.toInt, i+1) >= 0)
        return false
    }

    true
  }

}
