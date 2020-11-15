#!/bin/bash

# Simple For Loop
for ((i = 0 ; i < 10 ; i++))
do 
    echo $i
done

# For Each

my_list=(a b c d e)

for i in ${my_list[*]};
do 
    echo $i
done

# While

i=0

while [ $i -lt 10 ];
do 
    echo $i
    i=$(($i+1))
done