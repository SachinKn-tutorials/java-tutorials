package javaTypes;

import java.util.ArrayList;
import java.util.List;

public class Sample_1 {
    // Variables
    int p = 10;
    String q = "20";
    List<Integer> l1 = new ArrayList<>();
    String name;

    // Constructor
    public Sample_1(String name) {
        this.name = name;
    }

    // Methods
    public int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(getDayType(Days.Sunday));

        A b = new B();
        b.sayMyName();
    }

    static String getDayType(Days day) {
        if (day == Days.Saturday || day == Days.Sunday)
            return "weekend";
        else
            return "weekday";
    }

}

interface Sample_2 {
    // Variables
    public static final int p = 10;
    public static final String q = "20";

    // Methods
    public abstract int add(int x, int y);
}

enum Days {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

@interface Sample_4 {

}

class A {
    public void sayMyName() {
        System.out.println("Sachin");
    }
}

class B extends A {
    @Override
    public void sayMyName() {
        System.out.println("Sachi");
    }
}

