#!/bin/bash

#$1 - path to module

JIGSAW_JDK_PATH="/c/Program\ Files/Java/jdk-9.0.4"

eval $JIGSAW_JDK_PATH/bin/jar --print-module-descriptor --file=$1