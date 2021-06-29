import java.util.*;

class Solution {
    public int solve(int[] cells) {
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> { return b - a; });

        for (int i : cells) pq.add(i);

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (a == b)
                continue;
            pq.add((a + b) / 3);
        }

        if (pq.size() == 0)
            return -1;
        return pq.poll();
    }

}
