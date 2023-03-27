package day04_分支结构;

import java.util.Random;
import java.util.Scanner;

public class subject5 {

	public static void main(String[] args) {
		/*
		 * 5、实现简单的抽奖程序
		 * 生成一个0到9之间的随机数，
		 * 输入一个数字和随机数进行比较，
		 * 输出是否中奖。
		 * 使用随机数的方法：
		 * 1 在定义class的前面加上
		 * import java.util.Random;
		 * 2 获得随机数代码：
		 * Random rand = new Random();
		 * int number = rand.nextInt(10); //获得0~9之间的随机整数
		 * 
		 */	
		Random rand = new Random();
		int number = rand.nextInt(10);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个0~9之间的数字：");
		int num = input.nextInt();
		if(num == number) {
			System.out.println("中奖号码是：" + number + "中奖啦！");
		}else {
			System.out.println("中奖号码是：" + number + "很遗憾！欢迎下次惠顾！");
		}
		

	}
}
