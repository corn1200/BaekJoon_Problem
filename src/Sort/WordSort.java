package Sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
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

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        for (String str : arr) {
            if (!map.containsKey(str)) {
                bw.write(str + "\n");
                map.put(str, str);
            }
        }
        bw.flush();
        bw.close();
    }
}
