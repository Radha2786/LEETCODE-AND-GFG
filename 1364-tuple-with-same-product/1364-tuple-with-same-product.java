class Solution {
      private int nC2(int n) {
        return (n * (n - 1)) / 2;
    }
   public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>(); // K -> product, V -> frequency of such pair

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int product = nums[i] * nums[j];
                freq.put(product, freq.getOrDefault(product, 0) + 1);
            }
        }

        int count = 0;
        for (int frequency : freq.values()) {
            count += 8 * nC2(frequency);
        }

        return count;
    }
}