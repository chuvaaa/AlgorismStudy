package Section02;

import java.util.Scanner;

/**
 * @author a1101466 on 2023/03/13
 * @project AlgorismStudy
 * Section2. Array
 * 5번문제 소수(에라토스테네스 체)
 * @description
 */
public class Section02Prb05 {

    protected static int solution(int n){
        int answer = 0;

        for(int i = 2; i <= n; i++){
            if(checkDecimal(i)) answer++;
        }

        return answer;
    }

    protected static boolean checkDecimal(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(solution(n));
    }
}
