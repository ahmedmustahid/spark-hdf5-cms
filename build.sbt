import sbt.Resolver

spName := "FNAL/sns"

version := "1.0"

scalaVersion := "2.10.5"

sparkVersion := "2.0.0"

exportJars := true

resolvers ++= Seq(
        "Unidata maven repository" at "http://artifacts.unidata.ucar.edu/content/repositories/unidata-releases",
        "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
        "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)
sparkComponents ++= Seq("core", "sql", "mllib")
