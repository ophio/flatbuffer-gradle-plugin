package in.co.ophio

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

class FlatBufferTask extends DefaultTask {

    @InputFiles
    File[] inputFiles;

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



    @InputFiles
    def getInputFiles() {
        def inputFileNames = getInputFilesFullName()
        inputFiles = new File[inputFileNames.size()]
        def i = 0
        for (inputFileName in inputFileNames) {
            inputFiles[i] = new File(inputFileName)
            i = i + 1
        }
        inputFiles
    }

    def getInputFilesFullName() {
        List<String> fileNames = project.flatbuffer.inputFileNames
        def inputFileNamesFull = new ArrayList<String>(fileNames.size());
        for (name in fileNames) {
            def fullName = "${project.flatbuffer.inputFilePath}${File.separator}${name}"
            inputFileNamesFull.add(fullName)
        }
        return inputFileNamesFull;
    }


}