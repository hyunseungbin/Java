class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int checkP = 0;
        int checkY = 0;
        for (char check : s.toCharArray()){
            if (check == 'p' || check == 'P'){
                checkP += 1;
            }
            else if(check == 'y' || check == 'Y'){
                checkY += 1;
            }
        }
        if (checkP == checkY){
            return true;
        }
        else if (checkP > 0 || checkY > 0 &&(checkP != checkY)){
            return false;
        }
        else{
            return true;
        }
    }
}