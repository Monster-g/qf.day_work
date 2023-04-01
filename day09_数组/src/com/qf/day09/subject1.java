package com.qf.day09;

import java.util.Arrays;
import java.util.Random;

public class subject1 {

	public static void main(String[] args) {
//		1、定义一个数组，随机生成100以内的10个数字，并进行冒泡排序，打印出排序后的数组。
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
