class Solution {
    public int[] solution(long n) {
        // long → String      
        String string = String.valueOf(n);
        
        // reverse()메소드를 이용하기 위하여 
        // StringBuilder 인스턴스 생성
        StringBuilder stringBuilder = new StringBuilder(string);
        
        // reverse()로 문자열 뒤집기
        stringBuilder = stringBuilder.reverse();
        
        // String.split("")로 한 글자씩 잘라 배열에 담기
        String[] stringArr = stringBuilder.toString().split("");
        
        // 문자열 길이 만큼 배열 길이 할당
        int[] answer = new int[stringBuilder.length()];
        
        // String → int → int[]
        for (int i=0; i < stringBuilder.length(); i++) {
            answer[i] = Integer.parseInt(stringArr[i]);
        }
        return answer;
  }
}
