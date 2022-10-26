package Section01;

import Section1.Test01;

import java.util.Scanner;

public class Main01 {

    //한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.

    public int solution(String str, char c){
        int answer=0;
        str=str.toUpperCase();
        c=Character.toUpperCase(c);
        //System.out.println(str+" "+t);
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/
        for(char x : str.toCharArray()){
            if(x==c) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Main01 T = new Main01();
        Scanner kb = new Scanner(System.in);
        String str=kb.next(); //입력받은 문자를 str에 저장
//        char c=str.charAt(0);
        char c=kb.next().charAt(0); //다시 입력 받은 문자의 첫번째 문자열
        System.out.print(T.solution(str, c));
    }
}
