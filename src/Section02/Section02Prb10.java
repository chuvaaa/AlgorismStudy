package Section02;

import java.util.Scanner;

/**
 * @author a1101466 on 2023/03/27
 * @project AlgorismStudy
 * Section2. Array
 * 10번문제 봉우리 갯수 구하기
 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
 * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
 * 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
 * @description
 */
public class Section02Prb10 {

    protected static int solution(int cnt, int[][] arr){
        int answer = 0;

        for(int i = 0; i < cnt; i++){
            for(int j= 0; j < cnt; j++){
                if(i==0 || i==cnt-1 || j==0 || j==cnt-1){
                    continue;
                }

                if(arr[i][j] > arr[i][j+1] && arr[i][j] > arr[i][j-1] &&
                        arr[i][j] > arr[i+1][j] && arr[i][j] > arr[i-1][j]  ){
                    answer++;
                }
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();

        int[][] arr = new int[cnt+2][cnt+2];

        for(int i = 0; i < cnt+2; i++){
            for(int j= 0; j < cnt+2; j++){
                if(i==0 || i==cnt+1 || j==0 || j==cnt+1){
                    arr[i][j] = 0;
                    continue;
                }
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(cnt+2, arr));


    }
}
