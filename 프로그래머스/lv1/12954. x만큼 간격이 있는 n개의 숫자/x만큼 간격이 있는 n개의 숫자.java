import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        for (int j = 1; j <= n; j++){
            answer.add(x * (long)j);
        }
        return answer;
    }
}