
// Ex6_1�� TvŬ���� ���ǵ�.

class TvTest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� "+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� "+ t2.channel + "�Դϴ�.");
		System.out.println();
		
		t1.channel = 7; //t1�� channel���� 7�� ����.
		System.out.println("t1�� channel���� "+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� "+ t2.channel + "�Դϴ�.");
		System.out.println();
		
		t2 = t1;
		System.out.println("t1�� channel���� "+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� "+ t2.channel + "�Դϴ�.");
		System.out.println();
		
		t1.channel = 2;
		System.out.println("t1�� channel���� "+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� "+ t2.channel + "�Դϴ�.");
		System.out.println();
		
		t2.channel = 5;
		System.out.println("t1�� channel���� "+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� "+ t2.channel + "�Դϴ�.");
		System.out.println();
		
	}
}