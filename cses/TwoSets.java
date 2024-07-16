import java.io.*;
import java.util.*;

public class TwoSets {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long sum = (n * (n + 1)) / 2;

        StringBuilder sb = new StringBuilder();

        if (sum % 2 != 0) {
            sb.append("NO");
        } else {
            sb.append("YES\n");
            long target = sum / 2;
            List<Long> set1 = new ArrayList<>();
            List<Long> set2 = new ArrayList<>();

            for (long i = n; i >= 1; i--) {
                if (target >= i) {
                    set1.add(i);
                    target -= i;
                } else {
                    set2.add(i);
                }
            }

            sb.append(set1.size()).append("\n");
            for (long x : set1) {
                sb.append(x).append(" ");
            }
            sb.append("\n");

            sb.append(set2.size()).append("\n");
            for (long x : set2) {
                sb.append(x).append(" ");
            }
        }

        System.out.print(sb);
    }
}
