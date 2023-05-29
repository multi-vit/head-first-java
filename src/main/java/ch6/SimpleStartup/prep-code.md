# Prep Code

## SimpleStartup Object

| SimpleStartup                                 |
|-----------------------------------------------|
| ArrayList<Integer> locationCells              |
| int numOfHits                                 |
| ----------------------------------            |
| String checkYourself(int guess)               |
| void setLocationCells(ArrayList<Integer> loc) |

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
> > &nbsp; &nbsp; &nbsp; **REMOVE** this cell from the array  
> > &nbsp; &nbsp; &nbsp; // **FIND OUT** if it was the last location cell:
> > > &nbsp; &nbsp; &nbsp; **IF** the array is now empty, **RETURN** "kill" as the result  
> > > &nbsp; &nbsp; &nbsp; **ELSE** it was not a kill, so **RETURN** "hit"  
> > > &nbsp; &nbsp; &nbsp; END IF
> >
> > &nbsp; &nbsp; **ELSE** the user guess did not match, so **RETURN** "miss"  
> > &nbsp; &nbsp; END IF
>
> END REPEAT

END METHOD

---

**METHOD**: *void setLocationCells(ArrayList<Integer> cellLocations)*  
&nbsp; **GET** the cell locations as an *int array* parameter  
&nbsp; **ASSIGN** the cell locations parameter to the cell locations instance variable  
END METHOD

---

## SimpleStartupGame

| SimpleStartupGame            |
|------------------------------|
| SimpleStartup object         |
| int numOfGuesses<            |
| boolean isAlive              |
| ArrayList<Integer> locations |
| ---------------------        |
| main (String [] args)        |
|                              |

**DECLARE** an *int* to hold the number of user guesses. Call it **numOfGuesses** and **SET** it to 0
**DECLARE** a boolean variable representing the state of the game, named isAlive. **SET** it to true.

---

**METHOD**: *public static void main(string [] args)*

&nbsp; **MAKE** a SimpleStartup instance, passing in the location cells  
&nbsp; **COMPUTE** a random number between 0 and 4 that will be the starting cell location    
&nbsp; **ASSIGN** the starting location and consecutive 2 numbers to locations array  
&nbsp; **INVOKE** the setLocationCells() method on the SimpleStartup instance
> &nbsp; **REPEAT** while the SimpleStartup is still alive:  
> &nbsp; &nbsp; **GET** a guess from the user  
> &nbsp; &nbsp; // **CHECK** the guess:  
> &nbsp; &nbsp; &nbsp; **INVOKE** the *checkYourself()* method on the SimpleStartup instance    
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
