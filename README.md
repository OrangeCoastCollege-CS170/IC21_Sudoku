# IC21_Sudoku
##Badajoz, Seve</br>CS A170</br>November 16, 2016</br></br>IC21
###The classic Sudoku game involves a grid of 81 squares. The grid is divided into nine boxes, each containing nine squares.</br></br>The rules of the game are simple: each of the nine boxes has to contain all the numbers 1-9 within its squares. Each number can only appear once in a row, column or box.
To implement a Sudoku game in Java, we are going to use 3 different two-dimensional arrays as follows:

Array #1)  Declare and initialize a 9x9 array named initialPuzzle which stores all the initial values presented to the user.  A zero in the array indicates that the square is empty and the user needs to guess the value.  Any number other than zero will be displayed on screen.  The initialPuzzle array is what the user will see at the start of the Sudoku game and whenever s/he decides to reset the puzzle.  Here is the initial array, which you can copy/paste into your project above public static void main(String[ ] args)
```
public static int[][] initialPuzzle = {

{9,0,0,8,0,5,0,0,6},

{1,0,3,0,0,0,5,0,4},

{0,6,0,0,2,0,0,7,0},

{0,0,7,1,0,8,6,0,0},

{4,0,0,0,0,0,0,0,9},

{0,0,9,7,0,3,1,0,0},

{0,9,0,0,1,0,0,6,0},

{3,0,2,0,0,0,4,0,7},

{5,0,0,3,0,2,0,0,1}

};
```
Array #2)  Declare and initialize a 9x9 array named solvedPuzzle which stores the solution values (like an answer key).  This array will be used to determine whether the player won.  Here is the solvedPuzzle array, which you can copy/paste into your project above public static void main(String[ ] args)
```
public static int[][] solvedPuzzle = {

{9,7,4,8,3,5,2,1,6},

{1,2,3,9,6,7,5,8,4},

{8,6,5,4,2,1,9,7,3},

{2,3,7,1,9,8,6,4,5},

{4,8,1,2,5,6,7,3,9},

{6,5,9,7,4,3,1,2,8},

{7,9,8,5,1,4,3,6,2},

{3,1,2,6,8,9,4,5,7},

{5,4,6,3,7,2,8,9,1}

};
```
Array #3)  Declare and initialize a 9x9 array named workingPuzzle which stores the user input.  At the start of the game, the workingPuzzle is filled with the values from the initialPuzzle array.This array will be used to determine whether the player won.  Here is the solvedPuzzle array, which you can copy/paste into your project above public static void main(String[ ] args)

```
public static int[][] workingPuzzle = new int[ROWS][COLS];
```
***Note: ROWS and COLS are two constants you will need to define.  Both should have the value 9***

After you have defined all three arrays, you will need to create three static methods:

**Method #1)  `public static void resetPuzzle()`**

In this method, the workingPuzzle array will be "reset" back to the values in the initialPuzzle array.  You can do this by looping through all the elements in the workingPuzzle and setting them equal to the elements in the initialPuzzle.  This method will be called when the game first starts and when the user chooses to "Reset Puzzle (R)".

**Method #2)  `public static void printPuzzle()`**

In this method, the puzzle will be printed to the console with a header for the column numbers "C 1 2 3 4 5 6 7 8 9", followed by a row header "R  ---------------------------" and then each row of the workingPuzzle is displayed.  

Each row is displayed first with the row number (e.g. 1), then two spaces, then the vertical divider "|", followed by each value in that row of the workingPuzzle.  If the value in the workingPuzzle is 1-9, display it on screen.  If the value is 0, print a period "." instead of the 0 so that the user will know it's a free space. 

This method will be called when the game starts, after the user sets a square (makes a move) and when the user chooses to "Reset Puzzle (R)".

An image of what to print (sample) looks like this:
![Just the Puzzle](1)

**Method #3)  `public static boolean gameIsWon()`**

In this method, all the elements in the workingPuzzle array will be compared to all the elements in the solvedPuzzle array.  If any of the elements differ, the method should return false.  If all of the elements are the same, the method should return true.

This method will be called after the user sets a square on the board.  

__Below is a sample transaction of the game play (Set a square (S)):__

![sudoku snip](2)

__Below is a sample transaction of winning Sudoku (after setting all the squares correctly):__

![sudoku win](3)

__Below is a sample transaction of the game play (Reset Puzzle (R)):__

![reset](4)

