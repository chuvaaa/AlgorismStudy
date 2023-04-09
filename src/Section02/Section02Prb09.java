package Section02;

import java.util.Scanner;

/**
 * @author a1101466 on 2023/03/27
 * @project AlgorismStudy
 * Section2. Array
 * 9번문제 격자의 합/
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 * @description
 */
public class Section02Prb09 {

    protected static int solution(int cnt, int[][] arr){
        int answer = Integer.MIN_VALUE;

        for(int i = 0; i < cnt; i++){
            int row = 0;
            int col = 0;
            for(int j= 0; j < cnt; j++){
                row += arr[i][j];
                col += arr[j][i];
            }
            answer = Math.max(answer, row);
            answer = Math.max(answer, col);
        }
        int diagonal = 0;
        int revDiagonal = 0;

        for(int i = 0; i < cnt; i++){
            diagonal += arr[i][i];
            revDiagonal += arr[i][cnt-i-1];
        }
        answer = Math.max(answer, diagonal);
        answer = Math.max(answer, revDiagonal);

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();

        int[][] arr = new int[cnt][cnt];

        for(int i = 0; i < cnt; i++){
            for(int j= 0; j < cnt; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(cnt, arr));


    }
}
