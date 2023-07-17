import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        ArrayList<String> checkName = new ArrayList<>();
        for (int k = 0; k <name.length; k++){
            checkName.add(name[k]);
        }
        
        for (int i = 0; i < photo.length; i++){
            int checkIndex = 0;
            int checkValue = 0;
            for (int j = 0; j< photo[i].length; j++){
                checkIndex = checkName.indexOf(photo[i][j]);
                if (checkIndex != -1){
                    checkValue += yearning[checkIndex];
                }

            }
            answer[i] = checkValue;
        }
        return answer;
    }
}