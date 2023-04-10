package Section06;

import java.util.Scanner;

/**
* @author 1101466 on 2023/04/10
* @description
 * 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
**/
public class Section06Prb01 {

    public static String solution(int[] arr) {
        StringBuilder answer = new StringBuilder();

        sortArr(arr);

        for (int i : arr) {
            answer.append(i).append(" ");
        }
        return answer.toString().trim();
    }

    public static void sortArr(int[] arr){
        for(int i = 0;i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();
        int[] arr = new int[cnt];

        for (int i = 0; i < cnt; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr));
    }
}
