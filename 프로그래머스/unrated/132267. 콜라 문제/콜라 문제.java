class Solution {
    // public int cola(int a,int n) {
    //     if (n < a){
    //         return 0;
    //     }
    //     else{
    //         int check = n / a;
    //         return (check + cola(a,check +(n % a)));
    //     }
    // }
    
    public int solution(int a, int b, int n) {
        int totalBottles = 0;
        int emptyBottles = n;
        
        while (emptyBottles >= a) {
            int receivedBottles = emptyBottles / a;
            totalBottles += receivedBottles * b;
            emptyBottles = (emptyBottles % a) + receivedBottles * b;
        }
        
        return totalBottles;
    }
}