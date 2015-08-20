package in.co.ophio

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

class FlatBufferTask extends DefaultTask {


    @InputFile
    File inputFile

    @OutputDirectory
    File outputDir

    @TaskAction
    def exec () {
        print "${project.flatbuffer.flatcPath}/flatc -j -o ${getOutputDirectoryName()} ${getInputFileFullName()}"
        "${project.flatbuffer.flatcPath}/flatc -j -o ${getOutputDirectoryName()} ${getInputFileFullName()}".execute ([], project.rootDir)
    }

    @InputFile
    def getInputFile () {
        inputFile = new File (getInputFileFullName())
    }

    @OutputDirectory
    def getOutputDir () {
        outputDir = new File (getOutputDirectoryName())
    }

    def getOutputDirectoryName() {
        "${project.flatbuffer.outputDirPath}"
    }

    def getInputFileFullName () {
        "${project.flatbuffer.inputFilePath}/${project.flatbuffer.inputFileName}"
    }


}