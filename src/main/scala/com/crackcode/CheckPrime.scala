package com.crackcode

object CheckPrime extends App {

  def isPrime(n: Int): Boolean = {

    for (i <- 2 to Math.sqrt(n).toInt by 1) {
      if (n % i == 0)
        return false
    }
    return true
  }

  println(isPrime(24))
}
