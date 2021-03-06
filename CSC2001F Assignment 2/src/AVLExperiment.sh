#!/bin/bash
#
#Cameron Rebelo
#RBLCAM001

file=../data/oklist.txt #/home/cameron/Assignment2/data/oklist.txt
lines=500
javac AccessAVLApp.java
for (( i=1;i<=10;i++))
do
awk '{print$1}' $file | sort -R | head -n $((lines*i)) | cat > AVLExperimentInput.txt;
echo -n ""  > AVLExperimentResults.txt
cat AVLExperimentInput.txt | while read F
do
java AccessAVLApp $F >> AVLExperimentResults.txt
done 
awk '$0 ~ /comparisons/' AVLExperimentResults.txt | awk 'NR % 2 == 0' | awk '{print$1}' | awk '{if(min==""){min=max=$1}; if($1>max) {max=$1}; if($1<min) {min=$1}; total+=$1; count+=1} END {print total/count, max, min}'
done