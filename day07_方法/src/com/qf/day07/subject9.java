package com.qf.day07;

import java.util.Random;
import java.util.Scanner;

public class subject9 {

	public static void main(String[] args) {
//		思考题：定义方法，传入参数n，生成100以内n个随机数，返回这些随机数的第二小的数。
		Scanner input = new Scanner(System.in);
		System.out.println("你想生成多少个随机数：");
		int n = input.nextInt();
		judge(n);
	}
	public static int judge(int n) {
		Random rand = new Random();
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i = 1; i <= n; i++) {
			int num = rand.nextInt(100);
			System.out.println(num);
			if(min2 > num) {
				min2 = num;
				if(min2 < min1) {
					min1 = min1 ^ min2;
					min2 = min1 ^ min2;
					min1 = min1 ^ min2;
				}
			}
		}
		
		System.out.println("倒数第二小的数是：" + min2);
		return min2;
	}
}
