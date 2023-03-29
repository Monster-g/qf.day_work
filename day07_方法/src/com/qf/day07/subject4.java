package com.qf.day07;

public class subject4 {

	public static void main(String[] args) {
		/* 4、定义方法，传入参数n，
		 * 一只猴子，每天吃掉一半的果子，吃了n天，剩一个果子，求最初有多少个果子。 */
		int fruits = fruit(5);
		System.out.println(fruits);
	}
	public static int fruit(int n) {
//		int sum = 0;
		int s = 1;
		for(int i = 1; i <= n; i++) {
			
			s *= 2;
//			s = sum;
		}
		return s;
		
	}

}
