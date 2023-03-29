package com.qf.day07;

public class subject3 {

	public static void main(String[] args) {
//		3、定义方法，可以用参数控制输出三角形行数
		xhao(10);
	}
	public static int xhao(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		return n;
	}

}
