package BruteForce;

import java.io.*;

public class FilmDirectorShum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        String result = "666";

        if (N != 1) {
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                count++;
                char[] numDigit = String.valueOf(i).toCharArray();
                if (numDigit[numDigit.length - 1] != '6') {
                    result = i + "666";
                } else {
                    int sixCount = 0;
                    for (int j = numDigit.length - 1; j >= 0; j--) {
                        if (numDigit[j] == '6') {
                            sixCount++;
                            continue;
                        }
                        break;
                    }
                    for (int j = 0; j < Math.pow(10, sixCount); j++) {
                        result = String.valueOf((int) (666 * Math.pow(10, sixCount)) + j);
                        for (int k = 0; k < numDigit.length - sixCount; k++) {
                            result = numDigit[k] + result;
                        }
                        if (count == N || j == Math.pow(10, sixCount) - 1) {
                            break;
                        }
                        count++;
                    }
                }
                if (count == N) {
                    break;
                }
            }
        }
        bw.write(result);
        bw.flush();
        bw.close();
//        666
//        1666
//        2666
//        3666
//        4666
//        5666
//        6660
//        6661
//        6662
//        6663
//        6664
//        6665
//        6666
//        6667
//        6668
//        6669
//        7666
    }
}
