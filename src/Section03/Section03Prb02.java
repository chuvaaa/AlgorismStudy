package Section03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author a1101466 on 2023/04/24
 * @project AlgorismStudy
 * @description
 *
 * 설명
 *
 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 */
public class Section03Prb02 {
    public static String solution(int[] arr1, int[] arr2){
        StringBuilder answer = new StringBuilder();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int point1 = 0 , point2 = 0;

        while (point1 < arr1.length && point2 < arr2.length){
            if(arr1[point1]== arr2[point2]){
                answer.append(" ").append(arr1[point1]);
                point1++;
                point2++;
            }else if(arr1[point1] > arr2[point2]){
                point2++;
            }else{
                point1++;
            }
        }

        return answer.toString().trim();
    }

    public static int[] getArray(int cnt, Scanner in){
        int[] resultArr = new int[cnt];

        for (int i = 0; i < cnt; i++){
            resultArr[i] = in.nextInt();
        }

        return resultArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();
        int[] arr1 = getArray(cnt, in);

        int cnt2 = in.nextInt();
        int[] arr2 = getArray(cnt2, in);

        System.out.println(solution(arr1, arr2));


    }

}
