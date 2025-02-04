ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.16"

lazy val root = (project in file("."))
  .settings(
    name := "scala-math-playground",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-effect" % "3.5.3",
      "org.typelevel" %% "algebra" % "2.0.0",
      "org.typelevel" %% "algebra-laws" % "2.0.0" % Test,
      "org.scalatest" %% "scalatest" % "3.2.17" % Test,
      "org.scalacheck" %% "scalacheck" % "1.15.4" % Test, // ScalaCheck version
      "org.scalatestplus" %% "scalacheck-1-17" % "3.2.17.0" % Test,
      "org.scalatestplus" %% "scalacheck-1-17" % "3.2.17.0",
      "org.typelevel" %% "discipline-scalatest" % "1.0.0" % Test
    )
  )
