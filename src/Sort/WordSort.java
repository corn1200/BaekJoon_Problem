package Sort;

import java.io.*;
import java.util.HashMap;

public class WordSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }
        br.close();

        quickSort(arr, 0, arr.length - 1);

        for (String str : arr) {
            if (!map.containsKey(str)) {
                bw.write(str + "\n");
                map.put(str, str);
            }
        }
        bw.flush();
        bw.close();
    }

    static void quickSort(String[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pi = partition(arr, left, right);

        quickSort(arr, left, pi - 1);
        quickSort(arr, pi + 1, right);
    }

    static int partition(String[] arr, int left, int right) {
        String pivot = arr[left];
        int i = left, j = right;

        while (i < j) {
            while (pivot.length() < arr[j].length() || (pivot.length() == arr[j].length() && pivot.compareTo(arr[j]) < 0)) {
                j--;
            }

            while (i < j && (pivot.length() >= arr[i].length() || (pivot.length() == arr[j].length() && pivot.compareTo(arr[j]) > 0))) {
                i++;
            }
            swap(arr, i, j);
        }
        arr[left] = arr[i];
        arr[i] = pivot;
        return i;
    }

    static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
