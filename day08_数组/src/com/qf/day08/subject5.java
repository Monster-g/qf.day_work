package com.qf.day08;

import java.util.Scanner;

public class subject5 {

	public static void main(String[] args) {
//		5��һ���༶��10��ѧ��������ÿ��ѧ���ĳɼ��������ͳ�Ƴ�ƽ���ֺ���߷֡�
		double [] a = new double[10];
		Scanner input = new Scanner(System.in);
		double count = 0;
		double max = 0;
		for(int i = 0; i < a.length; i++) {
			System.out.println("�������" + (i+1) +"��ѧ���ĳɼ�");
			a[i] = input.nextDouble();
			count += a[i];
			if(max < a[i]) {
				max = a[i];
			}
		}
		double average = count / a.length;
		System.out.println("��10��ѧ������߷�Ϊ��" + max + ",�ð༶ƽ����Ϊ��" + average);
	}

}
