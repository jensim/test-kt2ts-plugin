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
    packs = arrayOf("org.fidget.models")
}
