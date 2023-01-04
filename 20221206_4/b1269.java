import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class b1269 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String tmp="";

        // A,B 개수 받기
        tmp=br.readLine();
        st=new StringTokenizer(tmp);
        int aNum=Integer.parseInt(st.nextToken());
        int bNum=Integer.parseInt(st.nextToken());
        int num=aNum+bNum;

        int[] arr=new int[num];

        // A 원소 받기
        tmp=br.readLine();
        st=new StringTokenizer(tmp);
        for(int i=0;i<aNum;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }

        // B 원소 받기
        tmp=br.readLine();
        st=new StringTokenizer(tmp);
        for(int i=aNum;i<num;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }

        // AB 출력
        /*for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }*/

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                map.remove(arr[i]);
            }
            else {
                map.put(arr[i],0);
            }
        }
        System.out.println(map.size());

    }
}