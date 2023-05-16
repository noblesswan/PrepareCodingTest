class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pP = 0;
        int yY = 0;
        String[] arr = String.valueOf(s).split("");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("p") || arr[i].equals("P")){
                pP++; 
            }
            else if(arr[i].equals("y") || arr[i].equals("Y")){
                yY++;
            }
        }
        
        if(pP != yY){
            answer = false;
        }
        
        return answer;
    }
}
