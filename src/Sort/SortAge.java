package Sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Member {
    private int age, signOrder;
    private String name;

    Member(int age, String name, int signOrder) {
        this.age = age;
        this.name = name;
        this.signOrder = signOrder;
    }

    protected String getName() {
        return this.name;
    }

    protected int getAge() {
        return this.age;
    }

    protected int getSignOrder() {
        return this.signOrder;
    }
}

public class SortAge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Member[] members = new Member[N];

        for (int i = 0; i < members.length; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            members[i] = new Member(Integer.parseInt(stk.nextToken()), stk.nextToken(), i);
        }

        Arrays.sort(members, (o1, o2) -> {
            if (o1.getAge() == o2.getAge()) {
                return o1.getSignOrder() - o2.getSignOrder();
            } else {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Member member : members) {
            bw.write(member.getAge() + " " + member.getName() + "\n");
        }
        bw.flush();
        bw.close();
    }
}
