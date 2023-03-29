package com.qf.day07;

import java.util.Scanner;

public class subject6 {

	public static void main(String[] args) {
//		6、定义方法，传入两个参数，求两个数字之间有多少个质数。
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个参数：");
		int n1 = input.nextInt();
		System.out.println("请输入第二个参数：");
		int n2 = input.nextInt();
		int count = prime(n1,n2);
		System.out.println(n1 + "和" + n2 + "之间有" + count + "个质数");
	}
	public static int prime(int n, int m) {
		int count = 0;
			for(int i = n; i <= m; i++) {
				int p = 0;
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						p = 1;
					}
				}
				if(p == 0) {
					count++;
				}
			}
		return count;
	}

}
