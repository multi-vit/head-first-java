package ch4.BeTheCompiler;

// Won't compile
// Getter on line 15 is currently set to return nothing
// So needs changing from "void" to "String" as the return type
// If that is fixed, output will be:
// time: 1245
/*
public class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    void getTime() {
        return time;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();

        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
*/
