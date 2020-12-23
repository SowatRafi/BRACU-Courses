usr = int(input("Enter turn number : "))
depth = (usr * 2)
print("DEPTH: ", depth)

MAX, MIN = 1000, -1000

branching = int(input("Enter branching factor: "))
print("Branch: ", branching)

max = int(input("Enter maximum range: "))
min = int(input("Enter minimum range: "))

leafNode = branching ** 2
print("Terminal states: ", leafNode)

import math

positive_Infinity = math.inf
print('Positive Infinity: ', positive_Infinity)

negative_Infinity = -math.inf
print('Negative Infinity: ', negative_Infinity)

c = []

dep
miniMaxABP(position, depth, alpha, beta, maximizingPlayer, nodeV, c):

if depth == 0:
    c.append(nodeV[position])

    return nodeV[position]

if maximizingPlayer:
    maxE = alpha
    for i in range(0, 3):

        evalue = miniMaxABP(position * 2 + i, depth - 1, alpha, beta, False, nodeV, c)

        maxE = max(maxE, evalue)
        alpha = max(alpha, evalue)
        if beta <= alpha:
            break
    return maxE

else:
    mE = beta
    for i in range(0, 3):
        # c += 1
        evalue = miniMaxABP(position * 2 + i, depth - 1, alpha, beta, True, nodeV, c)
        mE = min(mE, evalue)
        beta = min(beta, evalue)
        if beta <= alpha:
            break
    return mE

import random

nval = []
for i in range(leafNode):
    y = random.randint(minimum, maximum)
    print("values of node: ", y)
    nval.append(y)

print(nval)

print("Maximum amount : ", miniMaxABP(0, 2, MIN, MAX, True, nval, c))
print("Comparisons after pruning : ", len(c))

c = []


def miniMaxABP(position, depth, maximizingPlayer, nodeV, c):
    if depth == 0:
        c.append(nodeV[position])
        return nodeV[position]

    if maximizingPlayer:
        maxE = MIN
        for i in range(0, 3):
            eval = miniMaxABP(position * 2 + i, depth - 1, False, nodeV, c)
            maxE = max(maxE, eval)
        return maxE

    else:
        mE = MAX
        for i in range(0, 3):
            eval = miniMaxABP(position * 2 + i, depth - 1, True, nodeV, c)
            mE = min(mE, eval)
        return mE


print("Maximum amount: ", miniMaxABP(0, 2, True, nval, c))
print("Comparisons before pruning: ", len(c))