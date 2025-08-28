package 변수및타입변환;
public class 다른타입_문자열로변환 {
    public static void main(String[] args) {
    	
    	
    	
        // int를 String으로 변환
        int number = 10;
        String strNumber = String.valueOf(number);
        System.out.println("숫자 10의 문자열 변환: " + strNumber); // 출력: 숫자 10의 문자열 변환: 10

        // double을 String으로 변환
        double pi = 3.14;
        String strPi = String.valueOf(pi);
        System.out.println("3.14의 문자열 변환: " + strPi); // 출력: 3.14의 문자열 변환: 3.14

        // boolean을 String으로 변환
        boolean isTrue = true;
        String strTrue = String.valueOf(isTrue);
        System.out.println("true의 문자열 변환: " + strTrue); // 출력: true의 문자열 변환: true

        // char 배열을 String으로 변환
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String strHello = String.valueOf(chars);
        System.out.println("문자 배열의 문자열 변환: " + strHello); // 출력: 문자 배열의 문자열 변환: hello
        
        
        
        int nm = 10;
        String age = String.valueOf(nm);
        System.out.println(age);
    }
}