class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n=s.length();
        int sum=map.get(s.charAt(0));
        for(int i=1;i<n;i++){
            if(map.get(s.charAt(i))>map.get(s.charAt(i-1)))
                sum+=map.get(s.charAt(i))-2*(map.get(s.charAt(i-1)));
            
            else
                sum+=map.get(s.charAt(i));
            
        }
        return sum;


            
    }
}
// Ek aur tareeka
lass Solution {
    Map<Character, Integer> add = new HashMap<>();
    Map<String, Integer> add2 = new HashMap<>();
    Integer res = 0;
    public int solve(String numeral) {
        add.put('M', 1000);
        add.put('D', 500);
        add.put('C', 100);
        add.put('L', 50);
        add.put('X', 10);
        add.put('V', 5);
        add.put('I', 1);
        add2.put("CM", 900);
        add2.put("CD", 400);
        add2.put("XC", 90);
        add2.put("XL", 40);
        add2.put("IV", 4);
        add2.put("IX", 9);
        char[] s = numeral.toCharArray();
        int n = s.length;
        for (int i = n - 1; i >= 0;) {
            String sub = "";
            if (i - 1 >= 0)
                sub = numeral.substring(i - 1, i + 1);
            if (add2.containsKey(sub)) {
                res += add2.get(sub);
                i -= 2;
            } else {
                res += add.get(s[i]);
                i--;
            }
        }

        return res;
    }
}
