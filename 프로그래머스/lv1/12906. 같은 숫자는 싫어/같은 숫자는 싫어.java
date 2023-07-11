import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] answer = new int[arr.length];
        answer.add(arr[0]);
        for (int i = 1; i<=arr.length-1; i++){
            if (arr[i-1] != arr[i]){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}
