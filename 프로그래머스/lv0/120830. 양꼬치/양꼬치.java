class Solution {
    public int solution(int n, int k) {
        int answer = 12000;
        int drink = 2000;
        return (answer * n) + (drink * (k-n/10));
    }
}