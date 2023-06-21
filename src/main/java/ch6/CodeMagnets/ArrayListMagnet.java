package ch6.CodeMagnets;

import java.util.ArrayList;

public class ArrayListMagnet {
    public static void printList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printList(a);
        if (a.contains("three")) {
            a.add("four");
        }
        a.remove(2);
        printList(a);
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printList(a);
        if (a.contains("two")) {
            a.add("2.2");
        }
        printList(a);
    }
}










