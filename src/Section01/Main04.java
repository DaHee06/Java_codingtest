package Section01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main04 {

    //N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
//        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[lt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }



    public static void main(String[] args) {
        Main04 m = new Main04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i =0;i<n;i++){
            str[i] = sc.next();
        }
        for(String x : m.solution(n, str)){
            System.out.println(x);
        }

    }
}
