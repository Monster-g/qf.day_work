package com.qf.day08;

import java.util.Scanner;

public class subject6 {

	public static void main(String[] args) {
		/* 6������һ����������������飬����Ҫ���ҵ��������������������е�λ�á�
		 * ���ַ����Ƚ���Ҫʹ��equals������ */
		String [] a = {"����", "����", "����", "С��", "С��"};
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�������");
		String name = input.next();
		for(int i = 0; i < a.length; i++) {
			if(a[i].equals(name)) {
				System.out.println("�������е�" + (i+1) + "��");
			}
		}
	}

}
