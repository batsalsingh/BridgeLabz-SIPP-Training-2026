import java.util.*;

public class Scenario5APIRateLimiter {
    public int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {
        Map<Integer, Integer> freq = new HashMap<>();
        int start = 0, maxLen = 0;
        for (int end = 0; end < keyIds.length; end++) {
            freq.merge(keyIds[end], 1, Integer::sum);
            while (freq.size() > n) {
                int key = keyIds[start++];
                freq.put(key, freq.get(key) - 1);
                if (freq.get(key) == 0) freq.remove(key);
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
