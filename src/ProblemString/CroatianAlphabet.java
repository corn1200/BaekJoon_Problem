package ProblemString;

import java.io.*;

public class CroatianAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final String regex = ".*c=.*|.*c-.*|.*dz=.*|.*d-.*" +
                "|.*lj.*|.*nj.*|.*s=.*|.*z=.*";
        char[] wordCharArr = br.readLine().toCharArray();
        String tempBuffer = "";
        int tempCount = 0;
        int wordCount = 0;

        for (char word : wordCharArr) {
            tempBuffer += word;
            tempCount++;
            if (tempBuffer.matches(regex)) {
                wordCount++;
                tempCount -= tempBuffer.length() - replaceCroat(tempBuffer).length();
                tempBuffer = "";
            }
        }
        bw.write(String.valueOf(wordCount + tempCount));
        bw.flush();
        bw.close();
    }

    public static String replaceCroat(String temp) {
        if (temp.contains("c=")) {
            return temp.replaceAll("c=", "");
        } else if (temp.contains("c-")) {
            return temp.replaceAll("c-", "");
        } else if (temp.contains("dz=")) {
            return temp.replaceAll("dz=", "");
        } else if (temp.contains("d-")) {
            return temp.replaceAll("d-", "");
        } else if (temp.contains("lj")) {
            return temp.replaceAll("lj", "");
        } else if (temp.contains("nj")) {
            return temp.replaceAll("nj", "");
        } else if (temp.contains("s=")) {
            return temp.replaceAll("s=", "");
        } else if (temp.contains("z=")) {
            return temp.replaceAll("z=", "");
        }
        return temp;
    }
}
