# Mine Sweeper Game

This project is implemented in Java to create the Mine Sweeper game.

## Variables

- `SIZE`: A constant determining the size of the game board. For example, for a 5x5 board, `SIZE = 5` can be set.
- `MINES`: A constant determining the number of mines to be placed on the game board.
- `board`: A character array representing the game board (`char[][]`).
- `mineLocations`: A logical array holding the positions of mines (`boolean[][]`).
- `remainingCells`: A variable holding the number of remaining cells to be opened in the game.

## Methods

- `initializeBoard()`: A method that initializes the game board with "-" character and fills the board array.
- `placeMines()`: A method that places mines on the game board. It generates random mine positions using the `Random` class.
- `printBoard()`: A method that prints the game board to the console. It shows the current state of the game board to the player.
- `isValid(int row, int col)`: A method that checks whether the given row and column are valid positions on the game board.
- `revealCell(int row, int col)`: A recursive method that opens the specified cell and checks neighboring cells. If the opened cell is a mine, it ends the game.
- `countAdjacentMines(int row, int col)`: A method that counts the number of mines around the specified cell.
- `revealMines()`: A method that reveals all mines on the game board. It is used when the game ends.

## Console Input/Output Operations

- `main()`: The main method that controls the flow of the game. It takes user inputs, updates the game board, and prints the result to the console.