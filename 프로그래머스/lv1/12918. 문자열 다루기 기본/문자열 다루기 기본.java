class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        if (s.length() == 6 || s.length() == 4){
            for (int i =0; i<=s.length()-1; i++){
                char ch = s.charAt(i);
                int check = (int) ch;
                if(check >= 48&&check < 58)
                    continue;
                else
                    return false;
            }
            return true;
        }

        return false;
    }
}