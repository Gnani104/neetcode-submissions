class Solution {
    public boolean isHappy(int n) {
        int[] squares = new int[10];
        for (int i = 0; i <= 9; i++) {
            squares[i] = i * i;
        }

        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);

            int sum = 0;
            int temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                sum += squares[digit];
                temp /= 10;
            }
            n = sum;
        }

        return true;
    }
}