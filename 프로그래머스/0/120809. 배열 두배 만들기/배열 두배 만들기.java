class Solution {
    public int[] solution(int[] numbers) {

        

        for (int i = 0; i < numbers.length; i++) {
            int a = 2 * numbers[i];
            numbers[i] = a;
        }
        return numbers;

    }
}