package com.qf.day08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demon {

	public static void main(String[] args) {
		joint3();
	}
	public static void array() {
		//数组的创建
				int [] nums = new int[3];//创建3个int类型的变量空间
				//括号可以写在变量的前面也可以写在变量的后面
				//赋值
				nums[0] = 5;
				nums[1] = 4;
				nums[2] = 3;
				//取值
				System.out.println(nums[0] + "," + nums[1] + "," + nums[2]);

	}
	
	//定义一个数组，分别赋值10个，依次为2，4，6，8……
	public static void array2() {
		int[] ary = new int[10];
		for(int i = 0; i < ary.length; i++) {
			ary[i] =(i + 1) * 2;
			System.out.println(ary[i]);
		}
		
	}
	
	
	//数组的创建方式
//	先声明，再分配空间，最后赋值
	public static void team() {
		int [] arr1;
		arr1 = new int[2];
		arr1[0] = 5;
//		声明并分配空间，再赋值
		int [] arr2 = new int[2];
		arr2[0] = 10;
//		声明并赋值
		int [] arr3 = new int [] {1,2,3};
//		声明并赋值，自动推断空间（简化版）简化版只能在声明的同时赋值
		int [] arr4 = {1,2,3,4};
	}
	
	//数组的扩容
	public static void dalitation() {
		int [] arr = {1,2,3,4,5};
		int num = 6;
		int [] newarr = new int [arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			newarr[i] = arr[i];
		}
		newarr[newarr.length - 1] = num;//把新增的数加到最后
	}
	
	//拼接两个数组
	public static void joint1() {
		int [] arr1 = {1,2,3};
		int [] arr2 = {4,5};
		int [] arr3 = new int [arr1.length + arr2.length];
		for(int i = 0; i < arr1.length + arr2.length; i++) {
			if(i < arr1.length) {
				arr3[i] = arr1[i];
				
			}else if(i >= arr1.length) {
				arr3[i] = arr2[i - arr1.length];
				
			}
		}
		String str = Arrays.toString(arr3);//获取数组里的内容
		System.out.println(str);//若直接输出arr3则输出的是它的地址而不是内容
	}
	//拼接两个数组
	public static void joint2() {
		int [] arr1 = {1,2,3};
		int [] arr2 = {4,5};
		int [] arr3 = new int [arr1.length + arr2.length];
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[1]; 
		}
		for(int i = 0; i < arr2.length; i++) {
			arr3[i + arr1.length] = arr2[i];
		}
		String str = Arrays.toString(arr3);
		System.out.println(str);
	}
	
	//用系统提供的数组复制
	public static void joint3() {
		int [] arr1 = {1,2};
		int [] arr2 = {4,5};
		int [] arr3 = new int [arr1.length + arr2.length];
		//要复制的目标数组，第几个元素开始复制，复制到的目标数组，第几个元素开始存放数据，复制几个元素
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		System.out.println(Arrays.toString(arr3));
	}
	
		
}
