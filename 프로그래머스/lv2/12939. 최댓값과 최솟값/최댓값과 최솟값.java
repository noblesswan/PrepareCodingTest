class Solution {
    public String solution(String s) {

        s=s.replace(" ", ","); 
        String[] array_s = {};
        array_s = s.split(","); 
        
        int[] int_s = new int[array_s.length];
        for(int i = 0 ; i < array_s.length ; i++) {
            int_s[i] = Integer.parseInt(array_s[i]);
        }
		
        int min = int_s[0];
        for(int i = 1 ; i < int_s.length ; i++ ) {
            if(min > int_s[i]) {
                min = int_s[i];
            }
        }
		
        int max = int_s[0];
        for(int i = 1 ; i < int_s.length ; i++ ) {
            if(max < int_s[i]) {
                max = int_s[i];
            }
        }
		
        String answer = Integer.toString(min)+" "+Integer.toString(max);
        return answer;
    }
}
