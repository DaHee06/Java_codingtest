package Section01;

import Section1.Test02;

import java.util.Scanner;

public class Main02 {

    //대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요

    public String solution(String str){
        String answer="";
//        for(char c : str.toCharArray()){
//            if(Character.isLowerCase(c)) answer+=Character.toUpperCase(c);
//            else answer += Character.toLowerCase(c);
//        }
        //아스키 번호 이용해서 구할 수 있음, 대문자 65~90, 소문자 97~122
        for(char c : str.toCharArray()){
            if(c>=97 && c<=122) answer+=(char)(c-32);
            else answer+=(char)(c+32);
        }
        return answer;

    }

    public static void main(String[] args) {
        Main02 m = new Main02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}
