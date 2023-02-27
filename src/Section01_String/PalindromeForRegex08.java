package Section01_String;

import java.util.Scanner;

/**
 * @author a1101466 on 2023/02/20
 * @project AlgorismStudy
 * @description SECTION01 4번 문제 단어 뒤집기
 */
public class PalindromeForRegex08 {

    public static String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
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
        if(str.equals(reverseStr)){
            answer = "YES";
        }

        /**
         * String answer = "NO";
         * s=s.toUpperCase().replaceAll("[^A-Z]", "");
         * String tmp=new StringBuilder(s).reverse().toString();
         * if(s.equals(tmp)) answer="YES";
         * return answer;
         *
         * Stringbuilder의 reverse 쓰는게 훨씬 간단
         */
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(solution(str));

    }
}
