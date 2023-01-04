import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class b2193 {
    public static long[] arr=new long[91];
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        arr[0]=0;
        arr[1]=1;

        if(num==0) {
            System.out.println(arr[0]);
        }
        else if(num==1) {
            System.out.println(arr[1]);
        }
        else if(num>=2) {
            System.out.println(fn(num));
        }
    }
    public static long fn(int n) {
        if (arr[n] == 0) {
            if (n <= 2) {
                arr[n] = 1;
            } else {
                arr[n] = fn(n - 1) + fn(n - 2);
            }
        }
        return arr[n];
    }


}