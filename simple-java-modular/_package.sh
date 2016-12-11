#!/bin/bash

JIGSAW_JDK_PATH=/c/ProgramFiles/Java/jigsaw-jdk-9

mkdir -p target/moduleslibrary

#Packaging
$JIGSAW_JDK_PATH/bin/jar --create --file=target/moduleslibrary/ttomday_module.jar --main-class=ttomday_package.Main -C target/modules/ttomday_module .
$JIGSAW_JDK_PATH/bin/jar --create --file=target/moduleslibrary/year_module@1.0.jar --module-version=1.0 -C target/modules/year_module .
