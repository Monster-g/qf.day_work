package day04_��֧�ṹ;

import java.util.Scanner;

public class subject6 {

	public static void main(String[] args) {
//		6����������int�������֣������Լ����
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������");
		int n1 = input.nextInt();
		System.out.println("������ڶ���������");
		int n2 = input.nextInt();
		int n3 = n2;
		//ŷ������㷨
		if(n1 > n2) {
			do {
				n3 = n1 % n2;
				n1 = n2;
				n2 = n3;
			}while(n3 != 0);
			System.out.println(n1);
		}else {
			do {
				n3 = n2 % n1;
				n2 = n1;
				n1 = n3;
			}while(n3 != 0);
			System.out.println(n2);
		}
	}

}
