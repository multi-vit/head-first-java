# Prep Code

Pseudocode to help focus on logic without the worry of syntax

We are going to make a very simple version of battleships, that is one-sided only and features start up firms instead of
ships!

## SimpleStartUp Object

| SimpleStartUp                      |
|------------------------------------|
| int [] locationCells               |
| int numOfHits                      |
| ---------------------------------- |
| String checkYourself(int guess)    |
| void setLocationCells(int [] loc)  |

**DECLARE** an *int array* to hold the location cells. Call it **locationCells**.  
**DECLARE** an *int* to hold the number of hits. Call it **numOfHits** and **SET** it to 0

---

**DECLARE** a *checkYourself()* method that takes an **int** for the user's guess (1, 3, etc.), checks it, and returns a
result representing a "hit", "miss" or "kill"  
**DECLARE** a *setLocationCells()* setter method that takes an **int array** (which has the three cell locations as *
*ints** (2, 3, 4, etc.)).

---

**METHOD**: *String checkYourself(int userGuess)*  
&nbsp; **GET** the user guess as an int parameter

> **REPEAT** with each of the location cells in the *int array*  
> &nbsp; &nbsp; // **COMPARE** the user guess to the location cell:
> > &nbsp; &nbsp; **IF** the user guess matches:  
> > &nbsp; &nbsp; &nbsp; **INCREMENT** the number of hits  
> > &nbsp; &nbsp; &nbsp; // **FIND OUT** if it was the last location cell:
> > > &nbsp; &nbsp; &nbsp; **IF** number of hits is 3, **RETURN** "kill" as the result  
> > > &nbsp; &nbsp; &nbsp; **ELSE** it was not a kill, so **RETURN** "hit"  
> > > &nbsp; &nbsp; &nbsp; END IF
> >
> > &nbsp; &nbsp; **ELSE** the user guess did not match, so **RETURN** "miss"  
> > &nbsp; &nbsp; END IF
>
> END REPEAT

END METHOD

---

**METHOD**: *void setLocationCells(int [] cellLocations)*  
&nbsp; **GET** the cell locations as an *int array* parameter  
&nbsp; **ASSIGN** the cell locations parameter to the cell locations instance variable  
END METHOD

---

## SimpleStartUpGame

| SimpleStartUpGame     |
|-----------------------|
| SimpleStartUp object  |
| int numOfGuesses<     |
| boolean isAlive       |
| int [] locations      |
| --------------------- |
| main (String [] args) |
|                       |

**DECLARE** an *int* to hold the number of user guesses. Call it **numOfGuesses** and **SET** it to 0
**DECLARE** a boolean variable representing the state of the game, named isAlive. **SET** it to true.

---

**METHOD**: *public static void main(string [] args)*

&nbsp; **MAKE** a SimpleStartUp instance, passing in the location cells  
&nbsp; **COMPUTE** a random number between 0 and 4 that will be the starting cell location    
&nbsp; **ASSIGN** the starting location and consecutive 2 numbers to locations array  
&nbsp; **INVOKE** the setLocationCells() method on the SimpleStartUp instance
> &nbsp; **REPEAT** while the SimpleStartUp is still alive:  
> &nbsp; &nbsp; **GET** a guess from the user  
> &nbsp; &nbsp; // **CHECK** the guess:  
> &nbsp; &nbsp; &nbsp; **INVOKE** the *checkYourself()* method on the SimpleStartUp instance    
> &nbsp; &nbsp; **INCREMENT** *numOfGuesses* variable  
> &nbsp; &nbsp; // **CHECK** for Startup death:
>> &nbsp; &nbsp; &nbsp; IF result is "kill":  
> > &nbsp; &nbsp; &nbsp; &nbsp; **SET** *isAlive* to false (so we won't enter loop again)  
> > &nbsp; &nbsp; &nbsp; &nbsp; **PRINT** the number of user guesses  
> > &nbsp; &nbsp; &nbsp; END IF
>
> &nbsp; END REPEAT

END METHOD

---
