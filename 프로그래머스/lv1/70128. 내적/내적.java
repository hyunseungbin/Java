class Solution {
    
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i<=a.length-1; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}