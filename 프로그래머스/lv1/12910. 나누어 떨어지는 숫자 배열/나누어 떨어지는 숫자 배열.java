import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int count = 0;
        int number = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                count++;
            }
        }
        
        if(count == 0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[count];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[number] = arr[i];
                number++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
        
    }
}

// 다른 풀이

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
                             .filter(num -> num % divisor == 0)
                             .toArray();
        if (answer.length == 0) {
            return new int[]{-1};
        }
        Arrays.sort(answer);
        return answer;
    }
}
