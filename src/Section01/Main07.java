package Section01;

import java.util.Scanner;

/**
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라 한다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 아니면 "NO"를 출력하는 프로그램을 작성하세요.
 * 단, 회문 검사시에 대소문자를 구문하지 않습니다.
 */
public class Main07 {

    public String solution(String str){
//        String answer="YES";
        String answer="NO";
        str = str.toUpperCase();
//        int len = str.length();
//        for(int i =0;i<len/2;i++){
//            if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
//        }
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        Main07 t = new Main07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }

}
