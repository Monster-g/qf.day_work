package day05_循环;

import java.util.Random;
import java.util.Scanner;

public class subject8 {

	public static void main(String[] args) {
//		8、猜数字游戏。
		Scanner input = new Scanner(System.in);
		int num;
		Random rand = new Random();
		int number = rand.nextInt(100);
		do {
			System.out.println("请输入一个0~100的数字：");
			num = input.nextInt();
			if(num < number) {
				System.out.println("小了");
			}else if(num > number) {
				System.out.println("大了");
			}
		}while(num != number);
		System.out.println("恭喜你猜对了，这个数是" + num);
	}

}
