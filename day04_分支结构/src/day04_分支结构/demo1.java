package day04_分支结构;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in); System.out.println("请输入你想玩的游戏模式：");
		 * int pattern = input.nextInt();
		 */
		
		
		  Scanner input = new Scanner(System.in); 
		  System.out.println("请输入月份："); 
		  int month = input.nextInt();
		 
		/*
		 * if(score > 90){
		 * System.out.println("excellent！");
		 * }
		 */
		/*
		 * if(score >= 60) { System.out.println("pass!");
		 * 
		 * }else { System.out.println("fail!continu to study hard！"); } input.close();
		 */
		/*
		 * if(weather < 10) { System.out.println("今天穿棉袄！"); }else if(weather >= 10 &&
		 * weather <20){ System.out.println("今天穿大衣！"); }else if(weather >=20 && weather
		 * <30) { System.out.println("热死了，穿短袖！");
		 * 
		 * }else { System.out.println("天气不正常！"); }
		 */
		/*
		 * if(pattern == 1) { System.out.println("成功进入排位赛游戏模式！");
		 * System.out.println("请选择你想玩的位置："); pattern = input.nextInt(); if(pattern == 1)
		 * { System.out.println("法师位，请继续选择你的英雄："); pattern = input.nextInt(); if(pattern
		 * == 1) { System.out.println("西施玩家已就位！"); }else if(pattern == 2){
		 * System.out.println("李华玩家已就位！"); }else { System.out.println("炸弹猫玩家已就位！"); }
		 * System.out.println("全军出击！"); }else if(pattern == 2) {
		 * System.out.println("打野位，请继续选择你的英雄："); pattern = input.nextInt(); if(pattern
		 * == 1) { System.out.println("韩信玩家已就位！"); }else if(pattern == 2){
		 * System.out.println("李白玩家已就位！"); }else { System.out.println("猴子玩家已就位！"); }
		 * System.out.println("全军出击！"); } }else { System.out.println("成功进入匹配赛游戏模式！"); }
		 */
		
		
		  switch(month) { 
		  case 1: 
			  System.out.println(month + "月有31天"); 
			  break; 
		  case 2: 
			  System.out.println(month + "月有28天"); 
			  break; 
		  case 3: 
			  System.out.println(month + "月有31天"); 
			  break; 
		  case 4: 
			  System.out.println(month + "月有30天"); 
			  break;
		  default : 
			  System.out.println("月份输入错误！"); 
			  break; 
		  }
		 
	}
	

}
