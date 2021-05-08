package ch07;
/*
 * <포함관계composite>			참고) 클래스의 관계: 1.상속, 2.포함
 * - 클래스의 멤버로 참조변수를 선언하는 것.
 * 
 * 1. (일반 클래스방식):
 * class Circle {
 * 		int x;	//원점의 x좌표	
 * 		int y;	//원점의 y좌표
 * 		int r;	//반지름(radius)
 * }
 * 
 * 
 * 2. (포함방식 표현): 
 * class Point {
 * 		int x;
 * 		int y;
 * }
 * class Circle {
 * 		Point c = new Point();	//원점
 * 		int r;	//반지름 
 * }
 * 
 * 이어서 아래와 같이 주어졌을때
 * 
 * Circle c = new Circle();
 * 
 * 1. 
 * x -> c.x
 * y -> c.y
 * r -> c.r
 * 
 * 2.
 * r -> c.r
 * x -> c.c.x
 * y -> c.c.y
 * 
 * 
 * -작은단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만든다.
 * 
 * class Car { 
 * 		Engine e = new Engine();	//엔진
 * 		Door[] d = new Door[4];		//문, 문의 개수를 넷으로 가정하고 배열로 처리했다.
 * 		//....
 * }
 * 
 * 위의 주안점은 Engine이나 Door같은 작은 클래스를 만들고 Car클래스에 포함 시키는것.
 * 
 * 
 * <클래스 간의 관계 결정하기>
 * 상속관계 ~은 ~이다.(is-a)
 * 포함관계 ~은 ~을 가지고 있다.(has-a)
 * 
 * ex)
 * class Point {
 * 		int x;
 * 		int y;
 * }
 * 
 * 1.포함
 * class Circle {
 * 		Point c = new Point();
 * 		int r;
 * }
 * 
 * 2.상속
 * class Circle extends Point {
 * 		int r;
 * }
 * 
 * 원(Circle)은 점(Point)이다.   Circle is a Point.
 * 원(Circle)은 점(Point)을 가지고 있다.   Circle has a Point. 
 * 
 * 위와같은 경우 포함의 문장이 더 자연스러우므로 포함방식의 코드를 구성한다.
 * 
 * 
 */
public class Ex7_2 {

}
