import java.util.*;
import java.io.*;
public class Apartments {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input= br.readLine().split(" ");
        int n=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);
        long k=Long.parseLong(input[2]);

//        long[]people= new long[n];
//        long[]apartment= new long[m];
        List<Long>people= new ArrayList<>();
        List<Long>apartment= new ArrayList<>();

        String[] pe= br.readLine().split(" ");
        String[] ap= br.readLine().split(" ");
        for(int i=0;i<n;i++)
            people.add(Long.parseLong(pe[i]));

        for(int i=0;i<m;i++)
            apartment.add(Long.parseLong(ap[i]));


        Collections.sort(people);
        Collections.sort(apartment);

        int i=0;
        int j=0;
        int cnt=0;
        while(i<n && j<m){
            if(apartment.get(j)>=people.get(i)-k && apartment.get(j)<=people.get(i)+k){
                cnt++;
                i++;
                j++;
            }
            else if(people.get(i)>apartment.get(j)+k){
                j++;
            }
            else{
                i++;
            }
        }
        System.out.println(cnt);


    }
}
