package day04_��֧�ṹ;

import java.util.Scanner;

public class subject8 {

	public static void main(String[] args) {
//		8����λ���У��ԳƵ���Ϊ������������12321��������е���λ����������
		int g, s, b, q, w;
		int times = 0;
		for(int n = 10000; n <99999; n++) {
			w = n / 10000;
			q = n / 1000 % 10;
			b = n / 100 % 10;
			s = n / 10 % 10;
			g = n % 10;
			if(w == g && q == s) {
				System.out.println(n + "�ǻ�����");
				times++;
			}
		}
		System.out.println("һ����" + times + "����λ��������");
	}

}
