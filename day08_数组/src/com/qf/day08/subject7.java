package com.qf.day08;

import java.util.Arrays;

public class subject7 {

	public static void main(String[] args) {
//		7������һ�����飬����һ���������ڴ������в��Ҹñ�������ɾ���ñ�����
		int [] a = {1,2,3,4,5,6,7};
		int num = 4;
		//ûʹ�������飬��Ҫɾ����Ԫ�غ����Ԫ��ȫ����ǰ�ƶ�һ�����������ճ�����λ�ø�ֵΪ0
//		for(int i = 0; i < a.length; i++) {
//			if(a[i] == num) {
//				for(int j = i; j < a.length - 1; j++) {
//					a[j] = a[j+1];
//				}
//			}
//			if(i == a.length - 1) {
//				a[i] = 0;
//			}
//			System.out.print(a[i] + "\0");
//		}
		
	//ʹ���������ţ��������������ж����ͬ����ֻɾ����һ���ҵ���
		//�����Ҫɾ��������ͬ������������������м���do����whileѭ��
		int index = search(a, num);
		if(index != -1) {
			a = del(a, index);
			System.out.println(Arrays.toString(a));
		}
	}

	public static int[] del(int[] a, int index) {
		int [] newa = new int[a.length - 1];
		System.arraycopy(a, 0, newa, 0, index);
		System.arraycopy(a, index + 1, newa, index, newa.length - index);
		return newa;
	}

	public static int search(int[] a, int num) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == num) {
				return i;
			}
		}
		return -1;
	}

}
