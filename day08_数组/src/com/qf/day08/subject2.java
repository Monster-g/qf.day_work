package com.qf.day08;

import java.util.Random;

public class subject2 {

	public static void main(String[] args) {
//		2������һ������5��Ԫ�ص���������a��������ɸ�Ԫ�ص�ֵ����a������Ԫ�صĺ͡�
		int [] a = new int[5];
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			Random rand = new Random();
			a[i] = rand.nextInt(100);
			if(i == a.length - 1) {
				System.out.print(a[i]);
			}else
				System.out.print(a[i] + "+");
			sum += a[i];
		}
		System.out.println("=" + sum);
	}

}
