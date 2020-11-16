#!/bin/bash

function TaxCheck() {
    if (( $1 <= 240000 ))
    then
      local tax=$(( ($1 * 0)/100 ))
      echo "$tax"

    elif (( $1 > 240000 && $1-240000 <= 300000 ))
    then
        local tax=$((  ( ($1 - 240000) * 10)/100 ))
        echo "$tax"

    elif (( $1-240000-300000 <= 180000 ))
    then
        local step1=$(( ( ($1 - 240000)*0)/100 ))
        local step2=$(( (300000 * 10)/100 ))
        local step3=$(( ( ($1 - 240000 - 300000)*20)/100 ))
        local tax=$(( $step1 + $step2 + $step3 ))
        echo "$tax"

    else
      local step1=$(( ( ($1 - 240000)*0)/100 ))
      local step2=$(( (300000 * 10)/100 ))
      local step3=$(( (180000*20)/100 ))
      local step4=$(( ( ($1 - 240000 - 300000 - 180000)* 30)/100 ))
      local tax=$(( $step1 + $step2 + $step3 + $step4 ))
      echo "$tax"
    fi
}

read -p "Enter your annual income : " income
TaxCheck $income

