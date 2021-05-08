
public class Ex2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "3";
		
/*		System.out.println(str.charAt(0) - '0' + 1); // str.charAt(0)이 '3'으로 바뀌고 '3'-'0'하여 숫자 3이 출
		System.out.println("3".charAt(0) - '0' + 1); // str.charAt(0)과 "3".charAt(0)이 같다. 
		System.out.println(Integer.parseInt("3")+1); // 숫자3 + 숫자1
		System.out.println("3" + 1); // 문자열3 + 숫자1
		System.out.println(3 + '0'); // 문자3, '0'은 숫자로 48 
		System.out.println((char)(3 + '0')); //위를 형변환 한 결과 
*/
		
		int i=5, j=0;
		
		j = i++;	// 후위형, 대입을 한 후에 증가
		System.out.println("j=i++; 실행 후, i=" + i +", j=" +j);
		System.out.println("i=" + i +", j=" +j);
		
		i=5;		// 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경.
		j=0;
		
		j =++i;		// 전위형, 대입하기 전에 증가
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
		
		
	}

}
