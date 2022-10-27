package Section1;

//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요
public class Test04 {
    public static void main(String[] args) {
        String str = "it is time to study";
        String[] s = str.split(" ");
        for(String a : s) System.out.println(a);
    }
}
