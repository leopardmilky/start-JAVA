
public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char ch = 'W'; // ''표로 표시해야하고 한개의 문자만 가능, 빈문자('') 불가능.
		int i = 'A';
		System.out.println(i);
		
		String str =""; 
		String str2 ="A";
		String str3 = "ABC";
		String str4 = "1234";
		String str5 = str3 + str4;
		System.out.println(str5);
		
		System.out.println(""+7+7);
		System.out.println(7+7+"");
		// 위 둘은 결과값이 다르다. 77, 14
		
		
		// 두 변수 값 바꾸기
		int x =3, y=4;
		int tmp; // 두 변수를 바꾸는데에 또 다른 하나의 변수가 더 필요하다. 
		
		tmp=x; // x값을 tmp에 저장
		x=y; // y값을 x에 저장
		y=tmp; // tmp값을 y에 저장

		System.out.println("x=" +x);
		System.out.println("y=" +y);
		
		
		
		
		
		
	}
}

		
