package com.learningjavaprogrammingcrashcourse;

public class Main {

    public static void main(String[] args) {

     // Integer division only uses integer part of calculations so 3/4 = 0
        // where as Floating point would be 3/4  = 0.75
        double a = 12 * 3 / 4;
        double b = (12 * 3) / 4;
        double c = 12 * (3 / 4);
        System.out.printf("%s %s %s %n", a, b, c);
        System.out.println();

     //Floating point division
         a = 12 * 3 / 4.0;
         b = (12 * 3) / 4.0;
         c = 12 * (3 / 4.0);
        System.out.printf("%s %s %s %n", a, b, c);
        System.out.println();

        double d = 12.0 / 3.0 / 4.0;
        double e = (12.0 / 3.0) / 4.0;
        double f = 12.0 / (3.0 / 4.0);
        System.out.printf("%s %s %s %n", d, e, f);
        System.out.println();

        int x = 12 + 3 * 4;
        int y = (12 + 3) * 4;
        int z = 12 + (3 * 4);
        System.out.printf("%s %s %s %n", x, y, z);


    }
}
