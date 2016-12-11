#!/bin/bash

JIGSAW_JDK_PATH=/c/ProgramFiles/Java/jigsaw-jdk-9

#Create modules output folder
mkdir -p target/modules

#Multi-modules compilation
$JIGSAW_JDK_PATH/bin/javac -d target/modules --module-source-path src $(find src -name "*.java")