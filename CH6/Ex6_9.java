

/*
 * <�����ε�>
 * �� Ŭ���� �ȿ� ���� �̸��� �޼��� ���� ���� �����ϴ� ��.
 * 
 * <�����ε��� �����ϱ� ���� ����>
 * 1. �޼��� �̸��� ���ƾ� �Ѵ�.
 * 2. �Ű������� ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.(�Ѱ� ������ �ȵ�)
 * 3. ��ȯ Ÿ���� ������ ����.
 * 
 */


// <�����ε��� ��1>
class Ex6_9 {
	int add(int a, int b) {return a+b;}
	int add(int x, int y) {return x+y;}
	//���� ���� ���� �����ε��� �ƴϴ�. ��ȣ�� intŸ�� �ߺ�����.
}


class A {
	int add(int a, int b) {return a+b;}
	long add(int a, int b) {return (long)(a+b);}
	//���� ��쵵 �����ε��� �ƴϴ�. ��ȣ�� intŸ�� �ߺ�����. ��ȯŸ�Ը� �ٸ�.
}

class B {
	long add(int a, long b) {return a+b;}
	long add(long a, int b) {return a+b;}
	//���� ���� ���� �����ε� ����. �� ������ Ÿ���� �ٸ�.
}


//<�����ε��� ��2>
class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {		//�迭�� ��� ����� ���� ����� �����ش�.
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++)
			result += a[i];
		
		return result;
	}
}

