package ProblemBasicMath1;

import java.io.*;
import java.util.StringTokenizer;

public class FlyToAlphaCentauri {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
//            거리 값
            int distance = y - x;
//            모든 이동 횟수 중 가장 이동 거리가 긴 경우의 값
//            거리의 (소수점을 제외한)루트 값이다
            int max = (int) Math.sqrt(distance);
            int countFormula = 2 * max;

//            거리에 따라 max 값도 증가하는데 max 값이 변하는 지점에서
//            max 는 거리 값의 정확한 제곱근이 된다
            if (max == Math.sqrt(distance)) {
//                count 는 문제의 규칙 상 2 X max - 1 이 된다
                bw.write(countFormula - 1 + "\n");
//                max 값이 변하는 지점 사이에 count 를 기준으로 두 파트로
//                나뉘는 데 그 중 첫번째 파트는 아래 공식을 기준으로 한다
            } else if (distance <= max * max + max) {
//                문제의 규칙 상 2 X max + 1
                bw.write(countFormula + "\n");
//                마지막 파트는 다음 max 값의 변화 지점까지이기 때문에
//                특별한 제약조건 없이 남은 조건들이 모두 해당한다
            } else {
//                문제의 규칙 상 2 X max + 1
                bw.write(countFormula + 1 + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
