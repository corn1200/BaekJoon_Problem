package Recursion;

import java.io.*;

public class HanoiTowerTransferOrder {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        br.close();

        bw.write((int) (Math.pow(2, N) - 1) + "\n");
        hanoiTowerTransferOrder(1, 3, N);
        bw.flush();
        bw.close();
    }

    static int hanoiTowerTransferOrder(int from, int to, int n) throws IOException {
        if (n == 1) {
            bw.write(from + " " + to + "\n");
            return 0;
        }
        hanoiTowerTransferOrder(from, 6 - from - to, n - 1);
        bw.write(from + " " + to + "\n");
        hanoiTowerTransferOrder(6 - from - to, to, n - 1);
        return 0;
    }
}