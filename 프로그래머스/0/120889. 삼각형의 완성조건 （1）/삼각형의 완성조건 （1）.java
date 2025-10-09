import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int[] array = sides;
        Arrays.sort(array);
        if (array[0] + array[1] > array[2]) {
            return 1;
        } else {
            return 2;
        }
    }
}