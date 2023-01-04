import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine())+1;
        int cnt=0;
        int max=0;
        int result=0;

        int[] arr=new int[num];

        //입력 받아오기
        for(int i=1;i<num;i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }

        for(int i=1;i<num;i++) {
            cnt=fun(arr,i,num);
            if(cnt>max) {
                max=cnt;
                result=i;
            }
        }

        System.out.println(result);

    }

    public static int fun(int[] arr, int startIndex, int num) {
        int cnt=0;
        boolean doubleCheck=false;
        int tmp=arr[startIndex];
        boolean[] visited=new boolean[num];

        visited[startIndex]=true;
        while(!doubleCheck) {
            if(visited[tmp]==true) {
                doubleCheck=true;
            }
            else {
                visited[tmp]=true;
                tmp=arr[tmp];
            }
        }


        for(int i=1;i<num;i++) {
            if(visited[i]==true) {
                cnt++;
            }
        }
        return cnt;

    }
}