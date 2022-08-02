# sudoku-validator

Sudoku Validator
Procedure 
1.	Setup jdk path in OS environment variable 
2.	Place SudokuValidator.jar and validate.bat in the same directory
3.	Run below command in CMD for windows
            .\validate.bat input-files\valid-puzzleName.txt
            
         Note: input-files\valid-puzzleName.txt is input file path
Results
1.	Valid Sudoku input: Return 0 for valid input
 
2.	Invalid Sudoku (Duplicate entries) input: Return nonzero
 
3.Invalid Sudoku (Contains other than 1-9) input: Return nonzero
 
4.Invalid Sudoku (Invalid Sudoku size) input: Return nonzero
 
5.Invalid Sudoku (Empty file) input: Return non zero
 

Junit and Coverage
 




