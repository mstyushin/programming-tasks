import java.io.*;
import java.util.*;

public class Solution {

    static boolean[] twins(String[] a, String[] b) {
        boolean[] result = new boolean[Math.max(a.length, b.length)];
        char[] aiChars, biChars;
        ArrayList<Character> aiEven, aiOdd, biEven, biOdd;
        String ai, bi;
        if (a.length > 0 && b.length > 0) {
            for (int i = 0; i < Math.max(a.length, b.length); i++) {
                try {
                    ai = a[i];
                    bi = b[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    result[i] = false;
                    continue;
                }

                if (ai.length() != bi.length()) {
                    result[i] = false;
                    continue;
                }

                aiChars = ai.toCharArray();
                biChars = bi.toCharArray();
                aiEven = new ArrayList<>();
                aiOdd = new ArrayList<>();
                biEven = new ArrayList<>();
                biOdd = new ArrayList<>();


                for (int j = 0; j < aiChars.length; j++) {
                    if (j % 2 == 0) {
                        aiEven.add(aiChars[j]);
                    } else {
                        aiOdd.add(aiChars[j]);
                    }
                }

                for (int k = 0; k < biChars.length; k++) {
                    if (k % 2 == 0) {
                        biEven.add(biChars[k]);
                    } else {
                        biOdd.add(biChars[k]);
                    }
                }
                result[i] = aiEven.containsAll(biEven) &&
                        aiOdd.containsAll(biOdd);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine().trim());
        String[] a = new String[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }

        int m = Integer.parseInt(in.nextLine().trim());
        String[] b = new String[m];
        for(int i = 0; i < m; i++) {
            b[i] = in.nextLine();
        }

        // call twins function
        boolean[] results = twins(a, b);

        for (boolean result : results) {
            System.out.println(result ? "Yes" : "No");
        }
    }
}
