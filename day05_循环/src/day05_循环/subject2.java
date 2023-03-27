package day05_循环;

import java.util.Scanner;

public class subject2 {

	public static void main(String[] args) {
		/*
		 * 2、编写一个程序，根据输入某个班级学员的成绩，计算该班级学员的平均成绩，
		 *  班级的人数要求用户输入，根据输入的人数，分别录入学员的成绩，计算该
		 * 班级学员的平均成绩，并显示计算结果
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入班级人数：");
		int num = input.nextInt();
		int avg = 0;
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			Scanner input1 = new Scanner(System.in);
			System.out.println("请输入" + i + "号成绩：");
			int n1 = input1.nextInt();
			sum += n1;
			avg = sum / num;
//			System.out.println(sum);
		}
		System.out.println("目前平均成绩为：" + avg);
	}

}
