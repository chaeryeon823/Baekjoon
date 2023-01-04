
import javax.management.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class b1388 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());
        int row=Integer.parseInt(st.nextToken());
        int column=Integer.parseInt(st.nextToken());

        char[][] arr=new char[row][column];
        boolean[][] checkArr=new boolean[row][column];
        String[] tmp=new String[row];
        //입력 받아오기
        for(int i=0;i<row;i++) {
            tmp[i]=br.readLine();
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<column;j++) {
                arr[i][j]=tmp[i].charAt(j);
                checkArr[i][j]=false;
            }
        }
        
        fun(arr,checkArr,row,column);

    }

    public static void fun(char[][] arr, boolean[][] check, int totalRow, int totalCol) {
        int result=0;

        for(int i=0;i<totalRow;i++) {
            for(int j=0;j<totalCol;j++) {
                if(arr[i][j]=='-') {
                    if(j==totalCol-1) {
                        result++;
                    }
                    else if(arr[i][j+1]=='|') {
                        result++;
                    }

                }
                if(arr[i][j]=='|') {
                    if(i==totalRow-1) {
                        result++;
                    }
                    else if(arr[i+1][j]=='-') {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}