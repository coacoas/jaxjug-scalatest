libraryDependencies ++= Seq(
  "com.google.guava" % "guava" % "11.+",
  "org.scalatest" %% "scalatest" % "1.+" % "test",
  "org.scalacheck" %% "scalacheck" % "1.9" % "test",
  "junit" % "junit" % "4.10" % "test"
)

scalacOptions += "-deprecation"