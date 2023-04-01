package com.qf.day09;

import java.util.Arrays;
import java.util.Random;

public class subject2 {

	public static void main(String[] args) {
//		2、定义一个数组，随机生成100以内的10个数字，并进行选择排序，打印出排序后的数组。
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
