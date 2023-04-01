package com.qf.day08;

import java.util.Random;

public class subject2 {

	public static void main(String[] args) {
//		2、给定一个含有5个元素的整型数组a，随机生成各元素的值，求a中所有元素的和。
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
