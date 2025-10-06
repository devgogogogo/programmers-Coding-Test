class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        int meat = 12000 * n;
        int beverage = (k - service) * 2000;
        int result = meat + beverage;
        return result;
    }
}