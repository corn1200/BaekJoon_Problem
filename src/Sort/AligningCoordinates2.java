package Sort;

import java.io.*;
import java.util.StringTokenizer;

public class AligningCoordinates2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] location = new int[2][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            location[1][i] = Integer.parseInt(stk.nextToken());
            location[0][i] = Integer.parseInt(stk.nextToken());
        }

        quickSort(location, 0, N - 1);

        for (int i = 0; i < N; i++) {
            bw.write(location[1][i] + " " + location[0][i] + "\n");
        }

        bw.flush();
        bw.close();
    }

    static void quickSort(int[][] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pi = partition(arr, left, right);
        quickSort(arr, left, pi - 1);
        quickSort(arr, pi + 1, right);
    }

    static int partition(int[][] arr, int left, int right) {
        int pivot = arr[0][(left + right) / 2];
        int pivot2 = arr[1][(left + right) / 2];
        int i = left, j = right;

        while (i < j) {
            while (pivot < arr[0][j] || (pivot == arr[0][j] && pivot2 < arr[1][j])) {
                j--;
            }

            while (i < j && (pivot > arr[0][i] || (pivot == arr[0][i] && pivot2 > arr[1][i]))) {
                i++;
            }
            swap(arr, i, j);
        }
        return i;
    }

    static void swap(int[][] arr, int i, int j) {
        int temp = arr[0][i], temp2 = arr[1][i];
        arr[0][i] = arr[0][j];
        arr[1][i] = arr[1][j];
        arr[0][j] = temp;
        arr[1][j] = temp2;
    }
}
