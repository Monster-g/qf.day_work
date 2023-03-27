package day04_分支结构;

import java.util.Scanner;

public class subject7 {

	public static void main(String[] args) {
//		7、定义两个int类型数字，求最小公倍数。
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int n1 = input.nextInt();
		System.out.println("请输入第二个整数：");
		int n2 = input.nextInt();
		int n3;
		//欧几里得算法先求最大公约数，然后用两个数的乘积除以最大公约数得到两数的最小公倍数
				if(n1 > n2) {
					do {
						n3 = n1 % n2;
						n1 = n2;
						n2 = n3;
					}while(n3 != 0);
					System.out.println(n1 * n2 / n1);
				}else {
					do {
						n3 = n2 % n1;
						n2 = n1;
						n1 = n3;
					}while(n3 != 0);
					System.out.println(n1 * n2 / n2);
				}
	}

}
