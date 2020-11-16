#!/bin/bash

function Hello_world () {
    echo "Hello World."
}
function a () {
    a=7 # (1) It will not distroy outside of this function.
    local a=5 # Use this for local variables
    echo $a
}

a
echo $a # (2) See this?
Hello_world

# Parameters in a function

adder () {
    result=$(( $1 + $2))
    return $result
}

adder 6 9
echo $? # For getting the return value.