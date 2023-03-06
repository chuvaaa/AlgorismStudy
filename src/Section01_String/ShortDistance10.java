package Section01_String;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

/**
 * @author a1101466 on 2023/03/06
 * @project AlgorismStudy
 * @description SECTION01 10번 가장 짧은 문자거리
 */
public class ShortDistance10 {
    //김민수 제출
    public static String solution(String str) {
        String answer = "";

        String[] splitStr = str.split(" ");

        String sourceStr = splitStr[0];
        String targetChar = splitStr[1];

        Set<Integer> targetList = getTargetList(sourceStr, targetChar);

        for(int i = 0; i < sourceStr.length(); i++){
            int cnt = 0;
            int[] resultArr = new int[targetList.size()];
            for (Integer target : targetList) {
                resultArr[cnt] = Math.abs(i-target);
                cnt++;
            }
            answer += Arrays.stream(resultArr).min().getAsInt()+ " ";
        }


        return answer;
    }

    protected static Set<Integer> getTargetList(String sourceStr, String targetChar){
        LinkedList<Integer> targetList = new LinkedList<Integer>();
        for (int i = 0; i < sourceStr.length(); i++) {
            int pnt = sourceStr.indexOf(targetChar, i);

            targetList.add(pnt);

        }
        return new LinkedHashSet<>(targetList);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }
}
