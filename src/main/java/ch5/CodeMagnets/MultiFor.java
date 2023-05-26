package ch5.CodeMagnets;

public class MultiFor {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > 2; j--) {
                System.out.println(i + " " + j);
            }
            if (i == 1) {
                i++;
            }
        }
    }
}

/*
Output needs to be
0 4
0 3
1 4
1 3
3 4
3 3
* */