package Section2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성
 */

public class Test01 {

    public ArrayList<Integer> solution(int n , int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Test01 t = new Test01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] += sc.nextInt();
        }
        for(int x : t.solution(n, arr)){
            System.out.println(x + " ");
        }
    }
}
