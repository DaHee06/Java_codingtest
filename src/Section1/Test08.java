package Section1;

import java.util.Scanner;

public class Test08 {

    public String solution(String str){
        String answer = "";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(tmp.equals(str)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        Test08 t = new Test08();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
