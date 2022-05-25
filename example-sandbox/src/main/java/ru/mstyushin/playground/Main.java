package ru.mstyushin.playground;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String[] s = in.nextLine().split(" ");
        int[] inputArray = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            inputArray[i] = Integer.parseInt(s[i]);
        }

        int target = Integer.parseInt(in.nextLine());

        int[] result;
        result = Solution.twoSum(inputArray, target);

        System.out.println("Result: ");
        System.out.println(Arrays.toString(result));

    }
}
