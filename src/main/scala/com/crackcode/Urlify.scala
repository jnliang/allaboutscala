package com.crackcode

object Urlify extends App {

  println(urlify("hi james welcome ! "))

  def urlify(str: String): String = {

    val charArray = str.toCharArray.toBuffer

    var i = 0

    while(i < charArray.length) {
      if (charArray(i) == ' ') {
        charArray.remove(i)
        charArray.insert(i, "%20".toCharArray: _*)
      }
      i += 1
    }

    charArray.mkString
  }

}
