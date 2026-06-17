class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int answer = Integer.MIN_VALUE;

        for (int num: prices) {
            if (num < minValue) {
                minValue = num;
            }
            answer = Math.max(answer, num-minValue);
        }

        return answer;
    }
}
