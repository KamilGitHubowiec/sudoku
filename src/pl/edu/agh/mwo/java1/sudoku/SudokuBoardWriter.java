package pl.edu.agh.mwo.java1.sudoku;

public class SudokuBoardWriter {
  public static void writeBoard(int[][] board) {
    for (int row = 0; row < SudokuBoardGenerator.SIZE; row++) {
      for (int col = 0; col < SudokuBoardGenerator.SIZE; col++) {
        System.out.print(board[row][col] + " ");
      }
      System.out.println();
    }
  }
}