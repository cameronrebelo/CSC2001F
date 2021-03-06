#!/bin/bash
#
#Cameron Rebelo
#RBLCAM001

file=/home/cameron/Assignment1/data/oklist.txt
lines=500
javac AccessBSTApp.java
for (( i=1;i<=10;i++))
do
awk '{print$1}' $file | sort -R | head -n $((lines*i)) | cat > BSTExperimentInput.txt;
echo -n ""  > BSTExperimentResults.txt
cat BSTExperimentInput.txt | while read F
do
java AccessBSTApp $F >> BSTExperimentResults.txt
done 
awk '$0 ~ /comparisons/' BSTExperimentResults.txt | awk 'NR % 2 == 0' | awk '{print$1}' | awk '{if(min==""){min=max=$1}; if($1>max) {max=$1}; if($1<min) {min=$1}; total+=$1; count+=1} END {print total/count, max, min}'
done