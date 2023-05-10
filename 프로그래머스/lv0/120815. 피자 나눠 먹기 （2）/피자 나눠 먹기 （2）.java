class Solution {
	public int solution(int pizza) {
		int answer = 0;
		for (int i = 1; i <= 6 * pizza; i++) {
			if (6 * i % pizza == 0) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}