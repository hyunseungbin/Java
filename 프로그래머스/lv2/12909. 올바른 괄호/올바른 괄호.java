import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        ArrayList<String> check = new ArrayList<>();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        if (s.length() <= 1)
            return false;
        else{
            for (int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                String st = String.valueOf(ch);
                if (ch == '('){
                    check.add(st);
                }
                else{
                    if (check.size() ==0){
                        return false;
                    }
                    else{
                        int lastIndex = check.size() -1;
                        check.remove(lastIndex);
                        }
                }
            }
            if (check.size() !=0 ){
                return false;
            }
            else{
                return true;
            }
        }
    }
}