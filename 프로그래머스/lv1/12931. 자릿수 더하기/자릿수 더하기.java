import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
 
        // ex) 4 / 10 = 0.4 → 0 ( int )
        while (n > 0) {
            // %를 이용하여 한자리씩 잘라낸다.
            answer = answer + (n % 10);
            // 10을 나누어 int이니 소숫점 이하로 잘린다.
            n = n / 10;
        }
        return answer;
    }
}
