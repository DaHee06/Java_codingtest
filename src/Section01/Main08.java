package Section01;

import java.util.Scanner;

/**
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 한다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 "NO"를 출력하는 프로그램을 작성하세요.
 * 단, 회문을 검사할 때 알파벳만 가지고 회문을 검사하여, 대소문자를 구분하지 않습니다.
 *
 */

public class Main08 {

    public String solution(String s){
        String answer="NO";
        s=s.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();
        if(tmp.equals(s)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        Main08 t = new Main08();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }

}
