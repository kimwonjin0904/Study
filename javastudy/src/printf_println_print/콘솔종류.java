package printf_println_print;

public class 콘솔종류 {
	  public static void main(String[] args) {
		  //println(내용); -> 괄호안 내용 출력하고 행 바꾸기
		  
		  
		  
		  //print(내용);  -> 괄호 안의 내용 출력하고 행 그대로
		  
		  
		  
		  
		  //printf("형식문자열",값1,값2..) -> 형식문자열에  맞추어 뒤의 값 출력
		  System.out.printf("이름: %s", "김원진");   //이름:김원진
		  System.out.printf("나이: %d", 26);
			        System.out.printf("이름: %s%n", "김원진"); // 문자열
			        System.out.printf("나이: %d%n", 26);      // 정수
			        System.out.printf("키: %.2f%n", 175.5);   // 실수 (소수점 2자리)
			        System.out.printf("성별: %c%n", '남');    // 문자
			        System.out.printf("학생 여부: %b%n", true); // 불리언
			    
			

 	  }
}

