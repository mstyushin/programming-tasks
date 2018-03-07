import java.util.Scanner;

class Solution{
    static int series(int a, int b, int n) {
        int res;
        if (n == 0) {
            return a + (int)Math.pow(2, n) * b;
        } else {
            res = series(a, b, n - 1) + (int)Math.pow(2, n) * b;
            return res;
        }
    }

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i = 0; i < q; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0 ; j < n; j++) {
                System.out.print(series(a, b, j) + " ");
            }
            System.out.println();

        }
        in.close();
    }
}
