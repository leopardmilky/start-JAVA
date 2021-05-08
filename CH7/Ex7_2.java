package ch07;
/*
 * <���԰���composite>			����) Ŭ������ ����: 1.���, 2.����
 * - Ŭ������ ����� ���������� �����ϴ� ��.
 * 
 * 1. (�Ϲ� Ŭ�������):
 * class Circle {
 * 		int x;	//������ x��ǥ	
 * 		int y;	//������ y��ǥ
 * 		int r;	//������(radius)
 * }
 * 
 * 
 * 2. (���Թ�� ǥ��): 
 * class Point {
 * 		int x;
 * 		int y;
 * }
 * class Circle {
 * 		Point c = new Point();	//����
 * 		int r;	//������ 
 * }
 * 
 * �̾ �Ʒ��� ���� �־�������
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
 * -���������� Ŭ������ �����, �� ���� �����ؼ� Ŭ������ �����.
 * 
 * class Car { 
 * 		Engine e = new Engine();	//����
 * 		Door[] d = new Door[4];		//��, ���� ������ ������ �����ϰ� �迭�� ó���ߴ�.
 * 		//....
 * }
 * 
 * ���� �־����� Engine�̳� Door���� ���� Ŭ������ ����� CarŬ������ ���� ��Ű�°�.
 * 
 * 
 * <Ŭ���� ���� ���� �����ϱ�>
 * ��Ӱ��� ~�� ~�̴�.(is-a)
 * ���԰��� ~�� ~�� ������ �ִ�.(has-a)
 * 
 * ex)
 * class Point {
 * 		int x;
 * 		int y;
 * }
 * 
 * 1.����
 * class Circle {
 * 		Point c = new Point();
 * 		int r;
 * }
 * 
 * 2.���
 * class Circle extends Point {
 * 		int r;
 * }
 * 
 * ��(Circle)�� ��(Point)�̴�.   Circle is a Point.
 * ��(Circle)�� ��(Point)�� ������ �ִ�.   Circle has a Point. 
 * 
 * ���Ͱ��� ��� ������ ������ �� �ڿ�������Ƿ� ���Թ���� �ڵ带 �����Ѵ�.
 * 
 * 
 */
public class Ex7_2 {

}
