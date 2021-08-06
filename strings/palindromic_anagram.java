// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

class Solution {
    public boolean solve(String str) {
        if (str == null || str.isEmpty())
            return false;
        Map<Character, Integer> freqMap = new HashMap();
        for (char ch : str.toCharArray()) freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

        boolean isOddFrequencyCharFound = false;
        for (char ch : freqMap.keySet()) {
            int freq = freqMap.get(ch);
            if (freq % 2 == 0)
                continue;
            if (freq % 2 != 0) {
                if (!isOddFrequencyCharFound) {
                    isOddFrequencyCharFound = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
