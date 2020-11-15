#!/bin/bash

echo "Enter your name : "
read name

case $name in 
"Abul") echo "The name is $name.";
        echo "$name is the name.";; # Important for last statement ";" is for the last statement.
"Kashem") echo "The name is $name.";;
*) echo "Something else.";; # for default
esac