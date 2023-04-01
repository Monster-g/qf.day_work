package com.qf.day08;

import java.util.Random;

public class subject4 {

	public static void main(String[] args) {
//		4、求长度为5的整形数组中的最大值
		int [] arr = new int[5];
		int max = 0;
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}else {
				max = max;//可以不要这一句
			}
		}
		System.out.println("上述生成的五个数中最大值为：" + max);
	}


}
