package if문;


import java.util.Scanner;

public class 주사위뽑기 {
 public static void main(String[] args) {
	 
	 Scanner scanner = new Scanner(System.in); //문자열 입력
	 String str = scanner.nextLine();
	 int nm = Integer.parseInt(str);
	 
	 int number = (int)(Math.random() * 6 + 1);  //주사위 번호 하나 뽑기 
	 
	 if(number == 1) {
		 System.out.println("1번나옴");
	 }
	 else if(number ==2) {
		 System.out.println("2번");
	 }
	 
 }
}
