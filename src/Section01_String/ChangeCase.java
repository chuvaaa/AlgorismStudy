package Section01_String;

import java.util.Scanner;

/**
 * @author a1101466 on 2023/02/13
 * @project AlgorismStudy
 * @description SECTION01 2번 문제 대소문자 변환.
 */
public class ChangeCase {

    public static String changeCase(String str) {
        String answer = "";

        for (char strC : str.toCharArray()) {
            if (Character.isUpperCase(strC))
                answer += Character.toLowerCase(strC);

            if(Character.isLowerCase(strC))
                answer += Character.toUpperCase(strC);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(changeCase(str));
    }
}
