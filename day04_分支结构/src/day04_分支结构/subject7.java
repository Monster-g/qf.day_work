package day04_��֧�ṹ;

import java.util.Scanner;

public class subject7 {

	public static void main(String[] args) {
//		7����������int�������֣�����С��������
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������:");
		int n1 = input.nextInt();
		System.out.println("������ڶ���������");
		int n2 = input.nextInt();
		int n3;
		//ŷ������㷨�������Լ����Ȼ�����������ĳ˻��������Լ���õ���������С������
				if(n1 > n2) {
					do {
						n3 = n1 % n2;
						n1 = n2;
						n2 = n3;
					}while(n3 != 0);
					System.out.println(n1 * n2 / n1);
				}else {
					do {
						n3 = n2 % n1;
						n2 = n1;
						n1 = n3;
					}while(n3 != 0);
					System.out.println(n1 * n2 / n2);
				}
	}

}
