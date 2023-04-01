package com.qf.day09;

import java.util.Arrays;
import java.util.Random;

public class subject6 {

	public static void main(String[] args) {
//		1、定义一个数组，随机生成100以内的10个数字，并进行插入排序，打印出排序后的数组。
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
