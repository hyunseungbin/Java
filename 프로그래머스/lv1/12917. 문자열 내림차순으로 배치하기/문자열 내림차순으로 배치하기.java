import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<Integer> check_char = new ArrayList<>();
        for (int i = 0; i <= s.length()-1; i++){
            check_char.add((int)s.charAt(i));
        }
        Collections.sort(check_char, Comparator.reverseOrder());
        for (int i = 0; i <= s.length()-1; i++){
            int value = check_char.get(i);
            char c = (char) value;
            answer += c;
        }
        return answer;
    }
}