def defmod(dir: String, id: String = null): Project = Project(Option(id).getOrElse(dir), file(dir))
  .settings(
    scalaVersion := "2.11.8",
    organization := "pro.ulan.htmldsl",
    version := "1.0-SNAPSHOT",
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test"
  )

lazy val core = defmod("core")
  .enablePlugins(ScalaJSPlugin)

lazy val string = defmod("string")
  .dependsOn(core)
  .settings(
    libraryDependencies ++= Seq(
      "org.owasp.encoder" % "encoder" % "1.2.1",
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    ))

lazy val dom = defmod("dom")
  .dependsOn(core)
  .enablePlugins(ScalaJSPlugin)

lazy val htmlDsl = defmod(".", "htmlDsl")
  .aggregate(core, string, dom)