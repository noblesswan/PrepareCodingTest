class Solution{
	int solution(int n, int k) {
		int answer = 0;
	    int firstResult = n/10;
        answer = (n*12000)+((k-firstResult)*2000);
		return answer;
	}
}