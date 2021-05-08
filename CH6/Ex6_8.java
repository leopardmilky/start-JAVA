
/*
 * <static �޼���� �ν��Ͻ� �޼���> 
 * 
 * �޼��� �տ� static�� ������. static�ż���(=Ŭ���� �ż���).
 * Ex6_3 ����
 * 
 * �ν��Ͻ� �޼���:
 * -�ν��Ͻ� ���� ��, '��������.�޼����̸�()'���� ȣ��
 * -�ν��Ͻ� �ɹ�(iv,im)�� ���õ� �۾��� �ϴ� �ż���
 * -�޼��� ������ �ν��Ͻ� ����(iv) ��밡��.
 * 
 * static �޼���(Ŭ���� �޼���):
 * -��ü�������� 'Ŭ�����̸�.�޼����̸�()'���� ȣ��.
 * -�ν��Ͻ� �ɹ�(iv,im)�� ���þ��� �۾��� �ϴ� �޼���.
 * -�޼��� ������ �ν��Ͻ� ����(iv) ���Ұ�.
 * 
 * => �ν��Ͻ� �޼���� static�޼���� iv��뿩�η� ��������.
 * 
 * <static�� ���� �ٿ��� �ұ�?>
 * -> �Ӽ�(�������)�߿��� ���� �Ӽ��� ���δ�. (Ex6_3 ����)
 * -> �ν��Ͻ� ���(iv,im)�� ������� �ʴ� �޼��忡 ���δ�.
 */

class Ex6_8 {
	
long a,b;	//�ν��Ͻ� ����

long add() { //�ν��Ͻ� �޼���
	return a + b;
    }

static long add(long a, long b) {//Ŭ�����޼���(static�޼���)
	return a + b;
    }
	
//���� �޼����� ������ �ָ�.
//static�ż��� add�ȿ� long a,long b�� ��������.

}



/*
 * <�޼��� ���� ȣ��� ����>
 * ->static�޼���� �ν��Ͻ� ����(iv)�� ����� �� ����.
 */

class TestClass2 {
	int iv;		//�ν��Ͻ� ����
	static int cv;	//Ŭ���� ����
	
	void intstanceMethod() {	//�ν��Ͻ� �޼���
		System.out.println(iv);	//�ν��Ͻ� ������ ����� �� �ִ�.
		System.out.println(cv);	//Ŭ���� ������ ����� �� �ִ�.
	}
	
	static void staticMethod() {	//static�޼���
		System.out.println(iv);		//����..!! �ν��Ͻ� ������ ����� �� ����.
		System.out.println(cv);		//Ŭ���� ������ ����� �� �ִ�.
	}
}


/*
 * <�޼��� ���� ȣ��� ����>
 * ->static�޼���� �ν��Ͻ� �޼���(im)�� ȣ���� �� ����.
 */

class TestClass {
	void instanceMethod() {}		//�ν��Ͻ��޼���
	static void staticMethod() {} 	//static�޼���
	
	void instanceMethod2() {		//�ν��Ͻ��޼���
		 instanceMethod();			//�ٸ� �ν��Ͻ��޼��带 ȣ���Ѵ�.
		 staticMethod();			//static�޼��带 ȣ���Ѵ�.
	}
	
	static void staticMethod2() {	//static�޼���
		instanceMethod();			//����..! �ν��Ͻ��޼��带 ȣ���� �� ����.
		staticMethod();				//static�޼���� ȣ���� �� �ִ�.
	}
}


//static�޼���� static�޼��带 ȣ�� �����Ѱ�? -> yes

//static�޼���� �ν��Ͻ� ���� ��� �����Ѱ�? -> NO

//static�޼���� �ν��Ͻ� �޼��� ȣ�� �����Ѱ�? -> NO

//�� static�޼���� �ν��Ͻ� ���(iv,im)�� �� �� ���°�? 
//-> static�޼��� ȣ��� ��ü(iv����)�� ���� ���� �־.