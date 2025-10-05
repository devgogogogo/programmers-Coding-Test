class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 1. 두 분수의 합 구하기
        int numer = numer1 * denom2 + numer2 * denom1; // 분자
        int denom = denom1 * denom2; // 분모

        // 2. 기약분수 만들기 (최대공약수로 나누기)
        int gcd = getGCD(numer, denom);
        numer /= gcd;
        denom /= gcd;

        // 3. 결과 리턴
        return new int[]{numer, denom};
    }

    // 최대공약수 구하는 함수 (유클리드 호제법)
    public int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
}