// 22 12 11
// 프로그래머스 - 프린트
package level02;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
    public int solution(int[] priorities, int location) {
        // answer는 몇 번째 출력물인지를 나타내니까 1로
        int answer = 1;

        // 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // 우선순위 큐에 프린트 목록 넣기(내림차순으로 정렬됨)
        for (int i : priorities) {
            pq.add(i);
        }

        // pq가 비지않았다면 반복 == pq가 빌 때까지 반복해주세요.
        while (!pq.isEmpty()) {
            // 큐의 값과 매칭되는 경우 탐색
            for (int i = 0; i < priorities.length; i++) {
                // que의 제일 앞에 존재하는 값과 priorities의 값이 일치하면 큐에서 삭제
                if (pq.peek() == priorities[i]) {
                    // 값, 위치 모두 일치하면 answer 반환
                    // if문의 위치 주의
                    if (location == i) {
                        return answer;
                    }
                    pq.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}
