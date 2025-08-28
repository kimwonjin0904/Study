package if문;

public class 변수사용범위 {
	  public static void main(String[] args) {
		  
		  int v1 = 15;
		  
		  if(v1>10) {
			  int v2= 10;
			  int diff =v1 - v2;
			  System.out.println(diff);
		  }
		  else {
			  
			  System.out.println("dd");
		  }
		  System.out.println(v1);
	  }
}
