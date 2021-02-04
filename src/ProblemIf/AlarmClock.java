package ProblemIf;

import java.io.*;
import java.util.StringTokenizer;

public class AlarmClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        br.close();

        int hour = Integer.parseInt(stk.nextToken());
        int minute = Integer.parseInt(stk.nextToken());

        minute -= 45;
        if (minute < 0) {
            hour -= 1;
            if (hour < 0) {
                hour = 23;
            }
            minute += 60;
        }

        bw.write(hour + " ");
        bw.write(Integer.toString(minute));

        bw.flush();
        bw.close();
    }
}
