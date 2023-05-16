class Solution {
    public int[] solution(long n) {
        String[] arr = String.valueOf(n).split("");
        int[] answer = new int[arr.length];
        
        for (int i = arr.length - 1; i >= 0; i--) {
            int index = arr.length - 1 - i;  // 역순 인덱스 계산
            answer[index] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
