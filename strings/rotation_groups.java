import java.util.*;

class Solution {
    public int solve(String[] words) {
             List<String> list = new ArrayList<String>();
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (isRotation(words[i], list.get(j))) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                list.add(words[i]);
                count++;
            }
            flag = false;
        }
        return list.size();
    }
    public boolean isRotation(String a, String b) {
        if (a.length() != b.length())
            return false;
        a = a + a;
        return a.contains(b);
    }
    
}
