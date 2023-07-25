import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        ArrayList<String> check = new ArrayList <>();
        ArrayList<String> checkCardsOne = new ArrayList <>(Arrays.asList(cards1));
        ArrayList<String> checkCardsTwo = new ArrayList <>(Arrays.asList(cards2));
        ArrayList<String> checkCardsGoal = new ArrayList <>(Arrays.asList(goal));
        for (int i = 0; i <goal.length; i++){
            if (checkCardsOne.contains(goal[i])){
                check.add(checkCardsOne.get(0));
                checkCardsOne.remove(0);
            }
            else if (checkCardsTwo.contains(goal[i])){
                check.add(checkCardsTwo.get(0));
                checkCardsTwo.remove(0);
            }
        }
        if (checkCardsGoal.equals(check)){
            return "Yes";
        }
        else
            return "No";
    }
}
// def solution(cards1, cards2, goal):
//     answer = ''
//     check = []
//     for word in goal:
//         if word in cards1:
//             check.append(cards1[0])
//             cards1.pop(0)
//         elif word in cards2:
//             check.append(cards2[0])
//             cards2.pop(0)
//     if check == goal:
//         return "Yes"
//     else:
//         return "No"