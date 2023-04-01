package com.qf.day08;

import java.util.Arrays;

public class subject7 {

	public static void main(String[] args) {
//		7、给定一个数组，给定一个变量，在此数组中查找该变量，并删除该变量。
		int [] a = {1,2,3,4,5,6,7};
		int num = 4;
		//没使用新数组，把要删除的元素后面的元素全部往前移动一个，并把最后空出来的位置赋值为0
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
		
	//使用新数组存放，并且数组中若有多个相同的数只删除第一个找到的
		//如果需要删除所有相同的数，则在下面代码中加上do……while循环
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
