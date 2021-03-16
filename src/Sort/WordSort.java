package Sort;

import java.io.*;

public class WordSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strArr = new String[N];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = br.readLine();
        }
        br.close();

        quickSort(strArr, 0, strArr.length);

        bw.flush();
        bw.close();
    }

    static void quickSort(String[] strArr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pi = partition(strArr, left, right);
        quickSort(strArr, left, pi - 1);
        quickSort(strArr, pi + 1, right);
    }

    static int partition(String[] strArr, int left, int right) {
        String pivot = strArr[(left + right) / 2];
        int i = left, j = right;

        while (i < j) {
            while (pivot.length() < strArr[j].length()) {
                j--;
            }

            while (i < j && pivot.length() >= strArr[i].length()) {
                i++;
            }
        }
    }
}
