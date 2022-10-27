package Section01;

import java.util.Scanner;

public class Main03 {

    //한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

    public String solution(String str){
        String answer ="";
        //내가 하는 오답
//        String[] array = str.split(" ");
//        for(int i=0;i< array.length;i++){
//            if(array[i].length()>=array[i+1].length()) answer=array[i];
//            else answer=array[i+1];
//        }

        //split 사용하여 구하기
//        int m = Integer.MIN_VALUE; //가장 작은 값으로 초기화
//        String[] arr = str.split(" ");
//        for(String x : arr){
//            int len = x.length();
//            if(len>m){
//                m=len;
//                answer=x;
//            }
//        }

        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!= -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args) {
        Main03 m = new Main03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }
}
