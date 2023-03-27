package day04_分支结构;

import java.util.Scanner;

public class subject1 {

	public static void main(String[] args) {
		/*
		 * 1、模拟银行电话服务，
		 * 输入1，提示”银行卡业务“；
		 * 输入2，提示”信用卡业务“；
		 * 输入3，提示”业务咨询“；
		 * 输入4，提示”人工服务“，
		 * 其它数字，提示”挂机“
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请选择电话业务");
		int num = input.nextInt();
		//方法一，用if……else
		/*if(num == 1) {
			System.out.println("银行卡业务");
		}else if(num == 2) {
			System.out.println("信用卡业务");
		}else if(num == 3) {
			System.out.println("业务咨询");
		}else if(num == 4) {
			System.out.println("人工服务");
		}else {
			System.out.println("挂机");
		}*/
		//方法二，用switch
		switch(num) {
		case 1 : 
			System.out.println("银行卡业务");
			break;
		case 2 :
			System.out.println("信用卡业务");
			break;
		case 3 :
			System.out.println("业务咨询");
			break;
		case 4 :
			System.out.println("人工服务");
			break;
		default :
			System.out.println("挂机");
			break;
		
		}
	}

}
