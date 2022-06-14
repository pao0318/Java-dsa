import java.util.*;
public class Bishop {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int t= sc.nextInt();
        while (t-->0){
            int r=8,c=8;
            char [][] board= new char[r][];
            for(int i=0;i<8;i++)
                board[i]=sc.next().toCharArray();

            for(int x=1;x<7;x++){
                for(int y=1;y<7;y++){
                    if(board[x][y]=='#' && board[x+1][y+1]=='#' && board[x+1][y-1]=='#' && board[x-1][y-1]=='#')
                        System.out.println((x+1)+" "+ (y+1));
                }
            }


            }

    }
}
