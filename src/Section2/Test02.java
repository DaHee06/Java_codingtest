package Section2;

import java.util.Scanner;

/**
 *선생님이 N명의 학생을 일렬로 세웠다.
 * 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성
 * 자기 앞에 서 있는 학생들보다 클 때 학생이 보인다.
 */

public class Test02 {

    public int solution(int n, int[] arr){
        int answer=1;
        int MAX = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>MAX){
                answer++;
                MAX = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test02 t = new Test02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] += sc.nextInt();
        }
        System.out.println(t.solution(n, arr));
    }
}
