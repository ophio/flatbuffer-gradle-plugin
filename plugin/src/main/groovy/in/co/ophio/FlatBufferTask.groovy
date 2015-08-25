package in.co.ophio

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

class FlatBufferTask extends DefaultTask {

    @OutputDirectory
    File outputDir

    @TaskAction
    def exec () {
        //print "${project.flatbuffer.flatcPath}/flatc -j -o ${getOutputDirectoryName()} ${getInputFileFullName()}"

        println "starting executing"
        def inputFilesFullNames = getInputFilesFullName()

        for (inputFileNameFull in inputFilesFullNames) {
            println "input file: " + inputFileNameFull;
            "${project.flatbuffer.flatcPath}/flatc -j -o ${getOutputDirectoryName()} ${inputFileNameFull}".execute([], project.rootDir)
        }
    }



    @OutputDirectory
    def getOutputDir () {
        outputDir = new File (getOutputDirectoryName())
    }

    def getOutputDirectoryName() {
        "${project.flatbuffer.outputDirPath}"
    }





    def getInputFilesFullName() {
        println "in getInputFilesFullName"
        List<String> fileNames = project.flatbuffer.inputFileNames
        println "t"
        def inputFileNamesFull = new ArrayList<String>(fileNames.size());
        for (name in fileNames) {
            inputFileNamesFull =  "${project.flatbuffer.inputFilePath}${File.separator}${name}"
            println inputFileNamesFull
        }
        return inputFileNamesFull;
    }


}