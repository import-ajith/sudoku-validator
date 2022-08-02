package com.interview;

import com.interview.exception.SudokuException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ajithlal
 * @project SudokuValidator
 */
class SudokuValidatorTest {

    @Test
    void isValidSudokuValid() throws Exception {
        Assertions.assertEquals("0",SudokuValidator.isValidSudoku( "src/test/resources/valid-puzzleName.txt" ));
    }

    @Test
    void isValidSudokuInvalid() throws Exception {
        Assertions.assertEquals("1 - Sudoku entries has duplicate",SudokuValidator.isValidSudoku( "src/test/resources/invalid-puzzleName.txt" ));
    }

    @Test
    void isValidSudokuException() {
        SudokuException thrown = assertThrows(
                SudokuException.class,
                () -> SudokuValidator.isValidSudoku("src/test/resources/exception-puzzleName.txt")
        );
        assertTrue(thrown.getMessage().contains("3- Matrix row and column size should be equal"));
    }

    @Test
    void isValidSudokuExceptionRange() {
        SudokuException thrown = assertThrows(
                SudokuException.class,
                () -> SudokuValidator.isValidSudoku("src/test/resources/exception0-10-puzzleName.txt")
        );
        assertTrue(thrown.getMessage().contains("2- Entries should be in between 0 and 10"));
    }
}