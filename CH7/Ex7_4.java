package ch07;
/*
 * <�������̵� Overriding>
 * -��ӹ��� ������ �޼��带 �ڽſ� �°� �����ϴ� ��.
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
 * 		String getLocation() {		//�������̵� -> ���⼭�� z�� �߰��ؾ��ϹǷ�. *����δ� ����Ұ�, ������{}�� �����ϴ� ��, ���븸 �ٲܼ� ����.
 * 			return "x :" + x + ", y :"+ y + ", z :"+ z;
 * 		}
 * }
 * 
 * 
 * 
 * <�������̵� ����>
 * 1. ����ΰ� ���� Ŭ������ �޼���� ��ġ�ؾ� �Ѵ�.
 * class Point {
 * 		int x;
 * 		int y;
 * 
 * 		String getLocation() {  // 1.�����
 * 			return "x :" + x + ", y :" + y;
 * 		}
 * }
 * 
 * class Point3D extends Point {
 * 		int z;
 * 
 * 		String getLocation() { // �������̵�, 2.�����(1�� ��ġ�ؾ��Ѵ�(��ȯŸ��, �޼����̸�, �Ű����� ���)
 * 			return "x :" + x + ", y :" + y + ", z :" + z;
 * 		}
 * }
 * 
 * 
 * 2. ���� �����ڸ� ����Ŭ������ �޼��庸�� ���� ������ ������ �� ����.(����������: public, protected, default, private)
 * 3. ���ܴ� ����Ŭ������ �޼��庸�� ���� ������ �� ����. 
 * 
 * class Parent {
 * 		void parentMethod() throws IOException, SQLException { // throws���� ���ܼ���
 * 		//....
 * 		}
 * }
 * 
 * class Child extends Parent {
 * 		void parentMethod() throws IOException { // throws���� ���ܼ���, ���⼭ ���𰳼��� ���ų� ������Ѵ�. ���� �� ����.
 * 		//....
 * 		}
 * }
 * 
 * 
 * <�����ε�vs�������̵�>
 * �����ε�(overloading): ������ ���� ���ο� �޼��带 �����ϴ� ��.(new)
 * �������̵�(overriding): ��ӹ��� �޼����� ������ �����ϴ� ��.(change, modify)
 * 
 * class Parent { 
 * 		void parentMethod() {
 * }
 * 
 * class Child extends Parent {
 * 		void parentMethod() {}			// �������̵�
 * 		void parentMethod(int i) {}		// �����ε�
 * 
 * 		void childMethod() {}			//���޼�������
 * 		void childMethod(int i) {}		//�����ε�
 * 		void childMethod() {}			//�ߺ�����(������)
 * }
 * 
 * 
 */
public class Ex7_4 {

}
