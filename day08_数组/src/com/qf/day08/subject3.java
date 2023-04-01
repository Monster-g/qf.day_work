package com.qf.day08;

import java.util.Scanner;

public class subject3 {

	public static void main(String[] args) {
//		3、定义数组，输入5个人姓名保存在数组中，输出第一个、第三个和第五个人姓名。
		Scanner input = new Scanner(System.in);
		String [] arr = new String[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) +"个人的名字：");
			arr[i] = input.next();
//			System.out.println(arr[i]);
		}
		System.out.println("第一个人的名字是：" + arr[0] + "\n第三个人的名字是：" + arr[2] + "\n第五个人的名字是：" + arr[4]);
		input.close();
	}

}
