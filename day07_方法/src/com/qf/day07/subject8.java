package com.qf.day07;

import java.util.Random;
import java.util.Scanner;

public class subject8 {

	public static void main(String[] args) {
//		8�����巽�����������n������100����n���������������Щ���������С������
		Scanner input = new Scanner(System.in);
		System.out.println("�������������ɶ��ٸ��������");
		int num = input.nextInt();
		rado(num);
	}
	public static void rado(int n) {
		Random rand = new Random();
		int min = 0;
		int num1 = rand.nextInt(100);
		System.out.println(num1);
		for(int i = 1; i <= n - 1; i++) {
			int num = rand.nextInt(100);
			System.out.println(num);
			
			if(num1 < num) {
				min = num1;
			}else if(num1 == num) {
				min = num;
			}else {
				min = num;
			}
			num1 = min;
		}
		System.out.println("��С��Ϊ:" + min);
	}

}
