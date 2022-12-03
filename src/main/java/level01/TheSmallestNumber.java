package level01;

import java.util.Arrays;


public class TheSmallestNumber {
    public int[] Solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length - 1];

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            answer[index] = arr[i];
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        TheSmallestNumber theSmallestNumber = new TheSmallestNumber();
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = theSmallestNumber.Solution(arr);
        System.out.println(Arrays.toString(result));
    }
}
