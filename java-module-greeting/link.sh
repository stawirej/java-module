#!/bin/bash

JIGSAW_JDK_PATH="/c/Program\ Files/Java/jdk-9.0.4"

rm -R greetingsapp

#Create a custom modular run-time image
$JIGSAW_JDK_PATH/bin/jlink --module-path $JIGSAW_JDK_PATH/jmods:/d/Workspace/git/bitbucket/java-module/java-module-greeting/mlib --add-modules com.greetings --output greetingsapp