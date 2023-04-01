package com.qf.day08;

import java.util.Scanner;

public class subject5 {

	public static void main(String[] args) {
//		5、一个班级有10个学生，输入每个学生的成绩，最后能统计出平均分和最高分。
		double [] a = new double[10];
		Scanner input = new Scanner(System.in);
		double count = 0;
		double max = 0;
		for(int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i+1) +"个学生的成绩");
			a[i] = input.nextDouble();
			count += a[i];
			if(max < a[i]) {
				max = a[i];
			}
		}
		double average = count / a.length;
		System.out.println("该10名学生的最高分为：" + max + ",该班级平均分为：" + average);
	}

}
