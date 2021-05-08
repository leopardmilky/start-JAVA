

/*
 * <오버로딩>
 * 한 클래스 안에 같은 이름의 메서드 여러 개를 정의하는 것.
 * 
 * <오버로딩이 성립하기 위한 조건>
 * 1. 메서드 이름이 같아야 한다.
 * 2. 매개변수의 개수 또는 타입이 달라야 한다.(둘가 같으면 안됨)
 * 3. 반환 타입은 영향이 없다.
 * 
 */


// <오버로딩의 예1>
class Ex6_9 {
	int add(int a, int b) {return a+b;}
	int add(int x, int y) {return x+y;}
	//위와 같은 경우는 오버로딩이 아니다. 괄호안 int타입 중복정의.
}


class A {
	int add(int a, int b) {return a+b;}
	long add(int a, int b) {return (long)(a+b);}
	//위의 경우도 오버로딩이 아니다. 괄호안 int타입 중복정의. 반환타입만 다름.
}

class B {
	long add(int a, long b) {return a+b;}
	long add(long a, int b) {return a+b;}
	//위와 같은 경우는 오버로딩 성립. 각 변수의 타입이 다름.
}


//<오버로딩의 예2>
class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {		//배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++)
			result += a[i];
		
		return result;
	}
}

