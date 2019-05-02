allprojects{

    group = "se.jensim.testinggrounds"
    version = "1.0-SNAPSHOT"
}
buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.31"))
    }

}


subprojects {

    plugins.apply("org.jetbrains.kotlin.jvm")
}
