package Section02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 가위바위보
 * N번의 게임, 1 가위 2 바위 3 보
 * A가 이기면 A, B가 이기면 B, 비기면 D 출력
 */
public class Main03 {

    public String solution(int n, int[] a, int[] b){
        String answer="";
        for(int i=0; i<n; i++){
            if(a[i]==b[i]) answer+="D";
            else if(a[i]==1 && b[i]==3) answer+="A";
            else if(a[i]==2 && b[i]==1) answer+="A";
            else if(a[i]==3 && b[i]==2) answer+="A";
            else answer+="B";
        }
        return answer;
    }
    public static void main(String[] args){
        Main03 T = new Main03();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i]=kb.nextInt();
        }
        for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
    }
}
