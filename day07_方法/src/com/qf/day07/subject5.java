package com.qf.day07;

public class subject5 {

	public static void main(String[] args) {
//		5、输出所有的3位水仙花数
		shuixian();
	}
	public static void shuixian() {
		for(int i = 100; i <1000; i++ ) {
			int sum = gsb(i);
			if(sum == i) {
				System.out.println(i);
			}
		}
	}
	public static int gsb(int i) {
		int g = i % 10;
		int s = i / 10 % 10;
		int b = i / 100;
		return g * g * g + b * b * b + s * s * s;
	}

}
