package com.qf.day07;

public class demon {

	public static void main(String[] args) {
		prime();
	}
	public static void xhao() {
		for(int i = 0; i <= 10; i++) {
			System.out.print("*");
		}
	}
	
	//打印100以内所有质数
	public static void prime() {
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	
//	  求斐波那契数列（递归和循环） 后一个数等于前两个数的和
	public static void feibo(int n) {
		for(int i = 1; i <= n; i++) {
			int sum = f(i);
		}
	}
	public static int f(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return f(n-2) + f(n-1);
	}
	 
}
