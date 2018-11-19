package com.crackcode

import scala.collection.mutable.ArrayBuffer

object ReverseArray extends App {

  val theArray: ArrayBuffer[Int] = new ArrayBuffer[Int]()

  theArray.insert(0, 1, 2, 3, 4, 5)

  theArray.foreach(println)

  theArray(0) = 11

  theArray.foreach(println)

  for (i <- 0 to theArray.length/2) {
    val temp = theArray(i)
    theArray(i) = theArray(theArray.length - 1 - i)
    theArray(theArray.length -1 -i) = temp
  }

  theArray.foreach(println)


  val theString: StringBuilder = new StringBuilder
  theString.insert(0, "atest")

  for (i <- 0 to theString.length/2) {

    val temp = theString(i)
    theString(i) = theString(theString.length -1-i)
    theString(theString.length -1-i) = temp

  }

  println(theString)
}
