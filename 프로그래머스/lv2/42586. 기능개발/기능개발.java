import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        int currentIndex = 0;

        while (currentIndex < speeds.length){
            int count = 0;
            int currentProgress = progresses[currentIndex];
            int currentSpeeds = speeds[currentIndex];
            
                while(currentProgress < 100){
                
                    for (int i = currentIndex; i < progresses.length; i++){
                        progresses[i] += speeds[i];
                    }
                    currentProgress = progresses[currentIndex];
                    currentSpeeds = speeds[currentIndex];
                }
                while(currentIndex < progresses.length && progresses[currentIndex] >= 100){
                    count++;
                    currentIndex++;
                    
                }
                if (count > 0){
                    answer.add(count);
                }
                
            }

        return answer;
    }
}

