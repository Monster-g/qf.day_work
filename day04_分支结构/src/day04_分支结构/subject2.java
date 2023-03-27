package day04_分支结构;

import java.util.Scanner;

public class subject2 {

	public static void main(String[] args) {
//		2、 输入月份和年份，输出该月有多少天（考虑闰年2月是29天，否则28天）
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份：");
		int years = input.nextInt();
		System.out.println("请输入月份：");
		int months = input.nextInt();
		//方法一
//		if(years % 400 == 0 || years % 4 ==0 && years % 100 != 0) {
//			System.out.println(months + "该年份是闰年");
//			if(months == 1 || months == 3 || months == 5 || months == 7 || months ==8 || months ==10 || months ==12) {
//				System.out.println(months + "月有31天");
//			}else if(months == 4 || months == 6 || months == 9 || months == 11) {
//				System.out.println(months + "月有30天");
//			}else if(months == 2) {
//				System.out.println(months + "是闰月有28天");
//			}else {
//				System.out.println("月份输入错误！请核对！");
//			}
//		}else {
//			System.out.println(months + "该年份不是闰年");
//			if(months == 1 || months == 3 || months == 5 || months == 7 || months ==8 || months ==10 || months ==12) {
//				System.out.println(months + "月有31天");
//			}else if(months == 4 || months == 6 || months == 9 || months == 11) {
//				System.out.println(months + "月有30天");
//			}else if(months == 2) {
//				System.out.println(months + "不是闰月有29天");
//			}else {
//				System.out.println("月份输入错误！请核对！");
//			}
//		}
		//方法二
		if(months == 1 || months == 3 || months == 5 || months == 7 || months ==8 || months ==10 || months ==12) {
			System.out.println(years + "年" + months + "月有31天");
		}else if(months == 4 || months == 6 || months == 9 || months == 11) {
			System.out.println(years + "年" + months + "月有30天");
		}else if(months == 2) {
			if(years % 400 == 0 || years % 4 ==0 && years % 100 != 0) {
				System.out.println(years + "年是闰年" + months + "月有28天");
				}else {
					System.out.println(years + "年不是闰年" + months + "月有29天");
				}
			
		}
	}

}
