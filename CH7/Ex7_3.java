package ch07;


/*
 * <단일상속 Single inheritance>
 * - Java는 단일상속만을 허용한다. (c++은 다중상속을 허용함.)
 * 
 * class TvDVD extends Tv,DVD {	//에러..! 조상은 하나만 허용한다.
 * 		//.....
 * }
 * 
 * - 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 한다.
 * class Tv {
 *		boolean power;
 *		int channel;
 *
 *		void power() {power = !power;}
 *		void channelUp() {++channel;}
 *		void channelDown() {--channel;}
 *}
 *
 *class DVD {
 *		boolean power;
 *
 *		void power() {power = !power;}
 *		void play() { 내용생략 }
 *		void stop() { 내용생략 }
 *		void rew() { 내용생략 }
 *		void ff() { 내용생략 }
 *
 *위의 내용들에서 Tv클래스는 상속, DVD클래스는 포함으로 결합해서
 *
 *class TvDVD extends Tv {
 *	DVD dvd = new DVD();
 *
 *	void play() {
 *		dvd.play();
 *  }
 *
 *	void stop() {
 *		dvd.stop();
 *  }
 *
 *	void rew() {
 *		dvd.rew();
 *  }
 *
 *	void ff() {
 *		dvd.ff();
 *  }
 *}
 * 
 * 
 * <Object클래스 - 모든 클래스의 조상>
 * -부모가 없는 클래스는 자동적으로 Object클래스를 상속받게 된다.
 * -모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다.
 * ex): toString(), equals(Object obj), hashCode(), .....
 * 
 * class Tv {
 * 	//....
 * }
 * class SmartTv extends Tv {
 * 	//....
 * }
 * 
 * 위의 내용을 컴파일하면 아래와 같이 컴파일러가 자동적으로 Object를 추가함.
 * 
 * class Tv extends Object {
 * 	//....
 * }
 * class SmartTv extends Tv {
 * 	//....
 * }
 * 
 * 
 * 
 * 
 */


public class Ex7_3 {

}
