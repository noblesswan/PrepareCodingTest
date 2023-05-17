class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        String[] numberArr = str.split("");
        int sum = 0;

        for (int i = 0; i < numberArr.length; i++) {
            sum += Integer.parseInt(numberArr[i]);
        }

        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}