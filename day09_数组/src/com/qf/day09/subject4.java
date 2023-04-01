package com.qf.day09;

import java.util.Arrays;

public class subject4 {

	public static void main(String[] args) {
//		4、定义一个数组，反序（不是排序）后输出。（一个数组完成）
		int [] a = {1,2,3,4,5,6,7};
		for(int i = 0; i < a.length / 2; i++) {
			int num = a[a.length - i - 1];
			a[a.length - i - 1] = a[i];
			a[i] = num;
		}
		System.out.println(Arrays.toString(a));
	}

}
