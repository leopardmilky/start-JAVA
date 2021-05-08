
// Ex6_1에 Tv클래스 정의됨.

class TvTest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");
		System.out.println();
		
		t1.channel = 7; //t1의 channel값을 7로 변경.
		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");
		System.out.println();
		
		t2 = t1;
		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");
		System.out.println();
		
		t1.channel = 2;
		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");
		System.out.println();
		
		t2.channel = 5;
		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");
		System.out.println();
		
	}
}