# N Queen Problem
# Recursive solution

import time

numOfQueens = int(input("Enter number of Queens : "))  # Number of queens

currSol = [0 for x in range(numOfQueens)]  # will hold current testing data
solutions = []  # found solutions


def isSafe(tstRow, tstCol):
    # No need to check for row 0
    if tstRow == 0:
        return True

    for row in range(0, tstRow):

        # Check vertical
        if tstCol == currSol[row]:
            return False

        # Diagonal
        if abs(tstRow - row) == abs(tstCol - currSol[row]):
            return False

    # No attack found
    return True

def placeQueen(row):
    global currSol, solutions, numOfQueens

    for col in range(numOfQueens):
        if not isSafe(row, col):
            continue
        else:
            currSol[row] = col
            if row == (numOfQueens - 1):
                #  last row
                solutions.append(currSol.copy())
                print( "Solution number ", len( solutions ), currSol )
            else:
                placeQueen(row + 1)

print("Solving for " + str(numOfQueens) + " Queens")

time.sleep(2)
placeQueen(0)

print(len(solutions), " solutions found")
for solution in solutions:
    print(solution)