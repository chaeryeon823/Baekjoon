import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class b9625 {
    private static int[] cnt=new int[46];
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num=Integer.parseInt(br.readLine());
        int a=0;
        int b=0;

        if(num==1) {
            a=0;
            b=1;
        }
        else {
            a=fn(num-1);
            b=fn(num);
        }
        System.out.println(a+" "+b);

    }

    public static int fn(int n) {
        if (cnt[n] == 0) {
            if (n <= 2) {
                cnt[n] = 1;
            } else {
                cnt[n] = fn(n - 1) + fn(n - 2);
            }
        }
        return cnt[n];
    }

}