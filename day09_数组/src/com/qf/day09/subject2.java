package com.qf.day09;

import java.util.Arrays;
import java.util.Random;

public class subject2 {

	public static void main(String[] args) {
//		2������һ�����飬�������100���ڵ�10�����֣�������ѡ�����򣬴�ӡ�����������顣
		xuanze();
	}
	public static void xuanze() {
		Random rand = new Random();
		int [] a = new int[10];
		int j;
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(a));
		for(int i = 0; i < a.length; i++) {
			int index = i;
			for(j = i + 1; j < a.length; j++) {
				if(a[j] < a[index]) {
					index = j;
				}
			}
			if(index != i) {
				a[index] = a[i] ^ a[index];
				a[i] = a[i] ^ a[index];
				a[index] = a[i] ^ a[index];
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
