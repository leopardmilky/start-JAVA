
/*
 * <생성자constructor>
 * -인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
 * -인스턴스 생성시 수행할 작업(iv초기화)에 사용
 * 
 * Time t = new Time();    <-- Time()이 생성자.
 * t.hour = 12;
 * t.minute = 34;
 * t.secend = 56;
 * 
 * Time t = new Time(12, 34, 56);   <--Time(12, 34, 56)이 생성자이다.(생성자 호출)
 * 
 * 
 * -생성자의 이름은 클래스 이름과 같아야 한다.
 * -생성자는 리턴값이 없다.(void 안붙임)
 * -모든 클래스는 반드시 생성자를 가져야 한다.(1개이상)
 * 
 *  클래스이름(타입 변수명, 타입 변수명,....)
 *  	인스턴스 생성 시 수행될 코드,
 *  	주로 인스턴스 변수의 초기화 코드를 적는다.
 * 
 * 
 *<기본 생성자>
 *-매개변수가 없는 생성자
 *-생성자가 하나도 없을때만 컴파일러가 자동으로 추가. (한개라도 있으면 안됨.)
 *
 *	클래스이름() {}	//기본 생성자
 *	Point() {}	//Point클래스의 기본 생성자
 * 
 */

class Data_1 {		// 생성자가 하나도 없기 때문에 컴파일러가 자동으로 추가함.
	int value;
}

class Data_2 {
	int value;
	
//	Data_2(){}		// 기본 생성자.
	Data_2(int x) {		//매개변수가 있는 생성자.
		value = x;
	}
}

class Ex6_10 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();	// 컴파일러가 생성자를 자동으로 추가했음, 그래서 에러 없음.
		Data_2 d2 = new Data_2();	// compile error발생		
	}
}


//<매개변수가 있는 생성자>

class Car{
	String color;		//색상
	String geartype;	//변속기 종류 - auto(자동),manual(수동)
	int door;			//문의 개수
	
	Car(){}		//기본 생성자
	Car(String c, String g, int d) {	//매개변수가 있는 생성자
		color = c;
		geartype = g;
		door = d;
	}
}

/*
 * 참고)
 * Car c = new Car();
 * c.color = "white";
 * c.geartpye = "auto";
 * c.door = 4;
 * 
 * 위와 같은 식을 아래처럼 간편하게 쓸 수 있다.
 * 
 * Car c = new Car("white", "auto", 4);
 * 
 */


