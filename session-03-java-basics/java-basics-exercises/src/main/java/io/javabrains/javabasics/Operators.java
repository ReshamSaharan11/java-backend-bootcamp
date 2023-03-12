package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
         int a = 10;
         int b = 5;

        // Step 2: Perform arithmetic operations
        int add = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;

        // Step 3: Print the results of the arithmetic operations
        System.out.println("add = " + add);
        System.out.println("diff = " + diff);
        System.out.println("mul = " + mul);
        System.out.println("div = " + div);

        // Step 4: Perform increment and decrement operations
         a++;
         b--;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println(a);
        System.out.println(b);

        // Step 6: Perform comparison operations
          boolean isALarger = a > b;

        // Step 7: Print the results of the comparison operations
        System.out.println("isLarger = " + isALarger);

        // Step 8: Perform logical operations
         boolean isBLarger = b > a;
         boolean isAlwaysFalse = (isALarger) && (isBLarger);
         boolean isAlwaysTrue = (isALarger) || (isBLarger);


        // Step 9: Print the results of the logical operations
        System.out.println("isAlwaysTrue = " + isAlwaysTrue);
        System.out.println("isAlwaysFalse = " + isAlwaysFalse);

    }
}
