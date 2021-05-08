package ch07;

/*
 * <상속(inheritance)>		참고) 클래스의 관계: 1.상속, 2.포함
 * - 기존의 클래스로 새로운 클래스를 작성하는 것.(코드의 재사용)
 * - 두 클래스를 부모와 자식으로 관계를 맺어주는 것.
 * 
 * class 자식클래스 extends 부모클래스 {
 * (내용....)
 * }
 * 
 * class Parent { }
 * class Child extands Parent {
 * (내용....)
 * }
 * 
 * 
 * -자손은 조상의 모든 멤버를 상속받는다.(생성자, 초기화블럭 제외)
 * (*조상:부모의 부모까지 포함.)
 * -자손의 멤버 개수는 조상보다 적을 수 없다.(같거나 많다.)
 * 
 * class Parent {
 * 		int age;
 * }
 * 
 * class Child extends Parent{   }
 * 
 * 
 * 
 * -자손의 변경은 조상에 영향을 미치지 않는다.
 * 
 * class Parent {
 * 		int age;
 * }
 * 
 * class Child extends Parent {
 * 		void play() {
 * 			System.out.println("놀자~");
 * 	}
 * }
 * 
 * 
 * ex)
 * 
 * class Point {	//Point클래스 -> 2차원좌표.
 * 		int x;
 * 		int y;
 * }
 * 
 * 1.
 * class Point3D {		//Point3D클래스 -> 3차원좌표
 * 		int x;
 * 		int y;
 * 		int z;
 * }
 * 
 * 2.
 * class Point3D extends Point {
 * 		int z;
 * }
 * 
 * 
 * 
 */



public class Ex7_1 {

	
}
