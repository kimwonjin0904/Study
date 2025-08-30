package if문;

public class 점수 {
	  public static void main(String[] args) {
		  
		  //방식1
		  int score = 90;
		  
		  if (score > 90) {
			  System.out.println("a");
		  }
		  else if(score > 80) {
			  System.out.println("b");
		  }
		  else
		  {
			  System.out.println("d");
		  }
		  System.out.println("학생의 점수는:"+score);
		  
		  
		  
		  //방식2
		  int sco = 90;
		  String sc;
		  
		  if (sco >90) {
			  sc = "a";
		  }
		  else {
			  sc = "b";
		  }
		  System.out.println(sc);
	  }
}
