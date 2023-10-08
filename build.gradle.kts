
import org.gradle.api.Project
data class PlugProvider(
    val androidApp:Provider<PluginDependency>,
    val jetBrainsKotlin:Provider<PluginDependency>,
    val androidLibrary:Provider<PluginDependency>,
    val daggerHilt:Provider<PluginDependency>
)

class PluginDef{
    val myProject: Project = project
    // Acceder a la propiedad libs
    val libraries = myProject.extensions.getByType(libs::class.java)

    // Ahora puedes acceder a las propiedades de librariesForLibs
     val androidApp = libraries.plugins.androidApp
     val jetBrainsKotlin = libraries.plugins.jetbrainskotlinAndroid
     val androidLibrary = libraries.plugins.androidLibrary
     val daggerHilt = libraries.plugins.daggerHilt

    val provider = PlugProvider(androidApp,jetBrainsKotlin,androidLibrary,daggerHilt)

}


plugins {
    alias (libs.plugins.androidApp) apply false
    alias(libs.plugins.jetbrainskotlinAndroid) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.daggerHilt) apply false
    alias(libs.plugins.googleGMSservices)apply false
    alias(libs.plugins.org.jetbrains.kotlin.jvm) apply false
}
