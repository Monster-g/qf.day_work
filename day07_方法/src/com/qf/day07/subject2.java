package com.qf.day07;

public class subject2 {

	public static void main(String[] args) {
//		2、定义方法，输出5行直角三角形
		triangle();
	}
	public static void triangle() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
