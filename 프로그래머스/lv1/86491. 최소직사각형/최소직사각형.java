import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        ArrayList <Integer> minValue = new ArrayList<>();
        ArrayList <Integer> maxValue = new ArrayList<>();

        for (int i =0; i< sizes.length; i++){
            if (sizes[i][0] > sizes[i][1]){
                minValue.add(sizes[i][1]);
                maxValue.add(sizes[i][0]);
            }
            else{
                minValue.add(sizes[i][0]);
                maxValue.add(sizes[i][1]);
            } 
        }

        int min = minValue.get(0);
        for (int val : minValue){
            if (val > min){
                min = val;
            }
        }
        
        int max = maxValue.get(0);
        for (int val : maxValue){
            if (val > max){
                max = val;
            }
        }
        
        return min * max;
    }
}