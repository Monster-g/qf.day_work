package com.qf.day07;

public class subject4 {

	public static void main(String[] args) {
		/* 4�����巽�����������n��
		 * һֻ���ӣ�ÿ��Ե�һ��Ĺ��ӣ�����n�죬ʣһ�����ӣ�������ж��ٸ����ӡ� */
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
