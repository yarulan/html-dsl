def defModule(dir: String, id: String = null): Project = Project(Option(id).getOrElse(dir), file(dir))
  .settings(
    crossScalaVersions := Seq("2.12.2"),
    scalaVersion := crossScalaVersions.value.head,
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

lazy val htmlDsl = defModule(".", "htmlDsl")
  .aggregate(core, backends)

lazy val backends = defModule("backends", "backends")
  .aggregate(objectBackend, domBackend)

lazy val objectBackend = defModule("backends/object", "objectBackend")
  .dependsOn(core % "compile->compile;test->test")
  .settings(
    libraryDependencies ++= Seq(
      "org.owasp.encoder" % "encoder" % "1.2.1",
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    )
  )

lazy val domBackend = defModule("backends/dom", "domBackend")
  .dependsOn(core % "compile->compile;test->test")
  .enablePlugins(ScalaJSPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %%% "scalatest" % "3.0.1" % "test"
    ),
    jsDependencies in Test += RuntimeDOM
  )