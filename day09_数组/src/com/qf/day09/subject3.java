package com.qf.day09;

import java.util.Arrays;
import java.util.Random;

public class subject3 {

	public static void main(String[] args) {
//		3������һ�����飬�������100���ڵ�10�����֣�ʹ��Arrays�����򣬴�ӡ�����������顣
		Random rand = new Random();
		int [] a = new int[10];
		for(int i = 0; i < a.length; i++ ) {
			a[i] = rand.nextInt(100);
		}
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
