package com.qf.day08;

import java.util.Scanner;

public class subject3 {

	public static void main(String[] args) {
//		3���������飬����5�������������������У������һ�����������͵������������
		Scanner input = new Scanner(System.in);
		String [] arr = new String[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("�������" + (i + 1) +"���˵����֣�");
			arr[i] = input.next();
//			System.out.println(arr[i]);
		}
		System.out.println("��һ���˵������ǣ�" + arr[0] + "\n�������˵������ǣ�" + arr[2] + "\n������˵������ǣ�" + arr[4]);
		input.close();
	}

}
