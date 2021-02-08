package ProblemString;

import java.io.*;
import java.util.HashMap;
import java.util.Optional;

public class WordStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().toLowerCase();
        br.close();
        char[] wordCharArr = word.toCharArray();
        HashMap<Character, Integer> alphaCount = new HashMap<>();
        int mostUseCount = 0;
        char mostUseChar = 0;
        int secondUseCount = 0;

        for (char wordChar : wordCharArr) {
            Optional<Integer> opt = Optional.ofNullable
                    (alphaCount.get(wordChar));
            int wordCount = opt.isPresent() ? opt.get() + 1 : 1;
            alphaCount.put(wordChar, wordCount);
            if (mostUseCount < wordCount) {
                mostUseCount = wordCount;
                mostUseChar = wordChar;
            } else if (secondUseCount < wordCount) {
                secondUseCount = wordCount;
            }
        }

        if (mostUseCount == secondUseCount) {
            bw.write("?");
        } else {
            bw.write(String.valueOf(mostUseChar).toUpperCase());
        }
        bw.flush();
        bw.close();
    }
}
