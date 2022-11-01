package Section1;

import java.util.Scanner;

/**
 * 영어 알파벳과 특수 문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수 문자는 자기 자리에 그대로인 문자열을 만들어 출력하는 프로그램을 작성하시오.
 *
 * */

public class Test05 {

    public String solution(String str){
        String answer ="";
        //문자열을 문자 단위 배열로 변경
        char[] s = str.toCharArray();
        //문자열 길이 주의 : str.length-1
        int lt=0, rt=str.length()-1;
        if(lt<rt){
            if(!(Character.isAlphabetic(s[lt]))) lt++;
            else if(!(Character.isAlphabetic(s[rt]))) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Test05 t = new Test05();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
