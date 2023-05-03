package ch3.BeTheCompiler;

public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;
        // Index 3 out of bounds for length 3
        while (z < 3) { // Was while (z < 4) and then z was incremented on next line immediately
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            z = z + 1;
        }
    }
}

