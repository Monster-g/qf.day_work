package com.qf.day07;

public class subject2 {

	public static void main(String[] args) {
//		2�����巽�������5��ֱ��������
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
