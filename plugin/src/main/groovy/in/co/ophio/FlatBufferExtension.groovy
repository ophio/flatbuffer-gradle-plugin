package in.co.ophio

import org.gradle.api.Project

class FlatBufferExtension {
    String flatcPath
    List<String> inputFileNames
    String inputFilePath
    String outputDirPath

    FlatBufferExtension (Project project) {
        inputFilePath = "${project.rootDir}";
        flatcPath = "${project.rootDir}";
    }

}