package com.qf.day07;

public class subject3 {

	public static void main(String[] args) {
//		3�����巽���������ò��������������������
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
