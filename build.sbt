ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.16"

lazy val root = (project in file("."))
  .settings(
    name := "scala-math-playground",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-effect" % "3.5.3",
      "org.typelevel" %% "algebra" % "2.0.0",
      "org.typelevel" %% "algebra-laws" % "2.0.0" % Test
    )
  )
