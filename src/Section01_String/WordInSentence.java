package Section01_String;

import java.util.Scanner;

/**
 * @author a1101466 on 2023/02/20
 * @project AlgorismStudy
 * @description SECTION01 3번 문제 문장 속 가장 긴 단어
 */
public class WordInSentence {

    public static String solution(String str) {
        String answer = "";

        int prevLen = 0;

        String[] strSplit = str.split(" ");
        for (String s : strSplit) {
            int maxLen = s.length();
            if(maxLen > prevLen) {
                prevLen = maxLen;
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(solution(str));
    }
}
