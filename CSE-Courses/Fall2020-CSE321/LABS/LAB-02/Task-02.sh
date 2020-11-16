#!/bin/bash

function multipleCheck() {
if (( $1 % 5 == 0 && $1 %  2 == 0 ))           # no need for brackets
  then
    echo "NO"
  elif (( $1 % 5 == 0 || $1 % 2 == 0 ))
  then
    echo "YES"
  else
    echo "IGNORE"
fi
}

read -p "Enter a number " number # read can output the prompt for you.

multipleCheck $number
