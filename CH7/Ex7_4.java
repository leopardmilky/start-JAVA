package ch07;
/*
 * <오버라이딩 Overriding>
 * -상속받은 조상의 메서드를 자신에 맞게 변경하는 것.
 * 
 * class Point {
 * 		int x;
 * 		int y;
 * }
 * 
 * 		String getLocation() {
 * 			return "x :" + x + ", y:" + y;
 * 		}
 * }
 * 
 * class Point3D extends Point {
 * 		int z;
 * 
 * 		String getLocation() {		//오버라이딩 -> 여기서는 z를 추가해야하므로. *선언부는 변경불가, 구현부{}만 변경하능 즉, 내용만 바꿀수 있음.
 * 			return "x :" + x + ", y :"+ y + ", z :"+ z;
 * 		}
 * }
 * 
 * 
 * 
 * <오버라이딩 조건>
 * 1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
 * class Point {
 * 		int x;
 * 		int y;
 * 
 * 		String getLocation() {  // 1.선언부
 * 			return "x :" + x + ", y :" + y;
 * 		}
 * }
 * 
 * class Point3D extends Point {
 * 		int z;
 * 
 * 		String getLocation() { // 오버라이딩, 2.선언부(1과 일치해야한다(반환타입, 메서드이름, 매개변수 목록)
 * 			return "x :" + x + ", y :" + y + ", z :" + z;
 * 		}
 * }
 * 
 * 
 * 2. 접근 제어자를 조상클래스의 메서드보다 좁은 범위로 변경할 수 없다.(접근제어자: public, protected, default, private)
 * 3. 예외는 조상클래스의 메서드보다 많이 선언할 수 없다. 
 * 
 * class Parent {
 * 		void parentMethod() throws IOException, SQLException { // throws부터 예외선언
 * 		//....
 * 		}
 * }
 * 
 * class Child extends Parent {
 * 		void parentMethod() throws IOException { // throws부터 예외선언, 여기서 선언개수가 같거나 적어야한다. 많을 수 없다.
 * 		//....
 * 		}
 * }
 * 
 * 
 * <오버로딩vs오버라이딩>
 * 오버로딩(overloading): 기존에 없는 새로운 메서드를 정의하는 것.(new)
 * 오버라이딩(overriding): 상속받은 메서드의 내용을 변경하는 것.(change, modify)
 * 
 * class Parent { 
 * 		void parentMethod() {
 * }
 * 
 * class Child extends Parent {
 * 		void parentMethod() {}			// 오버라이딩
 * 		void parentMethod(int i) {}		// 오버로딩
 * 
 * 		void childMethod() {}			//새메서드정의
 * 		void childMethod(int i) {}		//오버로딩
 * 		void childMethod() {}			//중복정의(에러임)
 * }
 * 
 * 
 */
public class Ex7_4 {

}
