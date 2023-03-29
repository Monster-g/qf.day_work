package com.qf.day07;

public class subject1 {

	public static void main(String[] args) {
//		1、输出所有5位回文数
		huiwen();
	}
	public static void huiwen() {
		for(int i = 10000; i <= 99999; i++) {
			boolean p = judge(i);
			if(p) {
				System.out.println(i);
			}
		}
	}
	public static boolean judge(int i) {
		int g = i % 10;
		int s = i / 10 % 10;
		int q = i / 1000 % 10;
		int w = i / 10000;
		if(g == w && s == q) {
			return true;
		}
		return false;
	}

}
