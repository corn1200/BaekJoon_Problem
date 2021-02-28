package Recursion;

import java.io.*;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();
        bw.write(String.valueOf(factorial(1, N)));
        bw.flush();
        bw.close();
    }

    static int factorial(int n, int stack) {
        if (stack <= 0) {
            return n;
        }
        n *= stack;
        stack--;
        return factorial(n, stack);
    }
}
