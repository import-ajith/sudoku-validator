package com.interview;

import com.interview.exception.SudokuException;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author Ajithlal
 * @project SudokuValidator
 */
public class SudokuValidator {
    public static void main(String[] args) throws Exception {
        String path=args[0];
        System.out.println(isValidSudoku( path ));
    }

  /**
     * check whether provided input is valid or not based on unique condition
     * @param path
     * @return 0 (VALID),1(INVALID)
     */
    public static String isValidSudoku(String path) throws Exception {
        //read input from csv
        String matrix[][]=readCSVIntoMatrix( path );
        HashSet<String> validMatrix=new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String value= matrix[i][j];
                if (Integer.parseInt( value)<= 0 || Integer.parseInt(value)> 9 ){
                    throw new SudokuException("2- Entries should be in between 0 and 10");
                }
                /**
                 * checking 3 condition for valid sudoku
                 * 1.Each row must contain the digits 1-9 without repetition.
                 * 2.Each column must contain the digits 1-9 without repetition.
                 * 3.Each of the nine 3 x 3 sub-matrix of the matrix must contain
                 * the digits 1-9 without repetition.
                 */
                if (!validMatrix.add( value+" found in row "+i)
                        || !validMatrix.add( value+ " found in column "+j )
                        || !validMatrix.add( value+ " found in sub matrix "+i/3+" - "+j/3 )){
                    return "1 - Sudoku entries has duplicate";
                }
            }
            if (matrix[i].length!= matrix.length){
                throw new SudokuException("3- Matrix row and column size should be equal");
            }
        }
        return "0";
    }

    /**
     * This method read input data from csv to matrix
     * @param path
     * @return
     * @throws FileNotFoundException
     * @throws Exception
     */
    private static String[][] readCSVIntoMatrix(String path) throws FileNotFoundException, Exception {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            Collection<String[]> lines = new ArrayList<>();
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                lines.add(line.split(","));
            }
            if (lines.size()!=9) {
                throw new SudokuException( "4- The matrix size should be 9" );
            }
            return lines.toArray(new String[lines.size()][]);
        }
    }



}
