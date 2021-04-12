import Dependencies._

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.codedx"
ThisBuild / organizationName := "Code Dx, Inc"
ThisBuild / description := "$about$"

ThisBuild / scalaVersion := "2.12.13"
ThisBuild / crossScalaVersions := List("2.12.13", "2.13.5")
ThisBuild / scalacOptions := List("-deprecation", "-unchecked", "-feature", "-language:higherKinds")
ThisBuild / scalacOptions ++= (scalaBinaryVersion.value match {
	case "2.12" => Seq("-Ypartial-unification")
	case _ => Nil
})

ThisBuild / startYear := Some(2021)
ThisBuild / licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt"))

ThisBuild / updateOptions := updateOptions.value.withCachedResolution(true)

addCompilerPlugin("org.typelevel" % "kind-projector" % "0.11.3" cross CrossVersion.full)

lazy val root = (project in file("."))
	.settings(
		name := "$name$",
		libraryDependencies += scalaTest % Test,
	)

