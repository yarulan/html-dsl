def defModule(dir: String, id: String = null): Project = Project(Option(id).getOrElse(dir), file(dir))
  .settings(
    scalaVersion := "2.12.2",
    crossScalaVersions := Seq("2.12.2", "2.11.11"),
    organization := "pro.ulan.html-dsl",
    version := "1.0-SNAPSHOT",
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test"
  )

lazy val core = defModule("core")
  .enablePlugins(ScalaJSPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %%% "scalatest" % "3.0.1" % "provided"
    ))

lazy val string = defModule("string")
  .dependsOn(core % "compile->compile;test->test")
  .settings(
    libraryDependencies ++= Seq(
      "org.owasp.encoder" % "encoder" % "1.2.1",
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    ))

lazy val dom = defModule("dom")
  .dependsOn(core % "compile->compile;test->test")
  .enablePlugins(ScalaJSPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %%% "scalatest" % "3.0.1" % "test"
    ),
    jsDependencies in Test += RuntimeDOM
  )

lazy val htmlDsl = defModule(".", "htmlDsl")
  .aggregate(core, string, dom)