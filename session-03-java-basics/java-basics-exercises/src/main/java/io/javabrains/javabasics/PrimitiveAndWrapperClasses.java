package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int i = 10;
        long l = 122L;
        double d = 3.1444;
        boolean b = false;

        // Step 2: Convert primitive variables to wrapper objects

        Integer wrappedInteger = i;
        Long wrappedLong = l;
        Double wrappedDouble = d;
        Boolean wrappedBoolean = b;

        // Step 3: Print the values of the wrapper objects
        System.out.println("wrappedInteger = " + wrappedInteger);
        System.out.println("wrappedLong = " + wrappedLong);
        System.out.println("wrappedDouble = " + wrappedDouble);
        System.out.println("wrappedBoolean = " + wrappedBoolean);

        // Step 4: Convert wrapper objects back to primitive variables
        int num  = wrappedInteger.intValue();
        long val = wrappedLong.longValue();
        double d1 = wrappedDouble.doubleValue();
        boolean flag = wrappedBoolean.booleanValue();

        // Step 5: Print the values of the primitive variables
        System.out.println("num = " + num);
        System.out.println("val = " + val);
        System.out.println("d1 = " + d1);
        System.out.println("flag = " + flag);
    }
}
