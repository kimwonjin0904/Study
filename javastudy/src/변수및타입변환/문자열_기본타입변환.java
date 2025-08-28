package 변수및타입변환;

public class 문자열_기본타입변환 {
	public static void main(String[] args) {
		//문자열(String) -> 기본타입 변환
		//해당타입에서 


		//String -> int
		//Integer.parseInt(변수);
		String str = "10";
		int change = Integer.parseInt(str);
		
		//String -> float
		//Float.parseFloat(변수);
		String str2 = "20";
		float chg = Float.parseFloat(str2);
		
		//String -> double
		//Double.parseDouble(변수);
		String str3 = "230";
		double chg2 = Double.parseDouble(str3);
		
		
		System.out.println(str);

		System.out.println(str2);
		System.out.println(str3);
	}
}
