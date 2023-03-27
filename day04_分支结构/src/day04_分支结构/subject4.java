package day04_分支结构;

import java.util.Scanner;

public class subject4 {

	public static void main(String[] args) {
		/*
		 * 4、完成代码：
		 * 从键盘输入天气温度
		 * 温度大于40时输出:"大家都熟了"
		 * 温度在30到40间时输出:"我们只要空调、西瓜和WIFI"
		 * 温度在20到30间时输出:"天气凉，可以浪"
		 * 温度小于20时输出:"多穿衣服，免得感冒"
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入天气温度：");
		int t = input.nextInt();
		if(t > 40) {
			System.out.println("大家都输了");
		}else if(t > 30 && t <= 40) {
			System.out.println("我们只要空调西瓜和WiFi");
		}else if(t > 20 && t <= 30){
			System.out.println("天气凉，可以浪");
		}else if(t <= 20) {
			System.out.println("多穿衣服，免得感冒");
		}else {
			System.out.println("温度数值输入错误！请核对！");
		}
	}

}
