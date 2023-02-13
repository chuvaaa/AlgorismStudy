package Section01_String;

import java.util.Scanner;

/**
 * @author a1101466 on 2023/02/13
 * @project AlgorismStudy
 * @description SECTION01 1번 문제 문자 찾기.
 */
public class FindString {

    public static int FindChar(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char strC : str.toCharArray()) {
            if (c == strC)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        char c = in.next().charAt(0);

        System.out.println(FindChar(str, c));
    }
}
