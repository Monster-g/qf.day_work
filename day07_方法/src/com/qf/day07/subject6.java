package com.qf.day07;

import java.util.Scanner;

public class subject6 {

	public static void main(String[] args) {
//		6�����巽����������������������������֮���ж��ٸ�������
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ��������");
		int n1 = input.nextInt();
		System.out.println("������ڶ���������");
		int n2 = input.nextInt();
		int count = prime(n1,n2);
		System.out.println(n1 + "��" + n2 + "֮����" + count + "������");
	}
	public static int prime(int n, int m) {
		int count = 0;
			for(int i = n; i <= m; i++) {
				int p = 0;
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						p = 1;
					}
				}
				if(p == 0) {
					count++;
				}
			}
		return count;
	}

}
