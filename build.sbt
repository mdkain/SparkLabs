name := "SparkWorkshop"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.2"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.2"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.3.2"
//libraryDependencies += "org.apache.bahir" %% "spark-streaming-twitter" % "2.3.2"
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.3.2"

