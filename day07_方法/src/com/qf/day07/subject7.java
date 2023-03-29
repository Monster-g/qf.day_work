package com.qf.day07;

import java.util.Scanner;

public class subject7 {

	public static void main(String[] args) {
//		7、定义方法，传入两个参数m、n、返回m到n之间所有数的乘积（假设m<n)
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int n1 = input.nextInt();
		System.out.println("请输入第二个数：");
		int n2 = input.nextInt();
		int num = product(n1,n2);
		System.out.println(n1 + "和" + n2 + "之间所有数的乘积为：" + num);
	}
	public static int product(int m, int n) {
		int num = 1;
		for(int i = m; i <= n; i++) {
			num *= i;
		}
		return num;
	}

}
