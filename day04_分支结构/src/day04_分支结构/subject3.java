package day04_分支结构;

import java.util.Scanner;

public class subject3 {

	public static void main(String[] args) {
		/*
		 * 3、完成代码：
		 * 输入手机价格
		 * 超过5000就输出"去买IPHONE"，否则输出“Android手机也行”
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入手机价格：");
		int money = input.nextInt();
		if(money >5000) {
			System.out.println("去买IPHONE");			
		}else {
			System.out.println("Android手机也行");
		}
	}

}
