pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

}

rootProject.name = "ecomapp"
include(":app")
include(":Core")
include("Core:data")
include("Core:domain")
include("Core:common")

include(":Core:network")
include(":Core:dependencymanagement")
