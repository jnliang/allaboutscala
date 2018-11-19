package com.crackcode

object Fibonacci extends App {

  println(findFib(12))

  def findFib(n: Int): Long = {

    if (n <= 0)
      0
    else if (n == 1)
      1
    else
      findFib(n-1) + findFib(n-2)
  }

}
