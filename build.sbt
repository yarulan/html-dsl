import org.scalajs.jsenv.selenium.{SeleniumJSEnv, Firefox, Chrome}

def defModule(dir: String, id: String = null): Project = Project(Option(id).getOrElse(dir), file(dir))
  .settings(
    scalaVersion := "2.11.8",
    organization := "pro.ulan.htmldsl",
    version := "1.0-SNAPSHOT",
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test"
  )

lazy val core = defModule("core")
  .enablePlugins(ScalaJSPlugin)

lazy val string = defModule("string")
  .dependsOn(core)
  .settings(
    libraryDependencies ++= Seq(
      "org.owasp.encoder" % "encoder" % "1.2.1",
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    ))

lazy val dom = defModule("dom")
  .dependsOn(core)
  .enablePlugins(ScalaJSPlugin)
  .settings(
    jsEnv in Test := new SeleniumJSEnv(Chrome()),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    )
  )

lazy val htmlDsl = defModule(".", "htmlDsl")
  .aggregate(core, string, dom)