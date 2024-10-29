DEFAULT_GRID = [[0, 0, 0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0, 0, 0]
               ]

victories = [0, 0]

def isColValid(col):
    return 0 <= col <= 6 and grid[0][col] == 0

def updateGrid(col, player):
    for lin in range(len(grid) - 1, -1, -1):
        if grid[lin][col] == 0:
            grid[lin][col] = player
            return lin
    return -1

def printGrid():
    for lin in grid:
        print(lin)

def checkLine(lin, col, player):
    count = 0

    # Check left
    aux = col
    while aux >= 0 and grid[lin][aux] == player:
        count += 1
        aux -= 1

    # Check right
    aux = col + 1
    while aux <= 6 and grid[lin][aux] == player:
        count += 1
        aux += 1

    return count

def checkColumn(lin, col, player):
    count = 0
    while lin < 6 and grid[lin][col] == player:
        count += 1
        lin += 1

    return count

def checkDiagonal1(lin, col, player):
    count = 0

    # Check top-left
    aux = 0
    while lin - aux >= 0 and col - aux >= 0 and grid[lin - aux ][col - aux] == player:
        count += 1
        aux += 1

    # Check bottom-right
    aux = 1
    while lin + aux < 6 and col + aux < 7 and grid[lin + aux][col + aux] == player:
        count += 1
        aux += 1

    return count

def checkDiagonal2(lin, col, player):
    count = 0

    # Check bottom-left
    aux = 0
    while lin + aux < 6 and col - aux >= 0 and grid[lin + aux ][col - aux] == player:
        count += 1
        aux += 1

    # Check top-right
    aux = 1
    while lin - aux >= 0 and col + aux < 7 and grid[lin - aux][col + aux] == player:
        count += 1
        aux += 1

    return count

def hasWinner(lin, col, player):
    if checkLine(lin, col, player) >= 4: return True
    elif checkColumn(lin, col, player) >= 4: return True
    elif checkDiagonal1(lin, col, player) >= 4: return True
    elif checkDiagonal2(lin, col, player) >= 4: return True
    else: return False

def addVictory(player):
    print(f"Player {player} wins!")
    victories[player - 1] += 1

def isFull():
    for lin in range(len(grid) - 1, -1, -1):
        for col in range(len(grid[lin])):
            if grid[lin][col] == 0: 
                return False
    return True

def startRound(player):
    global grid
    grid = [row[:] for row in DEFAULT_GRID]

    while True:
        printGrid()
    
        move = int(input(f"Which column do you want to put {player}? ")) - 1
        while not isColValid(move):
            print("INVALID MOVE!")
            move = int(input("Choose a number between 1 and 7: ")) - 1
        print()

        i_lin = updateGrid(move, player)
        
        if i_lin >= 0:
            if hasWinner(i_lin, move, player):
                addVictory(player)
                break
            elif isFull():
                print("Draw")
                break

        player = 3 - player 

def startGame():
    continueGame = True

    player = 1
    while continueGame:
        startRound(player)

        print(f"ScoreBoard: {victories[0]} X {victories[1]}")

        if input("Do you want to continue? (y/n)? ") != "y":
            continueGame = False
        print()
            
        player = 3 - player

if __name__ == '__main__':
    startGame()
