
/*
 * <변수의 초기화>
 * - 지역변수(lv)는 수동 초기화 해야함(사용전 꼭!!)
 * - 멤버변수(iv, cv)는 자동 초기화된다.
 */

class Ex6_12 {
}

class InitTest {
	int x;			// 인스턴스 변수, 자동 초기화됨.
	int y = x;		// 인스턴스 변수

	void method1() {
		int i;		// 지역변수, 수동 초기화 해줘야함.
		int j = i;	// 에러, 지역변수를 초기화하지 않고 사용.
	}
}


// <멤버변수 초기화>
// 1. 명시적 초기화(=)
 
class Car {
	int door = 4;				//**기본형(primitive type) 변수의 초기화
	Engine e = new Engine();	//**참조형(reference type) 변수의 초기화, 참조형 변수는 객체를 만들어줌으로서 초기화
}

// 2. 초기화 블럭 (복잡한 초기화,(여러문장넣기))
// - 인스턴스 초기화 블럭 : {}
// - 클래스 초기화 블럭 : static {}

// 3. 생성자 (iv초기화, 복잡한 초기화)

	Car(String color, String gearType, int door) { // 매개변수 있는 생성자
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

/*
 * cv,iv 초기화 종류&순서
 * 1. 자동초기화 : 0값, 디폴트값
 * 2. 간단초기화 : = 대입연산자 대입 값
 * 3. 복잡초기화 : static{}, 생성자, {}
 */	

/*
 * 클래스 변수 초기화 시점: 클래스가 초음 로딩될때 단 한번.(메모리 올라갈때)
 * 인스턴스 변수 초기화 시점: 인스턴스가 생성될 때 마다. 
 */

class InitTest {
	static int cv = 1;	//명시적 초기화
	int iv = 1;			//명시적 초기화
	// 간단 초기화
	
	static {	cv = 2; }	//클래스 초기화 블럭
	{	iv = 2; }			//인스턴스 초기화 블럭
	
	InitTest()	{ // 생성자
		iv = 3;
	}
	// 복잡 초기화
}
