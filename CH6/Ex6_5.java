
public class Ex6_5 {
	
/*
 * <return문>
 * 실행중인 메서드를 종료하고 호출한 곳으로 되돌아간다.
 * 
 * EX)
 * void printGugudan(int dan) {
 * 		if(!(2 <= dan && dan <= 9))
 * 			return;		//dan의 값이 2~9가 아닌경우, 호출한 곳으로 그냥 되돌아간다.
 * 		
 * 		for(int i=1; i <= 9; i++) {
 * 			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
 * 		}
 * 		return; <--이 리턴은 반환타입이 void이므로 생략가능. 컴파일러가 자동으로 추가.	
 * 				   반환타입이 void가 아니면 반드시 return문 필요.
 * }
 * 
 */

	
	
/*
 * int add(int x, int y) {
 * 		int result = x + y;
 * 		return result;
 * }
 * 
 * 위와 아래는 같은 문장이다. 문장의 길이를 줄일 수 있다. 
 * 
 * int add(int x, int y) {
 * 		return x + y;
 * }
 * 
 * 
 */


}
