
lazy val `$name$` = (project in file("."))
  .settings(
    scalaVersion := "2.12.4",
	  samStage := "$stage$",
	  organization := "$organization$",
	  description := "sam's authentication and authorization component"
  )

  

