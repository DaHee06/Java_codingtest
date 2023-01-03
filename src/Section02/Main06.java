package Section02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 뒤집은 소수
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910을 뒤집으면 19로 숫자화 해야한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 */
public class Main06 {

    public boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2;i<num;i++){
            //약수 존재
            if(num%i==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        //for문 돌면서 숫자 뒤집기
        for(int i=0;i<n;i++){
            int tmp = arr[i]; //123
            int res = 0;
            while(tmp>0){
                int t= tmp%10; //나머지
                res = res*10+t;
                tmp=tmp/10; //몫
            }
            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main06 t = new Main06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int x : t.solution(n,arr)){
            System.out.println(x + " ");
        }
    }

}
