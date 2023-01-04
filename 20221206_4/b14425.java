import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String tmp="";
        int cnt=0;

        // N,M 받기
        tmp=br.readLine();
        st=new StringTokenizer(tmp);
        int nNum=Integer.parseInt(st.nextToken());
        int mNum=Integer.parseInt(st.nextToken());

        String[] nArr=new String[nNum];
        String[] mArr=new String[mNum];

        for(int i=0;i<nNum;i++) {
            nArr[i]=br.readLine();
        }

        for(int i=0;i<mNum;i++) {
            mArr[i]=br.readLine();
        }

        // nArr, mArr 출력
        /*for(int i=0;i<nNum;i++) {
            System.out.println(nArr[i]);
        }
        System.out.println();
        for(int i=0;i<mNum;i++) {
            System.out.println(mArr[i]);
        }*/

        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<nNum;i++) {
            map.put(nArr[i],0);
        }
        //System.out.println(map);

        for(int i=0;i<mNum;i++) {
            if(map.containsKey(mArr[i])) {
                cnt++;
            }
            else {
                continue;
            }
        }
        System.out.println(cnt);
    }
}