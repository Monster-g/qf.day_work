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
	
	//��ӡ100������������
	public static void prime() {
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	
//	  ��쳲��������У��ݹ��ѭ���� ��һ��������ǰ�������ĺ�
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
