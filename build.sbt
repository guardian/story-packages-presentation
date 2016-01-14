scalaVersion := "2.11.7"
organization := "com.gu"
libraryDependencies ++= Seq(
  "com.gu" %% "content-api-models" % "7.16",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)
publishMavenStyle := true
publishArtifact in Test := false
bintrayOrganization := Some("guardian")
bintrayRepository := "story-packages"
licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
