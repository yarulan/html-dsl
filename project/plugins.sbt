val sjsVersionBin = "0.6"

val sjsVersion = s"$sjsVersionBin.15"

addSbtPlugin("org.scala-js" % "sbt-scalajs" % sjsVersion)

libraryDependencies += "org.scala-js" %% "scalajs-env-selenium" % "0.1.3"