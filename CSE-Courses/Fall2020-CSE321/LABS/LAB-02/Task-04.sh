#!/bin/bash

function addition() {
  local result=$(( $1 + $2))
  return $result
}
function subtraction() {
  local result=$(( $1 - $2))
  return $result
}
function multiplication() {
  local result=$(( $1 * $2))
  return $result
}
function division() {
  local result=$(( $1 / $2))
  return $result
}

read -p "Which operation would you like to do?" operation
read -p "Operand 1 : " operand1
read -p "Operand 2 : " operand2

case $operation in
"+")
  addition $operand1 $operand2
  result=$?
  ;;
"-")
  subtraction $operand1 $operand2
  result=$?
  ;;
"*")
  multiplication $operand1 $operand2
  result=$?
  ;;
"/")
  division $operand1 $operand2
  result=$?
  ;;
esac
echo "The result is $result"