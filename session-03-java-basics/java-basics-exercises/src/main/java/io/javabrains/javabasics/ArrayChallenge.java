package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] numbers = {2,6,9,-1,55,31,10};


        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int sum = 0;
        double avg = 0;
        int count = 0;
        int max = -(int)1e9;

        for(int ele : numbers){
            sum += ele;
            count++;
             max = Math.max(max,ele);
        }

        System.out.println(sum);
        System.out.println(sum/count);
        System.out.println(max);

    }
}
