
public class Ex2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "3";
		
/*		System.out.println(str.charAt(0) - '0' + 1); // str.charAt(0)�� '3'���� �ٲ�� '3'-'0'�Ͽ� ���� 3�� ��
		System.out.println("3".charAt(0) - '0' + 1); // str.charAt(0)�� "3".charAt(0)�� ����. 
		System.out.println(Integer.parseInt("3")+1); // ����3 + ����1
		System.out.println("3" + 1); // ���ڿ�3 + ����1
		System.out.println(3 + '0'); // ����3, '0'�� ���ڷ� 48 
		System.out.println((char)(3 + '0')); //���� ����ȯ �� ��� 
*/
		
		int i=5, j=0;
		
		j = i++;	// ������, ������ �� �Ŀ� ����
		System.out.println("j=i++; ���� ��, i=" + i +", j=" +j);
		System.out.println("i=" + i +", j=" +j);
		
		i=5;		// ����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����.
		j=0;
		
		j =++i;		// ������, �����ϱ� ���� ����
		System.out.println("j=++i; ���� ��, i=" + i +", j="+ j);
		
		
	}

}
