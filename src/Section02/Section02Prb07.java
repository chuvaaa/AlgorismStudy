package Section02;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author a1101466 on 2023/03/13
 * @project AlgorismStudy
 * Section2. Array
 * 6번문제 뒤집은 소수
 * @description
 */
public class Section02Prb07 {

    protected static int solution(int cnt, String str){
        int answer = 0;

        LinkedList<Integer> intList = initInt(str);
        int pointCnt = 1;
        for (int i = 0; i < intList.size(); i++){
            if(intList.get(i) == 1){
                answer+=pointCnt;
                pointCnt++;
            }else if(intList.get(i) == 0 ){

                pointCnt = 1;
            }
        }

        return answer;
    }

    protected static boolean checkDecimal(int num){
        if(num == 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    protected static LinkedList<Integer> initInt(String str){
        String[] strArr = str.split(" ");
        LinkedList<Integer> result = new LinkedList<>();
        for (String s : strArr) {
            result.add(Integer.valueOf(s));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();
        in.nextLine();
        String str =in.nextLine();

        System.out.println(solution(cnt, str));
    }
}
