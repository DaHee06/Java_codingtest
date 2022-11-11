package Section1;

import java.util.Scanner;

/**
 * 한 개의 문자열 S와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하시오.
 */

public class Test10 {

    public int[] solution(String str, char c){
        int[] answer = new int[str.length()];
        int p = 1000;
        for(int i=0;i<=str.length();i++){
            if(str.charAt(i)==c){
                p=0;
                answer[i]=p;
            }else{
                p++;
                answer[i]=p;
            }
        }
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==c) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test10 t = new Test10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int x : t.solution(str, c)){
            System.out.println(x + " ");
        }
    }
}
