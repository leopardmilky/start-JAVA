/*
 * <생성자 this()>
 * -생성자에서 다른 생성자 호출할 때 사용 
 * -다른 생성자 호출시 첫 줄에서만 사용가능. 
 * -코드중복 제거에 사용한다.
 * 
 */

class Ex6_11 {

}

//	EX1)

class Car2 {
	String color;		//색상
	String gearType;	//변속기 종류 - auto(자동), manual(수동)
	int door;			//문의 개수
	
	Car2() {
		this("white", "auto", 4);   //--> Car2(String color, String gearType, int door)를 호출
	}
	
	Car2(String color) {
		this(color, "auto", 4);		//--> Car2(String color, String gearType, int door)를 호출
	}
	
	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

//	EX2)

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {					/*코드의 중복을*/	Car() {
		color = "white";	/*제거한 코드 */		//Car("white", "auto", 4);
		gearType = "auto";	/*------- >*/		this("white", "auto", 4);
		door = 4;							}
	}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}



/*
 * <참조변수 this>
 * -인스턴스 자신을 가리키는 참조변수
 * -인스턴스 메서드(생성자 포함)에서 사용가능.
 * -지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용.
 * -생성자this()와 전혀 다른 것.(연관x)
 */

//	EX1)
Car(String c, String g, int d) {
	//color,gearType,door는 iv;   c,g,d는 lv
	color = c;
	gearType = g;
	door = d;
}

Car(String color, String gearType, int door) {
	//this.color는 iv, color는 lv
	this.color = color;
	this.gearType = gearType;
	this.door = door;
}

/*
 * <참조변수 this와 생성자 this()>
 * - this : 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.
 * 			모든 인스턴스 메서드에 지역변수로 숨겨진채 존재한다. (선언 안해도 사용가능.)
 * - this(), this(매개변수) : 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다. (클래스 이름대신 this()를 사용)
 * 
 * !!! this와 this()는 비슷하게 생겼을뿐 완전히 다른 것이다. this는 '참조변수'이고, this()는 '생성자'이다.
 */


class MyMath2 {
	long a, b	// this.a, this.b	(iv의 진짜이름, this생략가능)
	
	MyMath2(int a, int b)	{	//생성자
		this.a = a;		//lv와 iv를 구별하기위해 사용.
		this.b = b;
	}
	long add()	{	// 인스턴스 메서드
		return a + b;	//return this.a + this.b;
	}
	static long add(long a, long b)	{ // 클래스 메서드(static메서드), 클래스 메서드라 this 사용불가.
		return a + b;
	}
}
