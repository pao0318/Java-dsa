import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class an {
    public static void main(String args[]) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-->0){
            String line = br.readLine();
            String[] splitLine = line.split(" ");
            Integer r = Integer.parseInt(splitLine[0]);
            Integer c = Integer.parseInt(splitLine[1]);
 
            long ans=0;
            if(r<c){
                if(c%2==0)
                    ans=(long)(c-1)*(long)(c-1)+ r;
                else
                    ans=(long)c*(long)c-(r-1);
            }
            else{
                if(r%2==0)
                    ans=(long)r*(long)r-(c-1);
                else
                    ans=(long)(r-1)*(long)(r-1)+c;
            }
            System.out.println(ans);
 
        }
 
    }
}
