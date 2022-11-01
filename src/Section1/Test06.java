package Section1;

import java.util.Scanner;

/**
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하시오.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 */

public class Test06 {

    public String solution(String str){
        String answer = "";
        for(int i =0;i<str.length();i++){
            if(i==str.indexOf(str.charAt(i))) answer+=str.charAt(i);
        }
        return answer;
    }

    public static  void main(String[] args){
        Test06 t = new Test06();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
