# sudoku-validator

Sudoku Validator
Procedure 

1. Setup jdk path in OS environment variable 

2. Place SudokuValidator.jar and validate.bat in the same directory

3. Run below command in CMD for windows

      .\validate.bat input-files\valid-puzzleName.txt
      
    Note: input-files\valid-puzzleName.txt is input file path
    
4. source code attached in the source-code folder         
  
Results

1.Valid Sudoku input: Return 0 for valid input
 
 ![valid](https://user-images.githubusercontent.com/7776645/182437897-f7b2d114-2bcb-4938-a735-530f4106cf66.png)
 
2.Invalid Sudoku (Duplicate entries) input: Return nonzero

![duplicate](https://user-images.githubusercontent.com/7776645/182437934-b08023e7-f4f6-49a0-a636-f1d911ee38d2.png)
 
3.Invalid Sudoku (Contains other than 1-9) input: Return nonzero

 ![range](https://user-images.githubusercontent.com/7776645/182437963-1c8f16ec-1de6-4f0e-8826-2b9e2d9d325f.png)

4.Invalid Sudoku (Invalid Sudoku size) input: Return nonzero

![invalid-size](https://user-images.githubusercontent.com/7776645/182437978-3bafe8bc-8834-4458-8a5d-0e8dbb1ed93f.png)

5.Invalid Sudoku (Empty file) input: Return non zero
 
![empty](https://user-images.githubusercontent.com/7776645/182437997-83c8495a-7fe4-453d-91b8-06ea4e0705f4.png)

Junit and Coverage

 ![coverage](https://user-images.githubusercontent.com/7776645/182438011-1680012e-4d03-4df8-b87e-0379009cdbe3.png)





