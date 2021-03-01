package Recursion;

import java.io.*;

public class FibonacciNumber5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();
        bw.write(String.valueOf(fibonacciNum(0, 1, n)));
        bw.flush();
        bw.close();
    }

    static int fibonacciNum(int n1, int n2, int stack) {
        if (stack == 0) {
            return n1;
        }
        stack--;
        return fibonacciNum(n2, n1 + n2, stack);
    }
}
