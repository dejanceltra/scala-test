import Dependencies._

ThisBuild / scalaVersion     := "2.12.17"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scalaTest",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.12.7",
    libraryDependencies += "com.fasterxml.jackson.core" % "jackson-annotations" % "2.12.7",
    libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.12.7",
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
