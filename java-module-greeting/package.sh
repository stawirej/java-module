#!/bin/bash

JIGSAW_JDK_PATH="/c/Program\ Files/Java/jigsaw-jdk-9"

mkdir mlib

#Packaging
eval $JIGSAW_JDK_PATH/bin/jar --create --file=mlib/com.greetings.jar --main-class=com.greetings.Main -C mods/com.greetings .
eval $JIGSAW_JDK_PATH/bin/jar --create --file=mlib/org.astro@1.0.jar --module-version=1.0 -C mods/org.astro .
