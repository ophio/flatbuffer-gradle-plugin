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
        print "${project.flatBuffer.flatcPath}/flatc -j -o ${getOutputDirectoryName()} ${getInputFileFullName()}"
        "${project.flatBuffer.flatcPath}/flatc -j -o ${getOutputDirectoryName()} ${getInputFileFullName()}".execute ([], project.rootDir)
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
        "${project.flatBuffer.outputDirPath}"
    }

    def getInputFileFullName () {
        "${project.flatBuffer.inputFilePath}/${project.flatBuffer.inputFileName}"
    }


}