package Recursion;

import java.io.*;
import java.util.Arrays;

public class StarPicking10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();
        char[][] starArr = new char[N][N];
        for (int i = 0; i < starArr.length; i++) {
            Arrays.fill(starArr[i], ' ');
        }

        recursiveStarPicking(N, 0, 0, starArr);

        for (char[] arr : starArr) {
            for (char star : arr) {
                bw.write(String.valueOf(star));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    static void recursiveStarPicking(int n, int firstIndex, int secondIndex, char[][] starArr) {
        int stack = n / 3;
        starArr[firstIndex][secondIndex] = '*';
        starArr[firstIndex][secondIndex + stack] = '*';
        starArr[firstIndex][secondIndex + (stack * 2)] = '*';
        starArr[firstIndex + stack][secondIndex] = '*';
        starArr[firstIndex + stack][secondIndex + (stack * 2)] = '*';
        starArr[firstIndex + (stack * 2)][secondIndex] = '*';
        starArr[firstIndex + (stack * 2)][secondIndex + stack] = '*';
        starArr[firstIndex + (stack * 2)][secondIndex + (stack * 2)] = '*';
        if (n == 3) {
            return;
        } else {
            recursiveStarPicking(stack, firstIndex, secondIndex, starArr);
            recursiveStarPicking(stack, firstIndex, secondIndex + stack, starArr);
            recursiveStarPicking(stack, firstIndex, secondIndex + (stack * 2), starArr);
            recursiveStarPicking(stack, firstIndex + stack, secondIndex, starArr);
            recursiveStarPicking(stack, firstIndex + stack, secondIndex + (stack * 2), starArr);
            recursiveStarPicking(stack, firstIndex + (stack * 2), secondIndex, starArr);
            recursiveStarPicking(stack, firstIndex + (stack * 2), secondIndex + stack, starArr);
            recursiveStarPicking(stack, firstIndex + (stack * 2), secondIndex + (stack * 2), starArr);
        }
    }
}
