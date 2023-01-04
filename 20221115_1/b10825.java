//문제 B(국영수) : 10825

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
				
			  // 학생 수 입력
        int num=Integer.parseInt(br.readLine());
        String[][] arr=new String[num][4];
				
				// 이름 / 국어 / 영어 / 수학 순으로 입력 받아 배열에 저장
        for(int i=0;i<num;i++) {
            st=new StringTokenizer(br.readLine()," ");
            arr[i][0]=st.nextToken();
            arr[i][1]=st.nextToken();
            arr[i][2]=st.nextToken();
            arr[i][3]=st.nextToken();
        }
        //국어[1] 영어[2] 수학[3] 조건에 맞춰 정렬
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[1].equals(o2[1])) {
                    if(o1[2].equals(o2[2])) {
                        if(o1[3].equals(o2[3])) {
                            return o1[0].compareTo(o2[0]);
                        }
                        else {
                            return Integer.parseInt(o2[3])-Integer.parseInt(o1[3]);
                        }
                    }
                    else {
                        return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
                    }

                }
                else {
                    return Integer.parseInt(o2[1])-Integer.parseInt(o1[1]);
                }

            }
        });
				// 이름만 출력
        for(int i=0;i<num;i++) {
            System.out.println(arr[i][0]);
        }
    }
}