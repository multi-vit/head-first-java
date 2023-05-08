# Sharpen Your Pencil

Given the method below, which of the method calls are legal?
Put a checkmark next to the ones that are legal. (Some statements are there to assign values used in the method calls)

```
int calcArea(int height,int width){
    return height*width;
    }
```

int a = calcArea(7, 12); ✅ // 2 integers being passed in as expected

short c = 7;
calcArea(c, 15); ✅ // Short can be implicitly promoted to an int

int d = calcArea(57); ❌ // Only 1 argument being passed when 2 are required

calcArea(2,3); ✅ // But won't be stored anywhere

long t = 42;
int f = calcArea(t, 17); ❌ // Long can be bigger than int (even though this one isn't)

int g = calcArea(); ❌ // No arguments being passed, 2 are required

byte h = calcArea(4, 20); ❌ // Function is returning an int, which may be bigger than a byte (even though this one
isn't)

int j = calcArea(2, 3, 5); ❌ // 3 arguments being passed, when there should be 2
