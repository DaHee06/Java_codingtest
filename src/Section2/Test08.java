package Section2;

import java.util.Scanner;

public class Test08 {

    public int[] solution(int n , int[] arr){
        int[] answer = new int[n];
        for(int i = 0; i<n ;i ++){
            int cnt =1;
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]) cnt++;
//                answer[i] += cnt;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Test08 t = new Test08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            //결괏값 [I@5056dfcb [I@58651fd0 [I@4520ebad
//            System.out.print(t.solution(n,arr).toString() + " ");
//            System.out.print(t.solution(n,arr) + " ");
        }
    }
}
