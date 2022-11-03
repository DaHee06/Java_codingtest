package Section01;

import java.util.Scanner;

/**
 * 한 개의 문자열 S와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하시오.
 */

public class Main10 {

    public int[] solution(String str, char c){
        //받은 문자열 길이만큼의 배열 생성
        int[] answer = new int[str.length()];
        //가장 기본 값 p=1000로 설정
        int p =1000;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                p=0;
                answer[i]=p;
            }else{
                p++;
                answer[i]=p;
            }
        }
        //최소 거리를 구해야하기 때문에 for문을 역으로 이중으로 돌려야함
        for(int i=str.length()-1;i>=0;i--){
            //이미 위에서 p=0, answer[]배열에 넣었음, 최소거리는 0으로 동일하기 때문에 p=0이라고만 한다.
            if(str.charAt(i)==c) p=0;
            //p값을 앞의 값과 비교하여 최소 거리를 answer에 넣는다.
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main10 t = new Main10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int x : t.solution(str, c)){
            System.out.print(x+" ");
        }
    }
}
