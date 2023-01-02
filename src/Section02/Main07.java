package Section02;

import java.util.Scanner;

/**
 * 첫째 줄에 입력에서 주어진 채점 결과에 대하여 가산점을 고려한 총 점수를 출력한다.
 * 1이 나오면 1 이후 숫자 cnt++ , 0이 나오면 0으로 리셋
 */

public class Main07 {
    public int solution(int n, int[] arr){
        int answer=0, cnt=0;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                answer+=cnt;
            }
            else cnt=0;
        }
        return answer;
    }
    public static void main(String[] args){
        Main07 T = new Main07();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
