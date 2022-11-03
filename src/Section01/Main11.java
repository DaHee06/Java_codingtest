package Section01;

import java.util.Scanner;

/**
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램작성
 */

public class Main11 {

    public String solution(String str){
        String answer="";
        //받은 문자열 맨 끝에 빈문자 하나 추가, 추가한 이유는 아래 배열 에러를 잡기 위함, java:18 참고
        str = str+" ";
        int cnt=1;
        //길이 주의, 빈문자 전까지만 진행
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)) cnt++;
            else{
                answer += str.charAt(i);
                //받은 cnt는 String 형태여야 한다.
                if(cnt>1) answer += String.valueOf((cnt));
                cnt=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main11 t = new Main11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}

