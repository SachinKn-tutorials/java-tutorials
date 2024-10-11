package col;

import java.util.*;

public class Demo_5 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr);

        // List -------------------------------------------------------------
        /* it will follow order of insertion, it will allow duplicate
            get(index);
            add(element);
            add(index, element);
            remove(element);
            remove(index);
            indexOf(element);
            set(index, element);
            addAll(list);
            size();
         */
        System.out.println("------------------List-------------------");
        List l1 = new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(10);
        l1.add("Sachin");

        System.out.println(l1);

        l1.remove("Sachin");
        l1.remove(l1.indexOf(30));
//      l1.remove(l1.indexOf("Sachin"));

        System.out.println(l1);

        l1.add(1, 15);
        System.out.println(l1);

        l1.set(1, 14);
        System.out.println(l1);

        List l2 = new ArrayList();
        l2.addAll(l1);
        System.out.println(l2);

        System.out.println(l1.get(2));
        System.out.println(l1.size());

        for (int i=0; i<l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        for (Object l : l1) {
            System.out.println(l);
        }

        // Set ----------------------------------------------------------------
        /*  it will not follow order of insertion, it will not allow duplicate
            add(element);
            remove(element);
            addAll(list);
            size();
         */
        System.out.println("------------------Set-------------------");
        Set s1 = new HashSet<>();
        s1.add(30);
        s1.add(10);
        s1.add(20);
        s1.add(10);
        System.out.println(s1);
        s1.remove(20);
        System.out.println(s1);

        Set s2 = new HashSet<>();
        s2.addAll(s1);
        System.out.println(s2);

        System.out.println(s1.size());

        for (Object o: s1) {
            System.out.println(o);
        }

        Set s3 = new TreeSet();
        s3.add(30);
        s3.add(10);
        s3.add(40);
        s3.add(20);
        s3.add(10);
        System.out.println(s3);

        Set s4 = new TreeSet();
        s4.add("Zjabsdas");
        s4.add("Asbgshgd");
        s4.add("Xkjuahysg");
        s4.add("Pcccc");
        s4.add("Soahsas");
        s4.add("Paaaa");
        System.out.println(s4);
    }
}
