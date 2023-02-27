package Section01_String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author a1101466 on 2023/02/20
 * @project AlgorismStudy
 * @description SECTION01 4번 문제 단어 뒤집기
 */
public class ReverseWord {

    public static ArrayList<String> solution(String[] str, int cnt) {
        ArrayList<String> answerList = new ArrayList<>();
        for (String word : str) {
            char[] c = word.toCharArray();
            int frontN  = 0;
            int backN   = word.length() -1;

            while ( frontN < backN ){
                char temp = c[frontN];
                c[frontN] = c[backN];
                c[backN] = temp;
                frontN++;
                backN--;
            }

            String answerTmp = String.valueOf(c);
            answerList.add(answerTmp);

        }
        return answerList;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();

        String[] str = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            str[i] = in.next();
        }

        ArrayList<String> result = solution(str, cnt);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
