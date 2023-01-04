//문제 A(아시아 정보 올림피아드) : 2535

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class b2535 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num=Integer.parseInt(br.readLine());
        boolean result;
        int[][] arr=new int[num][num];
        boolean[][] checkArr=new boolean[num][num];

        //입력 받아오기
        for(int i=0;i<num;i++) {
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<num;j++) {
                arr[i][j]=Integer.parseInt(st.nextToken());
                checkArr[i][j]=false;
            }
        }
        result=BFS(arr,checkArr,num);
        print(result);
    }

    public static boolean BFS(int[][] arr, boolean[][] check, int num) {
        Queue<Position> queue=new LinkedList<Position>();
        queue.add(new Position(0,0,arr[0][0]));

        while(!queue.isEmpty()) {
            Position pos=queue.poll();
            int r=pos.getRow();
            int c=pos.getCol();
            int v=pos.getValue();

            int down=r+v, right=c+v;
            if(down<num && !check[down][c]) {
                if(arr[down][c]==-1) {
                    return true;
                }
                else {
                    queue.add(new Position(down,c,arr[down][c]));
                    check[r][c]=true;
                }
            }
            if(right<num && !check[r][right]) {
                if(arr[r][right]==-1) {
                    return true;
                }
                else {
                    queue.add(new Position(r,right,arr[r][right]));
                    check[r][c]=true;
                }
            }
        }
        return false;
    }
    public static void print(boolean result) {
        if(result) {
            System.out.println("HaruHaru");
        }
        else {
            System.out.println("Hing");
        }
    }
}

class Position {
    private int v;
    private int r;
    private int c;

    public Position(int row, int col, int value) {
        r=row;
        c=col;
        v=value;
    }
    public int getRow() { return r; }
    public int getCol() { return c; }
    public int getValue() { return  v; }

}