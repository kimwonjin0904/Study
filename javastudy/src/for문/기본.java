package for문;

public class 기본 {
    public static void main(String[] args) {
        int sum = 0; // 누적 합 변수, 반복문 밖에서 초기화

        for(int i = 1; i <=5; i++) {
            sum = sum + i; // 누적 합 계산
            System.out.println("i = " + i + ", sum = " + sum);
        }
        System.out.println(sum);
    }
}
