

/*
 * !!!중요파트!!! 그림 그리는 것까지 익혀둘것.
 * 
 * <기본형 매개변수 >
 * 
 * 기본형 매개변수-변수의 값을 읽기만 할 수 있다. (read only)
 * 참조형 매개변수-변수의 값을 읽고 변경할 수 있다.(read & write)
 * 참고)기본형 8개: byte, short, int, long, char, float, double, boolean
 * 
 * 플래시 영상 참고)
 * 기본형 매개변수 예제:primitiveParam.exe
 * 참조형 매개변수 예제:referenceParam.exe
 * 
 * 
 */


/*
// 기본형 매개변수
class Data {int x;} 

class Ex6_7 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x =" + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x =" + d.x);
	}
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x =" + x);
	}
}



// 참조형 매개변수
class Data2 {int x;}

class Ex6_7 {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x =" + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	static void change(Data2 d) { //참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x =" + d.x);
	}
}
*/

// 참조형 반환타입
class Data3 {int x;}

class Ex6_7 {
	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x = " +d.x);
		System.out.println("d2.x = " +d2.x);
}

static Data3 copy(Data3 d) {
	Data3 tmp = new Data3();	//새로운 객체 tmp를 생성한다.
	
	tmp.x = d.x;	//d.x의 값을 tmp.x에 복사한다.
	
	return tmp;		// 복사한 객체의 주소를 반환한다.
  }
}