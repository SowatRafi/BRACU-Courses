#!/bin/bash

echo $0 # file name
echo $1
echo $2
echo $3
echo $4
echo $# # number of inputs
list=$* # For accessing all the commands in a list
echo $list

for i in ${list[*]};
do 
    echo $i
done