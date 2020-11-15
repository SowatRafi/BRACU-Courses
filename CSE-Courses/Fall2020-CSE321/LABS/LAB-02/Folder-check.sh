#!/bin/bash

echo "Enter name : "
read fileName

if [ -d $fileName ];
    then "It is a directory."
elif [ -f $fileName ];
    then echo "it is a file."
else 
    echo "Not a file or directory."
fi