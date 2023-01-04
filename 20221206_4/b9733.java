import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

class b9733 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] std={"Re","Pt","Cc","Ea","Tb","Cm","Ex"};
        ArrayList<String> arr=new ArrayList<String>();
        ArrayList<String> line=new ArrayList<String>();
        String tmp="";
        StringTokenizer st;

        // 값 입력 받아오기
        while((tmp=br.readLine())!=null) {
            st=new StringTokenizer(tmp);
            while(st.hasMoreTokens()) {
                arr.add(st.nextToken());
            }
        }


        // arr출력
        /*for(int i=0;i<arr.size();i++) {
            System.out.println(arr.get(i));
        }*/


        Map<String, Integer> map=new HashMap<String,Integer>();
        // 키 초기화
        for(int i=0;i<std.length;i++) {
            map.put(std[i],0);
        }
        // 개수 받아오기
        for(int i=0;i<arr.size();i++) {
            if(map.containsKey(arr.get(i))) {
                map.put(arr.get(i), map.getOrDefault(arr.get(i),0)+1);
            }
        }
        
        // 출력
        for(int i=0;i<std.length;i++) {
            String key=std[i];
            int cnt=map.getOrDefault(key,0);
            float rate=cnt/(arr.size()*1.0f);
            String strRate=String.format("%.2f",rate);
            System.out.println(key+" "+cnt+" "+strRate);
        }
        System.out.println("Total "+arr.size()+" 1.00");



    }
}