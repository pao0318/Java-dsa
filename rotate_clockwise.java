
import java.util.*;
public class RotateMatrix {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        ArrayList<ArrayList<Integer>> mat= new ArrayList<>();

        for(int i=0;i<n;i++){
            mat.add(new ArrayList<>());
            for(int j=0;j<m;j++){
                mat.get(i).add(sc.nextInt());
            }
        }
        rotatematrix(mat,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(mat.get(i).get(j)+" ");
            }
            System.out.println();
        }



    }
    public static void rotatematrix(ArrayList<ArrayList<Integer>> mat, int rowend, int colend){
        int rowstart=0;
        int colstart=0;
        int prev,curr;

        while(rowstart<rowend && colstart<colend){

            if(rowstart==rowend-1||colstart==colend-1)
                break;

            prev=mat.get(rowstart+1).get(colstart);

            for(int i=colstart;i<colend;i++){
                curr=mat.get(rowstart).get(i);
                mat.get(rowstart).set(i,prev);
                prev=curr;
            }
            rowstart++;

            for(int i=rowstart;i<rowend;i++){
                curr=mat.get(i).get(colend-1);
                mat.get(i).set(colend-1,prev);
                prev=curr;
            }
            colend--;

            if(rowstart<rowend){
                for(int i=colend-1;i>=colstart;i--){
                    curr=mat.get(rowend-1).get(i);
                    mat.get(rowend-1).set(i,prev);
                    prev=curr;
                }
            }
            rowend--;

            if(colstart<colend){
                for(int i=rowend-1;i>=rowstart;i--){
                    curr=mat.get(i).get(colstart);
                    mat.get(i).set(colstart,prev);
                    prev=curr;
                }
            }
            colstart++;

        }
    }
}
