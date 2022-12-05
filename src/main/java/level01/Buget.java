package level01;

import java.util.Arrays;

public class Buget {
    public int solution(int[] d, int budget) {
        Arrays.sort(d); // 정렬해주기
        int answer = 0;
        int sum = 0;

        for (int j = 0; j < d.length; j++) {
            sum += d[j];

            if (sum > budget) {
                answer = j;
                return answer;
            }

        }

        if (budget >= sum) {
            answer = d.length;
        }

        return answer;
    }
}
