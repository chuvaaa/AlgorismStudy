package Section01_String;

import java.util.Scanner;

/**
 * @author a1101466 on 2023/02/20
 * @project AlgorismStudy
 * @description SECTION01 6번 중복문자 제거
 */
public class DeleteDuplicate06 {
    //김민수 제출
    //Set List 차이 확인하기.
    //Set 중복 불가하게.
    public static String solution(String str) {
        String answer="";
        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i){
                answer+=str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}
