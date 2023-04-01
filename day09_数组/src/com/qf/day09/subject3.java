package com.qf.day09;

import java.util.Arrays;
import java.util.Random;

public class subject3 {

	public static void main(String[] args) {
//		3、定义一个数组，随机生成100以内的10个数字，使用Arrays类排序，打印出排序后的数组。
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
