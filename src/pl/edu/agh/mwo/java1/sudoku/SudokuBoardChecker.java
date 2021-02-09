package pl.edu.agh.mwo.java1.sudoku;

public class SudokuBoardChecker {
  public static boolean contains(int[] array, int value) {
    boolean result = false;

    for(int i : array){
      if(i == value){
        result = true;
        break;
      }
    }

    return result;
}

  public static void verifyBoardStructure(int[][] board) {
    boolean isBoardStructureCorrect = true;
    int[] possibleInputs = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    for (int row = 0; row < SudokuBoardGenerator.SIZE; row++) {
      for (int col = 0; col < SudokuBoardGenerator.SIZE; col++) {
        if (!(contains(possibleInputs, board[row][col]))) {
          isBoardStructureCorrect = false;
          System.out.print("Input:" + board[row][col] + " ");
          System.out.print("row:" + row + " ");
          System.out.print("col:" + col + " ");
          System.out.println();
        } 
      }
    }

    System.out.println("Board Structure is correct: " + isBoardStructureCorrect + "\n");
  }

  public static void verifyBoard(int[][] board) {
    boolean isBoardCorrect = true;

    // Check rows
    for (int row = 0; row < SudokuBoardGenerator.SIZE; row++) {
      for (int col = 0; col < SudokuBoardGenerator.SIZE; col++) {
        for (int i = col + 1; i < SudokuBoardGenerator.SIZE; i++) {
          if ((board[row][col] == board[row][i]) && (board[row][col] != 0)) {
            isBoardCorrect = false;
          }   
        }
      }
    }

    // Check columns
    for (int col = 0; col < SudokuBoardGenerator.SIZE; col++) {
      for (int row = 0; row < SudokuBoardGenerator.SIZE; row++) {
        for (int i = row + 1; i < SudokuBoardGenerator.SIZE; i++) {
          if ((board[row][col] == board[i][col]) && (board[row][col] != 0)) {
            isBoardCorrect = false;
          }   
        }
      }
    }

    // Check squares
    for (int rowSet = 0; rowSet < SudokuBoardGenerator.SIZE; rowSet += 3) {
      for (int colSet = 0; colSet < SudokuBoardGenerator.SIZE; colSet += 3) {
        for (int row = rowSet; row < rowSet + 3; row++) {
          for (int col = colSet; col < colSet + 3; col++) {
            for (int rowCheck = row; rowCheck < rowSet + 3; rowCheck++) {
              for (int colCheck = colSet; colCheck < colSet + 3; colCheck++) {
                if ((board[row][col] == board[rowCheck][colCheck]) && (board[row][col] != 0)) {
                  if (!((row == rowCheck) && (col == colCheck))) {
                    isBoardCorrect = false;
                  }
                }
              }
            }
          }
        }
      }
    }
    
    System.out.println("Board is correct: " + isBoardCorrect + "\n");
  }
}