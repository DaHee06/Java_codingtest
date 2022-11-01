package Section1;

import java.util.Scanner;

/**
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라 한다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 아니면 "NO"를 출력하는 프로그램을 작성하세요.
 * 단, 회문 검사시에 대소문자를 구문하지 않습니다.
 */

public class Test07 {

    public String solution(String str){
        String answer="NO";
        str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        Test07 t = new Test07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
