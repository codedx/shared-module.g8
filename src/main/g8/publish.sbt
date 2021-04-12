// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html


ThisBuild / organizationHomepage := Some(url("https://codedx.com/"))

ThisBuild / scmInfo := Some(
	ScmInfo(
		url("https://github.com/codedx/$name$"),
		"scm:git@github.com:codedx/$name$.git"
	)
)
ThisBuild / developers := List(
	Developer(
		id    = "codedx",
		name  = "Code Dx",
		email = "support@codedx.com",
		url   = url("https://codedx.com/")
	)
)

ThisBuild / homepage := Some(url("https://github.com/codedx/$name$"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository.withRank(KeyRanks.Invisible) := { _ => false }
ThisBuild / publishTo := {
	val nexus = "https://oss.sonatype.org/"
	if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
	else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle.withRank(KeyRanks.Invisible) := true