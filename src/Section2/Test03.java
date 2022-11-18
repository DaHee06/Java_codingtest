package Section2;

import java.util.Scanner;

/**
 * 가위바위보
 * N번의 게임, 1 가위 2 바위 3 보
 * A가 이기면 A, B가 이기면 B, 비기면 D 출력
 */

public class Test03 {

    public String solution(int n , int[] a,int[] b){
        String answer ="";
        for(int i=0;i<n;i++){
            if(a[i]==1 && b[i]==3) answer += "A";
            else if(a[i]==2 && b[i]==1) answer += "A";
            else if(a[i]==3 && b[i]==2) answer += "A";
            else if(a[i] == b[i]) answer += "D";
            else answer+="B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Test03 t = new Test03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] += sc.nextInt();
        }
        int[] b = new int[n];
        for(int i=0;i<a.length;i++){
            b[i] += sc.nextInt();
        }
        for(char c : t.solution(n, a, b).toCharArray()) System.out.println(c);
    }
}
