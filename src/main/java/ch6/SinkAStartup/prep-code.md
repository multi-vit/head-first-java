# Prep Code

## Startup Object

| Startup                                       |
|-----------------------------------------------|
| ArrayList<Integer> locationCells              |
| ----------------------------------            |
| String checkYourself(int guess)               |
| void setLocationCells(ArrayList<Integer> loc) |

**DECLARE** an *Integer ArrayList* to hold the location cells. Call it **locationCells**.

---

**DECLARE** a *checkYourself()* method that takes an **int** for the user's guess (1, 3, etc.), checks it, and returns a
result representing a "hit", "miss" or "kill"  
**DECLARE** a *setLocationCells()* setter method that takes an **Integer ArrayList** (which has the three cell locations
as *
*ints** (2, 3, 4, etc.)).

---

**METHOD**: *String checkYourself(int userGuess)*  
&nbsp; **GET** the user guess as an int parameter

> **REPEAT** with each of the location cells in the *int array*  
> &nbsp; &nbsp; // **COMPARE** the user guess to the location cell:
> > &nbsp; &nbsp; **IF** the user guess matches:  
> > &nbsp; &nbsp; &nbsp; **REMOVE** this cell from the ArrayList  
> > &nbsp; &nbsp; &nbsp; // **FIND OUT** if it was the last location cell:
> > > &nbsp; &nbsp; &nbsp; **IF** the ArrayList is now empty, **RETURN** "kill" as the result  
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
&nbsp; **GET** the cell locations as an *Integer ArrayList* parameter  
&nbsp; **ASSIGN** the cell locations parameter to the cell locations instance variable  
END METHOD

---

## StartupBust

| StartupBust           |
|-----------------------|
| GameHelper object     |
| ArrayList startups    |
| int numOfGuesses      |
| --------------------- |
| setUpGame()           |
| startPlaying()        |
| checkUserGuess()      |
| finishGame()          |

---

### Variable Declarations

**DECLARE** and instantiate the *GameHelper* instance variable, named *helper*.  
**DECLARE** and instantiate the *ArrayList* to hold the list of Startups (initially three). Call it *startups*.  
**DECLARE** an *int* variable to hold the number of user guesses (so that we can give the user a score at the end of the
game). Call it **numOfGuesses** and **SET** it to 0

---

### Method Declarations

**DECLARE** a *setUpGame()* method to create and initialise the Startup objects with names and locations. Display brief
instructions to the user.
**DECLARE** a *startPlaying()* method that asks the player for guesses and calls the checkUserGuess() method until all
the Startup objects are removed from play.
**DECLARE** a *checkUserGuess()* method that loops through all remaining Startup objects and calls each Startup object's
checkYourself() method.
**DECLARE** a *finishGame()* method that prints a message about the user's performance, based on how many guesses it
took to sink all the Startup objects.

---

### Method Implementations

**METHOD**: *void setUpGame()*

&nbsp; **CREATE** three Startup Objects  
&nbsp; **SET** a name for each startup    
&nbsp; **ADD** the Startups to *startups* (the ArrayList)
> &nbsp; **REPEAT** with each of the Startup objects in the *startup* List:  
> &nbsp; &nbsp; **CALL** the *placeStartup()* method on the helper object, to get a randomly-selected location for
> &nbsp; &nbsp; &nbsp; this Startup (three cells, vertically or horizontally aligned, on a 7 x 7 grid)  
> &nbsp; &nbsp; **SET** the location for each Startup based on the result of the *placeStartup()* call.
>
> &nbsp; END REPEAT

END METHOD

**METHOD**: *void startPlaying()*

> **REPEAT** while any Startups exist:  
> &nbsp; **GET** user input by calling the GameHelper *getUserInput()* method.  
> &nbsp; **EVALUATE** the user's guess by *checkUserGuess()* method.
>
> END REPEAT

END METHOD

**METHOD**: *void checkUserGuess(String userGuess)*  
// Find out if there's a hit (and kill) on any Startup  
&nbsp; **INCREMENT** the number of user guesses in the *numOfGuesses* variable.  
&nbsp; **SET** the local *result* variable (a *String*) to "miss", assuming that the user's guess will be a miss
> &nbsp; **REPEAT** with each of the Startup objects in the *startup* List:  
> &nbsp; &nbsp; **EVALUATE** the user's guess by calling the Startup object's *checkYourself()* method  
> &nbsp; &nbsp; **SET** the result to "hit" or "kill" if appropriate.
> &nbsp; &nbsp; **IF** the result is "kill", **REMOVE** the Startup from the *startups* List.
>
> &nbsp; END REPEAT

**DISPLAY** the result value to the user.  
END METHOD

**METHOD**: *void finishGame()*

&nbsp; **DISPLAY** a generic "game over" message, then:
> &nbsp; **IF** number of user guesses is small,  
> &nbsp; &nbsp; **DISPLAY** a congratulations message.  
> &nbsp; **ELSE** the result to "hit" or "kill" if appropriate.  
> &nbsp; &nbsp; **DISPLAY** an insulting one.
>
> &nbsp; END IF

END METHOD

---
