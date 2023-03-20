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
public class Section02Prb06 {

    protected static String solution(int cnt, String str){
        StringBuilder answer = new StringBuilder();

        LinkedList<Integer> intList = initInt(str);
        for (int i = 0; i < intList.size(); i++){
            if(checkDecimal(intList.get(i))){
                answer.append(" ").append(intList.get(i));
            }
        }

        return answer.toString().trim();
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
            result.add(Integer.valueOf(new StringBuffer(s).reverse().toString()));
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
