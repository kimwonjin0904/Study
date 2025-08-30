package case문;

public class 기본 {
 public static void main(String[] args) {
	 
	 int num = (int)(Math.random() * 6 + 1);
	 
	switch(num) {
	case 1:
		System.out.println("1번");
		break;
	case 2:
		System.out.println("2번");
		break;
	default:
		System.out.println("아무거나");
	     	
	}
	 

 }
}
