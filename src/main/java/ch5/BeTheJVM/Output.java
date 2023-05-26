package ch5.BeTheJVM;

public class Output {
    public static void main(String[] args) {
        Output output = new Output();
        output.go();
    }

    void go() {
        int value = 7;
        for (int i = 1; i < 8; i++) {
            value++;
            if (i > 4) {
                System.out.print(++value + " ");
            }
            if (value > 14) {
                System.out.print("i = " + i);
                break;
            }
        }
    }
}

// Output will be
// 13 15 i = 6