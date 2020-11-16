#!/bin/bash

function TaxCheck() {
    if (( $1 <= 240000 ))
    then
      local tax=$(( ($1 * 0)/100 ))
      echo "$tax"

    elif (( $1 > 240000 && $1 <= 300000 ))
    then
        local tax=$(( ($1 * 10)/100 ))
        echo "$tax"

    elif (( $1 > 300000 && $1 <= 1800000 ))
    then
        local tax=$(( ($1 * 20)/100 ))
        echo "$tax"

    else
      local tax=$(( ($1 * 30)/100 ))
      echo "$tax"
    fi
}

read -p "Enter your annual income : " income
TaxCheck $income

