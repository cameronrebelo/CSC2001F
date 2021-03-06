#!/bin/bash
#
#Cameron Rebelo
#RBLCAM001

file=/home/cameron/Assignment1/data/oklist.txt
lines=500
javac AccessArrayApp.java
for (( i=1;i<=10;i++))
do
awk '{print$1}' $file | sort -R | head -n $((lines*i)) | cat > ArrayExperimentInput.txt;
echo -n ""  > ArrayExperimentResults.txt
cat ArrayExperimentResults.txt
cat ArrayExperimentInput.txt | while read F
do
java AccessArrayApp $F >> ArrayExperimentResults.txt
#java AccessArrayApp data >> ArrayExperimentResults.txt
done
awk '$0 ~ /comparisons/' ArrayExperimentResults.txt | awk '{print$1}' | awk '{if(min==""){min=max=$1}; if($1>max) {max=$1}; if($1<min) {min=$1}; total+=$1; count+=1} END {print total/count, max, min}'
done