import java.util.*;

class Solution {
    public ArrayList <Integer> solution(String s) {
        ArrayList <Character> checkChar = new ArrayList<>();
        ArrayList <Character> checkString = new ArrayList<>();
        ArrayList <Integer> checkInt = new ArrayList<>();
        int[] answer = {};
        
        for (char cha : s.toCharArray()){
            checkChar.add(cha);
        }
        
        for (int i = 0; i < checkChar.size(); i++){
            if(checkString.contains(checkChar.get(i))){
                int nearsIndex = -1;
                for (int j =i-1 ; j>= 0;j--){
                    if (checkChar.get(j) == checkChar.get(i)){
                        nearsIndex = j;
                        break;
                    }
                }
                checkInt.add(i-nearsIndex);
            }
            else{
                checkInt.add(-1);
            }
            checkString.add(checkChar.get(i));
        }
        return checkInt;
    }
}
