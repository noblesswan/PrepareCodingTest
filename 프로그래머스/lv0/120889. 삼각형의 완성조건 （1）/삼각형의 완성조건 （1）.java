import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        for(int i=0; i<sides.length; i++){
            if(sides[0]+sides[1] > sides[2]){
                answer = 1;
            }
            else{
                answer = 2;
            }
        }
        return answer;
    }
}