class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int check = 0;
        boolean[] Kim = new boolean[seoul.length];
        for (int i = 0; i < seoul.length;i++){
            if (seoul[i].equals("Kim")){
                check = i;
            }
            
        }
        answer = String.format("김서방은 %d에 있다", check);
        return answer;
    }
}