package day04_��֧�ṹ;

import java.util.Scanner;

public class subject4 {

	public static void main(String[] args) {
		/*
		 * 4����ɴ��룺
		 * �Ӽ������������¶�
		 * �¶ȴ���40ʱ���:"��Ҷ�����"
		 * �¶���30��40��ʱ���:"����ֻҪ�յ������Ϻ�WIFI"
		 * �¶���20��30��ʱ���:"��������������"
		 * �¶�С��20ʱ���:"�ഩ�·�����ø�ð"
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("�����������¶ȣ�");
		int t = input.nextInt();
		if(t > 40) {
			System.out.println("��Ҷ�����");
		}else if(t > 30 && t <= 40) {
			System.out.println("����ֻҪ�յ����Ϻ�WiFi");
		}else if(t > 20 && t <= 30){
			System.out.println("��������������");
		}else if(t <= 20) {
			System.out.println("�ഩ�·�����ø�ð");
		}else {
			System.out.println("�¶���ֵ���������˶ԣ�");
		}
	}

}
