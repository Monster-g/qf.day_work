package com.qf.day07;

import java.util.Scanner;

public class subject7 {

	public static void main(String[] args) {
//		7�����巽����������������m��n������m��n֮���������ĳ˻�������m<n)
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������");
		int n1 = input.nextInt();
		System.out.println("������ڶ�������");
		int n2 = input.nextInt();
		int num = product(n1,n2);
		System.out.println(n1 + "��" + n2 + "֮���������ĳ˻�Ϊ��" + num);
	}
	public static int product(int m, int n) {
		int num = 1;
		for(int i = m; i <= n; i++) {
			num *= i;
		}
		return num;
	}

}
