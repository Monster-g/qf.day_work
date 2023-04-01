package com.qf.day09;

import java.util.Arrays;

public class demon {

	public static void main(String[] args) {
		xuanze();
	}
	
	//冒泡排序，相邻的两个数之间互相比较进行交换，直到不用交换为止
	public static void maopao() {
		int [] a = {2,3,1,43,90,23,12};
		boolean b = true;//判断是否交换完毕，减少比较次数
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if(a[j] > a[j + 1]) {//从小到大排序
					a[j] = a[j] ^ a[j + 1];//用异或的方式把两个数进行换位
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
	
	//选择排序，从前往后依次选择一个数与它后面的所有数逐个进行比较
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
	
	//插入排序，从前往后选择一个数与它前面的数进行比较,前面的是有序数列
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
