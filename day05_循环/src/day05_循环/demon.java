package day05_循环;

import java.util.Scanner;

public class demon {

	public static void main(String[] args) {
		//求1……100的和
		//for循环,执行判断之后进入循环体运算，运算完毕后再执行i++
//		int n = 0;
//		int m = 0;
//		for(int i = 0; i <= 100; i++) {
//			 n += i;
//			 m ++;
////			 System.out.println(m + "," + n);
//		 }
//		System.out.println(n + "循环次数" + m);
		//while循环
//		int i = 0;
//		int n = 0;
//		while(i < 100) {
//			i++;
//			n += i;
//			System.out.println(i + "," + n);
//		}
//		System.out.println(n + "循环次数" + i);
		//do^while循环
//		int i = 0;
//		int n = 0;
//		do {
//			i++;
//			n += i;
//			
//		}while(i < 100);
//		System.out.println(n + "循环次数" + i);
		
		//求100里面的偶数和
//		int n = 0;
//		int sum = 0;
//		for(int i = 0; i <= 100; i++) {
//			if(i % 2 == 0) {
//				n += i;
//			}
//		}
//		System.out.println("100中的所有偶数和为：" + n);
//		int i = 0;
//		while(i < 100) {
//			if(i % 2 == 0) {
//				n += i;
//				i++;
//			}
//		}
//		System.out.println(n);
		
		//求1~100之间所有5的倍数之和
//		int n = 1;
//		int sum = 0;
//		while(n <= 100) {
//			if(n % 5 ==0) {
//				sum += n;
//			}
//			n++;
//		}
//		System.out.println(sum);
		//输出1~100之内所有与7有关的数字
//		int n = 0;
//		int m = 0;
//		while(n <= 100) {
//			n ++;
//			if(n / 10 == 7 || n % 10 == 7 || n % 7 == 0) {
//				System.out.println(n);
//			}
//		}
		//学生写一次作业，老师输入批改结果，y为通过，n为不通过，则在写一次作业
//		Scanner input = new Scanner(System.in);
//		String msg;
//		do {
//			System.out.println("提交一次作业");
//			System.out.println("请老师输入是否通过：");
//			msg = input.next();
//		}while(msg.equals("n"));
//		input.close();
//		System.out.println("成功通过，结束提交作业");
		
		//输出100次欢迎
//		for(int n = 1; n <= 10; n++) {
//			System.out.println("第" + n + "次欢迎");
//		}
//		System.out.println("程序结束！");
		
		//求两个数的最大公约数
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入第一个整数：");
//		int n1 = input.nextInt();
//		System.out.println("请输入第二个整数：");
//		int n2 = input.nextInt();
//		if(n1 > n2) {
//			for(int i = n1; i > 0; i--) {
//				if(n1 % i == 0 && n2 % i == 0) {
//					System.out.println(n1 + "和" + n2 + "最大公约数为" + i);
//					break;
//				}
//			}
//		}else if(n1 < n2) {
//			
//		}
		
		
		int i = 1;
		while(i <= 1000) {
			int sum = 0;
			for(int j = 1; j < i; j++) 	{
				if(i % j == 0 && i != j) {
					sum += j;
//				System.out.println(j);
				}
			}
			if(sum == i) {
				System.out.println(i);
			}
			i++;
		}
		
		
//		for(int i = 1; i <= 1000; i++) {
//			for(int j = 1; j < i; j++) {
//				if(i % j == 0 && i != j) {
//					sum += j;
////				System.out.println(j);
//				}
//			}
//			if(sum == i) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		
		
//		for(int j = 1; j < 28; j++) {
//			if(28 % j == 0 && 28 != j) {
//				sum += j;
//			System.out.println(j);
//			}
//		}
//		if(sum == 28) {
////			System.out.println(i);
//		}
		
	}

}
