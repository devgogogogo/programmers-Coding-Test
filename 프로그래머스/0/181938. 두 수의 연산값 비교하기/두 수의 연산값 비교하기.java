class Solution {
    public int solution(int a, int b) {
        // a와 b를 이어붙인 값
        int concat = Integer.parseInt("" + a + b);
        
        // 2 * a * b 값
        int product = 2 * a * b;
        
        // 비교
        if (concat >= product) {
            return concat;
        } else {
            return product;
        }
    }
}
