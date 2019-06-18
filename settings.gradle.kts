pluginManagement {
  repositories {
    gradlePluginPortal()
  }
}

rootProject.name = "multi-module-gradle-kts"
include("domain", "app")
