package day04_��֧�ṹ;

import java.util.Scanner;

public class subject3 {

	public static void main(String[] args) {
		/*
		 * 3����ɴ��룺
		 * �����ֻ��۸�
		 * ����5000�����"ȥ��IPHONE"�����������Android�ֻ�Ҳ�С�
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("�������ֻ��۸�");
		int money = input.nextInt();
		if(money >5000) {
			System.out.println("ȥ��IPHONE");			
		}else {
			System.out.println("Android�ֻ�Ҳ��");
		}
	}

}
