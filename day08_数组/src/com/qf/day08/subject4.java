package com.qf.day08;

import java.util.Random;

public class subject4 {

	public static void main(String[] args) {
//		4���󳤶�Ϊ5�����������е����ֵ
		int [] arr = new int[5];
		int max = 0;
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}else {
				max = max;//���Բ�Ҫ��һ��
			}
		}
		System.out.println("�������ɵ�����������ֵΪ��" + max);
	}


}
