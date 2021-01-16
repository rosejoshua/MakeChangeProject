## Make Change Project

### Description

This is a simple console based Java application source code for inputing an item price followed by an amount paid both as a double, and giving change in the minimum number of denominations. The program also checks whether the amount paid covers the cost and provides an appropriate print statement if not.

### Topics and Technologies Used

* conditionals (if/else)
* integer division and modulus division
* printf()
* recursion

### How to Run

Compile java application and run. Follow prompts.

### Lessons Learned

The main problem that took me the longest to solve was handling the String printout of integer dollar and cents amounts. Printf() was needed when printing the amount of change due to the right of the decimal point because my first attempt using %100 to print cents resulted in pennies ending up in the tens position if there was supposed to be a zero in the tenths. Looking at my code now, I realize it would be wise to use a for-loop for printing denomination amounts as there is a lot of repeated code. However, the nature of money denominations not sharing a common base (.01, .05, .1, .25, et al) and grammatical differences of denomination plurals complicates shared code in a for-loop.
