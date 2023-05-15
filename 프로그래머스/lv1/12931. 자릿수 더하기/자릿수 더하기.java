import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] arr = String.valueOf(n).split("");  // 배열의 타입을 String[]으로 변경해야 합니다.
        for(int i=0; i<arr.length; i++){
            answer += Integer.parseInt(arr[i]);  // 배열 요소를 정수로 변환하여 answer에 더해줍니다.
        }        
        return answer;
    }
}