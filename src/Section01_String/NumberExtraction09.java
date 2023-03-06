package Section01_String;

import java.util.Scanner;

/**
 * @author a1101466 on 2023/02/20
 * @project AlgorismStudy
 * @description SECTION01 9번 ㅅㅜㅅ자만 추출.
 */
public class NumberExtraction09 {
    //김민수 제출
    public static int solution(String str) {
        int answer;
        str = str.replaceAll("[^0-9]", "");
        answer = Integer.parseInt(str);
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}
