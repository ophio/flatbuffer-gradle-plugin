package in.co.ophio

import org.gradle.api.Project

class FlatBufferExtension {
    String flatcPath
    String inputFileName
    String inputFilePath
    String outputDirPath

    FlatBufferExtension (Project project) {
        inputFilePath = "${project.rootDir}";
        flatcPath = "${project.rootDir}";
    }

}