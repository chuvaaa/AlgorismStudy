package Section01_String;

import java.util.Scanner;

/**
 * @author a1101466 on 2023/02/20
 * @project AlgorismStudy
 * @description SECTION01 4번 문제 단어 뒤집기
 */
public class ReverseWordInSentence {

    public static String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        int frontN  = 0;
        int backN   = str.length() -1;

        while ( frontN < backN ){

            //Character.isAlphabetic(); 사용이 더 간단
            if(!isAlphabet(c[frontN])){
                frontN++;
                continue;
            }
            if(!isAlphabet(c[backN])){
                backN--;
                continue;
            }

            char temp = c[frontN];
            c[frontN] = c[backN];
            c[backN] = temp;
            frontN++;
            backN--;

            answer = String.valueOf(c);

        }
        return answer;
    }

    static Boolean isAlphabet(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}
