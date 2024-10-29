# Configurações iniciais
DEFAULT_GRID = [[0]*7 for _ in range(6)]
victories = [0, 0]
player = 1

# Início do jogo
while True:
    grid = [row[:] for row in DEFAULT_GRID]
    while True:
        for lin in grid:
            print(lin)
        
        move = int(input(f"Qual coluna você quer colocar {player}? ")) - 1
        while not (0 <= move <= 6 and grid[0][move] == 0):
            print("MOVIMENTO INVÁLIDO!")
            move = int(input("Escolha um número entre 1 e 7: ")) - 1
        
        # Atualiza a grade
        for lin in range(5, -1, -1):
            if grid[lin][move] == 0:
                grid[lin][move] = player
                i_lin = lin
                break
        
        # Verifica vitória
        count = 1
        # Horizontal
        for direction in [-1, 1]:
            aux = move + direction
            while 0 <= aux < 7 and grid[i_lin][aux] == player:
                count += 1
                aux += direction
        if count >= 4:
            print(f"Player {player} wins!")
            victories[player - 1] += 1
            break
        
        count = 1
        # Vertical
        aux = i_lin + 1
        while aux < 6 and grid[aux][move] == player:
            count += 1
            aux += 1
        if count >= 4:
            print(f"Player {player} wins!")
            victories[player - 1] += 1
            break

        count = 1
        # Diagonal principal
        for direction in [-1, 1]:
            aux_lin, aux_col = i_lin + direction, move + direction
            while 0 <= aux_lin < 6 and 0 <= aux_col < 7 and grid[aux_lin][aux_col] == player:
                count += 1
                aux_lin += direction
                aux_col += direction
        if count >= 4:
            print(f"Player {player} wins!")
            victories[player - 1] += 1
            break
        
        count = 1
        # Diagonal secundária
        for direction in [-1, 1]:
            aux_lin, aux_col = i_lin + direction, move - direction
            while 0 <= aux_lin < 6 and 0 <= aux_col < 7 and grid[aux_lin][aux_col] == player:
                count += 1
                aux_lin += direction
                aux_col -= direction
        if count >= 4:
            print(f"Player {player} wins!")
            victories[player - 1] += 1
            break
        
        # Verifica se a grade está cheia
        if all(grid[lin][col] != 0 for lin in range(6) for col in range(7)):
            print("Empate")
            break
        
        player = 3 - player
    
    print(f"Placar: {victories[0]} X {victories[1]}")
    if input("Você quer continuar? (y/n)? ") != "y":
        break
