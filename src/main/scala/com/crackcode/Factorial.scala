package com.crackcode

object Factorial extends App {

  def calFactorial(n: Int): Long = {

    if (n < 1)
      -1
    else if (n == 1)
      1
    else
      n * calFactorial(n -1)
  }

  println(calFactorial(3))

}
