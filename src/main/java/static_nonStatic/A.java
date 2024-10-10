package static_nonStatic;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B();

        b1.x = 10;
        b2.x = 100;

        B.y = 20;

        System.out.println(b1.x);
        System.out.println(b2.x);

        System.out.println(B.y);

        Car poloGt = new Car();
        poloGt.brand = "VW";
        poloGt.color = "Black";
        poloGt.wheels = 4;

        Car benz = new Car();
        benz.brand = "Benz";
        benz.color = "White";
        benz.wheels = 5;

        System.out.println(poloGt);
        System.out.println(benz);

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        System.out.println(l1);

        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr);
    }
}

class B {
    int x;
    static int y;
}

class Car {
    static int wheels;
    String brand;
    String color;

    @Override
    public String toString() {
        return this.brand + ", " + this.color + ", " + this.wheels;
    }

//    public static void sumne() {
//        System.out.println(wheels, brand, color);
//    }
}