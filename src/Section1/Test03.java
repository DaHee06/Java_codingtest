package Section1;

import java.util.Arrays;
import java.util.Scanner;

//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
public class Test03 {

    public String solution(String str){
        String answer ="";
        String[] s = str.split(" ");
        int m = Integer.MIN_VALUE; //최소값 선언
        for (String x : s){
            int len = x.length();
            if(len>m) {
                m = len;   //길이 len이 크면 m 값 변경, 없다면 m값은 계속 정수 최소값으로 진행
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test03 t = new Test03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(t.solution(str));
    }
}
