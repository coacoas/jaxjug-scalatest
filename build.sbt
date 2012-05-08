libraryDependencies ++= Seq(
  "org.springframework" % "spring-core" % "3.1.1.RELEASE",
  "com.google.guava" % "guava" % "11.+",
  "org.scalatest" %% "scalatest" % "1.+",
  "org.scalacheck" %% "scalacheck" % "1.9",
  "junit" % "junit" % "4.10" % "test"
)

scalacOptions += "-deprecation"