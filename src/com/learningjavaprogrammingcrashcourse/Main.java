package com.learningjavaprogrammingcrashcourse;

public class Main {

    public static void main(String[] args) {

        // Assignment Operators

        int x = 12;
        x *= 34;
        System.out.println(x);

        int y = 12;
        y = y * 34;
        System.out.println(y);

        int z = y -= 8;
        System.out.printf("y is %s, z is %s %n", y, z);
    }

//        //Short circuit evaluation
//        int a = 12;
//        int b = 6;

//        if (b != 0) {
//            int c = divideTwoNumbers(a, b);
//
//            if (c == 2) {
//                System.out.println("We've found a 2.");
//            }
//        }
//        if (b != 0 && divideTwoNumbers(a, b) == 2) {
//            System.out.println("We've found a 2.");
//
//        }
//    }
//
//    private static int divideTwoNumbers(int x, int y) {
//        return x / y;
//    }


//// Relational Operators return boolean true or false
//
//        int second = 31;
//        int minute = 1;
//
//        if  ((minute < 59) && ((second +1) > 59)) {
//            minute++;
//        }


//  Remainder Operator code
//        int x = 12;
//        int y = 5;
//
//        if (x % y == 0) {
//            System.out.printf("%s divides exactly into %s%n", y, x);
//        } else {
//            System.out.printf("%s does not divide exactly into %s%n", y, x);
//        }
//
//        for (int month = 1; month <=12; month++) {
//            System.out.printf("The next month after %s is %s%n", month, month % 12 + 1);
//        }
//    }
//
//


//     // Integer division only uses integer part of calculations so 3/4 = 0
//        // where as Floating point would be 3/4  = 0.75
//        double a = 12 * 3 / 4;
//        double b = (12 * 3) / 4;
//        double c = 12 * (3 / 4);
//        System.out.printf("%s %s %s %n", a, b, c);
//        System.out.println();
//
//     //Floating point division
//         a = 12 * 3 / 4.0;
//         b = (12 * 3) / 4.0;
//         c = 12 * (3 / 4.0);
//        System.out.printf("%s %s %s %n", a, b, c);
//        System.out.println();
//
//        double d = 12.0 / 3.0 / 4.0;
//        double e = (12.0 / 3.0) / 4.0;
//        double f = 12.0 / (3.0 / 4.0);
//        System.out.printf("%s %s %s %n", d, e, f);
//        System.out.println();
//
//        int x = 12 + 3 * 4;
//        int y = (12 + 3) * 4;
//        int z = 12 + (3 * 4);
//        System.out.printf("%s %s %s %n", x, y, z);
//
//
//    }
}
