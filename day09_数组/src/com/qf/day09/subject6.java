package com.qf.day09;

import java.util.Arrays;
import java.util.Random;

public class subject6 {

	public static void main(String[] args) {
//		1������һ�����飬�������100���ڵ�10�����֣������в������򣬴�ӡ�����������顣
		int [] a = new int[10];
		rado(a);
	}
	public static void rado(int [] a) {
		Random rand = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(a));
	}
	public static void charu(int [] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j >= 0; j++) {
				
			}
		}
	}

}
