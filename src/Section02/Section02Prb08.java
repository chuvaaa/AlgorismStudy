package Section02;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author a1101466 on 2023/03/13
 * @project AlgorismStudy
 * Section2. Array
 * 8번문제 등수구하기
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 * @description
 */
public class Section02Prb08 {

    protected static String solution(int cnt, String str){
        StringBuilder answer = new StringBuilder();

        LinkedList<Integer> intList = initInt(str);

        Map<Integer, Integer> gradeMap =  getGrade(initInt(str));

        for (Integer integer : intList) {
            answer.append(" ").append(gradeMap.get(integer));
        }
        return answer.toString().trim();
    }

    protected static LinkedList<Integer> initInt(String str){
        String[] strArr = str.split(" ");
        LinkedList<Integer> list = new LinkedList<>();
        for (String s : strArr) {
            list.add(Integer.valueOf(s));
        }
        return list;
    }

    protected static Map<Integer, Integer> getGrade(List<Integer> intList){

        intList.sort(Comparator.reverseOrder());
        Map<Integer, Integer> result = new HashMap<>();
        for(int i = 0; i < intList.size(); i++){
            if(i == 0){
                result.put(intList.get(i), 1);
                continue;
            }
            if(!Objects.equals(intList.get(i - 1), intList.get(i))){
                result.put(intList.get(i), i+1);
            }

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
