package Section1;

import java.util.Scanner;

//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
public class Test01 {

    public int solution(String str, char c){
        int answer=0 ;
        String s = str.toUpperCase();
        c = Character.toUpperCase(c);

        //문자 배열로 만들어서 진행
//        char[] a = s.toCharArray();
//        for(char b : a){
//            if(c==b) answer++;
//        }

        //변환 없이 진행
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Test01 t = new Test01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(t.solution(str,c));
    }
}
