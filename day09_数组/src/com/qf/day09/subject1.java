package com.qf.day09;

import java.util.Arrays;
import java.util.Random;

public class subject1 {

	public static void main(String[] args) {
//		1������һ�����飬�������100���ڵ�10�����֣�������ð�����򣬴�ӡ�����������顣
		maopao();
	}

	public static void maopao() {
		int[] a = new int[10];
		Random rand = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(a));
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if(a[j + 1] < a[j]) {
					a[j] = a[j] ^ a[j + 1];
					a[j + 1] = a[j] ^ a[j + 1];
					a[j] = a[j] ^ a[j + 1];
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
