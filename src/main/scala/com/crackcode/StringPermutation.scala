package com.crackcode

object StringPermutation extends App {


  permutation("tactcoa")

  def permutation(str: String): Unit = {
    permutation("", str)
  }

  def permutation(prefix: String, restString: String): Unit = {

    if (restString.length < 1) {
      println(prefix)
    }
    else {

      for (i <- 0 until restString.length) {

        val newPrefix = prefix + restString.charAt(i)
        val newRestString = restString.substring(0, i) + restString.substring(i + 1)

        permutation(newPrefix, newRestString)
      }
    }
  }
}
