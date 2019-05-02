buildscript {
    repositories {
        maven("https://jitpack.io")
    }
    dependencies {
        classpath("com.github.ntrrgc:ts-generator:1.1.1")
    }
}
plugins {
    id("kotlin2ts.kt2ts") version "1.0.0"
}

kt2ts {
    packs = arrayOf("se.jensim.models")
}

tasks.findByName("kt2ts")?.apply {
    doLast {
        val filecontent = File("${project.buildDir}/kt2ts/kt2ts.txt").readText()
        if(filecontent.isNullOrEmpty()){
            throw RuntimeException("No file content produced")
        }else{
            println("All okay! '$filecontent'")
        }
    }
}
