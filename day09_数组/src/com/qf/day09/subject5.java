package com.qf.day09;

import java.util.Arrays;
import java.util.Random;

public class subject5 {

	public static void main(String[] args) {
		/* 5���Զ���һ��5x5��С�Ķ�ά���飬�������100����25������
		 * �������д���ƽ����������֮�ͣ���ͳ���������� */
		Random rand = new Random();
		int [][] a = new int[5][5];
		int count = 0;
		int average = 0;
		int i;
		int j;
		int p = 0;
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(100);
				System.out.print(a[i][j] + "\0");
				int num = a[i][j];
				count += num;
			}
			System.out.println();
		}
		average = count / 25;
		System.out.println("��Ϊ��" + count + "\n" + "ƽ����Ϊ��" + average);
		int sum = 0;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				if(a[i][j] > average) {
				sum += a[i][j];
				p++;
			}
			}
		}
		System.out.println("����ƽ����������֮��Ϊ:" + sum + "\n" + "����Ϊ��" + p + "��");
	
	}

}
