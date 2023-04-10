package Section04;

import java.util.HashMap;
import java.util.Scanner;

/**
* @author 1101466 on 2023/04/10
* @description
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
**/
public class Section04Prb01 {

    public static String solution(String str) {
        String answer = "";

        HashMap<String, Integer> voteMap = resultVoteMap(str);

        int maxCnt = 0;
        for (String s : voteMap.keySet()) {
            int cntOfVotes = voteMap.get(s);
            if(cntOfVotes > maxCnt){
                maxCnt = cntOfVotes;
                answer = s;
            }
        }

        return answer;
    }

    public static HashMap<String, Integer> resultVoteMap(String str){
        HashMap<String, Integer> voteMap = new HashMap<>();

        for (char strC : str.toCharArray()) {
            String s = String.valueOf(strC);
            voteMap.put(s, voteMap.getOrDefault(s, 0) + 1);
        }

        return voteMap;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();
        String str = in.next();

        HashMap<String, Integer> result = new HashMap<>();
        System.out.println(solution(str));
    }
}
