package com.qf.day09;

import java.util.Arrays;
import java.util.Random;

public class subject5 {

	public static void main(String[] args) {
		/* 5、自定义一个5x5大小的二维数组，随机生成100以内25个数，
		 * 计算所有大于平均数的数字之和，并统计其数量。 */
		Random rand = new Random();
		int [][] a = new int[5][5];
		int count = 0;
		int average = 0;
		int i;
		int j;
		int p = 0;
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(100);
				System.out.print(a[i][j] + "\0");
				int num = a[i][j];
				count += num;
			}
			System.out.println();
		}
		average = count / 25;
		System.out.println("和为：" + count + "\n" + "平均数为：" + average);
		int sum = 0;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				if(a[i][j] > average) {
				sum += a[i][j];
				p++;
			}
			}
		}
		System.out.println("大于平均数的数字之和为:" + sum + "\n" + "数量为：" + p + "个");
	
	}

}
