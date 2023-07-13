class Solution {
    public String solution(int[] food) {
        String answer = "";
        String addAnswer = "";
        for (int i = 1; i<food.length;i++){
            int check = i;
            int checkFood = food[i] / 2;
            for (int j = 0; j<checkFood;j++){
                answer += Integer.toString(check);
                addAnswer += Integer.toString(check);
            }
        }
        answer += "0";
        StringBuilder reverseString = new StringBuilder(addAnswer);
        reverseString.reverse();
        String reversAnswer = reverseString.toString();
        
        return answer+reversAnswer;
    }
}