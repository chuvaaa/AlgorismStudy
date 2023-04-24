package Section09;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
* @author 1101466 on 2023/04/10
* @description
 * 현수는 씨름 감독입니다. 현수는 씨름 선수를 선발공고를 냈고, N명의 지원자가 지원을 했습니다.
 * 현수는 각 지원자의 키와 몸무게 정보를 알고 있습니다.
 * 현수는 씨름 선수 선발 원칙을 다음과 같이 정했습니다.
 * “A라는 지원자를 다른 모든 지원자와 일대일 비교해서 키와 몸무게 모두 A지원자 보다 높은(크고, 무겁다) 지원자가
 * 존재하면 A지원자는 탈락하고, 그렇지 않으면 선발된다.”
 * N명의 지원자가 주어지면 위의 선발원칙으로 최대 몇 명의 선수를 선발할 수 있는지 알아내는 프로그램을 작성하세요.
 *
 *  참고 문서
 * https://wjheo.tistory.com/entry/Java-%EC%A0%95%EB%A0%AC%EB%B0%A9%EB%B2%95-Collectionssort
**/
public class Section09Prb01 {

    private static class Body implements Comparable<Body>{
        public int height, weight;
        Body(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
        @Override
        public int compareTo(Body body){
            return body.height-this.height;
        }
    }


    public static int solution(List<Body> bodyList) {
        int answer = 0;
        int maxWeight = 0;

        Collections.sort(bodyList);

        for (Body body : bodyList) {
            if(body.weight > maxWeight){
                maxWeight = body.weight;
                answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();

        List<Body> bodyArr = IntStream.range(0, cnt)
                .mapToObj(i -> new Body(in.nextInt(), in.nextInt()))
                .collect(Collectors.toList());

        System.out.println(solution(bodyArr));

    }
}
