package Section01_String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author a1101466 on 2023/02/20
 * @project AlgorismStudy
 * @description SECTION01 4번 문제 단어 뒤집기
 */
public class Palindrome07 {

    public static String solution(String str) {
        String answer = "NO";
        char[] c = str.toCharArray();
        int frontN  = 0;
        int backN   = str.length() -1;

        while ( frontN < backN ){
            char temp = c[frontN];
            c[frontN] = c[backN];
            c[backN] = temp;
            frontN++;
            backN--;
        }

        String reverseStr = String.valueOf(c);

        if(str.toUpperCase().equals(reverseStr.toUpperCase())){
            answer = "YES";
        }

        /**
         * String answer = "YES";
         * int len=str.length();
         * for(int i = 0; i<len/2; i++){
         *      if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
         * }
         * return answer;
         *
         * str의 절반만 for문을 돌려서 처음과 끝을 비교.
         */
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution(str));

    }
}
