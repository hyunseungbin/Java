class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer(my_string);
        String ret = answer.reverse().toString();
        return ret;
    }
}