
/*
 * <static 메서드와 인스턴스 메서드> 
 * 
 * 메서드 앞에 static이 붙은것. static매서드(=클래스 매서드).
 * Ex6_3 참조
 * 
 * 인스턴스 메서드:
 * -인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
 * -인스턴스 맴버(iv,im)와 관련된 작업을 하는 매서드
 * -메서드 내에서 인스턴스 변수(iv) 사용가능.
 * 
 * static 메서드(클래스 메서드):
 * -객체생성없이 '클래스이름.메서드이름()'으로 호출.
 * -인스턴스 맴버(iv,im)와 관련없는 작업을 하는 메서드.
 * -메서드 내에서 인스턴스 변수(iv) 사용불가.
 * 
 * => 인스턴스 메서드와 static메서드는 iv사용여부로 구분지음.
 * 
 * <static은 언제 붙여야 할까?>
 * -> 속성(멤버변수)중에서 공통 속성에 붙인다. (Ex6_3 참조)
 * -> 인스턴스 멤버(iv,im)를 사용하지 않는 메서드에 붙인다.
 */

class Ex6_8 {
	
long a,b;	//인스턴스 변수

long add() { //인스턴스 메서드
	return a + b;
    }

static long add(long a, long b) {//클래스메서드(static메서드)
	return a + b;
    }
	
//각각 메서드의 차이점 주목.
//static매서드 add안에 long a,long b는 지역변수.

}



/*
 * <메서드 간의 호출과 참조>
 * ->static메서드는 인스턴스 변수(iv)를 사용할 수 없다.
 */

class TestClass2 {
	int iv;		//인스턴스 변수
	static int cv;	//클래스 변수
	
	void intstanceMethod() {	//인스턴스 메서드
		System.out.println(iv);	//인스턴스 변수를 사용할 수 있다.
		System.out.println(cv);	//클래스 변수를 사용할 수 있다.
	}
	
	static void staticMethod() {	//static메서드
		System.out.println(iv);		//에러..!! 인스턴스 변수를 사용할 수 없다.
		System.out.println(cv);		//클래스 변수는 사용할 수 있다.
	}
}


/*
 * <메서드 간의 호출과 참조>
 * ->static메서드는 인스턴스 메서드(im)를 호출할 수 없다.
 */

class TestClass {
	void instanceMethod() {}		//인스턴스메서드
	static void staticMethod() {} 	//static메서드
	
	void instanceMethod2() {		//인스턴스메서드
		 instanceMethod();			//다른 인스턴스메서드를 호출한다.
		 staticMethod();			//static메서드를 호출한다.
	}
	
	static void staticMethod2() {	//static메서드
		instanceMethod();			//에러..! 인스턴스메서드를 호출할 수 없다.
		staticMethod();				//static메서드는 호출할 수 있다.
	}
}


//static메서드는 static메서드를 호출 가능한가? -> yes

//static메서드는 인스턴스 변수 사용 가능한가? -> NO

//static메서드는 인스턴스 메서드 호출 가능한가? -> NO

//왜 static메서드는 인스턴스 멤버(iv,im)를 쓸 수 없는가? 
//-> static메서드 호출시 객체(iv묶음)가 없을 수도 있어서.