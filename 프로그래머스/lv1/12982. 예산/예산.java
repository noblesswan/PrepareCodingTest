import java.util.*;

class Solution {
    public int solution(int[] dept, int budget) {
        Arrays.sort(dept);
        int i=0;
        while(dept[i]<= budget) {
            budget -= dept[i];            
            i++;
            if(i== dept.length)break;
        }
        return i;
    }
}