package pl.edu.agh.mwo.java1.sudoku;

public class SudokuApp {
  public static void main(String[] args) {
    // Sudoku board with incorrect structure
    SudokuBoardWriter.writeBoard(SudokuBoardGenerator.incorrectStructure());
    SudokuBoardChecker.verifyBoardStructure(SudokuBoardGenerator.incorrectStructure());

    // Correctly populated sudoku board
    SudokuBoardWriter.writeBoard(SudokuBoardGenerator.correctBoard());
    SudokuBoardChecker.verifyBoardStructure(SudokuBoardGenerator.correctBoard());
    SudokuBoardChecker.verifyBoard(SudokuBoardGenerator.correctBoard());
  
    // Sudoku board with 2 same values in one square   
    SudokuBoardWriter.writeBoard(SudokuBoardGenerator.twoSameInSquare());
    SudokuBoardChecker.verifyBoardStructure(SudokuBoardGenerator.twoSameInSquare());
    SudokuBoardChecker.verifyBoard(SudokuBoardGenerator.twoSameInSquare());

    // Sudoku board with 2 same values in one row
    SudokuBoardWriter.writeBoard(SudokuBoardGenerator.twoSameInRow());
    SudokuBoardChecker.verifyBoardStructure(SudokuBoardGenerator.twoSameInRow());
    SudokuBoardChecker.verifyBoard(SudokuBoardGenerator.twoSameInRow());

    // Sudoku board with 2 same values in one column
    SudokuBoardWriter.writeBoard(SudokuBoardGenerator.twoSameInColumn());
    SudokuBoardChecker.verifyBoardStructure(SudokuBoardGenerator.twoSameInColumn());  
    SudokuBoardChecker.verifyBoard(SudokuBoardGenerator.twoSameInColumn());  
  }
}