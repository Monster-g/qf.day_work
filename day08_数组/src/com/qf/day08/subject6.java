package com.qf.day08;

import java.util.Scanner;

public class subject6 {

	public static void main(String[] args) {
		/* 6、给定一个五个人姓名的数组，输入要查找的姓名，查找其在数组中的位置。
		 * （字符串比较需要使用equals方法） */
		String [] a = {"张三", "李四", "王五", "小明", "小红"};
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要查找的姓名：");
		String name = input.next();
		for(int i = 0; i < a.length; i++) {
			if(a[i].equals(name)) {
				System.out.println("在数组中第" + (i+1) + "个");
			}
		}
	}

}
