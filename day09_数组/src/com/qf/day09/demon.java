package com.qf.day09;

import java.util.Arrays;

public class demon {

	public static void main(String[] args) {
		xuanze();
	}
	
	//ð���������ڵ�������֮�以��ȽϽ��н�����ֱ�����ý���Ϊֹ
	public static void maopao() {
		int [] a = {2,3,1,43,90,23,12};
		boolean b = true;//�ж��Ƿ񽻻���ϣ����ٱȽϴ���
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if(a[j] > a[j + 1]) {//��С��������
					a[j] = a[j] ^ a[j + 1];//�����ķ�ʽ�����������л�λ
					a[j + 1] = a[j] ^ a[j + 1];
					a[j] = a[j] ^ a[j + 1];
					b = false;
				}
			}
			if(b) {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	//ѡ�����򣬴�ǰ��������ѡ��һ�������������������������бȽ�
	public static void xuanze() {
		int [] a = {6,8,23,98,1,4,3};
		for(int i = 0; i < a.length; i++) {
			int index = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[index] > a[j]) {
					index = j;
				}
			}
			if(index != i) {
				a[index] = a[index] ^ a[i];
				a[i] = a[index] ^ a[i];
				a[index] = a[index] ^ a[i];
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	//�������򣬴�ǰ����ѡ��һ��������ǰ��������бȽ�,ǰ�������������
	public static void charu() {
		int [] a = {5,3,9,21,14,6,8};
		for(int i = 0; i < a.length; i++) {
			int temp = a[i];
			int j = i - 1;
			for(; j >= 0; j--) {
				if(temp < a[j]) {
					a[j + 1] = a[j];
				}else {
					break;
				}
			}
			a[j + 1] = temp;
			System.out.println(Arrays.toString(a));
		}
	}

}
