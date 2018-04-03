#!/bin/bash

JIGSAW_JDK_PATH="/c/Program\ Files/Java/jdk-9.0.4"

#Create modules output folder
mkdir mods

#Single module compilation
#/c/Program\ Files/Java/jdk-9/bin/javac -d mods/org.astro src/org.astro/module-info.java src/org.astro/org/astro/World.java
#/c/Program\ Files/Java/jdk-9/bin/javac --module-path mods -d mods/com.greetings src/com.greetings/module-info.java src/com.greetings/com/greetings/Main.java

#Multi-modules compilation
#eval for making path with space working
eval $JIGSAW_JDK_PATH/bin/javac -d mods --module-source-path src $(find src -name "*.java")