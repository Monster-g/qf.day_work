package day04_分支结构;

import java.util.Scanner;

public class subject6 {

	public static void main(String[] args) {
//		6、定义两个int类型数字，求最大公约数。
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n1 = input.nextInt();
		System.out.println("请输入第二个整数：");
		int n2 = input.nextInt();
		int n3 = n2;
		//欧几里得算法
		if(n1 > n2) {
			do {
				n3 = n1 % n2;
				n1 = n2;
				n2 = n3;
			}while(n3 != 0);
			System.out.println(n1);
		}else {
			do {
				n3 = n2 % n1;
				n2 = n1;
				n1 = n3;
			}while(n3 != 0);
			System.out.println(n2);
		}
	}

}
