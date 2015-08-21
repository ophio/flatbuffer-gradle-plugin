package in.co.ophio

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskInstantiationException
import com.android.build.gradle.AppPlugin
import com.android.build.gradle.LibraryPlugin

class FlatBufferPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        verifyRequiredPlugins project
        FlatBufferExtension extension = new FlatBufferExtension(project)
        project.extensions.add("flatbuffer", extension)
        project.afterEvaluate {
            project.tasks.find {
                def pattern = ~/(?i)pre.*Build/
                pattern.matcher(it.name).matches()
            }?.dependsOn project.tasks.create([name: "flatBufferJavaFileGeneration", type: FlatBufferTask])
        }
    }

    // check if 'android' plugin is applied to the project
    private static void verifyRequiredPlugins(Project project) {
        if (!project.plugins.hasPlugin(AppPlugin) && !project.plugins.hasPlugin(LibraryPlugin)) {
            throw new TaskInstantiationException("'android' or 'android-library' plugin has to be applied before")
        }
    }

}