package if문;


import java.util.Scanner;


public class 사용자입력_점수 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 입력:");
		String score = scanner.nextLine();   //문자열 입력 받기
		int score_int = Integer.parseInt(score); //입력 받은 문자열 정수로 변환
		
		if(score_int>90) {
			System.out.println("a");
		}
		else {
			System.out.println("b");
		}
		
		System.out.println("학생의 점수는:" +score_int);
		
	}
}
