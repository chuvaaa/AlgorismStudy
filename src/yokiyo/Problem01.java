package yokiyo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author a1101466 on 2023/03/06
 * @project AlgorismStudy
 * @description
 */
public class Problem01 {

    public static String solution(int n , int k){
        String answer = "";

        List<String> alphabetList = getAlphabetList(k);
        // a b  c
        answer =  getAlphabetListToString(alphabetList);
        //abc
        String reverceAnswer = new StringBuilder(answer).reverse().toString();
        //cba

        String remainStr = "";

        int remainValue = n%k;
        if(remainValue > 0){
            System.out.println(remainValue);
            if( remainValue == 1){
                answer = answer+alphabetList.get(0)+reverceAnswer;
            }
            if(remainValue%2 == 0){
                for (int i = 0; i < remainValue/2; i++){
                    remainStr += alphabetList.get(i);
                }
                remainStr = remainStr + new StringBuilder(remainStr).reverse().toString();
                answer = answer + remainStr + reverceAnswer;
            }

        }else{
            answer += reverceAnswer;
        }

        return answer;
    }

    protected static List<String> getAlphabetList(int cnt){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            char ch = (char) (i + 97);
            result.add(String.valueOf(ch));

        }
        return result;
    }

    protected static String getAlphabetListToString(List<String> alphabetList){
        StringBuilder answer = new StringBuilder();

        for (String s : alphabetList) {
            answer.append(s);
        }

        return answer.toString();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();


        System.out.println(solution(n, k));
    }
}
