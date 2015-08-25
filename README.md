This grade plugin has been developed in order to make the usage of [`FlatBuffers`](https://github.com/google/flatbuffers)easier. Big thanks to [`@nabil_hachicha`](https://twitter.com/nabil_hachicha) for his [talk](https://skillsmatter.com/skillscasts/5984-build-your-gradle-plugin#video) at DroidCon London 2014.

## About
`FlatBuffers` format has been shown to give better results than JSON parsing. For more details about it read this [article](https://code.facebook.com/posts/872547912839369/improving-facebook-s-performance-on-android-with-flatbuffers/). For a more detailed introduction on how to use `FlatBuffers` you can have a look at this [article](https://code.facebook.com/posts/872547912839369/improving-facebook-s-performance-on-android-with-flatbuffers/). 

You may notice that the java files generation task could be difficult if there are frequent changes to the schema while developing. A solution for continuous generation of the java classes is needed. We have integrated the continuos generation of java file with the grade plugin. Whenever you make any changes to the input schema file, updated files will be generated upon the next grade build.

## Setup

1. Clone the `FlatBuffer`[repository](https://github.com/google/flatbuffers). 
2. Open the Xcode project: [`build/Xcode/FlatBuffers.xcodeproj`](https://github.com/google/flatbuffers/tree/master/build/Xcode/FlatBuffers.xcodeproj). Alternatively you can generate your **flatc** executable using any other way (or if you are not using a Mac) as described [here](https://google.github.io/flatbuffers/index.html).
3. Run the project using the Play Button or `⌘ + R`, you will find the **flatc** executable in the project root directory.
4. Create a schema file for your project, you can find information on how to create [here](https://google.github.io/flatbuffers/md__schemas.html).
5. Use the plugin. Change the schema and see the effect. Enjoy!

## Usage

[`flatbuffer-gradle-plugin`](plugin/) has been uploaded on [bintray](https://bintray.com/ophio/maven/flatbuffer-gradle-plugin/_latestVersion) and can be used as follows:

Gradle:

```
repositories {
    maven {
        url  "http://dl.bintray.com/ragdroid/maven" 
    }
}
dependencies {
        classpath 'in.co.ophio:flatbuffer-gradle-plugin:0.1.0'
    }
    
```
To apply the plugin: `apply plugin: 'flatbuffer-gradle-plugin'`

Use the `flatbuffer` closure as follows :

```
flatbuffer {
    flatcPath = "${project.rootDir}"  // (optional, default location project root directory)
    inputFileName = "schema.fbs" 
   inputFilePath = ""${project.rootDir}"" // (optional, default location project root directory)
    outputDirPath = "${projectDir}/src/main/java"
}
```

* `flatcPath`: (optional, defaults to the project root Directory) path to the **flatc** executable.
* `inputFilePath`: (optional, defaults to the project root Directory) path to input schema file.
* `inputFileName`: name of your input schema file
* `outputDirPath`: directory where you want your java classes to get generated.

## Uploading the plugin:

Upload on **maven** local :

```
cd plugin; ../gradlew clean uploadArchives
```

Upload on **bintray** (assuming you have a `bintray.properties` file in the `{rootDirectory}/plugin` directory) : 

```
cd plugin; ../gradlew clean build bintrayUpload
```
Licence Information

The MIT License (MIT)

Copyright (c) 2015 Ophio

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.