
class Ex6_1 {
	public static void main(String arg[]) {
		Tv t;				//Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv();		//Tv�ν��Ͻ��� �����Ѵ�.
		t.channel = 7;		//Tv�ν��Ͻ��� �ɹ����� channel�� ���� 7�� �Ѵ�.
		t.channelDown();		//Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�.
		System.out.println("���� ä���� "+ t.channel + "�Դϴ�.");
	}

}

class Tv{
	//Tv�� �Ӽ�(�������)
	String color;		//����
	boolean power;		//��������(on/off)
	int channel;		//ä��
	
	//Tv�� ���(�޼���)
	void power()	{ power	= !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}