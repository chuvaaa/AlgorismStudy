package Section05;

import java.util.Scanner;
import java.util.Stack;

/**
* @author 1101466 on 2023/04/10
* @description
 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
**/
public class Section05Prb01 {

    public static String solution(String str) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(c == '('){
                stack.push(c);
            }

            if(c == ')'){
                if(stack.size() == 0){
                    answer = "NO";
                    break;
                }
                else stack.pop();
            }
        }
        if(stack.size() > 0)
            answer = "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
