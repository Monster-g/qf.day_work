package com.qf.day08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demon {

	public static void main(String[] args) {
		joint3();
	}
	public static void array() {
		//����Ĵ���
				int [] nums = new int[3];//����3��int���͵ı����ռ�
				//���ſ���д�ڱ�����ǰ��Ҳ����д�ڱ����ĺ���
				//��ֵ
				nums[0] = 5;
				nums[1] = 4;
				nums[2] = 3;
				//ȡֵ
				System.out.println(nums[0] + "," + nums[1] + "," + nums[2]);

	}
	
	//����һ�����飬�ֱ�ֵ10��������Ϊ2��4��6��8����
	public static void array2() {
		int[] ary = new int[10];
		for(int i = 0; i < ary.length; i++) {
			ary[i] =(i + 1) * 2;
			System.out.println(ary[i]);
		}
		
	}
	
	
	//����Ĵ�����ʽ
//	���������ٷ���ռ䣬���ֵ
	public static void team() {
		int [] arr1;
		arr1 = new int[2];
		arr1[0] = 5;
//		����������ռ䣬�ٸ�ֵ
		int [] arr2 = new int[2];
		arr2[0] = 10;
//		��������ֵ
		int [] arr3 = new int [] {1,2,3};
//		��������ֵ���Զ��ƶϿռ䣨�򻯰棩�򻯰�ֻ����������ͬʱ��ֵ
		int [] arr4 = {1,2,3,4};
	}
	
	//���������
	public static void dalitation() {
		int [] arr = {1,2,3,4,5};
		int num = 6;
		int [] newarr = new int [arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			newarr[i] = arr[i];
		}
		newarr[newarr.length - 1] = num;//�����������ӵ����
	}
	
	//ƴ����������
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
		String str = Arrays.toString(arr3);//��ȡ�����������
		System.out.println(str);//��ֱ�����arr3������������ĵ�ַ����������
	}
	//ƴ����������
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
	
	//��ϵͳ�ṩ�����鸴��
	public static void joint3() {
		int [] arr1 = {1,2};
		int [] arr2 = {4,5};
		int [] arr3 = new int [arr1.length + arr2.length];
		//Ҫ���Ƶ�Ŀ�����飬�ڼ���Ԫ�ؿ�ʼ���ƣ����Ƶ���Ŀ�����飬�ڼ���Ԫ�ؿ�ʼ������ݣ����Ƽ���Ԫ��
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		System.out.println(Arrays.toString(arr3));
	}
	
		
}
