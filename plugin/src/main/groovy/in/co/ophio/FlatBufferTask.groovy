package in.co.ophio

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class FlatBufferTask extends DefaultTask {

    File[] inputFiles;

    File outputDir

    @TaskAction
    def exec () {
        //print "${project.flatbuffer.flatcPath}/flatc -j -o ${getOutputDirectoryName()} ${getInputFileFullName()}"

        def inputFilesFullNames = getInputFilesFullName()

        for (inputFileNameFull in inputFilesFullNames) {
            "${project.flatbuffer.flatcPath}/flatc -j -o ${getOutputDirectoryName()} ${inputFileNameFull}".execute([], project.rootDir)
        }
    }

    def getOutputDirectoryName() {
        "${project.flatbuffer.outputDirPath}"
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