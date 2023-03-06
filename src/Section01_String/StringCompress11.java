package Section01_String;

import java.util.Scanner;

/**
 * @author a1101466 on 2023/03/06
 * @project AlgorismStudy
 * @description SECTION01 11 문자열 압축하기.
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 */
public class StringCompress11 {
    //김민수 제출
    public static String solution(String str) {
        String answer = "";

        String[] strArr = str.split("");

        for(int i=0; i<strArr.length; i++){
            int cnt = 1;
            String curStr = strArr[i];
            answer += curStr;

            for (int j=i+1; j<strArr.length; j++){
                if(curStr.equals(strArr[j])){
                    cnt++;
                    i++;
                }else{
                    break;
                }
            }

            if( cnt > 1){
                answer += cnt;
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
