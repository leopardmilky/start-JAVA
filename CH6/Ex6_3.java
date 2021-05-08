

// 선언 위치에 따른 변수의 종류

class Ex6_3 
{ //{} 클래스 영역
	int iv; // 변수 선언; 인스턴스 변수; iv = instance variable
	static int cv; // 변수 선언; 클래스 변수(static변수, 공유변수); cv = class variable
	
	void method() // 메서드 선언
	{ //{} 메서드 영역
		int lv = 0; // 지역변수; lv = local variable
	}
}

/* 
	영역은 클래스 영역과 메서드 영역으로 나누어진다. 
	클래스 영역에는 iv, cv가 있다. cv는 iv형식에 static이 붙은 것(static + iv = cv).
	클래스 영역에는 선언문만 가능하다. 순서는 상관없음. (ex: y=x+3, System.out.println() 등은 쓸 수 없음.)
*/




// 클래스 변수와 인스턴스 변수

class Card{
	//iv(개별영역)
	String kind; // 무늬
	int number; // 숫자
	
	//cv(공통영역)
	static int width = 100; // 폭 
	static int height = 250; // 높이
}

/*
	<객체생성>
	Card c =  new Card();
	
	<객체사용>
		<iv>
		c.kind = "HEART";
		c.number = 5; 

		<cv>
		c.width = 200; 
		c.height = 300;
 		**하지만 cv같은 경우 위와같은 방법보다
 	
 		Card.width = 200;
 		Card.height = 300;
		**이와 같은 방법으로 cv는 클래스 이름(Card)을 붙여서 사용할 것을 권장한다.
*/

