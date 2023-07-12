class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int check = 0;
        while(check <= number.length-3){
            for (int i = check+1; i<number.length-1; i++){
                for (int j = i + 1; j<number.length; j++){
                    System.out.printf("check: %d i: %d j:%d ",check,i,j);
                    System.out.println(number[check] + number[i] + number[j]);
                    if (number[check] + number[i] + number[j] == 0){
                        answer++;
                    }

                }

            }
            check++;
        }
        
        return answer;
    }
}