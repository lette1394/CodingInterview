package Chap16;

public class Problem17 {
    private int max = Integer.MIN_VALUE;

    public int solve(int[] input) {
        for (int k = 0; k < input.length; k++) {
            for (int i = 0; i < input.length-k; i++) {
                max = Math.max(max, getSuccessSum(input, i, k));
            }
        }

        return max;
    }

    private int getSuccessSum(int[] input, int start, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += input[start+i];
        }

        return sum;
    }

    public int answer(int[] input) {
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < input.length; i++) {
            currentSum += input[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }

        }

        return maxSum;
    }


}
