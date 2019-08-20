plugins {
    application
    kotlin("jvm")
}

application{
    mainClassName = "com.example.console.MainKt"
}

dependencies {
    compile(project(":entity"))
    compile(kotlin("stdlib"))
}