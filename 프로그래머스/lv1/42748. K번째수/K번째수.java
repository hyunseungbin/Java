import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //ArrayList <Integer> answer = new ArrayList<>();
        int[] answer = new int[commands.length];
        ArrayList <Integer> arrCommand = new ArrayList<>();
        
        
        for (int i = 0; i < commands.length; i++) {
            ArrayList <Integer> arrResult = new ArrayList<>();
            int startIndex = commands[i][0];
            int endIndex = commands[i][1];
            int checkIndex = commands[i][2];
  
            for (int j =startIndex-1; j<=endIndex-1; j++){
                arrResult.add(array[j]);
            }

            Collections.sort(arrResult);
            
            answer[i] = arrResult.get(checkIndex-1);
        }

        return answer;
    }
}