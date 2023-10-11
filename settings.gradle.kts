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
include("Common")
include(":Core:navigation")

include(":features")
include(":features:retrievedatausecase")

