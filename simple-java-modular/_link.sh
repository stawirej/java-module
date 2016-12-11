#!/bin/bash

JIGSAW_JDK_PATH=/c/ProgramFiles/Java/jigsaw-jdk-9

#Create a custom modular run-time image
$JIGSAW_JDK_PATH/bin/jlink --module-path $JIGSAW_JDK_PATH/jmods:/d/Workspace/git/bitbucket/java-module/simple-java-modular/target/moduleslibrary --add-modules ttomday_module --output target/ttomdayapp