import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[arr.length];
        list.add(arr[0]);
        answer[0] = arr[0];
        for (int i = 1; i<=arr.length-1; i++){
            if (arr[i-1] != arr[i]){
                answer[i] = arr[i];
                list.add(arr[i]);
            }
        }
        // arr_result = []
        // arr_result.append(arr[0])
        // for i in range(1,len(arr)):
        //     if arr[i-1] != arr[i]:
        //         arr_result.append(arr[i])

        return list;
    }
}