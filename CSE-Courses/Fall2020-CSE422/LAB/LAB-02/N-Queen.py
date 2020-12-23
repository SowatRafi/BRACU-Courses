class QueenProblem:
    def __init__(self, numberOfQueens):
        self.numberOfQueens = numberOfQueens
        self.chessTable = [[None for i in range(numberOfQueens)] for j in range(numberOfQueens)]

        def solveQueensProblems(self):
            if self.solve(0):
                self.printQueen()
            else:
                print('There is no solution...')

        def solve(self, colIndex):
            if colIndex == self.numberOfQueens:
                return True

            for rowIndex in range(self.numberOfQueens):
                if self.isPlaceValid(rowIndex, colIndex):
                    self.chessTable[rowIndex] [colIndex] = 1
                    if self.solve(colIndex + 1):
                        return True
                    # Backtrack
                    self.chessTable[rowIndex][colIndex] = 0
            return False
        def isPlaceValid(self, rowIndex, columnIndex):
            #same row
            for i in range(columnIndex):
                if self.chessTable[rowIndex][i] == 1:
                    return False
            #from top left to bottom right
            j = columnIndex
            for i in range(rowIndex, -1 , -1):
                if j < 0:
                    break
                if self.chessTable[i][j] == 1:
                    return False
                j = j - 1
            #from bottom left to top right
            j = columnIndex
            for i in range(rowIndex, len(self.chessTable)):
                if j < 0:
                    break
                if self.chessTable[i][j] == 1:
                    return False
                j = j - 1
            return True
        def printQueens(self):
            for i in range(self.numberOfQueens):
                for j in range(self.numberOfQueens):
                    if self.chessTable[i][j] == 1:
                        print(" * ", end=""),
                    else:
                        print(" - ", end=""),
                print('\n')


if __name__ == '__main__':

    queensProblem = QueenProblem(4)
    queensProblem.solveQueensProblem()