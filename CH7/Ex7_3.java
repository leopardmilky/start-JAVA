package ch07;


/*
 * <���ϻ�� Single inheritance>
 * - Java�� ���ϻ�Ӹ��� ����Ѵ�. (c++�� ���߻���� �����.)
 * 
 * class TvDVD extends Tv,DVD {	//����..! ������ �ϳ��� ����Ѵ�.
 * 		//.....
 * }
 * 
 * - ������ ���� Ŭ���� �ϳ��� ��Ӱ����, �������� ���԰���� �Ѵ�.
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
 *		void play() { ������� }
 *		void stop() { ������� }
 *		void rew() { ������� }
 *		void ff() { ������� }
 *
 *���� ����鿡�� TvŬ������ ���, DVDŬ������ �������� �����ؼ�
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
 * <ObjectŬ���� - ��� Ŭ������ ����>
 * -�θ� ���� Ŭ������ �ڵ������� ObjectŬ������ ��ӹް� �ȴ�.
 * -��� Ŭ������ ObjectŬ������ ���ǵ� 11���� �޼��带 ��ӹ޴´�.
 * ex): toString(), equals(Object obj), hashCode(), .....
 * 
 * class Tv {
 * 	//....
 * }
 * class SmartTv extends Tv {
 * 	//....
 * }
 * 
 * ���� ������ �������ϸ� �Ʒ��� ���� �����Ϸ��� �ڵ������� Object�� �߰���.
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
