#!/bin/bash

echo "As Salamu Alaikum"

echo "Enter any number : "
read a
echo "Enter any number : "
read b

if [ $a -gt $b ]; # Space are important
    then echo "$a is greater than $b"
elif [ $a -lt $b ];
    then echo "$a is less than $b"
else 
    echo "$a and $b are equal"
fi # You have to use it for ending.

sum=$(($a + $b)) # Spaces are not important
echo "The sum is : $sum"