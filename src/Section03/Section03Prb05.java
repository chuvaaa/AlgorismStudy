package Section03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author a1101466 on 2023/04/24
 * @project AlgorismStudy
 * @description
 *
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 * 만약 N=15이면
 * 7+8=15
 * 4+5+6=15
 * 1+2+3+4+5=15
 */
public class Section03Prb05 {
    public static int solution(int cnt){

        int answer = 0;
        int sum = 0;
        int lt = 0;

        int[] numbers = new int[(cnt/2)+1];

        for(int i = 0; i < (cnt/2)+1; i++){
            numbers[i] = i+1;
        }

        for(int rt = 0; rt<numbers.length; rt++){
            sum+=numbers[rt];
            if(sum == cnt) answer++;
            while(sum>=cnt){
                sum-=numbers[lt++];
                if(sum==cnt) answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();

        System.out.println(solution(cnt));

    }

}
