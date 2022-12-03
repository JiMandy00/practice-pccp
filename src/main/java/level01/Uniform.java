package level01;

import java.util.Arrays;

public class Uniform {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }

        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if ((reserve[j] == lost[i]+1) || (reserve[j] == lost[i]-1)) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }


            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Uniform uniform = new Uniform();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int result = uniform.solution(n, lost, reserve);
        System.out.println(result);
    }
}
