/*
 * <������ this()>
 * -�����ڿ��� �ٸ� ������ ȣ���� �� ��� 
 * -�ٸ� ������ ȣ��� ù �ٿ����� ��밡��. 
 * -�ڵ��ߺ� ���ſ� ����Ѵ�.
 * 
 */

class Ex6_11 {

}

//	EX1)

class Car2 {
	String color;		//����
	String gearType;	//���ӱ� ���� - auto(�ڵ�), manual(����)
	int door;			//���� ����
	
	Car2() {
		this("white", "auto", 4);   //--> Car2(String color, String gearType, int door)�� ȣ��
	}
	
	Car2(String color) {
		this(color, "auto", 4);		//--> Car2(String color, String gearType, int door)�� ȣ��
	}
	
	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

//	EX2)

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {					/*�ڵ��� �ߺ���*/	Car() {
		color = "white";	/*������ �ڵ� */		//Car("white", "auto", 4);
		gearType = "auto";	/*------- >*/		this("white", "auto", 4);
		door = 4;							}
	}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}



/*
 * <�������� this>
 * -�ν��Ͻ� �ڽ��� ����Ű�� ��������
 * -�ν��Ͻ� �޼���(������ ����)���� ��밡��.
 * -��������(lv)�� �ν��Ͻ� ����(iv)�� ������ �� ���.
 * -������this()�� ���� �ٸ� ��.(����x)
 */

//	EX1)
Car(String c, String g, int d) {
	//color,gearType,door�� iv;   c,g,d�� lv
	color = c;
	gearType = g;
	door = d;
}

Car(String color, String gearType, int door) {
	//this.color�� iv, color�� lv
	this.color = color;
	this.gearType = gearType;
	this.door = door;
}

/*
 * <�������� this�� ������ this()>
 * - this : �ν��Ͻ� �ڽ��� ����Ű�� ��������, �ν��Ͻ��� �ּҰ� ����Ǿ� �ִ�.
 * 			��� �ν��Ͻ� �޼��忡 ���������� ������ä �����Ѵ�. (���� ���ص� ��밡��.)
 * - this(), this(�Ű�����) : ������, ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����Ѵ�. (Ŭ���� �̸���� this()�� ���)
 * 
 * !!! this�� this()�� ����ϰ� �������� ������ �ٸ� ���̴�. this�� '��������'�̰�, this()�� '������'�̴�.
 */


class MyMath2 {
	long a, b	// this.a, this.b	(iv�� ��¥�̸�, this��������)
	
	MyMath2(int a, int b)	{	//������
		this.a = a;		//lv�� iv�� �����ϱ����� ���.
		this.b = b;
	}
	long add()	{	// �ν��Ͻ� �޼���
		return a + b;	//return this.a + this.b;
	}
	static long add(long a, long b)	{ // Ŭ���� �޼���(static�޼���), Ŭ���� �޼���� this ���Ұ�.
		return a + b;
	}
}
