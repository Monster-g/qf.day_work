package day05_循环;

import java.util.Scanner;

public class subject1 {

	public static void main(String[] args) {
//		1、输入一个数字，然后分解质因数，例如：输入20，输出：20=2x2x5
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int num = input.nextInt();
		int n =num;
		int m = 2;
		int consult = 0;
		while(n >= m) {
			if(num >= m && num % m == 0) {
				consult = num / m;
				num = consult;
				System.out.println(m);
			}else
			 m++;
		}
		
	}

}
