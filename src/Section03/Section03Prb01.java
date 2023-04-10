package Section03;

import java.util.Arrays;
import java.util.Scanner;

/**
* @author 1101466 on 2023/04/10
* @description
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
**/
public class Section03Prb01 {

    public static int[] getArray(int cnt, Scanner in){
        int[] resultArr = new int[cnt];

        for (int i = 0; i < cnt; i++){
            resultArr[i] = in.nextInt();
        }

        return resultArr;
    }

    public static int[] absorptionArr(int cnt, int[] arr1, int[] arr2){
        int[] resultArr = new int[cnt];
        int index = 0;
        for (int n : arr1) {
            resultArr[index++] = n;
        }
        for (int n : arr2) {
            resultArr[index++] = n;
        }

        return resultArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();
        int[] arr1 = getArray(cnt, in);

        int cnt2 = in.nextInt();
        int[] arr2 = getArray(cnt2, in);

        int[] absArr = absorptionArr(cnt+cnt2, arr1, arr2);

        Arrays.sort(absArr);
        for (int i : absArr) {
            System.out.print(i + " ");
        }

    }
}
