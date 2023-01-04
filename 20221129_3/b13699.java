import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class b13699 {
    private static long[] arr=new long[36];
    private static int ii=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num=Integer.parseInt(br.readLine());
        arr[0]=1;
        arr[1]=1;


        for(int i=2;i<num+1;i++) {
            for(int j=0;j<i;j++) {
                arr[i]+=arr[j]*arr[i-j-1];
            }
        }

        System.out.println(arr[num]);

    }

}