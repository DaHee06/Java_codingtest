package Section01;

import java.util.Scanner;

/**
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 */

public class Main09 {

//    public int solution(String s){
//        int answer = 0;
//        for(char x : s.toCharArray()){
//            if(x>=48 && x<=56) answer=answer*10+(x-48);
//        }
//        return answer;
//    }

    //int로 바꿔야하는 이유는 String일 경우 맨 앞이 0인 경우 생략이 안됨
    public int solution(String s){
        String answer="";
        for(char x : s.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main09 T = new Main09();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
