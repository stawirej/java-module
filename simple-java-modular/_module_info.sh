#!/bin/bash

JIGSAW_JDK_PATH=/c/ProgramFiles/Java/jdk-9.0.4

$JIGSAW_JDK_PATH/bin/jar --print-module-descriptor --file=target/moduleslibrary/ttomday_module.jar
$JIGSAW_JDK_PATH/bin/jar --print-module-descriptor --file=target/moduleslibrary/year_module@1.0.jar