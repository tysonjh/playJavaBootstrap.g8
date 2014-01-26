libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)

def customLessEntryPoints(base: File): PathFinder = (
  (base / "app" / "assets" / "stylesheets" / "bootstrap" * "bootstrap.less") +++
    (base / "app" / "assets" / "stylesheets" * "*.less"))

lazy val lessSettings = Seq(play.Project.lessEntryPoints <<= baseDirectory(customLessEntryPoints))

lazy val baseSettings = Seq(
  scalaVersion := "$scala_version$",
  scalacOptions := Seq("-language:_", "-deprecation", "-unchecked", "-Xlint"))

lazy val main = play.Project("$name$", "$version$", settings = play.Project.playJavaSettings ++ lessSettings ++ baseSettings)
