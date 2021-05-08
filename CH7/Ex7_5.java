package ch07;
/*
 * <��������super> 
 * -��ü �ڽ��� ����Ű�� ��������. �ν��Ͻ� �޼���(������) ������ ����(��, static�޼��� ������ ��� �Ұ�).
 * -������ ����� �ڽ��� ����� ������ �� ���.
 * -����� �ɷ� this�� �ִ�.(this�� lv�� iv������ ���.)
 */


class Ex7_5 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent { int x = 10;	/* super.x */ }

class Child extends Parent {
	int x = 20; // this.x
	
	void method() {
		System.out.println("x=" + x);	// �� ��� ����� ���� x�� ��µȴ�.
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}



class Ex7_5 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 { int x = 10;  /*super.x�� this.x �� �� ����. */}

class Child2 extends Parent2 {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}



/*
 *<super() - ������ ������>   (��������super�ʹ� �ƿ� �ٸ� ��.)
 *- ������ �����ڸ� ȣ���� �� ���.
 *- ������ ����� ������ �����ڸ� ȣ���ؼ� �ʱ�ȭ.
 *- (*��ӿ��� �����ڿ� �ʱ�ȭ ���� ����� �ȵȴ�!)
 *
 */



class Point {
	int x,y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


// 1. 
class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		this.x = x;		// ������ ��� �ʱ�ȭ  (������ ���� ������ �̿� ���� �ϸ� �ȵȴ�.)
		this.y = y;		// ������ ��� �ʱ�ȭ  (������ ���� ������ �̿� ���� �ϸ� �ȵȴ�.)
		this.z = z;		// �⺻������ �ڼ��� �ڽ��� ������ �͸� �ʱ�ȭ �ؾ��Ѵ�.
	}
}


// �׷��Ƿ� 2���� ���� �ۼ��ؾ��Ѵ�.

// 2.
class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);		// ����Ŭ����(PointŬ����)�� ������ Point(int x, int y)�� ȣ��.
		this.z = z;			// �ڽ��� ����� �ʱ�ȭ
	}
}


/*
 * <super() - ������ ������>
 * -�߰�����:
 * -�������� ù �ٿ��� �ݵ�� �ٸ� �����ڸ� ȣ���Ѵ�!!!!!!! �׷��� ������ �����Ϸ��� �������� ù �ٿ� super();�� �ڵ�����.
 */

class Point {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y); {
		//�� �κп� �����ڰ� �����Ƿ� �����Ͻ� super(); �ڵ����Ե�.
		this.x = x;
		this.y = y;
	}
}

// ���� �ڵ带 �������ϸ�

class Point extends Object {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y); {
		super(); //Object();
		this.x = x;
		this.y = y;
	}
}

// ���� ���� �ȴ�.


// EX) �� ���� �߿�!!!!

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {	//�������̵�
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}


class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

// ���� �ڵ带 �������ϸ� ������ ����. 
// ���� �ڵ带 ������ �ϸ� �Ʒ��� ���� �ȴ�.

class Point extends Object {
	int x;
	int y;
	
	Point(int x, int y) {
		super(); // Object(); , '�������� ù �ٿ��� �ݵ�� �ٸ� �����ڸ� ȣ���Ѵ�'�� ��Ģ�� ���� ���Ե� ��.
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		super();	// Point()�� ȣ��. '�������� ù �ٿ��� �ݵ�� �ٸ� �����ڸ� ȣ���Ѵ�'�� ��Ģ�� ���� ���Ե� ��.
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {	//�������̵�
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}


class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

// Ŭ������ ���鶧 �⺻�����ڴ� �ʼ�.
// �Ʒ��� ���� ����� ������ ���� �ʴ´�. �ΰ��� ��찡 �ִ�.

// 1.
class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		// ������ ������ Point(int x, int y)�� ȣ��.
		super(x, y);
		this.z = z;
	}
	
	String getLocation() {	//�������̵�
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}


class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

// 2.

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :"+ y;		//Point() {}�� �߰��ϴ� ����ε� ���� ��� �ؾ� ���� ��....
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {	//�������̵�
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}


class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
	}
}
