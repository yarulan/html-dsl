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
      "org.scala-js" %%% "scalajs-dom" % "0.9.1" % "provided",
      "org.scalatest" %%% "scalatest" % "3.0.1" % "provided"
    ))

lazy val htmlDsl = defModule(".", "html-dsl")
  .aggregate(core, backends, fooJS, fooJVM)
  .settings(
    ideExcludedDirectories := Seq(file("node_modules"))
  )

lazy val backends = defModule("backends", "backends")
  .aggregate(objectBackend, domBackend)

lazy val objectBackend = defModule("backends/object", "object-backend")
  .dependsOn(core % "compile->compile;test->test")
  .settings(
    libraryDependencies ++= Seq(
      "org.owasp.encoder" % "encoder" % "1.2.1",
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    )
  )

lazy val domBackend = defModule("backends/dom", "dom-backend")
  .dependsOn(core % "compile->compile;test->test")
  .enablePlugins(ScalaJSPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.1",
      "org.scalatest" %%% "scalatest" % "3.0.1" % "test"
    ),
    jsDependencies in Test += RuntimeDOM
  )

lazy val foo = crossProject.in(file("foo")).
  settings(
    name := "foo",
    version := "0.1-SNAPSHOT"
  ).
  jvmSettings(
    // Add JVM-specific settings here
  ).
  jsSettings(
    // Add JS-specific settings here
  )

lazy val fooJVM = foo.jvm
lazy val fooJS = foo.js