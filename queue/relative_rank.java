class Solution {
    class Pair {
        Pair(int score, int index) { this.score = score; this.index = index;}
        int score;
        int index;
    };

    public String[] findRelativeRanks(int[] score) {
        int count = 0;
        String[] answer = new String[score.length];
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->(b.score - a.score));

        for (int i = 0; i < score.length; ++i) {
            pq.add(new Pair(score[i], i));
        }

        while (!pq.isEmpty()) {
            Pair top = pq.poll();
            count++;

            if (count == 1) {
                answer[top.index] = "Gold Medal";
            } else if (count == 2) {
                answer[top.index] = "Silver Medal";
            } else if (count == 3) {
                answer[top.index] = "Bronze Medal";
            } else {
                answer[top.index] = String.valueOf(count);
            }
        }

        return answer;
    }
}
