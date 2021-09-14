import java.util.*;

class Solution {
    public int[][] solve(int[][] fractions) {
      int n=fractions.length;
      int[][]arr1=new int[n][2];
      int i=0;
    //   YAHA PE DIVIDE KIYE AUR DAALE
      for(int[]f:fractions){
        int a=f[0];
        int b=f[1];
        int div=gcd(a,b);
        a=a/div;
        b=b/div;
        if(b<0){
            if(a>=0){
                a=a*(-1);
                b=b*(-1);
            }
        }
        arr1[i]=new int[]{a,b};
        i++;
      }
    
    // UNIQUE CHAHIE TO HASHSET
    HashSet<ArrayList<Integer>> hs=new HashSet();
    for(int[]f:arr1){
        ArrayList<Integer> list=new ArrayList();
        list.add(f[0]);
        list.add(f[1]);
        hs.add(list);
    }
    // sorting se pehle usko int[][] 
    int[][]r=new int[hs.size()][2];
    int j=0;
    for(ArrayList<Integer>a:hs){
        r[j][0]=a.get(0);
        r[j][1]=a.get(1);
        j++;
    }
    // AV TERA BHAI SORTING KAREGA 
    Arrays.sort(r,new Comparator<int[]>(){
        public int compare(int[]p1, int[]p2){
        if(p1[0]*1.0/p1[1]<p2[0]*1.0/p2[1])
            return -1;
        return 1; 
        }   
    });
    
    return r;
}
    public int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b,a%b);    
    }
}
