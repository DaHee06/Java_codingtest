package Section1;

import java.util.Scanner;

public class Test09 {

    public int solution(String str){
        String answer="";
        //isDigit
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) answer+=x;
        }
        //반환형이 String이면 맨 앞이 0인 경우 생략이 안되기 때문에 반환형을 int로 하고 형변환
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Test09 t = new Test09();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
