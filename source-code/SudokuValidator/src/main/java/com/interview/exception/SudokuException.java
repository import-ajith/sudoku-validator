package com.interview.exception;

/**
 * CustomException for Sudoku Program
 * @author Ajithlal
 * @project SudokuValidator
 */
public class SudokuException extends Exception{

    public SudokuException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}
