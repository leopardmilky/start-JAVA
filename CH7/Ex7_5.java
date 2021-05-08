package ch07;
/*
 * <참조변수super> 
 * -객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자) 내에만 존재(즉, static메서드 내에서 사용 불가).
 * -조상의 멤버를 자신의 멤버와 구별할 때 사용.
 * -비슷한 걸로 this가 있다.(this는 lv와 iv구별에 사용.)
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
		System.out.println("x=" + x);	// 이 경우 가까운 쪽의 x가 출력된다.
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

class Parent2 { int x = 10;  /*super.x와 this.x 둘 다 가능. */}

class Child2 extends Parent2 {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}



/*
 *<super() - 조상의 생성자>   (참조변수super와는 아예 다른 것.)
 *- 조상의 생성자를 호출할 때 사용.
 *- 조상의 멤버는 조상의 생성자를 호출해서 초기화.
 *- (*상속에서 생성자와 초기화 블럭은 상속이 안된다!)
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
		this.x = x;		// 조상의 멤버 초기화  (에러는 나지 않지만 이와 같이 하면 안된다.)
		this.y = y;		// 조상의 멤버 초기화  (에러는 나지 않지만 이와 같이 하면 안된다.)
		this.z = z;		// 기본적으로 자손의 자신이 선언한 것만 초기화 해야한다.
	}
}


// 그러므로 2번과 같이 작성해야한다.

// 2.
class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);		// 조상클래스(Point클래스)의 생성자 Point(int x, int y)를 호출.
		this.z = z;			// 자신의 멤버를 초기화
	}
}


/*
 * <super() - 조상의 생성자>
 * -추가조건:
 * -생성자의 첫 줄에는 반드시 다른 생성자를 호출한다!!!!!!! 그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 자동삽입.
 */

class Point {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y); {
		//이 부분에 생성자가 없으므로 컴파일시 super(); 자동삽입됨.
		this.x = x;
		this.y = y;
	}
}

// 위의 코드를 컴파일하면

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

// 위와 같이 된다.


// EX) 이 예제 중요!!!!

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
	
	String getLocation() {	//오버라이딩
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}


class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

// 위의 코드를 컴파일하면 에러가 난다. 
// 위의 코드를 컴파일 하면 아래와 같이 된다.

class Point extends Object {
	int x;
	int y;
	
	Point(int x, int y) {
		super(); // Object(); , '생성자의 첫 줄에는 반드시 다른 생성자를 호출한다'의 규칙에 의해 삽입된 것.
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
		super();	// Point()을 호출. '생성자의 첫 줄에는 반드시 다른 생성자를 호출한다'의 규칙에 의해 삽입된 것.
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {	//오버라이딩
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}


class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

// 클래스를 만들때 기본생성자는 필수.
// 아래와 같이 만들면 에러가 나지 않는다. 두가지 경우가 있다.

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
		// 조상의 생성자 Point(int x, int y)를 호출.
		super(x, y);
		this.z = z;
	}
	
	String getLocation() {	//오버라이딩
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
		return "x :" + x + ", y :"+ y;		//Point() {}을 추가하는 방법인데 아직 어디에 해야 할지 모름....
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {	//오버라이딩
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}


class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
	}
}
