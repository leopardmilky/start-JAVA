

/*
 * !!!�߿���Ʈ!!! �׸� �׸��� �ͱ��� �����Ѱ�.
 * 
 * <�⺻�� �Ű����� >
 * 
 * �⺻�� �Ű�����-������ ���� �б⸸ �� �� �ִ�. (read only)
 * ������ �Ű�����-������ ���� �а� ������ �� �ִ�.(read & write)
 * ����)�⺻�� 8��: byte, short, int, long, char, float, double, boolean
 * 
 * �÷��� ���� ����)
 * �⺻�� �Ű����� ����:primitiveParam.exe
 * ������ �Ű����� ����:referenceParam.exe
 * 
 * 
 */


/*
// �⺻�� �Ű�����
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



// ������ �Ű�����
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
	static void change(Data2 d) { //������ �Ű�����
		d.x = 1000;
		System.out.println("change() : x =" + d.x);
	}
}
*/

// ������ ��ȯŸ��
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
	Data3 tmp = new Data3();	//���ο� ��ü tmp�� �����Ѵ�.
	
	tmp.x = d.x;	//d.x�� ���� tmp.x�� �����Ѵ�.
	
	return tmp;		// ������ ��ü�� �ּҸ� ��ȯ�Ѵ�.
  }
}