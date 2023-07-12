import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int check = 0;
        Arrays.sort(d);
        
        for (int i =0; i< d.length;i++){
            check = d[i];
            if (budget - d[i] >= 0){
                budget -= d[i];
                answer++;
            }
        }
        // j = 0
        // d.sort()
        // for i in range(0,len(d)):
        //     if (budget - d[i]) >= 0:
        //         budget -= d[i]
        //         j += 1
        return answer;
    }
}