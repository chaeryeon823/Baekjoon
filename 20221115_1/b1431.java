//문제 C(시리얼 번호) : 1431

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class b1431 {
		// 숫자 더하는 함수
    public static int sumNum(String str) {
        int sum=0;
				// 문자열의 숫자인 것만 골라 sum 변수에 더해준다.
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9') {
                sum=sum+(ch-'0');
            }
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

				// 기타의 개수 입력
        int num=Integer.parseInt(br.readLine());
        String[] arr=new String[num];

				// 기타 시리얼 번호 입력받아 배열에 저장
        for(int i=0;i<num;i++) {
            arr[i]=br.readLine();
        }
				
				// 조건에 맞춰 정렬
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()-o2.length()==0) {
                    int a=sumNum(o1);
                    int b=sumNum(o2);
                    if(a-b==0) {
                        return o1.compareTo(o2);
                    }
                    else {
                        return a-b;
                    }
                }
                else {
                    return o1.length()-o2.length();
                }
            }
        });
				// 시리얼 번호 출력
        for(int i=0;i<num;i++) {
            System.out.println(arr[i]);
        }

    }
}