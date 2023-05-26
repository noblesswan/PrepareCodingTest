import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        ArrayList<Integer> cnt = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 정답 개수 세기
        for(int i = 0; i < answers.length; i++) {
        	if(supo1[i % supo1.length] == answers[i]) { cnt.set(1, cnt.get(1)+1); }
        	if(supo2[i % supo2.length] == answers[i]) { cnt.set(2, cnt.get(2)+1); }
        	if(supo3[i % supo3.length] == answers[i]) { cnt.set(3, cnt.get(3)+1); }
        }
        
        // 점수 비교
        int idx = 0;
        int max = Collections.max(cnt);
        for(int i = 0; i < cnt.size(); i++) {
        	if(cnt.get(i) == max) {
        		answer.add(i);
        	}
        }
        
        Collections.sort(answer);
        
        return answer;
    }
}