#!/bin/bash

#$1 - path to module

JIGSAW_JDK_PATH="/c/Program\ Files/Java/jigsaw-jdk-9"

eval $JIGSAW_JDK_PATH/bin/jar --print-module-descriptor --file=$1