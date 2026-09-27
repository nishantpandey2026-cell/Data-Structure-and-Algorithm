class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        return helper(n, 1L);
    }

    public boolean helper(int n, long sum) {
        if (sum > n) {
            return false;
        }

        if (sum == n) {
            return true;
        }

        return helper(n, sum * 2);
    }
}