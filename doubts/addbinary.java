import java.util.*;


class Solution {
    public String solve(String a, String b) {
        int n1=a.length();
        int n2=b.length();
        if(n1==0||n2==0)
            return "0";
        int sum1=0;
        int sum2=0;

        for(int i=0;i<n1;i++){
            int dig=Integer.parseInt(String.valueOf(a.charAt(i)));
            sum1+=Math.pow(2,(n1-i-1))*dig;
        }
        for(int j=0;j<n2;j++){
            int dig2=Integer.parseInt(String.valueOf(b.charAt(j)));
            sum2+=Math.pow(2,(n2-j-1))*dig2;
        }
        int sum3=sum1+sum2;

        if(sum3==0)
            return "0";
        int[]binary=new int[sum3];
        int idx=0;
        while(sum3>0){
            binary[idx++]=sum3%2;
            sum3=sum3/2;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int k=binary.length-1;k>=0;k--){
            list.add(String.valueOf(binary[k]));
        }
        
        int index=0;
        
        
        for(int index=0;index<list.size();index++){
            char chr=list.get(index);
            if(chr=='1')
                break;
            list.remove(chr);    

        }
       String s=Joiner.on("").join(list);
       return s;

    }
}
