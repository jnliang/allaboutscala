package com.allaboutscala.spark

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

trait Context {

  lazy val sparkConf = new SparkConf()
    .setAppName("Learn Spark")
    .setMaster("local[*]")
    .set("spark.cores.max", "2")

  lazy val sparkSession = SparkSession
    .builder()
    .config(sparkConf)
    .getOrCreate()
}

object DataFrame_Tutorial extends App with Context {

  val dfTags = sparkSession
    .read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv("src/main/resources/question_tags_10K.csv")
    .toDF("id", "tag")

  dfTags.show(10)

  dfTags.printSchema()

  dfTags.select("id", "tag").show(10)

  dfTags.filter("tag == 'html'").show(10)

  println(s"Number of php tags = ${ dfTags.filter("tag == 'html'").count() }")

  dfTags.filter("tag like 's%'").show(10)

  dfTags
    .filter("tag like 's%'")
    .filter("id == 25 or id == 108")
    .show(10)


}

