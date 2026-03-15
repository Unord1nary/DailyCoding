class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int mx = 0;
          for(int i = 0; i < numbers.length; i++) {
            for (int k = i + 1; k < numbers.length; k++) {
                if (numbers[i] * numbers[k] > mx) {
                    mx = numbers[i] * numbers[k];
                }
            }
        }
        return mx;
    }
}