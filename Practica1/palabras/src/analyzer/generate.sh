#!/bin/bash
echo "JLex javac"
/usr/lib/jvm/java-8-openjdk/bin/javac JLex/Main.java JLex/Main.java
echo ""
echo "Processing lexical file"
java JLex.Main lexical
echo ""
echo "Processing syntantic file"
java -jar Cup/java-cup-11b.jar -parser Parser syntactic
echo ""
read -p "Press any key to continue"
echo ""

