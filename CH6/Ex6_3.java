

// ���� ��ġ�� ���� ������ ����

class Ex6_3 
{ //{} Ŭ���� ����
	int iv; // ���� ����; �ν��Ͻ� ����; iv = instance variable
	static int cv; // ���� ����; Ŭ���� ����(static����, ��������); cv = class variable
	
	void method() // �޼��� ����
	{ //{} �޼��� ����
		int lv = 0; // ��������; lv = local variable
	}
}

/* 
	������ Ŭ���� ������ �޼��� �������� ����������. 
	Ŭ���� �������� iv, cv�� �ִ�. cv�� iv���Ŀ� static�� ���� ��(static + iv = cv).
	Ŭ���� �������� ���𹮸� �����ϴ�. ������ �������. (ex: y=x+3, System.out.println() ���� �� �� ����.)
*/




// Ŭ���� ������ �ν��Ͻ� ����

class Card{
	//iv(��������)
	String kind; // ����
	int number; // ����
	
	//cv(���뿵��)
	static int width = 100; // �� 
	static int height = 250; // ����
}

/*
	<��ü����>
	Card c =  new Card();
	
	<��ü���>
		<iv>
		c.kind = "HEART";
		c.number = 5; 

		<cv>
		c.width = 200; 
		c.height = 300;
 		**������ cv���� ��� ���Ͱ��� �������
 	
 		Card.width = 200;
 		Card.height = 300;
		**�̿� ���� ������� cv�� Ŭ���� �̸�(Card)�� �ٿ��� ����� ���� �����Ѵ�.
*/

